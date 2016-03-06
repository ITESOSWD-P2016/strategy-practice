package com.iteso.nintendo.character;

import javax.naming.directory.InvalidAttributesException;

import com.iteso.nintendo.power.iHitSpecialPower;
import com.iteso.nintendo.power.iPower;
import com.iteso.nintendo.power.iSlideSpecialPower;
import com.iteso.nintendo.power.impl.TouchPower;
/**
 * Created by rvillalobos on 3/3/16.
 */
public abstract class NintendoCharacter {
	private String currentPower;
    private String speed;
    private String powerName;
    private String specialAction;
    
    public static void main(String[] args) throws InvalidAttributesException{
    	NintendoCharacter n = new Browser();
    	n.setPower(new TouchPower());
    	System.out.println(n.performAButtonAction());
    }
    
    public void setPower(iPower oPower) throws InvalidAttributesException{
    	if ((oPower instanceof iHitSpecialPower && !(this instanceof iHitSpecialPower))
    		|| (oPower instanceof iSlideSpecialPower && !(this instanceof iSlideSpecialPower)))
    		throw new InvalidAttributesException("Acción no válida");
    	
    	setCurrentPower(oPower.getAction());
    	setPowerName(oPower.getPowerName());
    	setSpeed(oPower.getSpeed());
    	setSpecialAction(oPower.getSpecialAction());
    };

	public String getCurrentPower() {
		return currentPower;
	}

	private void setCurrentPower(String sCurrentPower) {
		this.currentPower = sCurrentPower;
	}

	public String getSpeed() {
		return speed;
	}

	private void setSpeed(String sSpeed) {
		this.speed = sSpeed;
	}

	public String getPowerName() {
		return powerName;
	}

	private void setPowerName(String sPowerName) {
		this.powerName = sPowerName;
	}
	
    public String performBButtonAction(){
    	return this.getCurrentPower();
    }

	public abstract String performXButtonAction();
    public abstract String performYButtonAction();
    
    public String performAButtonAction(){
    	return this.getSpecialAction();
    }

	public String getSpecialAction() {
		return this.specialAction;
	}

	public void setSpecialAction(String specialAction) {
		this.specialAction = specialAction;
	}
    
}
