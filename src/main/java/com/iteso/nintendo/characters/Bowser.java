package com.iteso.nintendo.characters;

/**
 * Created by Sebastian on 06/03/16.
 */
public class Bowser extends NintendoCharacter{

    public Bowser() {
        setCurrentPower("normal");
        setName("Bowser");
        setSpeed("slow");
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
        else if (getCurrentPower() == "giant")
            return "break bricks";
        else if (getCurrentPower() == "flames")
            return "flamethrower";

        else
            return "error";
    }
}
