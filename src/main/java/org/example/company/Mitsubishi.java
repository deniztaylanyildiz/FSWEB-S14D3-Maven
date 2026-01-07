package org.example.company;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        super.startEngine();
        return "Mitsubishi engine is starting";
    }

    @Override
    public String accelerate() {
        super.accelerate();
        return "Mitsubishi is accelerating";
    }

    @Override
    public String brake() {
        super.brake();
        return "Mitsubishi is braking";
    }
}