package com.iteso.nintendo;

import com.iteso.nintendo.characters.Luigi;
import com.iteso.nintendo.powers.impl.FlowerPower;
import com.iteso.nintendo.powers.impl.MushroomPower;
import com.iteso.nintendo.powers.impl.Normal;
import com.iteso.nintendo.powers.impl.StarPower;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.rules.ExpectedException;
import org.junit.Rule;

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
    public void testPowerWhenLuigiIsNormal(){
        luigi.setPower(new Normal());

        assertEquals("normal", luigi.getCurrentPower());
    }

    @Test
    public void testBActionWhenLuigiIsNormal(){
        luigi.setPower(new Normal());

        assertEquals("nothing", luigi.performBButtonAction());
    }

    @Rule
    public final ExpectedException exception = ExpectedException.none();
    @Test(expected = NullPointerException.class)
    public void testBActionWhenError(){
        luigi.setPower(null);

        assertEquals("break bricks",luigi.performBButtonAction());

    }


    @Test
    public void testPowerActionWhenLuigiIsBig() {
        luigi.setPower(new MushroomPower());

        assertEquals("error", luigi.performBButtonAction());
    }


}
