
package com.iteso.nintendo.Characters;

import com.iteso.nintendo.Powers.impl.InhalePower;


public class Kirby extends NintendoCharacter{
    public Kirby(){
        setCharName("Kirby");
        this.setPower(new InhalePower());
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

