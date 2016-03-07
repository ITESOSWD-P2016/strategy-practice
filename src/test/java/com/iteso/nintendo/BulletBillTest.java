package com.iteso.nintendo;
import com.iteso.nintendo.characters.Bowser;
import com.iteso.nintendo.characters.BulletBill;
import com.iteso.nintendo.powers.impl.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Sebastian on 06/03/16.
 */
public class BulletBillTest {

        BulletBill bulletBill;

        @Before
        public void setUp() {
            bulletBill = new BulletBill();
        }

    @Test
    public void testPowerWhenBulletBillIsNormal() {
        bulletBill.setPower(new Normal());

        assertEquals("normal", bulletBill.getCurrentPower());
    }

    @Test
    public void testBActionWhenBulletBillIsNormal() {
        bulletBill.setPower(new Normal());

        assertEquals("nothing", bulletBill.performBButtonAction());
    }

    @Test
    public void testBActionWhenBulletBillIsAngry() {
        bulletBill.setPower(new SpeedPower());

        assertEquals("MaxSpeed", bulletBill.performBButtonAction());
    }

    @Test
    public void testPowerWhenBulletBillIsAngy() {
        bulletBill.setPower(new SpeedPower());

        assertEquals("Speed", bulletBill.getCurrentPower());
    }

}
