package com.iteso.nintendo;

import static org.junit.Assert.*;

import javax.naming.directory.InvalidAttributesException;

import org.junit.Before;
import org.junit.Test;

import com.iteso.nintendo.character.Koopa;
import com.iteso.nintendo.power.impl.AttackPower;
import com.iteso.nintendo.power.impl.FlowerPower;
import com.iteso.nintendo.power.impl.MushroomPower;
import com.iteso.nintendo.power.impl.NormalPower;
import com.iteso.nintendo.power.impl.StarPower;
import com.iteso.nintendo.power.impl.TouchPower;

public class KoopaTest {
    Koopa koopa;

    @Before
    public void setUp() throws InvalidAttributesException{
        koopa = new Koopa();
    }

    @Test
    public void testPowerWhenBrowserTakesAFlower() throws InvalidAttributesException{
        koopa.setPower(new FlowerPower());
        assertEquals("fire",koopa.getPowerName());
    }

    @Test
    public void testBActionWhenBrowserTakesAFlower() throws InvalidAttributesException{
    	koopa.setPower(new FlowerPower());
        assertEquals("fireball",koopa.performBButtonAction());
    }

    @Test
    public void testPowerWhenBrowserTakesAStar() throws InvalidAttributesException{
    	koopa.setPower(new StarPower());
        assertEquals("invincibility",koopa.getPowerName());
    }

    @Test
    public void testBActionWhenBrowserTakesAStar() throws InvalidAttributesException{
    	koopa.setPower(new StarPower());
        assertEquals("dash",koopa.performBButtonAction());
    }

    @Test
    public void testPowerWhenBrowserIsNormal() throws InvalidAttributesException{
    	koopa.setPower(new NormalPower());
        assertEquals("normal",koopa.getPowerName());
    }

    @Test
    public void testBActionWhenBrowserIsNormal() throws InvalidAttributesException{
    	koopa.setPower(new NormalPower());
        assertEquals("nothing",koopa.performBButtonAction());
    }
    
    @Test (expected = NullPointerException.class)
    public void testPowerWhenError() throws InvalidAttributesException{
    	koopa.setPower(null);
        assertEquals("error",koopa.getPowerName());
    }

    @Test (expected = NullPointerException.class)
    public void testBActionWhenError() throws InvalidAttributesException{
    	koopa.setPower(null);
        assertEquals("error",koopa.performBButtonAction());
    }
    
    @Test (expected = InvalidAttributesException.class)
    public void testSetInvalidPower() throws InvalidAttributesException{
    	koopa.setPower(new TouchPower());
    	assertEquals("error", koopa.performAButtonAction());
    }
    
    @Test
    public void testSetSpecialPower() throws InvalidAttributesException{
    	koopa.setPower(new AttackPower());
    	assertEquals("attack", koopa.getPowerName());
    }
    
    @Test
    public void testAActionWhenKoopaIsNormal() throws InvalidAttributesException{
    	koopa.setPower(new NormalPower());
        assertNull(koopa.performAButtonAction());
    }
    
    @Test
    public void testAActionWhenKoopaHasAttackPower() throws InvalidAttributesException{
    	koopa.setPower(new AttackPower());
        assertEquals("kill", koopa.performAButtonAction());
    }
    
    @Test
    public void testAActionWhenKoopaHasFlowerPower() throws InvalidAttributesException{
    	koopa.setPower(new FlowerPower());
        assertEquals("throw fireballs", koopa.performAButtonAction());
    }
    
    @Test
    public void testAActionWhenKoopaHasMushroomPower() throws InvalidAttributesException{
    	koopa.setPower(new MushroomPower());
        assertEquals("break blocks", koopa.performAButtonAction());
    }
    
    @Test
    public void testAActionWhenKoopaHasStarPower() throws InvalidAttributesException{
    	koopa.setPower(new StarPower());
        assertEquals("jump higher", koopa.performAButtonAction());
    }
}
