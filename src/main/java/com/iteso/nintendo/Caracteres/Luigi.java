package com.iteso.nintendo.Caracteres;

import com.iteso.nintendo.Caracteres.*;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class Luigi extends NintendoCharacter {

    public Luigi(){
        setCurrentPower("normal");
        setName("Luigi ");
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
        if (getCurrentPower() == "fire")
            return "fireball";
        else if (getCurrentPower() == "invincibility")
            return "dash";
        else if (getCurrentPower() == "normal")
            return "nothing";
        else if (getCurrentPower() == "giant")
            return "superstrength";
        return "error";
    }

    @Override
    public String performBButtonAction() {
        if (getCurrentPower() == "fire")
            return "fireball";
        else if (getCurrentPower() == "invincibility")
            return "dash";
        else if (getCurrentPower() == "normal")
            return "nothing";
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
        else
            setCurrentPower("error");
    }
}