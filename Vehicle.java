package org.example;

class Vehicle {
    public static float increaseSpeed(float increaseBy, float currentSpeed) {
        return currentSpeed += increaseBy;
    }

    public static float decreseSpeed(float decreseBy, float currentSpeed) {
        return currentSpeed -= decreseBy;
    }

    public static float stop() {
        return 0;
    }
}