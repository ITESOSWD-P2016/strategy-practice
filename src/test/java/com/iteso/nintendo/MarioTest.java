package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import com.iteso.nintendo.caracteres.Mario;
import com.iteso.nintendo.powers.impl.FlowerPower;
import com.iteso.nintendo.powers.impl.MushroomPower;
import com.iteso.nintendo.powers.impl.NormalPower;
import com.iteso.nintendo.powers.impl.StarPower;

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
        mario.setPower(new FlowerPower());

        assertEquals("fire",mario.getCurrentPower());
    }

    @Test
    public void testBActionWhenMarioTakesAFlower(){
        mario.setPower(new FlowerPower());

        assertEquals("fireball",mario.performBButtonAction());
    }

    @Test
    public void testPowerWhenMarioTakesAStar(){
        mario.setPower(new StarPower());

        assertEquals("invincibility",mario.getCurrentPower());
    }

    @Test
    public void testBActionWhenMarioTakesAStar(){
        mario.setPower(new StarPower());

        assertEquals("dash",mario.performBButtonAction());
    }

    @Test
    public void testPowerWhenMarioIsNormal(){
        mario.setPower(new NormalPower());

        assertEquals("normal",mario.getCurrentPower());
    }

    @Test
    public void testBActionWhenMarioIsNormal(){
        mario.setPower(new NormalPower());

        assertEquals("nothing",mario.performBButtonAction());
    }
    @Test
    public void testPowerWhenMarioTakesAMushroom(){
        mario.setPower(new MushroomPower());

        assertEquals("big", mario.getCurrentPower());
    }

    @Test
    public void testBActionWhenMarioTakesAMushroom(){
        mario.setPower(new MushroomPower());

        assertEquals("breakbrick", mario.performBButtonAction());
    }
    @Test(expected = NullPointerException.class)
    public void testPowerWhenError(){
        mario.setPower(null);

        assertEquals("error",mario.getCurrentPower());
    }

    @Test(expected = NullPointerException.class)
    public void testBActionWhenError(){
        mario.setPower(null);

        assertEquals("error",mario.performBButtonAction());
    }

}