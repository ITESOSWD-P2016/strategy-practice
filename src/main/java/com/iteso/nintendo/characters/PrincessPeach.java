package com.iteso.nintendo.characters;

public class PrincessPeach extends NintendoCharacter {
	
	public PrincessPeach(){
        setCurrentPower("normal");
        setName("PrincessPeach ");
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
        else if (getCurrentPower() == "peachpower")
            return "float";
        else
            return "error";
	}

}
