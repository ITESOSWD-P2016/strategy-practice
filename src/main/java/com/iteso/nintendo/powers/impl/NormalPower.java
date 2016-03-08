package com.iteso.nintendo.powers.impl;

import com.iteso.nintendo.powers.IPower;

/**
 * Created by luis_ on 04/03/2016.
 */
public class NormalPower implements IPower {


    public java.lang.String getAAction() {
        return "jump";
    }
    public java.lang.String getBAction() {
        return "nothing";
    }

    public java.lang.String getSpeed() {
        return "normal";
    }

    public java.lang.String getPowerName() {
        return "normal";
    }

}
