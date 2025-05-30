package org.lprog.domain.model;

import java.util.List;

public class Model {

    public String ModelName;
    public float CargoCapacity;
    public int Autonomy;
    public int CruisingVelocity;
    public int LiftingVelocity;
    public int LandingVelocity;
    public List<Sensors> sensors;
    public List<String> operationalLimits;

    public Model(
            String modelName,
            
    ) {

    }

}
