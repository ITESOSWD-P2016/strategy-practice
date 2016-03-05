package com.iteso.nintendo.Powers.impl;

import com.iteso.nintendo.Powers.iPower;

/**
 * Created by lnvitado on 04/03/2016.
 */
public class StarPower  implements iPower {
    public String getAction() {
        return "dash";
    }

    public String getSpeed() {
        return "fast";
    }

    public String getPowerName() {
        return "invincibility";
    }
}
