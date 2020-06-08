package Missions;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class AttackMission extends Mission{
    String target;

    public AttackMission(String target, Coordinates coordinates){
        this.coordinates = coordinates;
        this.target = target;
    }

    public String getPlace(){
        return this.target;
    }
}
