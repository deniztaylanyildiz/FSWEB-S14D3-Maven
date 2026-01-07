package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public String startEngine() {
        return getName() + " (Hybrid) is switching between battery and gas.";
    }

    @Override
    public String drive() {
        super.runEngine();
        return getName() + " is driving optimally with its " + cylinders + " cylinders.";
    }
}