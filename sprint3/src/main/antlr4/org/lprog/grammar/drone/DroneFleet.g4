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

IDENT: [a-zA-Z_]([a-zA-Z0-9_]|'-')*  ;
STRING: '"' (~["\r\n])* '"' ;
INT: [0-9]+ ;

WS: [ \t\r\n]+ -> skip ;
