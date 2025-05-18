#define nameSize 10
#define maxSensorsNumber 20
#define sensorSize 12
#define nOperationalLimitations 256
#define operationalLimitationSize 50

#ifndef MODEL_H
#define MODEL_H

typedef struct {
    char *name;
    int cargoCapacity;
    int autonomy;
    int crusingVelocity;
    int liftingVelocity;
    int landingVelocity;
    char* sensors[maxSensorsNumber];
    char operationalLimitations[nOperationalLimitations][operationalLimitationSize];
} Model_t;

#endif