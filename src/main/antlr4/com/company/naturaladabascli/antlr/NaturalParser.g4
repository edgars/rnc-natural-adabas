parser grammar NaturalParser;

options { tokenVocab = NaturalLexer; }

program
    : (programElement)* END NL? EOF
    | (programElement)* EOF
    ;

programElement
    : defineData
    | findStatement
    | readLikeStatement
    | histogramStatement
    | storeStatement
    | updateStatement
    | deleteStatement
    | endTransactionStatement
    | backoutTransactionStatement
    | callnatStatement
    | performStatement
    | includeStatement
    | computeStatement
    | ifStatement
    | decideStatement
    | moveStatement
    | assignStatement
    | writeStatement
    | displayStatement
    | reinputStatement
    | inputStatement
    | unknownStatement
    ;

defineData
    : DEFINE DATA (LOCAL | GLOBAL | PARAMETER)? NL
      dataLine*
      END_DEFINE NL?
    ;

dataLine
    : defineLine
    | unknownLine
    ;

defineLine
    : INT ID (VIEW OF ID)? NL
    | INT ID typeSpec NL
    ;

typeSpec
    : LPAREN ID (COMMA INT)? RPAREN
    ;

findStatement
    : FIND ID (WITH expr)? NL
      blockContent*
      END_FIND NL?
    ;

readLikeStatement
    : (READ | GET) ID (WITH expr)? NL
    ;

histogramStatement
    : HISTOGRAM ID (WITH expr)? NL
    ;

storeStatement
    : STORE ID NL
    ;

updateStatement
    : UPDATE NL
    ;

deleteStatement
    : DELETE NL
    ;

endTransactionStatement
    : END_TRANSACTION NL
    ;

backoutTransactionStatement
    : BACKOUT_TRANSACTION NL
    ;

callnatStatement
    : CALLNAT STRING callArgList? NL
    ;

callArgList
    : (ID | STRING | INT | OTHER | STAR | EQ | COMMA | DOT | COLON | LPAREN | RPAREN)+
    ;

performStatement
    : PERFORM ID NL
    ;

includeStatement
    : INCLUDE ID NL
    ;

computeStatement
    : COMPUTE expr NL
    ;

moveStatement
    : MOVE expr NL
    ;

assignStatement
    : ASSIGN expr NL
    ;

writeStatement
    : WRITE expr NL
    ;

displayStatement
    : DISPLAY expr NL
    ;

reinputStatement
    : REINPUT expr NL
    ;

inputStatement
    : INPUT expr NL
    ;

ifStatement
    : IF expr NL
      blockContent*
      (ELSE NL blockContent*)?
      END_IF NL?
    ;

decideStatement
    : DECIDE ON expr NL
      decideBranch*
      END_DECIDE NL?
    ;

decideBranch
    : VALUE expr NL blockContent*
    | unknownLine
    ;

blockContent
    : ifStatement
    | computeStatement
    | callnatStatement
    | performStatement
    | includeStatement
    | writeStatement
    | displayStatement
    | reinputStatement
    | inputStatement
    | moveStatement
    | assignStatement
    | readLikeStatement
    | histogramStatement
    | storeStatement
    | updateStatement
    | deleteStatement
    | decideStatement
    | unknownLine
    ;

expr
    : (~(NL | END_IF | ELSE | END_FIND | END_DEFINE | END_DECIDE))+
    ;

unknownStatement
    : unknownLine
    ;

unknownLine
    : ~(DEFINE | FIND | READ | GET | HISTOGRAM | STORE | UPDATE | DELETE | IF | ELSE | END_IF | END_FIND | END_DEFINE | CALLNAT | PERFORM | INCLUDE | COMPUTE | MOVE | ASSIGN | REINPUT | INPUT | WRITE | DISPLAY | DECIDE | END_DECIDE | END | END_TRANSACTION | BACKOUT_TRANSACTION | NL)+ NL
    | NL
    ;
