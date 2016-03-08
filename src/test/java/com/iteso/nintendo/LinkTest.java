package com.iteso.nintendo;

import com.iteso.nintendo.Characters.Link;
import com.iteso.nintendo.Powers.impl.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class LinkTest {
    Link link;

    @Before
    public void setUp(){
        link = new Link();
    }

    @Test
    public void testWrongPowerWhenLinkTakesAFlower(){
        link.setPower(new FlowerPower());

        assertEquals("Can't get this power", link.getPowerName());
    }

    @Test
    public void testWrongAActionWhenLinkTakesAFlower(){
        link.setPower(new FlowerPower());

        assertEquals("Can't get this power", link.performAButtonAction());
    }

    @Test
    public void testWrongBActionWhenLinkTakesAFlower(){
        link.setPower(new FlowerPower());

        assertEquals("Can't get this power", link.performBButtonAction());
    }

    @Test
    public void testWrongSpeedWhenLinkTakesAFlower(){
        link.setPower(new FlowerPower());

        assertEquals("Can't get this power", link.getSpeed());
    }

    @Test
    public void testPowerWhenLinkTakesAMushroom(){
        link.setPower(new MushroomPower());

        assertEquals("giant", link.getPowerName());
    }

    @Test
    public void testWrongAActionWhenLinkTakesAMushroom(){
        link.setPower(new MushroomPower());

        assertEquals("brick break jump", link.performAButtonAction());
    }

    @Test
    public void testWrongBActionWhenLinkTakesAMushroom(){
        link.setPower(new MushroomPower());

        assertEquals("none", link.performBButtonAction());
    }

    @Test
    public void testWrongSpeedWhenLinkTakesAMushroom(){
        link.setPower(new MushroomPower());

        assertEquals("normal", link.getSpeed());
    }

    @Test
    public void testPowerWhenLinkTakesAStar(){
        link.setPower(new StarPower());

        assertEquals("invincibility", link.getPowerName());
    }

    @Test
    public void testAActionWhenLinkTakesAStar(){
        link.setPower(new StarPower());

        assertEquals("dash jump", link.performAButtonAction());
    }

    @Test
    public void testBActionWhenLinkTakesAStar(){
        link.setPower(new StarPower());

        assertEquals("dash", link.performBButtonAction());
    }

    @Test
    public void testSpeedWhenLinkTakesAStar(){
        link.setPower(new StarPower());

        assertEquals("fast", link.getSpeed());
    }

    @Test
    public void testWrongPowerWhenLinkIsNormal(){
        link.setPower(new NormalPower());

        assertEquals("Can't get this power", link.getPowerName());
    }

    @Test
    public void testWrongAActionWhenLinkIsNormal(){
        link.setPower(new NormalPower());

        assertEquals("Can't get this power", link.performAButtonAction());
    }

    @Test
    public void testWrongBActionWhenLinkIsNormal(){
        link.setPower(new NormalPower());

        assertEquals("Can't get this power", link.performBButtonAction());
    }

    @Test
    public void testWrongSpeedWhenLinkIsNormal(){
        link.setPower(new NormalPower());

        assertEquals("Can't get this power", link.getSpeed());
    }

    @Test (expected = NullPointerException.class)
    public void testPowerWhenError(){
        link.setPower(null);
        assertEquals("error",link.getPowerName());
    }

    @Test (expected = NullPointerException.class)
    public void testBActionWhenError(){
        link.setPower(null);
        assertEquals("error",link.performBButtonAction());
    }

    @Test (expected = NullPointerException.class)
    public void testAActionWhenError(){
        link.setPower(null);
        assertEquals("error",link.performAButtonAction());
    }


    @Test
    public void testPowerWhenLinkIsSword(){
        link.setPower(new SwordPower());
        assertEquals("swordsmanship", link.getPowerName());
    }

    @Test
    public void testAActionWhenLinkIsSword(){
        link.setPower(new SwordPower());
        assertEquals("jump slash", link.performAButtonAction());
    }

    @Test
    public void testBActionWhenLinkIsSword(){
        link.setPower(new SwordPower());
        assertEquals("sword slash", link.performBButtonAction());
    }

    @Test
    public void testSpeedWhenLinkIsSword(){
        link.setPower(new SwordPower());

        assertEquals("normal", link.getSpeed());
    }

    @Test
    public void testWrongPowerWhenLinkIsInhale(){
        link.setPower(new InhalePower());
        assertEquals("Can't get this power", link.getPowerName());
    }

    @Test
    public void testWrongAActionWhenLinkIsInhale(){
        link.setPower(new InhalePower());
        assertEquals("Can't get this power", link.performAButtonAction());
    }

    @Test
    public void testWrongBActionWhenLinkIsInhale(){
        link.setPower(new InhalePower());
        assertEquals("Can't get this power", link.performBButtonAction());
    }

    @Test
    public void testWrongSpeedWhenLinkTakesIsInhale(){
        link.setPower(new InhalePower());

        assertEquals("Can't get this power", link.getSpeed());
    }

    @Test
    public void testPowerWhenLinkTakesABomb(){
        link.setPower(new BombPower());
        assertEquals("bomberman", link.getPowerName());
    }

    @Test
    public void testAActionWhenLinkTakesABomb(){
        link.setPower(new BombPower());
        assertEquals("jump", link.performAButtonAction());
    }

    @Test
    public void testBActionWhenLinkTakesABomb(){
        link.setPower(new BombPower());
        assertEquals("bomb throw", link.performBButtonAction());
    }

    @Test
    public void testSpeedWhenLinkTakesABomb(){
        link.setPower(new BombPower());

        assertEquals("slow", link.getSpeed());
    }
}
