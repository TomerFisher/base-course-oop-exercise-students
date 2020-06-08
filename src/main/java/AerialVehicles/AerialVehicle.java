package AerialVehicles;

import Entities.Coordinates;
import Missions.Mission;
import Missions.MissionTypeException;

public abstract class AerialVehicle implements AerialVehicleService{
    private String AerialVehicleName;
    private String pilotName;
    private Mission mission;
    private int hoursOfFlightSinceLastRepair;
    private boolean readyToFly;

    //Set methods.
    public void setAerialVehicleName(String aerialVehicleName) { AerialVehicleName = aerialVehicleName; }

    public void setPilotName(String pilotName) { this.pilotName = pilotName; }

    public void setMission(Mission mission) {
        this.mission = mission;
    }

    public void setHoursOfFlightSinceLastRepair(int hoursOfFlightSinceLastRepair) { this.hoursOfFlightSinceLastRepair = hoursOfFlightSinceLastRepair; }

    public void setReadyToFly(boolean readyToFly) { this.readyToFly = readyToFly; }

    //Get methods.
    public String getAerialVehicleName() { return AerialVehicleName; }

    public String getPilotName() { return pilotName; }

    public Mission getMission() { return mission; }

    public int getHoursOfFlightSinceLastRepair() {
        return hoursOfFlightSinceLastRepair;
    }

    public boolean getReadyToFly() { return this.readyToFly;}

    //Another required methods.
    public void flyTo(){
        System.out.println("Flying to: " + mission.getCoordinates());
    }

    public void land(){
        System.out.println("Landing");
    }

    public void repair(){
        this.readyToFly = true;
        this.hoursOfFlightSinceLastRepair = 0;
    }
}