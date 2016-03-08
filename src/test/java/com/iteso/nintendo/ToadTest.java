package com.iteso.nintendo;

import com.iteso.nintendo.caracteres.Luigi;
import com.iteso.nintendo.powers.impl.FlowerPower;
import com.iteso.nintendo.powers.impl.MushroomPower;
import com.iteso.nintendo.powers.impl.NormalPower;
import com.iteso.nintendo.powers.impl.StarPower;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class ToadTest {
    Luigi luigi;

    @Before
    public void setUp() {
        luigi = new Luigi();
    }

    @Test
    public void testPowerWhenLuigiTakesAFlower() {
        luigi.setPower(new FlowerPower());

        assertEquals("fire", luigi.getCurrentPower());
    }

    @Test
    public void testBActionWhenLuigiTakesAFlower() {
        luigi.setPower(new FlowerPower());

        assertEquals("fireball", luigi.performBButtonAction());
    }

    @Test
    public void testPowerWhenLuigiTakesAStar() {
        luigi.setPower(new StarPower());

        assertEquals("invincibility", luigi.getCurrentPower());
    }

    @Test
    public void testBActionWhenLuigiTakesAStar() {
        luigi.setPower(new StarPower());

        assertEquals("dash", luigi.performBButtonAction());
    }

    @Test
    public void testPowerWhenLuigiTakesAMushroom() {
        luigi.setPower(new MushroomPower());

        assertEquals("big", luigi.getCurrentPower());
    }

    @Test
    public void testBActionWhenLuigiTakesAMushroom() {
        luigi.setPower(new MushroomPower());

        assertEquals("nothing", luigi.performBButtonAction());
    }

    @Test
    public void testPowerWhenLuigiIsNormal() {
        luigi.setPower(new NormalPower());

        assertEquals("normal", luigi.getCurrentPower());
    }

    @Test
    public void testBActionWhenLuigiIsNormal() {
        luigi.setPower(new NormalPower());

        assertEquals("nothing", luigi.performBButtonAction());
    }

    @Test(expected = NullPointerException.class)
    public void testPowerWhenError() {
        luigi.setPower(null);

        assertEquals("error", luigi.getCurrentPower());
    }

    @Test(expected = NullPointerException.class)
    public void testBActionWhenError() {
        luigi.setPower(null);

        assertEquals("error", luigi.performBButtonAction());
    }
}