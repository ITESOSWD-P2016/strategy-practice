package com.iteso.nintendo;

import com.iteso.nintendo.Mario;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class MarioTest {
    Mario mario;

    @Before
    public void setUp(){
        mario = new Mario();
    }

    @Test
    public void testPowerWhenMarioTakesAFlower(){
        mario.setPower("flower");

        assertEquals("fire",mario.getCurrentPower());
    }

    @Test
    public void testBActionWhenMarioTakesAFlower(){
        mario.setPower("flower");

        assertEquals("fireball",mario.performBButtonAction());
    }

    @Test
    public void testPowerWhenMarioTakesAStar(){
        mario.setPower("star");

        assertEquals("invincibility",mario.getCurrentPower());
    }

    @Test
    public void testBActionWhenMarioTakesAStar(){
        mario.setPower("star");

        assertEquals("dash",mario.performBButtonAction());
    }

    @Test
    public void testPowerWhenMarioIsNormal(){
        mario.setPower("clear power");

        assertEquals("normal",mario.getCurrentPower());
    }

    @Test
    public void testBActionWhenMarioIsNormal(){
        mario.setPower("clear power");

        assertEquals("nothing",mario.performBButtonAction());
    }
    @Test
    public void testPowerWhenError(){
        mario.setPower("invalid");

        assertEquals("error",mario.getCurrentPower());
    }

    @Test
    public void testBActionWhenError(){
        mario.setPower("invalid");

        assertEquals("error",mario.performBButtonAction());
    }

}
