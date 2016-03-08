package com.iteso.nintendo;

import com.iteso.nintendo.Characters.Kirby;
import com.iteso.nintendo.Powers.impl.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class KirbyTest {
    Kirby kirby;

    @Before
    public void setUp(){
        kirby = new Kirby();
    }

    @Test
    public void testPowerWhenKirbyTakesAFlower(){
        kirby.setPower(new FlowerPower());

        assertEquals("fire", kirby.getPowerName());
    }

    @Test
    public void testAActionWhenKirbyTakesAFlower(){
        kirby.setPower(new FlowerPower());

        assertEquals("brick break jump", kirby.performAButtonAction());
    }

    @Test
    public void testBActionWhenKirbyTakesAFlower(){
        kirby.setPower(new FlowerPower());

        assertEquals("fireball", kirby.performBButtonAction());
    }

    @Test
    public void testSpeedWhenKirbyTakesAFlower(){
        kirby.setPower(new FlowerPower());

        assertEquals("normal", kirby.getSpeed());
    }

    @Test
    public void testWrongPowerWhenKirbyTakesAMushroom(){
        kirby.setPower(new MushroomPower());

        assertEquals("Can't get this power", kirby.getPowerName());
    }

    @Test
    public void testWrongAActionWhenKirbyTakesAMushroom(){
        kirby.setPower(new MushroomPower());

        assertEquals("Can't get this power", kirby.performAButtonAction());
    }

    @Test
    public void testWrongBActionWhenKirbyTakesAMushroom(){
        kirby.setPower(new MushroomPower());

        assertEquals("Can't get this power", kirby.performBButtonAction());
    }

    @Test
    public void testWrongSpeedWhenKirbyTakesAMushroom(){
        kirby.setPower(new MushroomPower());

        assertEquals("Can't get this power", kirby.getSpeed());
    }

    @Test
    public void testPowerWhenKirbyTakesAStar(){
        kirby.setPower(new StarPower());

        assertEquals("invincibility", kirby.getPowerName());
    }

    @Test
    public void testAActionWhenKirbyTakesAStar(){
        kirby.setPower(new StarPower());

        assertEquals("dash jump", kirby.performAButtonAction());
    }

    @Test
    public void testBActionWhenKirbyTakesAStar(){
        kirby.setPower(new StarPower());

        assertEquals("dash", kirby.performBButtonAction());
    }

    @Test
    public void testSpeedWhenKirbyTakesAStar(){
        kirby.setPower(new StarPower());

        assertEquals("fast", kirby.getSpeed());
    }

    @Test
    public void testWrongPowerWhenKirbyIsNormal(){
        kirby.setPower(new NormalPower());

        assertEquals("Can't get this power", kirby.getPowerName());
    }

    @Test
    public void testWrongAActionWhenKirbyIsNormal(){
        kirby.setPower(new NormalPower());

        assertEquals("Can't get this power", kirby.performAButtonAction());
    }

    @Test
    public void testWrongBActionWhenKirbyIsNormal(){
        kirby.setPower(new NormalPower());

        assertEquals("Can't get this power", kirby.performBButtonAction());
    }

    @Test
    public void testWrongSpeedWhenKirbyIsNormal(){
        kirby.setPower(new NormalPower());

        assertEquals("Can't get this power", kirby.getSpeed());
    }

    @Test (expected = NullPointerException.class)
    public void testPowerWhenError(){
        kirby.setPower(null);
        assertEquals("error",kirby.getPowerName());
    }

    @Test (expected = NullPointerException.class)
    public void testBActionWhenError(){
        kirby.setPower(null);
        assertEquals("error",kirby.performBButtonAction());
    }

    @Test (expected = NullPointerException.class)
    public void testAActionWhenError(){
        kirby.setPower(null);
        assertEquals("error",kirby.performAButtonAction());
    }


    @Test
    public void testWrongPowerWhenKirbyIsSword(){
        kirby.setPower(new SwordPower());
        assertEquals("Can't get this power", kirby.getPowerName());
    }

    @Test
    public void testWrongAActionWhenKirbyIsSword(){
        kirby.setPower(new SwordPower());
        assertEquals("Can't get this power", kirby.performAButtonAction());
    }

    @Test
    public void testWrongBActionWhenKirbyIsSword(){
        kirby.setPower(new SwordPower());
        assertEquals("Can't get this power", kirby.performBButtonAction());
    }

    @Test
    public void testWrongSpeedWhenKirbyIsSword(){
        kirby.setPower(new SwordPower());

        assertEquals("Can't get this power", kirby.getSpeed());
    }

    @Test
    public void testPowerWhenKirbyIsInhale(){
        kirby.setPower(new InhalePower());
        assertEquals("inhale", kirby.getPowerName());
    }

    @Test
    public void testAActionWhenKirbyIsInhale(){
        kirby.setPower(new InhalePower());
        assertEquals("jump >> float", kirby.performAButtonAction());
    }

    @Test
    public void testBActionWhenKirbyIsInhale(){
        kirby.setPower(new InhalePower());
        assertEquals("inhale >> throw", kirby.performBButtonAction());
    }

    @Test
    public void testSpeedWhenKirbyTakesIsInhale(){
        kirby.setPower(new InhalePower());

        assertEquals("slow", kirby.getSpeed());
    }

    @Test
    public void testPowerWhenKirbyTakesABomb(){
        kirby.setPower(new BombPower());
        assertEquals("bomberman", kirby.getPowerName());
    }

    @Test
    public void testAActionWhenKirbyTakesABomb(){
        kirby.setPower(new BombPower());
        assertEquals("jump", kirby.performAButtonAction());
    }

    @Test
    public void testBActionWhenKirbyTakesABomb(){
        kirby.setPower(new BombPower());
        assertEquals("bomb throw", kirby.performBButtonAction());
    }

    @Test
    public void testSpeedWhenKirbyTakesABomb(){
        kirby.setPower(new BombPower());

        assertEquals("slow", kirby.getSpeed());
    }
}
