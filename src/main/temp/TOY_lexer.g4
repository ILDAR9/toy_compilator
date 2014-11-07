lexer grammar TOY_lexer;

IDENTIFIER : LETTER+(LETTER|NUMBER)* ;

// Keywords
fragment LETTER : [a-zA-Z\u0080-\u00FF_];
NUMBER : [0-9];
IMPORT  : 'import'       ;
CLASS   : 'class'        ;
EXTENDS : 'extends'      ;
PRIVATE : 'private'      ;
PUBLIC  : 'public'       ;
STATIC  : 'static'       ;
VOID    : 'void'         ;
IF      : 'if'           ;
ELSE    : 'else'         ;
WHILE   : 'while'        ;
LOOP    : 'for'          ;
RETURN  : 'return'       ;
PRINT   : 'print'        ;
NULL    : 'null'         ;
NEW     : 'new'          ;
INT     : 'int'          ;
REAL    : 'real'|'float' ;
BOOLEAN : 'bool'         ;


// Delimiters
LBRACE     :'{' ;
RBRACE     :'}' ;
LPAREN     :'(' ;
RPAREN     :')' ;
LBRACKET   :'[' ;
RBRACKET   :']' ;
COMMA      :',' ;
DOT        :'.' ;
SEMICOLON  :';' ;

//Operator signs
ASSIGN     :'='  ;
LESS       :'<'  ;
GREATER    :'>'  ;
EQUAL      :'==' ;
NOT_EQUAL  :'!=' ;
AND        :'&&' ;
OR         :'||' ;
POW        : '^' ;
PLUS       :'+'  ;
MINUS      :'-'  ;
MULTIPLY   :'*'  ;
DIVIDE     :'/'  ;


// Whitespace and comments
WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;
