package com.iteso.nintendo;

import com.iteso.nintendo.Powers.iPower;
import com.iteso.nintendo.Powers.impl.Flower;
import com.iteso.nintendo.Powers.impl.Hongo;
import com.iteso.nintendo.Powers.impl.Normal;
import com.iteso.nintendo.Powers.impl.Star;
import com.iteso.nintendo.caracteres.Mario;
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
        iPower power = new Flower();
        mario.setPower(power);

        assertEquals("fire",mario.getCurrentPower());
    }

    @Test
    public void testBActionWhenMarioTakesAFlower(){
        iPower power = new Flower();
        mario.setPower(power);

        assertEquals("fireball",mario.performBButtonAction());
    }

    @Test
    public void testPowerWhenMarioTakesAStar(){
        iPower power = new Star();
        mario.setPower(power);

        assertEquals("invincibility",mario.getCurrentPower());
    }

    @Test
    public void testBActionWhenMarioTakesAStar(){
        iPower power = new Star();
        mario.setPower(power);

        assertEquals("dash",mario.performBButtonAction());
    }

    @Test
    public void testPowerWhenMarioTakesAHongo(){
        iPower power = new Hongo();
        mario.setPower(power);

        assertEquals("big mario",mario.getCurrentPower());
    }

    @Test
    public void testBActionWhenMarioTakesAHongo(){
        iPower power = new Hongo();
        mario.setPower(power);

        assertEquals("Super strong",mario.performBButtonAction());
    }

    @Test
    public void testPowerWhenMarioIsNormal(){
        iPower power = new Normal();
        mario.setPower(power);

        assertEquals("normal",mario.getCurrentPower());
    }

    @Test
    public void testBActionWhenMarioIsNormal(){
        iPower power = new Normal();
        mario.setPower(power);

        assertEquals("nothing",mario.performBButtonAction());
    }
/*
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
*/
}
