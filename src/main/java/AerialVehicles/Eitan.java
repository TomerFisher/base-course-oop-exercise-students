package AerialVehicles;

import Missions.Mission;

public class Eitan extends AerialVehicle implements AerialAttackVehicle, AerialIntelligenceVehicle{
    int numberOfMissiles;
    String missileType;
    String sensorType;

    public Eitan(int numberOfMissiles, String missileType, String sensorType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean readyToFly){
        this.numberOfMissiles = numberOfMissiles;
        this.missileType = missileType;
        this.sensorType = sensorType;
        this.pilotName = pilotName;
        this.mission = mission;
        this.hoursOfFlightSinceLastRepair = hoursOfFlightSinceLastRepair;
        this.readyToFly = readyToFly;
        this.MAX_HOURS_OF_FLIGHT_AFTER_REPAIR = 150;
    }

    public String attack() {
        return this.pilotName + ": Eithan Attacking " + this.mission.getPlace() + " with: " + this.missileType + "X" + this.numberOfMissiles;
    }

    public String collectIntelligence() {
        return this.pilotName + ": Eithan Collecting Data in " + this.mission.getPlace() + " with sensor type: " + this.sensorType;
    }
}
