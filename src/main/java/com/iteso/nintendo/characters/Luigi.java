package com.iteso.nintendo.characters;

import com.iteso.nintendo.characters.NintendoCharacter;

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
        else if (getCurrentPower() == "bigluigi")
            return "break bricks";
        else
            return "error";
    }
}