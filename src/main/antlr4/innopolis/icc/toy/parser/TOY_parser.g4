grammar TOY_parser;

//start compilationUnit
compilationUnit
    : imports classDeclarations
    ;

qualifiedName
    :IDENTIFIER (DOT IDENTIFIER)*
    ;

imports
    :importDeclaration*
;

importDeclaration
    : IMPORT qualifiedName (DOT MULTIPLY)? SEMICOLON
    ;

classDeclarations
    :classDeclaration
    ;

classDeclaration
    :PUBLIC CLASS qualifiedName extension SEMICOLON classBody
    ;

extension
       : /* empty */
       | EXTENDS IDENTIFIER
       ;

classBody
       : LBRACE              RBRACE
       | LBRACE classMembers RBRACE
       ;

classMembers
       :              classMember*
       ;

classMember
       : fieldDeclaration //ToDo finish classMember
       | methodDeclaration
       ;

fieldDeclaration
       : visibility staticness type IDENTIFIER SEMICOLON
       ;

visibility
       : /* empty */
       | PRIVATE
       | PUBLIC
       ;

staticness
       : /* empty */
       | STATIC
       ;

methodDeclaration
       : visibility staticness methodType IDENTIFIER parameters
            body
       ;

parameters
       : LPAREN               RPAREN
       | LPAREN parameterList RPAREN
       ;

parameterList
       : parameter (COMMA parameter)*
       ;

parameter
       : type IDENTIFIER
       ;

methodType
       : type
       | VOID
       ;

body
       : LBRACE localDeclarations statements RBRACE
       ;

localDeclarations
       :  localDeclaration*
       ;

localDeclaration
       : type IDENTIFIER (COMMA IDENTIFIER)* SEMICOLON
       ;

statements
       :   statement*
       ;

statement
       : assignment
       | ifStatement
       | whileStatement
       | forStatement
       | returnStatement
       | callStatement
       | printStatement
       | block
       ;

assignment
       : leftPart ASSIGN (literal|expression) SEMICOLON
       ;

leftPart
       : compoundName
       | compoundName LBRACKET expression RBRACKET
       ;

compoundName
       :                  IDENTIFIER
       | compoundName DOT IDENTIFIER
       ;

ifStatement
       : IF LPAREN relation RPAREN statement
       | IF LPAREN relation RPAREN statement ELSE statement
       ;

whileStatement
       : WHILE LPAREN relation RPAREN LBRACE statements RBRACE
       ;


// begin for statment
forStatement
    :   LOOP LPAREN forControl RPAREN LBRACE statements RBRACE
    ;

forControl
    :   forInit? SEMICOLON relation? SEMICOLON forUpdate?
    ;

forInit
    :   expressionList
    |   variableDeclarators
    ;

forUpdate
    :   expressionList
    |   variableDeclarators
    ;
// end for statment

expressionList
    :   expression (',' expression)*
    ;

variableDeclarators
    :   variableDeclarator (',' variableDeclarator)*
    ;

variableDeclarator
    :   leftPart ASSIGN (literal|expression)
    ;

returnStatement
    : RETURN            SEMICOLON
    | RETURN expression SEMICOLON
    ;

callStatement
    : compoundName  arguments SEMICOLON
    ;

arguments
       : LPAREN              RPAREN
       | LPAREN argumentList RPAREN
       ;

argumentList
       : argument (COMMA argument)*
       ;

argument
       : expression
       ;

printStatement
       : PRINT expression SEMICOLON
       ;

block
       : LBRACE            RBRACE
       | LBRACE statements RBRACE
       ;

relation
       : expression
       | expression relationalOperator expression
       ;

relationalOperator
       : LESS
       | GREATER
       | EQUAL
       | NOT_EQUAL
       ;

expression
       : literal
       |         term terms
       | addSign term terms
       ;

addSign
       : PLUS
       | MINUS
       ;

terms
       : /* empty */
       | addSign term terms
       ;

term
       : factor factors
       ;

factors
       : /* empty */
       | multSign factor factors
       ;

multSign
       : MULTIPLY
       | DIVIDE
       ;

factor
       : literal
       | leftPart
       | NULL
   //  | NEW newType
   //  | NEW newType LBRACKET expression RBRACKET
       ;

literal
       : IntegerLiteral
       | FloatingPointLiteral
       | BooleanLiteral
       ;

// Real literal

FloatingPointLiteral
    : DecimalNumeral DOT NUMBER+
    ;

// Integer Literal

IntegerLiteral
    : DecimalNumeral
    ;

// Boolean Literals
BooleanLiteral
    :   'true'
    |   'false'
    ;

newType
       : INT
       | REAL
       | IDENTIFIER
       ;

type
       : INT        arrayTail
       | REAL       arrayTail
       | IDENTIFIER arrayTail
       ;

arrayTail
       : /* empty */
       | LBRACKET RBRACKET
       ;




//Lexer
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
REAL    : 'real'         ;
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
GREATER         : '>' ;
EQUAL      :'==' ;
NOT_EQUAL  :'!=' ;
AND        :'&&' ;
OR         :'||' ;
POW        : '^' ;
PLUS       :'+'  ;
MINUS      :'-'  ;
MULTIPLY   :'*'  ;
DIVIDE     :'/'  ;





DecimalNumeral
    :   '0'
    |   NonZeroDigit NUMBER*
    ;

fragment
NonZeroDigit
    :   [1-9]
    ;

// Idetntifier appears after every keyword in the grammar
fragment LETTER : [a-zA-Z\u0080-\u00FF_];
IDENTIFIER
    : LETTER (LETTER|NUMBER)* ;

// Whitespace and comments
WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    : '//' (~('\n'|'\r'))* ->skip
    ;