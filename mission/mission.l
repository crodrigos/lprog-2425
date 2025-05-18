%{
#include "mission.tab.h"
#include <string.h>
#include "point.h"
%}

%%

"mission:"   return MISSION;
"STT:"     return STT;
"MD:"     return MD;
"STP:"     return STP;
"deliveries:" return DELIVERIES;
"P:"     return P;

[0-9]{4}-[0-9]{2}-[0-9]{2},[0-9]{2}:[0-9]{2} {
    yylval.sval = strdup(yytext);
    return DATE;
}

[0-9]+ {
    yylval.ival = atoi(yytext);
    return NUMBER;
}

[A-Z]{2}-[0-9]{3} {
    yylval.sval = strdup(yytext);
    return MODEL;
}

"(" return '(';
")" return ')';
"{" return '{';
"}" return '}';
";" return ';';
"," return ',';

[ \t\r\n]+  ;//skip spaces

. return yytext[0];

%%

int yywrap() {
    return 1;
}
