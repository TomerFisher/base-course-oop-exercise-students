package AerialVehicles;

import Missions.AttackMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class F15 extends AerialVehicle implements AerialAttackVehicle, AerialIntelligenceVehicle{
    int numberOfMissiles;
    String missileType;
    String sensorType = null;

    public F15(String missileType, String sensorType, int numberOfMissiles, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean readyToFly){
        this.numberOfMissiles = numberOfMissiles;
        this.missileType = missileType;
        this.sensorType = sensorType;
        this.pilotName = pilotName;
        this.mission = mission;
        this.hoursOfFlightSinceLastRepair = hoursOfFlightSinceLastRepair;
        this.readyToFly = readyToFly;
        this.MAX_HOURS_OF_FLIGHT_AFTER_REPAIR = 250;
    }

    public String attack() {
        return this.pilotName + ": F15 Attacking " + this.mission.getPlace() + " with: " + this.missileType + "X" + this.numberOfMissiles;
    }

    public String collectIntelligence() {
        return this.pilotName + ": F15 Collecting Data in " + this.mission.getPlace() + " with sensor type: " + this.sensorType;
    }
}
