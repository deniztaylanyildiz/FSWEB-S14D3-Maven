package org.example.company;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        super.startEngine();
        return "Holden engine is starting";
    }

    @Override
    public String accelerate() {
        super.accelerate();
        return "Holden is accelerating";
    }

    @Override
    public String brake() {
        super.brake();
        return "Holden is braking";
    }
}