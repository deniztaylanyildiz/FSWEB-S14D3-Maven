package org.example.arge;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }
    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }
    @Override
    public String startEngine() {
        return getName() + " (EV) electronics system is ready. Battery: " + batterySize + "kWh.";
    }

    @Override
    public String drive() {
        super.runEngine();
        return getName() + " is driving silently with " + avgKmPerCharge + " km per charge.";
    }
}