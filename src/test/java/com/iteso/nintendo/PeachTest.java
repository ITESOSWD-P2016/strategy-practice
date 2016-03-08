package com.iteso.nintendo;

import com.iteso.nintendo.caracteres.Luigi;
import com.iteso.nintendo.caracteres.Peach;
import com.iteso.nintendo.powers.IPower;
import com.iteso.nintendo.powers.impl.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class PeachTest {
    Peach peach;

    @Before
    public void setUp() {
        peach = new Peach();
    }

    @Test
    public void testPowerWhenPeachTakesAFlower() {
        peach.setPower(new FlowerPower());

        assertEquals("fire", peach.getCurrentPower());
    }

    @Test
    public void testBActionWhenPeachTakesAFlower() {
        peach.setPower(new FlowerPower());

        assertEquals("fireball", peach.performBButtonAction());
    }



    @Test
    public void testPowerWhenLuigiTakesAStar() {
        peach.setPower(new StarPower());

        assertEquals("invincibility", peach.getCurrentPower());
    }

    @Test
    public void testBActionWhenLuigiTakesAStar() {
        peach.setPower(new StarPower());

        assertEquals("dash", peach.performBButtonAction());
    }

    @Test
    public void testPowerWhenLuigiTakesAMushroom() {
        peach.setPower(new MushroomPower());

        assertEquals("big", peach.getCurrentPower());
    }

    @Test
    public void testBActionWhenLuigiTakesAMushroom() {
        peach.setPower(new MushroomPower());

        assertEquals("nothing", peach.performBButtonAction());
    }

    @Test
    public void testPowerWhenLuigiIsNormal() {
        peach.setPower(new NormalPower());

        assertEquals("normal", peach.getCurrentPower());
    }

    @Test
    public void testBActionWhenLuigiIsNormal() {
        peach.setPower(new NormalPower());

        assertEquals("nothing", peach.performBButtonAction());
    }

    @Test(expected = NullPointerException.class)
    public void testPowerWhenError() {
        peach.setPower(null);

        assertEquals("error", peach.getCurrentPower());
    }

    @Test(expected = NullPointerException.class)
    public void testBActionWhenError() {
        peach.setPower(null);

        assertEquals("error", peach.performBButtonAction());
    }
}