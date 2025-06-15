grammar Mission;

file: (mission)* EOF;

mission: MISSION ':' '{' body missionEnd;

missionEnd: '}';

body: (keyValuePair ';')*;

keyValuePair
    : 'STT' ':' DATE              #StaringTime
    | 'MD' ':' MODEL              #Model
    | 'STP' ':' POINT             #StartingPoint
    | 'deliveries' ':' list       #ListOfDeliveries
    ;

list: '{' listBody '}' ;

listBody: (',' POINT)*;

MISSION: 'MISSION'|'Mission'|'mission';

DATE   : [0-9]+ '-' [0-9]+ '-' [0-9]+ ',' [0-9]+ ':' [0-9]+;

MODEL  : [A-Z]+ '-' [A-Z0-9]+ ;

POINT  : '(' [0-9]+ ',' [0-9]+ ',' [0-9]+ ')';

WS     : [ \t\r\n]+ -> skip;