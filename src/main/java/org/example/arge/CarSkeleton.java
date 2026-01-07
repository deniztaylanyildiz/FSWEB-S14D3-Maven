package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine() {
        return getName() + " engine is starting.";
    }

    public String drive() {
        runEngine();
        return getName() + " is driving.";
    }

    protected void runEngine() {
        System.out.println("Engine is running for " + getName());
    }

    // Sınıf tipini basan yardımcı metod
    public void printType() {
        System.out.println("Unit Type: " + getClass().getSimpleName());
    }
}