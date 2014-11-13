grammar TOY_parser;

import TOY_lexer;

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
       :                   localDeclaration*
       ;

localDeclaration
       : type IDENTIFIER SEMICOLON
       ;

statements
       :            statement*
       ;

statement
       : assignment
       | ifStatement
       | whileStatement
       | returnStatement
       | callStatement
       | printStatement
       | block
       ;

assignment
       : leftPart ASSIGN expression SEMICOLON
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
       : WHILE relation LOOP statement SEMICOLON
       ;

returnStatement
       : RETURN            SEMICOLON
       | RETURN expression SEMICOLON
       ;

callStatement
       : compoundName  arguments SEMICOLON
       ;

arguments
       : LPAREN argumentList? RPAREN
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

expression   //ToDO think about it
    :         term terms
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
       | NEW newType
       | NEW newType LBRACKET REALssion RBRACKET
       ;

literal
       : IntegerLiteral
       | FloatingPointLiteral
       | BooleanLiteral
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