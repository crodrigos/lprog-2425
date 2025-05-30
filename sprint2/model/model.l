%{
#include "model.tab.h"

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
%}

%option yylineno

%%

[\t\r\n ]+ ;

"model" return MODEL;
"NM" return NM;
"CC" return CC;
"AT" return AT;
"VC" return VC;
"VS" return VS;
"VD" return VD;
"SS" return SS;
"LO" return LO;

":" return ':';
";" return ';';
"," return ',';
"{" return '{';
"}" return '}';
"[" return '[';
"]" return ']';

[0-9]+      { yylval.ival = atoi(yytext); return NUMBER; }
[a-zA-Z0-9\-]+ { yylval.sval = strdup(yytext); return ALPHANUMERIC; }

\"([^\\"]|\\.)*\" { yylval.sval = strdup(yytext); return STRING; }
. return yytext[0];
%%