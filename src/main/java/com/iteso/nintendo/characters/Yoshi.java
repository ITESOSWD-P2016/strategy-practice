package com.iteso.nintendo.characters;

public class Yoshi extends NintendoCharacter {
	
	public Yoshi(){
        setCurrentPower("normal");
        setName("Yoshi ");
        setSpeed("normal");
    }

	@Override
	public String performXButtonAction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String performYButtonAction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String performAButtonAction() {
		// TODO Auto-generated method stub
				return null;
	}

	@Override
	public String performBButtonAction() {
		// TODO Auto-generated method stub
		if (getCurrentPower() == "fire")
            return "fireball";
        else if (getCurrentPower() == "invincibility")
            return "dash";
        else if (getCurrentPower() == "normal")
            return "nothing";
        else if (getCurrentPower() == "giant")
            return "superstrength";
        else if (getCurrentPower() == "yoshipower")
            return "breathefire";
        else
            return "error";
	}

}
