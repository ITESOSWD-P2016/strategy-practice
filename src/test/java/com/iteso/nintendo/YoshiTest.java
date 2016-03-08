package com.iteso.nintendo;

import com.iteso.nintendo.*;
import com.iteso.nintendo.Caracteres.Yoshi;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by Flaveyro´sDell on 07/03/2016.
 */
public class YoshiTest {
    Yoshi yoshi;

    @Before
    public void setUp(){
        yoshi = new Yoshi();
    }

    @Test
    public void testPowerWhenMarioTakesAFlower(){
        yoshi.setPower("flower");

        assertEquals("fire",yoshi.getCurrentPower());
    }

    @Test
    public void testBActionWhenMarioTakesAFlower(){
        yoshi.setPower("flower");

        assertEquals("fireball",yoshi.performBButtonAction());
    }

    @Test
    public void testPowerWhenMarioTakesAStar(){
        yoshi.setPower("star");

        assertEquals("invincibility",yoshi.getCurrentPower());
    }

    @Test
    public void testBActionWhenMarioTakesAStar(){
        yoshi.setPower("star");

        assertEquals("dash",yoshi.performBButtonAction());
    }

    @Test
    public void testPowerWhenMarioIsNormal(){
        yoshi.setPower("clear power");

        assertEquals("normal",yoshi.getCurrentPower());
    }

    @Test
    public void testBActionWhenMarioIsNormal(){
        yoshi.setPower("clear power");

        assertEquals("nothing",yoshi.performBButtonAction());
    }
    @Test
    public void testPowerWhenError(){
        yoshi.setPower("invalid");

        assertEquals("error",yoshi.getCurrentPower());
    }

    @Test
    public void testBActionWhenError(){
        yoshi.setPower("invalid");

        assertEquals("error",yoshi.performBButtonAction());
    }

    public void TestPowerwhenYoshiIsHungry(){
        yoshi.setPower("Hungry");

        assertEquals("Eat Enemy",yoshi.getCurrentPower());
    }
    public void TestPowerwhenYoshiIsAngry(){
        yoshi.setPower("EyeLaser");

        assertEquals("Kill Enemy",yoshi.getCurrentPower());
    }

}


