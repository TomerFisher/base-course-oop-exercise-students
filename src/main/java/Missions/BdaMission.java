package Missions;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class BdaMission extends Mission{
    String objective;

    public BdaMission(String objective, Coordinates coordinates){
        this.coordinates = coordinates;
        this.objective = objective;
    }

    public String getPlace(){
        return this.objective;
    }
}
