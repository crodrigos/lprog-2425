| Term                     | Definition                                                                 | Type                |
|--------------------------|---------------------------------------------------------------------------|---------------------|
| Drone                   | Número de série, capacidade de carga, autonomia, velocidade média (incluindo de subida e descida), sensores, limites operacionais (tais como, máximo de horas de voo, etc.), restrições (tais como, voo diurno, etc.), número de horas de voo e o seu estado atual | -                   |
| Número de Série         | Alfanumérico único                                                        | SN:D-XXXXXXXX          |
| Capacidade de Carga     | Número inteiro que representa a carga máxima que o drone pode transportar | CC:2500g (or if we have time: 20kg)             |
| Autonomia               | Número inteiro que representa o tempo máximo de voo do drone              | AT:60min              |
| Velocidade Média Cruseiro | Número inteiro que representa a velocidade média do drone                | VC:20kmh              |
| Velocidade Média de Subida | Número inteiro que representa a velocidade média de subida do drone      | VS:5kmh               |
| Velocidade Média de Descida | Número inteiro que representa a velocidade média de descida do drone    | VD:5kmh               |
| Sensores                | Lista de sensores que o drone possui                                      | ex: SS:GPS, Câmara, Termo etc |
| Limites Operacionais    | Lista de limites operacionais do drone                                    | ex: LO:máximo de horas de voo, etc |
| Restrições              | Lista de restrições do drone                                              | ex:RT: voo diurno, etc |
| Tempo de Voo  | Número inteiro que representa o número de horas de voo do drone           | TV:1200m                 |
| Estado Atual            | Estado atual do drone                                                     | EA:FLYN/IDLE/CHRG/MNTC/UNAV |