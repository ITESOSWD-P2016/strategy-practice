package com.iteso.nintendo.caracteres;

import com.iteso.nintendo.NintendoCharacter;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class Mario extends NintendoCharacter {

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
        else if (getCurrentPower() == "big")
            return "breakbrick";
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
        else if(powerItem.toLowerCase() == "mushroom"){
            setCurrentPower("big");
            setSpeed("normal");
        }
        else
            setCurrentPower("error");
    }
}