package com.iteso.nintendo.characters;

/**
 * Created by Sebastian on 06/03/16.
 */
public class BulletBill extends NintendoCharacter {
    @Override
    public String performXButtonAction() {
        return null;
    }

    @Override
    public String performYButtonAction() {
        return null;
    }

    @Override
    public String performAButtonAction() {
        return "MoveAway";
    }

    @Override
    public String performBButtonAction() {
        if (getCurrentPower() == "Speed")
            return "MaxSpeed";
        else if (getCurrentPower() == "normal")
            return "nothing";

        else return "error";

    }
}
