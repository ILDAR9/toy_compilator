lexer grammar TOY_lexer;

// Keywords
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

// Integer Literal

IntegerLiteral
    :   DecimalIntegerLiteral
    ;

fragment
DecimalNumeral
    :   '0'
    |   NonZeroDigit Digit*
    ;

fragment
Digit
    :   '0'
    |   NonZeroDigit
    ;

fragment
NonZeroDigit
    :   [1-9]
    ;

// Boolean Literals
BooleanLiteral
    :   'true'
    |   'false'
    ;

// Null Literal
NullLiteral
    :   'null'
    ;

// Idetntifier appears after every keyword in the grammar
fragment LETTER : [a-zA-Z\u0080-\u00FF_];
Identifier : LETTER+(LETTER|Digit)* ;

// Whitespace and comments
WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;