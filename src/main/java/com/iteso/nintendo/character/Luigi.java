package com.iteso.nintendo.character;

import javax.naming.directory.InvalidAttributesException;

import com.iteso.nintendo.power.impl.NormalPower;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class Luigi extends NintendoCharacter{

    public Luigi() throws InvalidAttributesException{
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
        return "jump";
    }
}