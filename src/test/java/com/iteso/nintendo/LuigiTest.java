package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.iteso.nintendo.characters.Luigi;
import com.iteso.nintendo.powers.impl.FloatPower;
import com.iteso.nintendo.powers.impl.FlowerPower;
import com.iteso.nintendo.powers.impl.MushroomPower;
import com.iteso.nintendo.powers.impl.NormalPower;
import com.iteso.nintendo.powers.impl.StarPower;

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

        assertEquals("fire", luigi.getCurrentPower());
    }

    @Test
    public void testBActionWhenLuigiTakesAFlower(){
        luigi.setPower(new FlowerPower());

        assertEquals("fireball", luigi.performBButtonAction());
    }
    @Test
    public void testAActionWhenLuigiTakesAFlower(){
        luigi.setPower(new FlowerPower());

        assertEquals("open door", luigi.performAButtonAction());
    }
    

    @Test
    public void testPowerWhenLuigiTakesAStar(){
        luigi.setPower(new StarPower());

        assertEquals("invincibility", luigi.getCurrentPower());
    }

    @Test
    public void testBActionWhenLuigiTakesAStar(){
        luigi.setPower(new StarPower());

        assertEquals("dash", luigi.performBButtonAction());
    }
    @Test
    public void testAActionWhenLuigiTakesAStar(){
        luigi.setPower(new StarPower());

        assertEquals("open door", luigi.performAButtonAction());
    }
    

    @Test
    public void testPowerWhenLuigiTakesAMushroom(){
        luigi.setPower(new MushroomPower());

        assertEquals("giant", luigi.getCurrentPower());
    }

    @Test
    public void testBActionWhenLuigiTakesAMushroom(){
        luigi.setPower(new MushroomPower());

        assertEquals("superstrength", luigi.performBButtonAction());
    }
    @Test
    public void testAActionWhenLuigiTakesAMushroom(){
        luigi.setPower(new MushroomPower());

        assertEquals("open door", luigi.performAButtonAction());
    }
    
    
    @Test
    public void testPowerWhenLuigiIsNormal(){
        luigi.setPower(new NormalPower());

        assertEquals("normal", luigi.getCurrentPower());
    }

    @Test
    public void testBActionWhenLuigiIsNormal(){
        luigi.setPower(new NormalPower());

        assertEquals("nothing", luigi.performBButtonAction());
    }
    
    @Test
    public void testAActionWhenLuigiIsNormal(){
        luigi.setPower(new NormalPower());

        assertEquals("open door", luigi.performAButtonAction());
    }
    
    @Test
    public void testPowerWhenLuigiWantsExclusivePower(){
        luigi.setPower(new FloatPower());

        assertEquals("error", luigi.performBButtonAction());
    }
    
    
    @Test(expected = NullPointerException.class)
    public void testPowerWhenError(){
        luigi.setPower(null);
 
        assertEquals("error", luigi.getCurrentPower());
    }

    @Test(expected = NullPointerException.class)
    public void testBActionWhenError(){
        luigi.setPower(null);

        assertEquals("error", luigi.performBButtonAction());
    }
    
    @Test(expected = NullPointerException.class)
    public void testAActionWhenError(){
        luigi.setPower(null);

        assertEquals("error", luigi.performAButtonAction());
    }

}
