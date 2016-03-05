package com.iteso.nintendo.powers.impl;

import com.iteso.nintendo.powers.IPower;

/**
 * Created by luis_ on 04/03/2016.
 */
public class MushroomPower implements IPower {
    public java.lang.String getAction() {
        return "breakbrick";
    }

    public java.lang.String getSpeed() {
        return "normal";
    }

    public java.lang.String getPowerName() {
        return "big";
    }
}
