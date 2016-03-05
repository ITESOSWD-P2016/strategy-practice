package com.iteso.nintendo.powers.impl;

import com.iteso.nintendo.powers.IPower;

/**
 * Created by luis_ on 04/03/2016.
 */
public class StarPower implements IPower {
    public java.lang.String getAction() {return "dash";}

    public java.lang.String getSpeed() {
        return "fast";
    }

    public java.lang.String getPowerName() {
        return "invincibility";
    }
}
