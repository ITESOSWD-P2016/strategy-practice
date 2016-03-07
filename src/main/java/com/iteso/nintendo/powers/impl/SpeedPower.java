package com.iteso.nintendo.powers.impl;
import com.iteso.nintendo.powers.iPower;

/**
 * Created by Sebastian on 06/03/16.
 */
public class SpeedPower implements iPower {
    public String getAction() {
        return "MaxSpeed";
    }

    public String getSpeed() {
        return "MaxSpeed";
    }

    public String getPowerName() {
        return "Speed";
    }
}
