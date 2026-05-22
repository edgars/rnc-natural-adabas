parser grammar NaturalDdmParser;

options { tokenVocab = NaturalDdmLexer; }

ddmFile
    : ddmHeader fileLine* EOF
    ;

fileLine
    : metaLine
    | fieldLine
    | unknownLine
    ;

ddmHeader
    : DDM ID NL
    ;

metaLine
    : DBID INT NL
    | FNR INT NL
    ;

fieldLine
    : FIELD ID typeSpec (descriptor)? NL
    ;

typeSpec
    : TYPE_CHAR INT (COMMA INT)?
    ;

descriptor
    : STAR
    | ID
    ;

unknownLine
    : ~(DDM | FIELD | DBID | FNR | NL)+ NL
    | NL
    ;
