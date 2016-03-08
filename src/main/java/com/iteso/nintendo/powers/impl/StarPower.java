package com.iteso.nintendo.powers.impl;

import com.iteso.nintendo.powers.IPower;

/**
 * Created by luis_ on 04/03/2016.
 */
public class StarPower implements IPower {
    public java.lang.String getBAction() {return "dash";}
    public java.lang.String getAAction() {return "High Jump";}

    public java.lang.String getSpeed() {
        return "fast";
    }

    public java.lang.String getPowerName() {
        return "invincibility";
    }
}
