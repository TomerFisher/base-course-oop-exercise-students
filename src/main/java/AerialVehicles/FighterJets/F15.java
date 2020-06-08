package AerialVehicles.FighterJets;

import AerialVehicles.AerialIntelligenceVehicle;
import Missions.AttackMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class F15 extends FighterJetsKit implements AerialIntelligenceVehicle {
    String sensorType;

    public F15(String sensorType, int numberOfMissiles, String missileType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean readyToFly){
        this.setAerialVehicleName("F15");
        this.sensorType = sensorType;
        this.setNumberOfMissiles(numberOfMissiles);
        this.setMissileType(missileType);
        this.setPilotName(pilotName);
        this.setMission(mission);
        this.setHoursOfFlightSinceLastRepair(hoursOfFlightSinceLastRepair);
        this.setReadyToFly(readyToFly);
    }

    public String collectIntelligence() {
        return this.getPilotName() + ": " + this.getAerialVehicleName() + " Collecting Data in " + this.getMission().getPlace() + " with sensor type: " + this.sensorType;
    }
}
