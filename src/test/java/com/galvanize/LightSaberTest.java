package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LightSaberTest {
    @Test
    public void storesJediSerialNumber() {
        LightSaber lightSaber = new LightSaber(123456);
        assertEquals(123456, lightSaber.getJediSerialNumber());
    }

    @Test
    public void storesNewChargeValue() {
        LightSaber lightSaber = new LightSaber(123456);

        lightSaber.setCharge(200.0f);

        assertEquals(200.0f, lightSaber.getCharge());
    }

    @Test
    public void storesNewColorValue() {
        LightSaber lightSaber = new LightSaber(123456);

        lightSaber.setColor("purple");

        assertEquals("purple", lightSaber.getColor());
    }

    @Test
    public void chargeReducedAfter10Minutes() {
        LightSaber lightSaber = new LightSaber(123456);

        lightSaber.use(60.0f);

        assertEquals(90.0f, lightSaber.getCharge());
    }

    @Test
    public void checkAccurateRemainingMinutes() {
        LightSaber lightSaber = new LightSaber(123456);

        assertEquals(300, lightSaber.getRemainingMinutes());
    }

    @Test
    public void checkRechargeAfterUse() {
        LightSaber lightSaber = new LightSaber(123456);

        lightSaber.use(60.0f);
        lightSaber.recharge();

        assertEquals(100.0f, lightSaber.getCharge());
    }
}
