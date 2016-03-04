package com.iteso.nintendo;

import com.iteso.nintendo.characters.Mario;
import com.iteso.nintendo.powers.impl.FlowerPower;
import com.iteso.nintendo.powers.impl.MushroomPower;
import com.iteso.nintendo.powers.impl.Normal;
import com.iteso.nintendo.powers.impl.StarPower;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.rules.ExpectedException;
import org.junit.Rule;

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

        assertEquals("fire",mario.getCurrentPower());
    }

    @Test
    public void testBActionWhenMarioTakesAFlower(){
        mario.setPower(new FlowerPower());

        assertEquals("fireball",mario.performBButtonAction());
    }

    @Test
    public void testPowerWhenMarioTakesAStar(){
        mario.setPower(new StarPower());

        assertEquals("invincibility",mario.getCurrentPower());
    }

    @Test
    public void testBActionWhenMarioTakesAStar(){
        mario.setPower(new StarPower());

        assertEquals("dash",mario.performBButtonAction());
    }

    @Test
    public void testPowerWhenMarioIsNormal(){
        mario.setPower(new Normal());

        assertEquals("normal",mario.getCurrentPower());
    }

    @Test
    public void testBActionWhenMarioIsNormal(){
        mario.setPower(new Normal());

        assertEquals("nothing",mario.performBButtonAction());
    }
    @Test
    public void testPowerActionWhenMarioIsBig(){
        mario.setPower(new MushroomPower());

        assertEquals("break bricks",mario.performBButtonAction());
    }

    @Rule
    public final ExpectedException exception = ExpectedException.none();
    @Test(expected = NullPointerException.class)
    public void testBActionWhenError(){
        mario.setPower(null);

        assertEquals("error",mario.performBButtonAction());
    }
}


