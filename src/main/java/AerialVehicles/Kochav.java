package AerialVehicles;

import Missions.AttackMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Kochav extends AerialVehicle implements AerialAttackVehicle, AerialIntelligenceVehicle, AerialBdaVehicle{
    int numberOfMissiles;
    String missileType;
    String cameraType;
    String sensorType;

    public Kochav(int numberOfMissiles, String missileType, String cameraType, String sensorType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean readyToFly){
        this.numberOfMissiles = numberOfMissiles;
        this.missileType = missileType;
        this.cameraType = cameraType;
        this.sensorType = sensorType;
        this.pilotName = pilotName;
        this.mission = mission;
        this.hoursOfFlightSinceLastRepair = hoursOfFlightSinceLastRepair;
        this.readyToFly = readyToFly;
        this.MAX_HOURS_OF_FLIGHT_AFTER_REPAIR = 100;
    }

    public String attack() {
        return this.pilotName + ": Kochav Attacking " + this.mission.getPlace() + " with: " + this.missileType + "X" + this.numberOfMissiles;
    }

    public String preformBda() {
        return this.pilotName + ": Kochav taking pictures of " + this.mission.getPlace() + " with: " + this.cameraType + "camera";
    }

    public String collectIntelligence() {
        return this.pilotName + ": Kochav Collecting Data in " + this.mission.getPlace() + " with sensor type: " + this.sensorType;
    }
}
