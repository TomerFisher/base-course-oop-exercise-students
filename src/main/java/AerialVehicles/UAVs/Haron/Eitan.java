package AerialVehicles.UAVs.Haron;

import Missions.Mission;

public class Eitan extends HaronKit {
    public Eitan(int numberOfMissiles, String missileType, String sensorType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean readyToFly){
        this.setAerialVehicleName("Eitan");
        this.setNumberOfMissiles(numberOfMissiles);
        this.setMissileType(missileType);
        this.setSensorType(sensorType);
        this.setPilotName(pilotName);
        this.setMission(mission);
        this.setHoursOfFlightSinceLastRepair(hoursOfFlightSinceLastRepair);
        this.setReadyToFly(readyToFly);
    }
}
