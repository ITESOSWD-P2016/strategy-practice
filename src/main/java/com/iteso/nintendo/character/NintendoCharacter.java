package com.iteso.nintendo.character;

import com.iteso.nintendo.power.iPower;
/**
 * Created by rvillalobos on 3/3/16.
 */
public abstract class NintendoCharacter {
    private iPower oPower;
    private String sCurrentPower;
    private String sSpeed;
    private String sPowerName;
    
    public String getPower() {
        return oPower.getAction();
    }
    
    public void setPower(iPower oPower){
    	this.oPower = oPower;
    	setCurrentPower(this.oPower.getAction());
    	setPowerName(this.oPower.getPowerName());
    	setSpeed(this.oPower.getSpeed());
    };

	public String getCurrentPower() {
		return sCurrentPower;
	}

	private void setCurrentPower(String sCurrentPower) {
		this.sCurrentPower = sCurrentPower;
	}

	public String getSpeed() {
		return sSpeed;
	}

	private void setSpeed(String sSpeed) {
		this.sSpeed = sSpeed;
	}

	public String getPowerName() {
		return sPowerName;
	}

	private void setPowerName(String sPowerName) {
		this.sPowerName = sPowerName;
	}
	
    public String performBButtonAction(){
    	return this.getCurrentPower();
    }

	public abstract String performXButtonAction();
    public abstract String performYButtonAction();
    public abstract String performAButtonAction();
    
}
