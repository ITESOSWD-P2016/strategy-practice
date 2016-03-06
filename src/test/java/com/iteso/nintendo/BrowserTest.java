package com.iteso.nintendo;

import static org.junit.Assert.assertEquals;

import javax.naming.directory.InvalidAttributesException;

import org.junit.Before;
import org.junit.Test;

import com.iteso.nintendo.character.Browser;
import com.iteso.nintendo.power.impl.AttackPower;
import com.iteso.nintendo.power.impl.FlowerPower;
import com.iteso.nintendo.power.impl.MushroomPower;
import com.iteso.nintendo.power.impl.NormalPower;
import com.iteso.nintendo.power.impl.StarPower;
import com.iteso.nintendo.power.impl.TouchPower;

public class BrowserTest {
    Browser browser;

    @Before
    public void setUp() throws InvalidAttributesException{
        browser = new Browser();
    }

    @Test
    public void testPowerWhenBrowserTakesAFlower() throws InvalidAttributesException{
        browser.setPower(new FlowerPower());
        assertEquals("fire",browser.getPowerName());
    }

    @Test
    public void testBActionWhenBrowserTakesAFlower() throws InvalidAttributesException{
    	browser.setPower(new FlowerPower());
        assertEquals("fireball",browser.performBButtonAction());
    }

    @Test
    public void testPowerWhenBrowserTakesAStar() throws InvalidAttributesException{
    	browser.setPower(new StarPower());
        assertEquals("invincibility",browser.getPowerName());
    }

    @Test
    public void testBActionWhenBrowserTakesAStar() throws InvalidAttributesException{
    	browser.setPower(new StarPower());
        assertEquals("dash",browser.performBButtonAction());
    }

    @Test
    public void testPowerWhenBrowserIsNormal() throws InvalidAttributesException{
    	browser.setPower(new NormalPower());
        assertEquals("normal",browser.getPowerName());
    }

    @Test
    public void testBActionWhenBrowserIsNormal() throws InvalidAttributesException{
    	browser.setPower(new NormalPower());
        assertEquals("nothing",browser.performBButtonAction());
    }
    
    @Test (expected = NullPointerException.class)
    public void testPowerWhenError() throws InvalidAttributesException{
    	browser.setPower(null);
        assertEquals("error",browser.getPowerName());
    }

    @Test (expected = NullPointerException.class)
    public void testBActionWhenError() throws InvalidAttributesException{
    	browser.setPower(null);
        assertEquals("error",browser.performBButtonAction());
    }
    
    @Test (expected = InvalidAttributesException.class)
    public void testSetInvalidPower() throws InvalidAttributesException{
    	browser.setPower(new AttackPower());
    	assertEquals("error", browser.performAButtonAction());
    }
    
    @Test
    public void testSetSpecialPower() throws InvalidAttributesException{
    	browser.setPower(new TouchPower());
    	assertEquals("super strength", browser.getPowerName());
    }
    
    @Test
    public void testAActionWhenBrowserIsNormal() throws InvalidAttributesException{
    	browser.setPower(new NormalPower());
        assertEquals("nothing",browser.performAButtonAction());
    }
    
    @Test
    public void testAActionWhenBrowserHasTouchPower() throws InvalidAttributesException{
    	browser.setPower(new TouchPower());
        assertEquals("kill character",browser.performAButtonAction());
    }
    
    @Test
    public void testAActionWhenKoopaHasFlowerPower() throws InvalidAttributesException{
    	browser.setPower(new FlowerPower());
        assertEquals("throw fireballs", browser.performAButtonAction());
    }
    
    @Test
    public void testAActionWhenKoopaHasMushroomPower() throws InvalidAttributesException{
    	browser.setPower(new MushroomPower());
        assertEquals("break blocks", browser.performAButtonAction());
    }
    
    @Test
    public void testAActionWhenKoopaHasStarPower() throws InvalidAttributesException{
    	browser.setPower(new StarPower());
        assertEquals("jump higher", browser.performAButtonAction());
    }
}
