package AerialVehicles;

import Missions.BdaMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Shoval extends AerialVehicle implements AerialAttackVehicle, AerialIntelligenceVehicle, AerialBdaVehicle{
    int numberOfMissiles;
    String missileType;
    String cameraType;
    String sensorType;

    public Shoval(int numberOfMissiles, String missileType, String cameraType, String sensorType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean readyToFly){
        this.numberOfMissiles = numberOfMissiles;
        this.missileType = missileType;
        this.cameraType = cameraType;
        this.sensorType = sensorType;
        this.pilotName = pilotName;
        this.mission = mission;
        this.hoursOfFlightSinceLastRepair = hoursOfFlightSinceLastRepair;
        this.readyToFly = readyToFly;
        this.MAX_HOURS_OF_FLIGHT_AFTER_REPAIR = 150;
    }

    public String attack() {
        return this.pilotName + ": Shoval Attacking " + this.mission.getPlace() + " with: " + this.missileType + "X" + this.numberOfMissiles;
    }

    public String preformBda() {
        return this.pilotName + ": Shoval taking pictures of " + this.mission.getPlace() + " with: " + this.cameraType + "camera";
    }

    public String collectIntelligence() {
        return this.pilotName + ": Shoval Collecting Data in " + this.mission.getPlace() + " with sensor type: " + this.sensorType;
    }
}
