grammar Mission;

mission: MISSION ':' '{' body '}' EOF;

body: (keyValuePair ';')*;

keyValuePair
    : 'ID' ':' ID                 #MissionID
    | 'STT' ':' DATE              #StaringTime
    | 'SN' ':' DRONE              #DroneSerialNumber
    | 'STP' ':' POINT             #StartingPoint
    | 'deliveries' ':' list       #ListOfDeliveries
    ;

list: '{' listBody '}' ;

listBody: (',' POINT)*;

MISSION: 'mission';

ID     : [A-Z0-9]+ ;

DATE   : [0-9]{4} '-' [0-9]{2} '-' [0-9]{2} ',' [0-9]{2} ':' [0-9]{2};

DRONE  : [A-Z]+ '-' [A-Z0-9]+ ;

POINT  : '(' [0-9]+ ',' [0-9]+ ',' [0-9]+ ')';

WS     : [ \t\r\n]+ -> skip;