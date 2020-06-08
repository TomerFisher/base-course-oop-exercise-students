package AerialVehicles.UAVs.Hermes;

import Missions.Mission;

public class Zik extends HermesKit{
    public Zik(String cameraType, String sensorType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean readyToFly){
        this.setAerialVehicleName("Zik");
        this.setCameraType(cameraType);
        this.setSensorType(sensorType);
        this.setPilotName(pilotName);
        this.setMission(mission);
        this.setHoursOfFlightSinceLastRepair(hoursOfFlightSinceLastRepair);
        this.setReadyToFly(readyToFly);
    }
}
