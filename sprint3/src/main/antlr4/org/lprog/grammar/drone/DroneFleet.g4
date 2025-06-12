grammar DroneFleet;

fleet: (droneEntry)+ EOF;

droneEntry: 'drone' ':' '{' atributos '}' ;

atributos: atributo+ ;

atributo
    : 'SN' ':' IDENT ';'
    | 'TV' ':' INT ';'
    | 'MD' ':' IDENT ';'
    | 'RT' ':' '[' restrictionList? ']' ';'
    | 'EA' ':' STATUS ';'
    ;

restrictionList: STRING (',' STRING)* ;

STATUS: 'FLYN' | 'IDLE' | 'CHRG' | 'MNTC' | 'UNAV';

IDENT: [A-Z]+ '-' [A-Z0-9]+ ;
STRING: '"' (~["\r\n])* '"' ;
INT: [0-9]+ ;

WS: [ \t\r\n]+ -> skip ;
