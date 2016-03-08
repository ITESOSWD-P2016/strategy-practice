package com.iteso.nintendo;

import com.iteso.nintendo.Characters.Luigi;
import com.iteso.nintendo.Powers.impl.*;
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
        luigi.setPower(new FlowerPower());

        assertEquals("fire", luigi.getPowerName());
    }

    @Test
    public void testAActionWhenLuigiTakesAFlower(){
        luigi.setPower(new FlowerPower());

        assertEquals("brick break jump", luigi.performAButtonAction());
    }

    @Test
    public void testBActionWhenLuigiTakesAFlower(){
        luigi.setPower(new FlowerPower());

        assertEquals("fireball", luigi.performBButtonAction());
    }

    @Test
    public void testSpeedWhenLuigiTakesAFlower(){
        luigi.setPower(new FlowerPower());

        assertEquals("normal", luigi.getSpeed());
    }

    @Test
    public void testPowerWhenLuigiTakesAMushroom(){
        luigi.setPower(new MushroomPower());

        assertEquals("giant", luigi.getPowerName());
    }

    @Test
    public void testAActionWhenLuigiTakesAMushroom(){
        luigi.setPower(new MushroomPower());

        assertEquals("brick break jump", luigi.performAButtonAction());
    }

    @Test
    public void testBActionWhenLuigiTakesAMushroom(){
        luigi.setPower(new MushroomPower());

        assertEquals("none", luigi.performBButtonAction());
    }

    @Test
    public void testSpeedWhenLuigiTakesAMushroom(){
        luigi.setPower(new MushroomPower());

        assertEquals("normal", luigi.getSpeed());
    }

    @Test
    public void testPowerWhenLuigiTakesAStar(){
        luigi.setPower(new StarPower());

        assertEquals("invincibility", luigi.getPowerName());
    }

    @Test
    public void testAActionWhenLuigiTakesAStar(){
        luigi.setPower(new StarPower());

        assertEquals("dash jump", luigi.performAButtonAction());
    }

    @Test
    public void testBActionWhenLuigiTakesAStar(){
        luigi.setPower(new StarPower());

        assertEquals("dash", luigi.performBButtonAction());
    }

    @Test
    public void testSpeedWhenLuigiTakesAStar(){
        luigi.setPower(new StarPower());

        assertEquals("fast", luigi.getSpeed());
    }

    @Test
    public void testPowerWhenLuigiIsNormal(){
        luigi.setPower(new NormalPower());

        assertEquals("normal", luigi.getPowerName());
    }

    @Test
    public void testAActionWhenLuigiIsNormal(){
        luigi.setPower(new NormalPower());

        assertEquals("jump", luigi.performAButtonAction());
    }

    @Test
    public void testBActionWhenLuigiIsNormal(){
        luigi.setPower(new NormalPower());

        assertEquals("none", luigi.performBButtonAction());
    }

    @Test
    public void testSpeedWhenLuigiIsNormal(){
        luigi.setPower(new NormalPower());

        assertEquals("normal", luigi.getSpeed());
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

    @Test (expected = NullPointerException.class)
    public void testAActionWhenError(){
        luigi.setPower(null);
        assertEquals("error",luigi.performAButtonAction());
    }

    // Wrong Powers Test

    @Test
    public void testWrongPowerWhenLuigiIsSword(){
        luigi.setPower(new SwordPower());
        assertEquals("Can't get this power", luigi.getPowerName());
    }

    @Test
    public void testWrongAActionWhenLuigiIsSword(){
        luigi.setPower(new SwordPower());
        assertEquals("Can't get this power", luigi.performAButtonAction());
    }

    @Test
    public void testWrongSpeedWhenLuigiIsSword(){
        luigi.setPower(new SwordPower());

        assertEquals("Can't get this power", luigi.getSpeed());
    }

    @Test
    public void testWrongBActionWhenLuigiIsSword(){
        luigi.setPower(new SwordPower());
        assertEquals("Can't get this power", luigi.performBButtonAction());
    }

    @Test
    public void testWrongPowerWhenLuigiIsInhale(){
        luigi.setPower(new InhalePower());
        assertEquals("Can't get this power", luigi.getPowerName());
    }

    @Test
    public void testWrongAActionWhenLuigiIsInhale(){
        luigi.setPower(new InhalePower());
        assertEquals("Can't get this power", luigi.performAButtonAction());
    }

    @Test
    public void testWrongBActionWhenLuigiIsInhale(){
        luigi.setPower(new InhalePower());
        assertEquals("Can't get this power", luigi.performBButtonAction());
    }

    @Test
    public void testWrongSpeedWhenLuigiIsInhale(){
        luigi.setPower(new InhalePower());

        assertEquals("Can't get this power", luigi.getSpeed());
    }

    @Test
    public void testWrongPowerWhenLuigiTakesABomb(){
        luigi.setPower(new BombPower());
        assertEquals("Can't get this power", luigi.getPowerName());
    }

    @Test
    public void testWrongAActionWhenLuigiTakesABomb(){
        luigi.setPower(new BombPower());
        assertEquals("Can't get this power", luigi.performAButtonAction());
    }

    @Test
    public void testWrongBActionWhenLuigiTakesABomb(){
        luigi.setPower(new BombPower());
        assertEquals("Can't get this power", luigi.performBButtonAction());
    }

    @Test
    public void testWrongSpeedWhenLuigiTakesABomb(){
        luigi.setPower(new BombPower());

        assertEquals("Can't get this power", luigi.getSpeed());
    }
}
