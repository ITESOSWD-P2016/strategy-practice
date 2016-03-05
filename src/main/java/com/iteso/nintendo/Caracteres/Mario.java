package com.iteso.nintendo.Caracteres;

/**
 * Created by Flaveyro´sDell on 04/03/2016.
 */
public  class Mario extends NintendoCharacter {

    public Mario(){
        setCurrentPower("normal");
        setName("Mario");
        setSpeed("normal");
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
        return "jump";
    }

    @Override
    public String performBButtonAction() {
        if (getCurrentPower() == "fire")
            return "fireball";
        else if (getCurrentPower() == "invincibility")
            return "dash";
        else if (getCurrentPower() == "normal")
            return "nothing";
        else if(getCurrentPower() == "mushroom")
            return "strength";
        else
            return "error";
    }

    @Override
    public void setPower(String powerItem) {
        if (getCurrentPower().toLowerCase() != "normal") {
            return;
        }

        else if(powerItem.toLowerCase() == "flower"){
            setCurrentPower("fire");
        }
        else if(powerItem.toLowerCase() == "star"){
            setCurrentPower("invincibility");
            setSpeed("fast");
        }
        else if(powerItem.toLowerCase() == "clear power"){
            setCurrentPower("normal");
            setSpeed("normal");
        }
        else if (powerItem.toLowerCase () == "mushroom"){

            setCurrentPower("Giant");
            setSpeed("normal");

        }
        else
            setCurrentPower("error");
    }

}
