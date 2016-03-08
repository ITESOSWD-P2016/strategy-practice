package com.iteso.nintendo.Powers.impl;

import com.iteso.nintendo.Powers.iPower;

/**
 * Created by Flaveyro´sDell on 04/03/2016.
 */
public class flowerPower implements iPower {

    public String getAction() {
        return "fireBall";
    }

    public String getSpeed() {
        return "Normal";
    }

    public String getPowerName() {
        return "Fire";
    }
}
