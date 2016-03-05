package com.iteso.nintendo.Characters;

import com.iteso.nintendo.Characters.NintendoCharacter;
import com.iteso.nintendo.Powers.iPower;
import com.iteso.nintendo.Powers.impl.NormalPower;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class Luigi extends NintendoCharacter {

    public Luigi(){
        setCharName("Luigi");
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
        return "jump";
    }

    @Override
    public String performBButtonAction() {
       return this.getCurrentPower();

    }


}