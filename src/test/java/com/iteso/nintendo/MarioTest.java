package com.iteso.nintendo;

import com.iteso.nintendo.characters.Mario;
import com.iteso.nintendo.powers.impl.*;
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
    public void testBActionWhenMarioIsBig(){
        mario.setPower(new MushroomPower());

        assertEquals("break bricks",mario.performBButtonAction());
    }

    @Test
    public void testPowerWhenMarioIsBig(){
        mario.setPower(new MushroomPower());

        assertEquals("giant", mario.getCurrentPower());
    }

    @Rule
    public final ExpectedException exception = ExpectedException.none();
    @Test(expected = NullPointerException.class)
    public void testBActionWhenError(){
        mario.setPower(null);

        assertEquals("error",mario.performBButtonAction());
    }

    @Test(expected=NullPointerException.class)
    public void testPowerWhenError(){
        mario.setPower(null);

        assertEquals("error", mario.getCurrentPower());
    }

    @Test
    public void testAActionWhenMarioIsNormal(){
        mario.setPower(new Normal());

        assertEquals("jump",mario.performAButtonAction());
    }
    @Test
    public void testAActionWhenMarioTakesAStar() {
        mario.setPower(new StarPower());

        assertEquals("jump", mario.performAButtonAction());
    }

    @Test
    public void testAActionWhenMarioTakesAFlower(){
        mario.setPower(new FlowerPower());

        assertEquals("jump",mario.performAButtonAction());
    }
    @Test
    public void testAActionWhenMarioIsBig() {
     mario.setPower(new MushroomPower());

     assertEquals("jump", mario.performAButtonAction());
    }

    @Test(expected = NullPointerException.class)
    public void testAActionWhenError() {
        mario.setPower(null);
    }

    @Test //Rodrigo esta prueba es para verificar que es poder exclusivo el de BulletBill

    public void testAActionWhenMarioIsAngry() {
        mario.setPower(new SpeedPower());

        assertEquals("error", mario.performBButtonAction());
    }
}


