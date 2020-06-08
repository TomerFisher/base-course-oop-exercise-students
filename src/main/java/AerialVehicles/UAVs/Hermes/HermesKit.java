package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.UAVs.UAVsKit;

public abstract class HermesKit extends UAVsKit implements AerialBdaVehicle {
    String cameraType;

    //Set method.
    public void setCameraType(String cameraType) { this.cameraType = cameraType; }

    //Get method.

    public String getCameraType() { return cameraType; }

    //Another required methods.
    public void check(){
        int maxHoursOfFlightAfterRepair = 100;
        if (this.getHoursOfFlightSinceLastRepair() > maxHoursOfFlightAfterRepair)
            this.repair();
    }

    public String preformBda() { return this.getPilotName() + ": " + this.getAerialVehicleName() + " taking pictures of " + this.getMission().getPlace() + " with: " + this.cameraType + " camera"; }
}
