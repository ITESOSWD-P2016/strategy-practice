package com.iteso.nintendo.Powers.impl;

import com.iteso.nintendo.Powers.iPower;

/**
 * Created by Sabino on 04/03/2016.
 */
public class Normal implements iPower {
    public String getAction() {
        return "nothing";
    }

    public String getSpeed() {
        return "normal";
    }

    public String powerName() {
        return "normal";
    }
}
