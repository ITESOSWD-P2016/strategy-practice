package com.iteso.nintendo.Caracteres;
import com.iteso.nintendo.Caracteres.*;

/**
 * Created by Flaveyro´sDell on 07/03/2016.
 */
public class Toad extends NintendoCharacter{

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

        else if (getCurrentPower() == "Explosion")
            return "Explote";
        else if(getCurrentPower() == "hipnotist")
            return "Control Enemy";


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
        else if(powerItem.toLowerCase()=="BombSoul"){
            setCurrentPower("Explosive");
            setSpeed("normal");
        }
        else if(powerItem.toLowerCase()=="hipnotist"){
            setCurrentPower("Control Enemy");
            setSpeed("normal");
        }
        else
            setCurrentPower("error");
    }
}

