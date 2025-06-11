grammar Mission;

mission: MISSION ':' '{' body '}' EOF;

body: (keyValuePair ';')*;

keyValuePair
    : 'STT' ':' DATE              #StaringTime
    | 'MD' ':' MODEL              #Model
    | 'STP' ':' POINT             #StartingPoint
    | 'deliveries' ':' list       #ListOfDeliveries
    ;

list: '{' listBody '}' ;

listBody: (',' POINT)*;

MISSION: 'mission';

DATE   : [0-9]{4} '-' [0-9]{2} '-' [0-9]{2} ',' [0-9]{2} ':' [0-9]{2};

MODEL  : [A-Z]{2} '-' [A-Z0-9]{3} ;

POINT  : '(' [0-9]+ ',' [0-9]+ ',' [0-9]+ ')';

WS     : [ \t\r\n]+ -> skip;