package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialAttackVehicle;
import Missions.Mission;

public class Kochav extends HermesKit implements AerialAttackVehicle {
    private int numberOfMissiles;
    private String missileType;

    public Kochav(int numberOfMissiles, String missileType, String cameraType, String sensorType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean readyToFly){
        this.setAerialVehicleName("Kochav");
        this.numberOfMissiles = numberOfMissiles;
        this.missileType = missileType;
        this.setCameraType(cameraType);
        this.setSensorType(sensorType);
        this.setPilotName(pilotName);
        this.setMission(mission);
        this.setHoursOfFlightSinceLastRepair(hoursOfFlightSinceLastRepair);
        this.setReadyToFly(readyToFly);
    }

    public void setNumberOfMissiles(int numberOfMissiles) { this.numberOfMissiles = numberOfMissiles; }

    public void setMissileType(String missileType) { this.missileType = missileType; }

    public int getNumberOfMissiles() { return numberOfMissiles; }

    public String getMissileType() { return missileType; }

    public String attack() { return this.getPilotName() + ": " + this.getAerialVehicleName() + " Attacking " + this.getMission().getPlace() + " with: " + this.missileType + "X" + this.numberOfMissiles; }
}
