package com.iteso.nintendo.powers.impl;

import com.iteso.nintendo.powers.iPower;

/**
 * Created by Sebastian on 06/03/16.
 */
public class FirePower implements iPower {
    public String getAction() {
        return "fireball";
    }

    public String getSpeed() {
        return "normal";
    }

    public String getPowerName() {
        return "flames";
    }
}

