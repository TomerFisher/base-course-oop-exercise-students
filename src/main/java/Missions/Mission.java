package Missions;

import Entities.Coordinates;

import java.awt.peer.CanvasPeer;


public abstract class Mission implements MissionService{
    Coordinates coordinates;

    public String getCoordinates(){
        return this.coordinates.getLongitude() + ", " + this.coordinates.getLatitude();
    }

    public void begin(){
        System.out.println("Beginning Mission!");
    }

    public void cancel(){
        System.out.println("Abort Mission!");
    }

    public void finish(){
        System.out.println("Finish Mission!");
    }
}
