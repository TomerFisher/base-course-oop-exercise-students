package AerialVehicles;

import Missions.BdaMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Zik extends AerialVehicle implements AerialIntelligenceVehicle, AerialBdaVehicle{
    String cameraType;
    String sensorType;

    public Zik(String cameraType, String sensorType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean readyToFly){
        this.cameraType = cameraType;
        this.sensorType = sensorType;
        this.pilotName = pilotName;
        this.mission = mission;
        this.hoursOfFlightSinceLastRepair = hoursOfFlightSinceLastRepair;
        this.readyToFly = readyToFly;
        this.MAX_HOURS_OF_FLIGHT_AFTER_REPAIR = 100;
    }

    public String preformBda() {
        return this.pilotName + ": Zik taking pictures of " + this.mission.getPlace() + " with: " + this.cameraType + "camera";
    }

    public String collectIntelligence() {
        return this.pilotName + ": Zik Collecting Data in " + this.mission.getPlace() + " with sensor type: " + this.sensorType;
    }
}
