package AerialVehicles;

import Missions.AttackMission;
import Missions.BdaMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class F16 extends AerialVehicle implements AerialAttackVehicle, AerialBdaVehicle{
    int numberOfMissiles;
    String missileType;
    String cameraType;

    public F16(String cameraType, int numberOfMissiles, String missileType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean readyToFly){
        this.numberOfMissiles = numberOfMissiles;
        this.missileType = missileType;
        this.cameraType = cameraType;
        this.pilotName = pilotName;
        this.mission = mission;
        this.hoursOfFlightSinceLastRepair = hoursOfFlightSinceLastRepair;
        this.readyToFly = readyToFly;
        this.MAX_HOURS_OF_FLIGHT_AFTER_REPAIR = 250;
    }

    public String attack() {
        return this.pilotName + ": F16 Attacking " + this.mission.getPlace() + " with: " + this.missileType + "X" + this.numberOfMissiles;
    }

    public String preformBda() {
        return this.pilotName + ": F16 taking pictures of " + this.mission.getPlace() + " with: " + this.cameraType + "camera";
    }
}
