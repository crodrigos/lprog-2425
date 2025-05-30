package org.lprog.domain.model;

import java.util.List;

public class Model {

    public String ModelName;
    public float CargoCapacity;
    public int Autonomy;
    public int CruisingVelocity;
    public int LiftingVelocity;
    public int LandingVelocity;
    public List<Sensor> sensors;
    public List<String> operationalLimits;

    public Model(
            String modelName,
            float cargoCapacity,
            int autonomy,
            int cruisingVelocity,
            int liftingVelocity,
            int landingVelocity,
            List<Sensor> sensors,
            List<String> operationalLimits
    ) {
        this.ModelName = modelName;
        this.CargoCapacity = cargoCapacity;
        this.Autonomy = autonomy;
        this.CruisingVelocity = cruisingVelocity;
        this.LiftingVelocity = liftingVelocity;
        this.LandingVelocity = landingVelocity;
        this.sensors = sensors;
        this.operationalLimits = operationalLimits;
    }

}
