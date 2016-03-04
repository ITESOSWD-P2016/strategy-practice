package com.iteso.nintendo.powers.impl;
import com.iteso.nintendo.powers.iPower;

/**
 * Created by Sebastian on 04/03/16.
 */
public class MushroomPower implements iPower {

    public String getAction() {
        return "break bricks";
    }
    public String getSpeed() {
        return "normal";
    }
    public String getPowerName(){
        return "bigmario";
    }

}
