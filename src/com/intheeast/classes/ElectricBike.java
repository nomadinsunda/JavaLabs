package com.intheeast.classes;

public class ElectricBike extends Bicycle{
	
	private int batteryCharge;
    
    public ElectricBike() {
    	
    }
    
    public ElectricBike(int cadence,
    		int gear,
    		int speed,
    		int boardTube) {
    	
    	super(cadence, gear, speed);
    	
    	this.batteryCharge = boardTube;
    }

	
	public int getBatteryCharge() {
		return batteryCharge;
	}

	public void setBatteryCharge(int batteryCharge) {
		this.batteryCharge = batteryCharge;
	}

}
