%{
#include "drone.tab.h"
#include <string.h>
%}

%%

"drone"     return DRONE;
"SN"        return SN;
"TV"        return TV;
"MD"        return MD;
"RT"        return RT;
"EA"        return EA;

[0-9]+      { yylval.ival = atoi(yytext); return NUMBER; }
\"[^\"]*\"  { yylval.sval = strdup(yytext); return STRING; }
[a-zA-Z0-9\-]+ { yylval.sval = strdup(yytext); return IDENT; }

":"         return ':';
";"         return ';';
","         return ',';
"["         return '[';
"]"         return ']';
[ \t\r\n]+  ;    // ignora espaços
.           return yytext[0];

%%
