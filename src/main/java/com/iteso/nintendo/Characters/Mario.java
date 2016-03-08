package com.iteso.nintendo.Characters;

import com.iteso.nintendo.Characters.NintendoCharacter;
import com.iteso.nintendo.Powers.iPower;
import com.iteso.nintendo.Powers.impl.NormalPower;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class Mario extends NintendoCharacter {

    public Mario(){
        setCharName("Mario");
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
        return this.getCurrentJump();
    }

    @Override
    public String performBButtonAction() {
        return this.getCurrentPower();

    }
}