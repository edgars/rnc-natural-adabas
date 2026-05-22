lexer grammar NaturalDdmLexer;

WS: [ \t]+ -> skip;

NL: [\r\n]+;

LINE_COMMENT: '!' ~[\r\n]* -> skip;

DDM: 'DDM';
FIELD: 'FIELD';
DBID: 'DBID';
FNR: 'FNR';

COMMA: ',';
STAR: '*';

TYPE_CHAR: [ANPIBLDT];

INT: [0-9]+;

ID: [A-Za-z#] [A-Za-z0-9_-]*;

OTHER: . ;
