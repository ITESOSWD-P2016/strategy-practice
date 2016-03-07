package com.iteso.nintendo;
import com.iteso.nintendo.characters.Bowser;
import com.iteso.nintendo.powers.impl.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Sebastian on 06/03/16.
 */
public class BowserTest {
    Bowser bowser;

    @Before
    public void setUp() {
        bowser = new Bowser();
    }

    @Test
    public void testPowerWhenBowserTakesAFlower() {
        bowser.setPower(new FlowerPower());

        assertEquals("fire", bowser.getCurrentPower());
    }

    @Test
    public void testBActionWhenBowserTakesAFlower() {
        bowser.setPower(new FlowerPower());

        assertEquals("fireball", bowser.performBButtonAction());
    }

    @Test
    public void testPowerWhenBowserTakesAStar() {
        bowser.setPower(new StarPower());

        assertEquals("invincibility", bowser.getCurrentPower());
    }

    @Test
    public void testBActionWhenBowserTakesAStar() {
        bowser.setPower(new StarPower());

        assertEquals("dash", bowser.performBButtonAction());
    }

    @Test
    public void testPowerWhenBowserIsNormal() {
        bowser.setPower(new Normal());

        assertEquals("normal", bowser.getCurrentPower());
    }

    @Test
    public void testBActionWhenBowserIsNormal() {
        bowser.setPower(new Normal());

        assertEquals("nothing", bowser.performBButtonAction());
    }

    @Test(expected = NullPointerException.class)
    public void testPowerWhenError() {
        bowser.setPower(null);

        assertEquals("error", bowser.getCurrentPower());
    }

    @Test(expected = NullPointerException.class)
    public void testBActionWhenError() {
        bowser.setPower(null);

        assertEquals("error", bowser.performBButtonAction());

    }

    @Test
    public void testBActionWhenBowserIsBig() {
        bowser.setPower(new MushroomPower());

        assertEquals("break bricks", bowser.performBButtonAction());
    }

    @Test
    public void testPowerWhenBowserIsBig() {
        bowser.setPower(new MushroomPower());
        assertEquals("giant", bowser.getCurrentPower());
    }

    @Test
    public void testPowerWhenBowserIsAngry() {
        bowser.setPower(new FirePower());
        assertEquals("flames", bowser.getCurrentPower());
    }

    @Test
    public void testBActionWhenBowserIsAngry() {
        bowser.setPower(new FirePower());

        assertEquals("flamethrower", bowser.performBButtonAction());
    }
}