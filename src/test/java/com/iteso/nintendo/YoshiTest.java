package com.iteso.nintendo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.iteso.nintendo.characters.Yoshi;
import com.iteso.nintendo.powers.impl.BreatheFirePower;
import com.iteso.nintendo.powers.impl.FlowerPower;
import com.iteso.nintendo.powers.impl.MushroomPower;
import com.iteso.nintendo.powers.impl.NormalPower;
import com.iteso.nintendo.powers.impl.StarPower;

public class YoshiTest {
	Yoshi yoshi;

    @Before
    public void setUp(){
        yoshi = new Yoshi();
    }

    @Test
    public void testPowerWhenyoshiTakesAFlower(){
        yoshi.setPower(new FlowerPower());

        assertEquals("fire", yoshi.getCurrentPower());
    }

    @Test
    public void testBActionWhenyoshiTakesAFlower(){
        yoshi.setPower(new FlowerPower());

        assertEquals("fireball", yoshi.performBButtonAction());
    }

    @Test
    public void testPowerWhenyoshiTakesAStar(){
        yoshi.setPower(new StarPower());

        assertEquals("invincibility", yoshi.getCurrentPower());
    }

    @Test
    public void testBActionWhenyoshiTakesAStar(){
        yoshi.setPower(new StarPower());

        assertEquals("dash", yoshi.performBButtonAction());
    }

    @Test
    public void testPowerWhenyoshiTakesAMushroom(){
        yoshi.setPower(new MushroomPower());

        assertEquals("giant", yoshi.getCurrentPower());
    }

    @Test
    public void testBActionWhenyoshiTakesAMushroom(){
        yoshi.setPower(new MushroomPower());

        assertEquals("superstrength", yoshi.performBButtonAction());
    }
    
    @Test
    public void testPowerWhenyoshihasYoshiPower(){
        yoshi.setPower(new BreatheFirePower());

        assertEquals("yoshipower", yoshi.getCurrentPower());
    }

    @Test
    public void testBActionWhenyoshihasYoshiPower(){
        yoshi.setPower(new BreatheFirePower());

        assertEquals("breathefire", yoshi.performBButtonAction());
    }
    
    @Test
    public void testPowerWhenyoshiIsNormal(){
        yoshi.setPower(new NormalPower());

        assertEquals("normal", yoshi.getCurrentPower());
    }

    @Test
    public void testBActionWhenyoshiIsNormal(){
        yoshi.setPower(new NormalPower());

        assertEquals("nothing", yoshi.performBButtonAction());
    }
    
    @Test(expected = NullPointerException.class)
    public void testPowerWhenError(){
        yoshi.setPower(null);
 
        assertEquals("error", yoshi.getCurrentPower());
    }

    @Test(expected = NullPointerException.class)
    public void testBActionWhenError(){
        yoshi.setPower(null);

        assertEquals("error", yoshi.performBButtonAction());
    }
}
