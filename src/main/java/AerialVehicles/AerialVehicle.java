package AerialVehicles;

import Entities.Coordinates;
import Missions.Mission;
import Missions.MissionTypeException;

public abstract class AerialVehicle implements AerialVehicleService{
    String pilotName;
    Mission mission;
    int hoursOfFlightSinceLastRepair;
    boolean readyToFly;
    int MAX_HOURS_OF_FLIGHT_AFTER_REPAIR;


    public void flyTo(){
        System.out.println("Flying to: " + mission.getCoordinates());
    }

    public void land(){
        System.out.println("Landing");
    }

    public void check(){
        if (this.hoursOfFlightSinceLastRepair > MAX_HOURS_OF_FLIGHT_AFTER_REPAIR)
            this.repair();
    }

    public void repair(){
        this.readyToFly = true;
        this.hoursOfFlightSinceLastRepair = 0;
    }

    public int getHoursOfFlightSinceLastRepair() {
        return hoursOfFlightSinceLastRepair;
    }

    public void setHoursOfFlightSinceLastRepair(int hoursOfFlightSinceLastRepair) {
        this.hoursOfFlightSinceLastRepair = hoursOfFlightSinceLastRepair;
    }

    public void setMission(Mission mission) {
        this.mission = mission;
    }
}