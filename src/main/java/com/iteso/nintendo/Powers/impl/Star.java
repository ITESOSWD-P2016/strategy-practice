package com.iteso.nintendo.Powers.impl;

import com.iteso.nintendo.Powers.iPower;

/**
 * Created by Sabino on 04/03/2016.
 */
public class Star implements iPower {
    public String getAction() {
        return "dash";
    }

    public String getSpeed() {
        return "fast";
    }

    public String powerName() {
        return "invincibility";
    }
}
