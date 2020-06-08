package AerialVehicles.UAVs;

import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;

public abstract class UAVsKit extends AerialVehicle implements AerialIntelligenceVehicle {
    private String sensorType;

    //Set method.
    public void setSensorType(String sensorType) { this.sensorType = sensorType; }

    //Get method.
    public String getSensorType() { return sensorType; }

    public String collectIntelligence() {
        return this.getPilotName() + ": " + this.getAerialVehicleName() + " Collecting Data in " + this.getMission().getPlace() + " with sensor type: " + this.sensorType;
    }
}
