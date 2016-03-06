package com.iteso.nintendo.character;

import javax.naming.directory.InvalidAttributesException;

import com.iteso.nintendo.power.iHitSpecialPower;
import com.iteso.nintendo.power.impl.NormalPower;

public class Browser extends NintendoCharacter implements iHitSpecialPower {

    public Browser() throws InvalidAttributesException{
    	this.setPower(new NormalPower());
    }
	
	@Override
	public String performXButtonAction() {
		return null;
	}

	@Override
	public String performYButtonAction() {
		return null;
	}

	@Override
	public String performAButtonAction() {
    	if (!this.getPowerName().equals("normal"))
    		return super.performAButtonAction();
        return "nothing";
	}

}