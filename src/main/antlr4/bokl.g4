grammar bokl;

type: Int | String;
varDeclaration: type WS Var WS? LE WS?;

intRValue: Var | Num;
intVarDeclaration: Int WS Var WS? '=' WS? intRValue WS? LE WS?;
intVarAssign: Var WS? '=' WS? intRValue WS? LE WS?;
compareInt: intRValue WS? compareOperation WS? intRValue WS?;

strRValue: Var | StringValue;
strVarDeclaration: String WS Var WS '=' WS strRValue WS? LE WS?;
strVarAssign: Var WS? '=' WS? strRValue WS? LE WS?;
compareStr: strRValue WS? compareOperation WS? strRValue WS?;

condition: '(' WS? (compareInt | compareStr) WS? ')' WS?;
ifStatement: 'if' WS (condition) codeBlock WS?;

print : 'print' WS? '(' (Num | StringValue | Var) WS? ')' WS? LE WS?;
gotoOperation: 'goto' WS Var WS? LE WS?;
increment: Var '++' WS? LE WS?;
whileLoop: 'while' WS? (condition) WS? codeBlock WS?;
gotoLabel: GT WS? Var WS? LE WS?;


codeBlock: '{' WS? (gotoLabel | gotoOperation | varDeclaration | intVarDeclaration |
    intVarAssign | strVarDeclaration | strVarAssign |
    ifStatement | whileLoop | codeBlock | increment | print)*'}' | EOF;


script: WS? 'mainFunc' WS? codeBlock;


compareOperation: Less | LessEqual | Greater | GreaterEqual | NotEqual | Equal;
Less: '<';
LessEqual: '<=';
Greater: '>';
GreaterEqual: '>=';
NotEqual: '!=';
Equal: '==';



LE : ';' ;
WS : [ \n\r\t]+;

GT : '$';

Int : 'int' ;
String : 'string' ;

Var : [a-zA-Z][a-zA-Z0-9_]*;
Num : '-'?[0-9]+;
StringValue: '"' (.)*? '"';