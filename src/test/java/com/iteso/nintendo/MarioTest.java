package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import com.iteso.nintendo.character.Mario;
import com.iteso.nintendo.power.impl.AttackPower;
import com.iteso.nintendo.power.impl.FlowerPower;
import com.iteso.nintendo.power.impl.MushroomPower;
import com.iteso.nintendo.power.impl.NormalPower;
import com.iteso.nintendo.power.impl.StarPower;

import static org.junit.Assert.assertEquals;

import javax.naming.directory.InvalidAttributesException;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class MarioTest {
    Mario mario;

    @Before
    public void setUp() throws InvalidAttributesException{
        mario = new Mario();
    }

    @Test
    public void testPowerWhenMarioTakesAFlower() throws InvalidAttributesException{
        mario.setPower(new FlowerPower());
        assertEquals("fire",mario.getPowerName());
    }

    @Test
    public void testBActionWhenMarioTakesAFlower() throws InvalidAttributesException{
    	mario.setPower(new FlowerPower());
        assertEquals("fireball",mario.performBButtonAction());
    }

    @Test
    public void testPowerWhenMarioTakesAStar() throws InvalidAttributesException{
    	mario.setPower(new StarPower());
        assertEquals("invincibility",mario.getPowerName());
    }

    @Test
    public void testBActionWhenMarioTakesAStar() throws InvalidAttributesException{
    	mario.setPower(new StarPower());
        assertEquals("dash",mario.performBButtonAction());
    }

    @Test
    public void testPowerWhenMarioIsNormal() throws InvalidAttributesException{
    	mario.setPower(new NormalPower());
        assertEquals("normal",mario.getPowerName());
    }

    @Test
    public void testBActionWhenMarioIsNormal() throws InvalidAttributesException{
    	mario.setPower(new NormalPower());
        assertEquals("nothing",mario.performBButtonAction());
    }
    
    @Test (expected = NullPointerException.class)
    public void testPowerWhenError() throws InvalidAttributesException{
    	mario.setPower(null);
        assertEquals("error",mario.getPowerName());
    }

    @Test (expected = NullPointerException.class)
    public void testBActionWhenError() throws InvalidAttributesException{
    	mario.setPower(null);
        assertEquals("error",mario.performBButtonAction());
    }
    
    @Test (expected = InvalidAttributesException.class)
    public void testSetInvalidPower() throws InvalidAttributesException{
    	mario.setPower(new AttackPower());
    	assertEquals("error", mario.performAButtonAction());
    }
    
    @Test
    public void testAActionWhenKoopaIsNormal() throws InvalidAttributesException{
    	mario.setPower(new NormalPower());
        assertEquals("jump", mario.performAButtonAction());
    }
    
    @Test
    public void testAActionWhenKoopaHasFlowerPower() throws InvalidAttributesException{
    	mario.setPower(new FlowerPower());
        assertEquals("throw fireballs", mario.performAButtonAction());
    }
    
    @Test
    public void testAActionWhenKoopaHasMushroomPower() throws InvalidAttributesException{
    	mario.setPower(new MushroomPower());
        assertEquals("break blocks", mario.performAButtonAction());
    }
    
    @Test
    public void testAActionWhenKoopaHasStarPower() throws InvalidAttributesException{
    	mario.setPower(new StarPower());
        assertEquals("jump higher", mario.performAButtonAction());
    }

}
