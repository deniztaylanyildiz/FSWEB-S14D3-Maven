package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public String startEngine() {
        return getName() + " (Gas) ignites " + cylinders + " cylinders.";
    }

    @Override
    public String drive() {
        super.runEngine();
        return getName() + " is driving using gasoline at " + avgKmPerLitre + " km/l.";
    }
}