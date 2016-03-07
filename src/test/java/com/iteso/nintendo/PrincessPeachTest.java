package com.iteso.nintendo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.iteso.nintendo.characters.PrincessPeach;
import com.iteso.nintendo.powers.impl.BreatheFirePower;
import com.iteso.nintendo.powers.impl.FloatPower;
import com.iteso.nintendo.powers.impl.FlowerPower;
import com.iteso.nintendo.powers.impl.MushroomPower;
import com.iteso.nintendo.powers.impl.NormalPower;
import com.iteso.nintendo.powers.impl.StarPower;

public class PrincessPeachTest {
	PrincessPeach peach;

    @Before
    public void setUp(){
        peach = new PrincessPeach();
    }
    
    @Test
    public void testPowerWhenpeachTakesAFlower(){
        peach.setPower(new FlowerPower());

        assertEquals("fire", peach.getCurrentPower());
    }

    @Test
    public void testBActionWhenpeachTakesAFlower(){
        peach.setPower(new FlowerPower());

        assertEquals("fireball", peach.performBButtonAction());
    }

    @Test
    public void testPowerWhenpeachTakesAStar(){
        peach.setPower(new StarPower());

        assertEquals("invincibility", peach.getCurrentPower());
    }

    @Test
    public void testBActionWhenpeachTakesAStar(){
        peach.setPower(new StarPower());

        assertEquals("dash", peach.performBButtonAction());
    }

    @Test
    public void testPowerWhenpeachTakesAMushroom(){
        peach.setPower(new MushroomPower());

        assertEquals("giant", peach.getCurrentPower());
    }

    @Test
    public void testBActionWhenpeachTakesAMushroom(){
        peach.setPower(new MushroomPower());

        assertEquals("superstrength", peach.performBButtonAction());
    }
    
    @Test
    public void testPowerWhenPeachHasPeachPower(){
        peach.setPower(new FloatPower());

        assertEquals("peachpower", peach.getCurrentPower());
    }

    @Test
    public void testBActionWhenPeachHasPeachPower(){
        peach.setPower(new FloatPower());

        assertEquals("float", peach.performBButtonAction());
    }
    
    @Test
    public void testPowerWhenpeachIsNormal(){
        peach.setPower(new NormalPower());

        assertEquals("normal", peach.getCurrentPower());
    }

    @Test
    public void testBActionWhenPeachIsNormal(){
        peach.setPower(new NormalPower());

        assertEquals("nothing", peach.performBButtonAction());
    }
    
    @Test(expected = NullPointerException.class)
    public void testPowerWhenError(){
        peach.setPower(null);
 
        assertEquals("error", peach.getCurrentPower());
    }

    @Test(expected = NullPointerException.class)
    public void testBActionWhenError(){
        peach.setPower(null);

        assertEquals("error", peach.performBButtonAction());
    }

}
