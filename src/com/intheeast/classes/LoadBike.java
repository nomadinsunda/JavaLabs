package com.intheeast.classes;

public class LoadBike extends Bicycle{	

    private int boardTube;
    
    public LoadBike() {
    	
    }
    
    public LoadBike(int cadence,
    		int gear,
    		int speed,
    		int boardTube) {
    	super(cadence, gear, speed);
    	
    	this.boardTube = boardTube;
    }

	
	public int getBoardTube() {
		return boardTube;
	}

	public void setBoardTube(int boardTube) {
		this.boardTube = boardTube;
	}

}
