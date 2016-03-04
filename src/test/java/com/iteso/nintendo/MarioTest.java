package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import com.iteso.nintendo.character.Mario;
import com.iteso.nintendo.power.impl.FlowerPower;
import com.iteso.nintendo.power.impl.NormalPower;
import com.iteso.nintendo.power.impl.StarPower;

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
        assertEquals("fire",mario.getPowerName());
    }

    @Test
    public void testBActionWhenMarioTakesAFlower(){
    	mario.setPower(new FlowerPower());
        assertEquals("fireball",mario.performBButtonAction());
    }

    @Test
    public void testPowerWhenMarioTakesAStar(){
    	mario.setPower(new StarPower());
        assertEquals("invincibility",mario.getPowerName());
    }

    @Test
    public void testBActionWhenMarioTakesAStar(){
    	mario.setPower(new StarPower());
        assertEquals("dash",mario.performBButtonAction());
    }

    @Test
    public void testPowerWhenMarioIsNormal(){
    	mario.setPower(new NormalPower());
        assertEquals("normal",mario.getPowerName());
    }

    @Test
    public void testBActionWhenMarioIsNormal(){
    	mario.setPower(new NormalPower());
        assertEquals("nothing",mario.performBButtonAction());
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

}
