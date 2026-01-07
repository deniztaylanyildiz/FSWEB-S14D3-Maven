package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;

public class Main {
    public static void main(String[] args) {
        CarSkeleton gasCar = new GasPoweredCar("Mustang", "Muscle Car", 8.5, 8);
        CarSkeleton electricCar = new ElectricCar("Tesla Model S", "Electric Sedan", 500, 100);
        CarSkeleton hybridCar = new HybridCar("Toyota Prius", "Eco-friendly Hybrid", 4.2, 40, 4);

        CarSkeleton[] cars = {gasCar, electricCar, hybridCar};

        for (CarSkeleton car : cars) {
            System.out.println("--- Testing Vehicle ---");
            car.printType();
            System.out.println(car.startEngine());
            System.out.println(car.drive());
            System.out.println();
        }
    }
}