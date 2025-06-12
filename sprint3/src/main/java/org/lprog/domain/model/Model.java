package org.lprog.domain.model;

import java.util.List;
import java.util.Objects;

public class Model {

    public String ModelName;
    public int CargoCapacity;
    public int Autonomy;
    public int CruisingVelocity;
    public int LiftingVelocity;
    public int LandingVelocity;
    public List<Sensor> sensors;
    public List<String> operationalLimits;

    public Model(
            String modelName,
            int cargoCapacity,
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

    @Override
    public String toString() {
        return "Model{" +
                "ModelName='" + ModelName + '\'' +
                ", CargoCapacity=" + CargoCapacity +
                ", Autonomy=" + Autonomy +
                ", CruisingVelocity=" + CruisingVelocity +
                ", LiftingVelocity=" + LiftingVelocity +
                ", LandingVelocity=" + LandingVelocity +
                ", sensors=" + sensors +
                ", operationalLimits=" + operationalLimits +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Model model = (Model) o;

        return CargoCapacity == model.CargoCapacity &&
                Autonomy == model.Autonomy &&
                CruisingVelocity == model.CruisingVelocity &&
                LiftingVelocity == model.LiftingVelocity &&
                LandingVelocity == model.LandingVelocity &&
                Objects.equals(ModelName, model.ModelName) &&
                Objects.equals(sensors, model.sensors) &&
                Objects.equals(operationalLimits, model.operationalLimits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ModelName, CargoCapacity, Autonomy, CruisingVelocity, LiftingVelocity, LandingVelocity, sensors, operationalLimits);
    }
}
