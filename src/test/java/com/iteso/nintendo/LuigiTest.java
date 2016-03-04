package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import com.iteso.nintendo.character.Luigi;
import com.iteso.nintendo.power.impl.FlowerPower;
import com.iteso.nintendo.power.impl.NormalPower;
import com.iteso.nintendo.power.impl.StarPower;

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
        luigi.setPower(new FlowerPower());
        assertEquals("fire",luigi.getPowerName());
    }

    @Test
    public void testBActionWhenLuigiTakesAFlower(){
    	luigi.setPower(new FlowerPower());
        assertEquals("fireball",luigi.performBButtonAction());
    }

    @Test
    public void testPowerWhenLuigiTakesAStar(){
    	luigi.setPower(new StarPower());
        assertEquals("invincibility",luigi.getPowerName());
    }

    @Test
    public void testBActionWhenLuigiTakesAStar(){
    	luigi.setPower(new StarPower());
        assertEquals("dash",luigi.performBButtonAction());
    }

    @Test
    public void testPowerWhenLuigiIsNormal(){
    	luigi.setPower(new NormalPower());
        assertEquals("normal",luigi.getPowerName());
    }

    @Test
    public void testBActionWhenLuigiIsNormal(){
    	luigi.setPower(new NormalPower());
        assertEquals("nothing",luigi.performBButtonAction());
    }
    
    @Test (expected = NullPointerException.class)
    public void testPowerWhenError(){
    	luigi.setPower(null);
        assertEquals("error",luigi.getPowerName());
    }

    @Test (expected = NullPointerException.class)
    public void testBActionWhenError(){
    	luigi.setPower(null);
        assertEquals("error",luigi.performBButtonAction());
    }
}
