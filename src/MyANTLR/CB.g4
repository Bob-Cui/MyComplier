grammar CB;      // 定义一个名为Hello的语法，名字与文件名一致


//@header{package com.zetyun.aiops.core.math;}

prog : stat+;

stat: expr NEWLINE          # printExpr
    | ID '=' expr NEWLINE   # assign
    | NEWLINE               # blank
    ;

expr:  expr '/'expr   # MulDiv
| expr op=('+'|'-') expr        # AddSub
| expr MUL expr                 # Mul
| NUM                           # int
| ID                            # id
| '(' expr ')'                  # parens
;

MUL : '*' ; // assigns token name to '*' used above in grammar
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;

ASSIGN:'=';
LT:'<';
LE:'<=';
GT:'>';
GE:'>=';


Semicolon:';';//分号
Colon:':';

Point:'.';
COMMA:',';
LBrac:'(';
RBrac:')';
LBBrac:'{';
RBBrac:'}';
LSB:'[';
RSB:']';



STRUCT:'struct';

IF:'if';
ELSE:'else';

FOR:'for';
WHILE:'while';
DO:'do';
SWITCH:'switch';
CASE:'case';

TRUE:'true';
FALSE:'false';



NEW:'new';

INT:'int';
FLOAT:'float';
DOUBLE:'double';
LONG:'long';
CHAR:'char';


ID : [a-zA-Z]+ ;
NUM : [0-9]+ ;
NEWLINE:'\r'? '\n' ;
WS : [\r\t\n]+ -> skip;