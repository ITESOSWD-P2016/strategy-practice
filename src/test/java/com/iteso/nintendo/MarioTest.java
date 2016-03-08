package com.iteso.nintendo;

import com.iteso.nintendo.Characters.Mario;
import com.iteso.nintendo.Powers.impl.*;
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
        mario.setPower(new FlowerPower());

        assertEquals("fire", mario.getPowerName());
    }

    @Test
    public void testAActionWhenMarioTakesAFlower(){
        mario.setPower(new FlowerPower());

        assertEquals("brick break jump", mario.performAButtonAction());
    }

    @Test
    public void testBActionWhenMarioTakesAFlower(){
        mario.setPower(new FlowerPower());

        assertEquals("fireball", mario.performBButtonAction());
    }

    @Test
    public void testSpeedWhenMarioTakesAFlower(){
        mario.setPower(new FlowerPower());

        assertEquals("normal", mario.getSpeed());
    }

    @Test
    public void testPowerWhenMarioTakesAMushroom(){
        mario.setPower(new MushroomPower());

        assertEquals("giant", mario.getPowerName());
    }

    @Test
    public void testAActionWhenMarioTakesAMushroom(){
        mario.setPower(new MushroomPower());

        assertEquals("brick break jump", mario.performAButtonAction());
    }

    @Test
    public void testBActionWhenMarioTakesAMushroom(){
        mario.setPower(new MushroomPower());

        assertEquals("none", mario.performBButtonAction());
    }

    @Test
    public void testSpeedWhenMarioTakesAMushroom(){
        mario.setPower(new MushroomPower());

        assertEquals("normal", mario.getSpeed());
    }

    @Test
    public void testPowerWhenMarioTakesAStar(){
        mario.setPower(new StarPower());

        assertEquals("invincibility", mario.getPowerName());
    }

    @Test
    public void testAActionWhenMarioTakesAStar(){
        mario.setPower(new StarPower());

        assertEquals("dash jump", mario.performAButtonAction());
    }

    @Test
    public void testBActionWhenMarioTakesAStar(){
        mario.setPower(new StarPower());

        assertEquals("dash", mario.performBButtonAction());
    }

    @Test
    public void testSpeedWhenMarioTakesAStar(){
        mario.setPower(new StarPower());

        assertEquals("fast", mario.getSpeed());
    }

    @Test
    public void testPowerWhenMarioIsNormal(){
        mario.setPower(new NormalPower());

        assertEquals("normal", mario.getPowerName());
    }

    @Test
    public void testAActionWhenMarioIsNormal(){
        mario.setPower(new NormalPower());

        assertEquals("jump", mario.performAButtonAction());
    }

    @Test
    public void testBActionWhenMarioIsNormal(){
        mario.setPower(new NormalPower());

        assertEquals("none", mario.performBButtonAction());
    }

    @Test
    public void testSpeedWhenMarioIsNormal(){
        mario.setPower(new NormalPower());

        assertEquals("normal", mario.getSpeed());
    }

    @Test (expected = NullPointerException.class)
    public void testPowerWhenError(){
        mario.setPower(null);
        assertEquals("error",mario.getPowerName());
    }

    @Test (expected = NullPointerException.class)
    public void testBActionWhenError(){
        mario.setPower(null);
        assertEquals("error",mario.performBButtonAction());
    }

    @Test (expected = NullPointerException.class)
    public void testAActionWhenError(){
        mario.setPower(null);
        assertEquals("error",mario.performAButtonAction());
    }

    // Wrong Powers Test

    @Test
    public void testWrongPowerWhenMarioIsSword(){
        mario.setPower(new SwordPower());
        assertEquals("Can't get this power", mario.getPowerName());
    }

    @Test
    public void testWrongAActionWhenMarioIsSword(){
        mario.setPower(new SwordPower());
        assertEquals("Can't get this power", mario.performAButtonAction());
    }

    @Test
    public void testWrongSpeedWhenMarioIsSword(){
        mario.setPower(new SwordPower());

        assertEquals("Can't get this power", mario.getSpeed());
    }

    @Test
    public void testWrongBActionWhenMarioIsSword(){
        mario.setPower(new SwordPower());
        assertEquals("Can't get this power", mario.performBButtonAction());
    }

    @Test
    public void testWrongPowerWhenMarioIsInhale(){
        mario.setPower(new InhalePower());
        assertEquals("Can't get this power", mario.getPowerName());
    }

    @Test
    public void testWrongAActionWhenMarioIsInhale(){
        mario.setPower(new InhalePower());
        assertEquals("Can't get this power", mario.performAButtonAction());
    }

    @Test
    public void testWrongBActionWhenMarioIsInhale(){
        mario.setPower(new InhalePower());
        assertEquals("Can't get this power", mario.performBButtonAction());
    }

    @Test
    public void testWrongSpeedWhenMarioIsInhale(){
        mario.setPower(new InhalePower());

        assertEquals("Can't get this power", mario.getSpeed());
    }

    @Test
    public void testWrongPowerWhenMarioTakesABomb(){
        mario.setPower(new BombPower());
        assertEquals("Can't get this power", mario.getPowerName());
    }

    @Test
    public void testWrongAActionWhenMarioTakesABomb(){
        mario.setPower(new BombPower());
        assertEquals("Can't get this power", mario.performAButtonAction());
    }

    @Test
    public void testWrongBActionWhenMarioTakesABomb(){
        mario.setPower(new BombPower());
        assertEquals("Can't get this power", mario.performBButtonAction());
    }

    @Test
    public void testWrongSpeedWhenMarioTakesABomb(){
        mario.setPower(new BombPower());

        assertEquals("Can't get this power", mario.getSpeed());
    }
}