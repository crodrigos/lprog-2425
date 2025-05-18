#include "point.h"

#ifndef MISSION_H
#define MISSION_H

#define MAX_DELIVERIES 100

typedef struct {
    char* startDate;
    char* model;
    Point_t startPoint;
    Point_t deliveries[100];  // até 100 pontos de entrega
    int deliveryCount;
} Mission_t;

#endif