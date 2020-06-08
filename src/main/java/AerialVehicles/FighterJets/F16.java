package AerialVehicles.FighterJets;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import Missions.AttackMission;
import Missions.BdaMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class F16 extends FighterJetsKit implements AerialBdaVehicle {
    String cameraType;

    public F16(String cameraType, int numberOfMissiles, String missileType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean readyToFly){
        this.setAerialVehicleName("F16");
        this.cameraType = cameraType;
        this.setNumberOfMissiles(numberOfMissiles);
        this.setMissileType(missileType);
        this.setPilotName(pilotName);
        this.setMission(mission);
        this.setHoursOfFlightSinceLastRepair(hoursOfFlightSinceLastRepair);
        this.setReadyToFly(readyToFly);
    }

    public String preformBda() { return this.getPilotName() + ": " + this.getAerialVehicleName() + " taking pictures of " + this.getMission().getPlace() + " with: " + this.cameraType + " camera"; }
}
