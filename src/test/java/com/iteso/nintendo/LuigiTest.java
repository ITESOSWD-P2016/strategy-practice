package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import com.iteso.nintendo.character.Luigi;
import com.iteso.nintendo.power.impl.FlowerPower;
import com.iteso.nintendo.power.impl.MushroomPower;
import com.iteso.nintendo.power.impl.NormalPower;
import com.iteso.nintendo.power.impl.StarPower;
import com.iteso.nintendo.power.impl.TouchPower;

import static org.junit.Assert.assertEquals;
import javax.naming.directory.InvalidAttributesException;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class LuigiTest {
    Luigi luigi;

    @Before
    public void setUp() throws InvalidAttributesException{
        luigi = new Luigi();
    }

    @Test
    public void testPowerWhenLuigiTakesAFlower() throws InvalidAttributesException{
        luigi.setPower(new FlowerPower());
        assertEquals("fire",luigi.getPowerName());
    }

    @Test
    public void testBActionWhenLuigiTakesAFlower() throws InvalidAttributesException{
    	luigi.setPower(new FlowerPower());
        assertEquals("fireball",luigi.performBButtonAction());
    }

    @Test
    public void testPowerWhenLuigiTakesAStar() throws InvalidAttributesException{
    	luigi.setPower(new StarPower());
        assertEquals("invincibility",luigi.getPowerName());
    }

    @Test
    public void testBActionWhenLuigiTakesAStar() throws InvalidAttributesException{
    	luigi.setPower(new StarPower());
        assertEquals("dash",luigi.performBButtonAction());
    }

    @Test
    public void testPowerWhenLuigiIsNormal() throws InvalidAttributesException{
    	luigi.setPower(new NormalPower());
        assertEquals("normal",luigi.getPowerName());
    }

    @Test
    public void testBActionWhenLuigiIsNormal() throws InvalidAttributesException{
    	luigi.setPower(new NormalPower());
        assertEquals("nothing",luigi.performBButtonAction());
    }
    
    @Test (expected = NullPointerException.class)
    public void testPowerWhenError() throws InvalidAttributesException{
    	luigi.setPower(null);
        assertEquals("error",luigi.getPowerName());
    }

    @Test (expected = NullPointerException.class)
    public void testBActionWhenError() throws InvalidAttributesException{
    	luigi.setPower(null);
        assertEquals("error",luigi.performBButtonAction());
    }
    
    @Test (expected = InvalidAttributesException.class)
    public void testSetInvalidPower() throws InvalidAttributesException{
    	luigi.setPower(new TouchPower());
    	assertEquals("error", luigi.performAButtonAction());
    }
    
    @Test
    public void testAActionWhenKoopaIsNormal() throws InvalidAttributesException{
    	luigi.setPower(new NormalPower());
        assertEquals("jump", luigi.performAButtonAction());
    }
    
    @Test
    public void testAActionWhenKoopaHasFlowerPower() throws InvalidAttributesException{
    	luigi.setPower(new FlowerPower());
        assertEquals("throw fireballs", luigi.performAButtonAction());
    }
    
    @Test
    public void testAActionWhenKoopaHasMushroomPower() throws InvalidAttributesException{
    	luigi.setPower(new MushroomPower());
        assertEquals("break blocks", luigi.performAButtonAction());
    }
    
    @Test
    public void testAActionWhenKoopaHasStarPower() throws InvalidAttributesException{
    	luigi.setPower(new StarPower());
        assertEquals("jump higher", luigi.performAButtonAction());
    }
}
