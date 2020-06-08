package Missions;

import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class IntelligenceMission extends Mission{
    String region;

    public IntelligenceMission(String region, Coordinates coordinates){
        this.coordinates = coordinates;
        this.region = region;
    }

    public String getPlace(){
        return this.region;
    }
}
