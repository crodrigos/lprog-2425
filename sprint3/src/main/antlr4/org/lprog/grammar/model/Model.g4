grammar Model;

file: (model)* EOF;

model: MODEL ':' '{' structureBody modelEnd;

modelEnd: '}';

structureBody: (keyValuePair ';')* ;

keyValuePair
    : 'NM' ':' ALPHANUMERIC                   #NameField
    | 'CC' ':' NUMBER                         #CargoCapacityField
    | 'AT' ':' NUMBER                         #AutonomyField
    | 'VC' ':' NUMBER                         #CruisingVelocityField
    | 'VS' ':' NUMBER                         #LiftingVelocityField
    | 'VD' ':' NUMBER                         #LandingVelocityField
    | 'SS' ':' list                           #SensorsField
    | 'LO' ':' list                           #LimitationsField
    ;

list: '[' listBody? ']' ;

listBody: value (',' value)* ;

value: ALPHANUMERIC | STRING ;

// Lexer rules
MODEL: 'Model'|'model';

NUMBER         : [0-9]+ ;
ALPHANUMERIC   : [a-zA-Z_][a-zA-Z0-9_]* ;
STRING         : '"' (~["\r\n\-]  | '""')* '"' ;

WS             : [ \t\r\n]+ -> skip ;
COLON          : ':' ;
SEMI           : ';' ;
COMMA          : ',' ;
LBRACE         : '{' ;
RBRACE         : '}' ;
LBRACK         : '[' ;
RBRACK         : ']' ;
