package com.iteso.nintendo;


import com.iteso.nintendo.*;
import com.iteso.nintendo.Caracteres.Toad;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by Flaveyro´sDell on 07/03/2016.
 */
public class ToadTest {

    Toad toad;

    @Before
    public void setUp(){
        toad = new Toad();
    }

    @Test
    public void testPowerWhenMarioTakesAFlower(){
        toad.setPower("flower");

        assertEquals("fire",toad.getCurrentPower());
    }

    @Test
    public void testBActionWhenMarioTakesAFlower(){
        toad.setPower("flower");

        assertEquals("fireball",toad.performBButtonAction());
    }

    @Test
    public void testPowerWhenMarioTakesAStar(){
        toad.setPower("star");

        assertEquals("invincibility",toad.getCurrentPower());
    }

    @Test
    public void testBActionWhenMarioTakesAStar(){
        toad.setPower("star");

        assertEquals("dash",toad.performBButtonAction());
    }

    @Test
    public void testPowerWhenMarioIsNormal(){
        toad.setPower("clear power");

        assertEquals("normal",toad.getCurrentPower());
    }

    @Test
    public void testBActionWhenMarioIsNormal(){
        toad.setPower("clear power");

        assertEquals("nothing",toad.performBButtonAction());
    }
    @Test
    public void testPowerWhenError(){
        toad.setPower("invalid");

        assertEquals("error",toad.getCurrentPower());
    }

    @Test
    public void testBActionWhenError(){
        toad.setPower("invalid");

        assertEquals("error",toad.performBButtonAction());
    }
    @Test
    public void TestPowerwhenToadTakesABomb(){
    toad.setPower("BombSoul");

    assertEquals("Explosive",toad.getCurrentPower());
}
    @Test
    public void TestPowerwhenToadHpnotist(){
        toad.setPower("Hipnotize");

        assertEquals("Control Enemy",toad.getCurrentPower());
    }

}


