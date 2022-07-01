package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class VehicleTest {

    @Test
    void increaseSpeed() {
        assertEquals(20, Vehicle.increaseSpeed(20, 0));
    }

    @Test
    void decreseSpeed() {
        assertEquals(20, Vehicle.decreseSpeed(5, 25));
    }

    @Test
    void stop() {
        assertEquals(0, Vehicle.stop());
    }
}