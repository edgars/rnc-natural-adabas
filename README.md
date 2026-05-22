# natural-adabas-cli-analyzer

MVP de linha de comando em **Java 8** para inspecionar repositórios públicos ou pacotes ZIP contendo fontes **Software AG Natural** e **DDM (Data Definition Module)** relacionados a **Adabas**, gerando um **relatório Markdown** com inventário, modelo lógico, acessos a dados, matriz CRUD simplificada, chamadas entre programas e candidatos a regras de negócio (somente com evidência de código).

## Objetivo

- Baixar ou clonar código legado (GitHub público, ZIP remoto ou ZIP local).
- Escanear e classificar arquivos Natural/DDM (e correlatos).
- Fazer parsing **parcial e tolerante** via **ANTLR 4**.
- Produzir um **único arquivo Markdown** com visão estrutural para apoio à modernização (sem execução de código, sem Adabas em runtime, sem IA).

## Pré-requisitos

- **JDK / JRE 8**
- **Apache Maven 3.x** (para compilar e empacotar)

## Como compilar

```bash
cd natural-adabas-cli-analyzer
mvn clean package
```

O JAR sombreado (executável) é gerado em:

`target/natural-adabas-cli-analyzer.jar`

## Como executar

### Repositório GitHub público

```bash
java -jar target/natural-adabas-cli-analyzer.jar analyze \
  --source https://github.com/org/repo \
  --type git \
  --output ./report.md
```

### Modo automático (inferência de `--type`)

- `https://github.com/...` e **não** termina em `.zip` → **git**
- `http(s)://...` e termina em `.zip` → **zip-url**
- Caminho local terminando em `.zip` → **zip-file**

```bash
java -jar target/natural-adabas-cli-analyzer.jar analyze \
  --source https://github.com/org/repo \
  --output ./report.md
```

### ZIP remoto

```bash
java -jar target/natural-adabas-cli-analyzer.jar analyze \
  --source https://example.com/natural-adabas-source.zip \
  --type zip-url \
  --output ./report.md
```

### ZIP local

```bash
java -jar target/natural-adabas-cli-analyzer.jar analyze \
  --source ./samples/natural-adabas.zip \
  --type zip-file \
  --output ./report.md
```

### Manter workspace temporário

Por padrão, o diretório de trabalho em `./.natural-analyzer-workspace/<timestamp>/` é removido ao final. Para inspecionar conteúdo clonado/extraído:

```bash
java -jar target/natural-adabas-cli-analyzer.jar analyze \
  --source ./samples.zip \
  --type zip-file \
  --output ./report.md \
  --keep-workspace
```

## Exemplo de saída no console

```
Natural/Adabas CLI Analyzer
Source: https://github.com/example/legacy-natural
Mode: git

[1/7] Preparing workspace...
[2/7] Fetching source...
...
Analysis completed.
Programs found: 12
DDMs found: 4
Data accesses found: 31
Candidate business rules found: 18
Report generated at: ./report.md
```

## Exemplo de relatório gerado

O Markdown segue seções numeradas:

1. Executive Summary  
2. Source Inventory  
3. Programs Found  
4. DDMs and Data Model  
5. CRUD Matrix  
6. Data Accesses  
7. Program Calls  
8. Business Rule Candidates  
9. Parse Issues  
10. Modernization Notes  

Trecho ilustrativo:

```markdown
## 1. Executive Summary

- Source: ./samples
- Source type: ZIP_FILE
- Analysis date: 2026-05-22 12:00:00 UTC
- Natural programs found: 1
- DDMs found: 1
...
```

## Limitações da versão MVP

- O parser Natural é **parcial** (subconjunto sintático, gramática tolerante).
- O parser de DDM é **simplificado** (metadados e campos básicos).
- **Não** executa programas Natural nem acessa Adabas.
- **Não** há IA, banco de dados, servidor web ou autenticação Git.
- **Não** cobre todos os comandos e variantes da linguagem Natural.
- “Regras de negócio” são **candidatas** com base em padrões (IF, COMPUTE, DECIDE, REINPUT, etc.), não verdades funcionais.
- A qualidade do relatório depende da completude dos **DDM** e do código-fonte fornecido.

## Como evoluir a gramática ANTLR

1. Edite os arquivos em `src/main/antlr4/com/company/naturaladabascli/antlr/` (`Natural*.g4`, `NaturalDdm*.g4`).
2. Execute `mvn generate-sources` (ou `mvn package`) para regenerar parsers/lexers em `target/generated-sources/antlr4`.
3. Ajuste visitantes em `drivers/natural/` para mapear novos nós para o modelo (`model/`).
4. Amplie testes em `src/test/java` e amostras em `src/test/resources/samples/`.

## Como adicionar novos drivers no futuro

1. Crie uma classe que implemente `com.company.naturaladabascli.drivers.TechnologyAnalyzer`.
2. Registre-a no fluxo do comando `analyze` (por exemplo, após classificação de artefatos), de forma semelhante a `NaturalAdabasAnalyzer`.
3. Exemplos futuros citados no desenho: Visual Basic, Delphi, Java, .NET, Oracle Forms, PL/SQL — cada um com seu próprio parser/heurísticas.

## Stack

| Componente        | Uso                          |
|-------------------|------------------------------|
| Java 8           | Linguagem e bytecode alvo    |
| Maven            | Build e dependências         |
| ANTLR 4.9.3      | Lexers/parsers               |
| Picocli 4.7.x    | CLI                          |
| JGit 5.13.x      | Clone GitHub público         |
| Commons Compress | Leitura de ZIP              |
| Commons IO       | I/O auxiliar                 |
| JUnit 4.13.2     | Testes                       |

## Licença

Uso interno / exemplo de projeto — ajuste a licença conforme a política da sua organização.
