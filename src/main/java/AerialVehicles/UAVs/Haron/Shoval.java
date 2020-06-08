package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialBdaVehicle;
import Missions.Mission;

public class Shoval extends HaronKit implements AerialBdaVehicle {
    String cameraType;

    public Shoval(String cameraType, int numberOfMissiles, String missileType, String sensorType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean readyToFly){
        this.setAerialVehicleName("Shoval");
        this.cameraType = cameraType;
        this.setNumberOfMissiles(numberOfMissiles);
        this.setMissileType(missileType);
        this.setSensorType(sensorType);
        this.setPilotName(pilotName);
        this.setMission(mission);
        this.setHoursOfFlightSinceLastRepair(hoursOfFlightSinceLastRepair);
        this.setReadyToFly(readyToFly);
    }

    //Set method.
    public void setCameraType(String cameraType) { this.cameraType = cameraType; }

    //Get method.
    public String getCameraType() { return cameraType; }

    public String preformBda() { return this.getPilotName() + ": " + this.getAerialVehicleName() + " taking pictures of " + this.getMission().getPlace() + " with: " + this.cameraType + " camera"; }
}
