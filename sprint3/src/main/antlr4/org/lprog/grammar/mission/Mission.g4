grammar Mission;

mission: MISSION ':' '{' body '}' EOF;

body: (keyValuePair ';')*;

keyValuePair
    : 'STT' ':' DATE              #StaringTime
    | 'SN' ':' DRONE              #DroneSerialNumber
    | 'STP' ':' POINT             #StartingPoint
    | 'deliveries' ':' list       #ListOfDeliveries
    ;

list: '{' listBody '}' ;

listBody: (',' POINT)*;

MISSION: 'mission';

DATE   : [0-9]+ '-' [0-9]+ '-' [0-9]+ ',' [0-9]+ ':' [0-9]+;

DRONE  : [A-Z]+ '-' [A-Z0-9]+ ;

POINT  : '(' [0-9]+ ',' [0-9]+ ',' [0-9]+ ')';

WS     : [ \t\r\n]+ -> skip;