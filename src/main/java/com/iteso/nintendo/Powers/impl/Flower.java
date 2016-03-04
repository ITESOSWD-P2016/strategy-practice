package com.iteso.nintendo.Powers.impl;

import com.iteso.nintendo.Powers.iPower;

/**
 * Created by Sabino on 04/03/2016.
 */
public class Flower implements iPower {
    public String getAction() {
        return "fireball";
    }

    public String getSpeed() {
        return "normal";
    }

    public String powerName() {
        return "fire";
    }
}
