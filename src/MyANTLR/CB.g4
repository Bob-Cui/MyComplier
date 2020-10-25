grammar CB;      // 定义一个名为Hello的语法，名字与文件名一致


//@header{package com.zetyun.aiops.core.math;}

prog : stat+;
comment:COMMENT1
       |COMMENT2
;
stat: expr NEWLINE          # printExpr
    | ID '=' expr NEWLINE   # assign
    | NEWLINE               # blank
    ;

expr:  expr '/'expr   # MulDiv
| expr op=('+'|'-'|'=') expr        # AddSub
| expr MUL expr                 # Mul
| '(' expr ')'                  # parens
| NUM                           # int
| ID                            # id

;

COMMENT1:'/*'.*?'*/'->channel(2);
COMMENT2:'//'[s|S] ->channel(2);












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
NOTHING:' ';
WS : [\t\n\r\f]+-> skip;
