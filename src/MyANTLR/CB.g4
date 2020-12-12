grammar CB;      // 定义一个名为Hello的语法，名字与文件名一致


//@header{package com.zetyun.aiops.core.math;}

prog : statlist;


block:
     |'{'  NEWLINE  '}'
     |'{' statlist '}';


statlist:stat
|stat';'statlist;

stat:  expr
    | typename? ID '=' expr
    |NUM '='expr
    |forexpr
    |ifexpr;




ifexpr:IF '('expr')'block ';'
      |IF '('expr')'block ELSE IF block ';'
      |IF '('expr')'block ELSE block';';

forexpr:FOR '(' stat ';'  expr';' autocCacu ')' block
       |FOR '('        ')'block
;
//自增与自减
autocCacu:ID'++'
         |ID'--';



funtions:typename ID'('formals')'block

;
//参数表
formals:formal
       |formal','formals;

formal:typename ID;


expr:
|mulexpr(('+'|'-')mulexpr)*
|expr LE expr
|expr GE expr
|expr GT expr
|expr LT expr
;


mulexpr: atom(('*'|'/') atom) *;



atom:'('expr')'
|NUM
|ID;



//声明语句
declare:typename idlist;


idlist:ID
      |idlist ',' ID;

typename:VOID
        |FLOAT
        | INT
        |DOUBLE
        |LONG;

//有关跳转的语句
jump_stat	:
			| 'continue' ';'
			| 'break' ';'
			| 'return' expr ';'
			| 'return'	';';

NEWLINE:'\r'?'\n'->skip;
NOTHING:' '+->skip;
WS : [\t\n\r\f]+-> skip;

COMMENT1:'/*'.*?'*/'->channel(2);
COMMENT2:'//'.*?'\n' ->channel(2);
PRE:'#'.*?'\n'->channel(3);










MUL : '*' ; // assigns token name to '*' used above in grammar
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;

ASSIGN:'=';
LT:'<';
LE:'<=';
GT:'>';
GE:'>=';
AND:'&&';
OR:'||';
XOR:'^';


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


VOID:'void';

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
RETURN:'return';
MAIN:'main';

INT:'int';
FLOAT:'float';
DOUBLE:'double';
LONG:'long';
CHAR:'char';


ID : [a-zA-Z][a-zA-Z0-9]*;
NUM : [0-9]+;
REAL_NUM:NUM Point NUM;

