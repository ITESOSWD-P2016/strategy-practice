package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class LuigiTest {
    Luigi luigi;

    @Before
    public void setUp(){
        luigi = new Luigi();
    }

    @Test
    public void testPowerWhenLuigiTakesAFlower(){
        luigi.setPower("flower");

        assertEquals("fire", luigi.getCurrentPower());
    }

    @Test
    public void testBActionWhenLuigiTakesAFlower(){
        luigi.setPower("flower");

        assertEquals("fireball", luigi.performBButtonAction());
    }

    @Test
    public void testPowerWhenLuigiTakesAStar(){
        luigi.setPower("star");

        assertEquals("invincibility", luigi.getCurrentPower());
    }

    @Test
    public void testBActionWhenLuigiTakesAStar(){
        luigi.setPower("star");

        assertEquals("dash", luigi.performBButtonAction());
    }

    @Test
    public void testPowerWhenLuigiIsNormal(){
        luigi.setPower("clear power");

        assertEquals("normal", luigi.getCurrentPower());
    }

    @Test
    public void testBActionWhenLuigiIsNormal(){
        luigi.setPower("clear power");

        assertEquals("nothing", luigi.performBButtonAction());
    }
    @Test
    public void testPowerWhenError(){
        luigi.setPower("invalid");

        assertEquals("error", luigi.getCurrentPower());
    }

    @Test
    public void testBActionWhenError(){
        luigi.setPower("invalid");

        assertEquals("error", luigi.performBButtonAction());
    }

}
