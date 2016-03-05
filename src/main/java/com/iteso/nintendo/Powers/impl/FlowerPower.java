package com.iteso.nintendo.Powers.impl;

import com.iteso.nintendo.Powers.iPower;

/**
 * Created by lnvitado on 04/03/2016.
 */
public class FlowerPower implements iPower {


    public String getAction() {
        return "fireball";
    }

    public String getSpeed() {
        return "normal";
    }

    public String getPowerName() {
        return "fire";
    }
}
