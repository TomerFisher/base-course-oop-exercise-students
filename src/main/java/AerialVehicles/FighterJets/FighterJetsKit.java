package AerialVehicles.FighterJets;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialVehicle;

public class FighterJetsKit extends AerialVehicle implements AerialAttackVehicle{
    private int numberOfMissiles;
    private String missileType;

    //Set methods.
    public void setNumberOfMissiles(int numberOfMissiles) { this.numberOfMissiles = numberOfMissiles; }

    public void setMissileType(String missileType) { this.missileType = missileType; }

    //Get methods.
    public int getNumberOfMissiles() { return numberOfMissiles; }

    public String getMissileType() { return missileType; }

    //Another required methods.
    public void check(){
        int maxHoursOfFlightAfterRepair = 250;
        if (this.getHoursOfFlightSinceLastRepair() > maxHoursOfFlightAfterRepair)
            this.repair();
    }

    public String attack() { return this.getPilotName() + ": " + this.getAerialVehicleName() + " Attacking " + this.getMission().getPlace() + " with: " + this.missileType + "X" + this.numberOfMissiles; }
}
