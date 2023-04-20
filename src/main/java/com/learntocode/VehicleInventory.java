package com.learntocode;

public class VehicleInventory {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle(101101, "Ford Explorer", "Red", 32775, 12250.00);
        Vehicle vehicle2 = new Vehicle(101102, "Tesla", "Yellow", 34255, 124500.00);
        Vehicle vehicle3 = new Vehicle(101103, "Toyota Supra", "Orange", 89000, 145700.00);
        Vehicle vehicle4 = new Vehicle(101104, "Toyota Camry", "Silver", 146500, 5000.00);
        Vehicle vehicle5 = new Vehicle(101105, "Honda Civic", "Black", 35467, 12000.00);
        Vehicle vehicle6 = new Vehicle(101106, "Dodge Challenger", "Black", 46775, 89000.00);

        Vehicle[] vehicleObjects = new Vehicle[20];
        vehicleObjects[0] = vehicle1;
        vehicleObjects[1] = vehicle2;
        vehicleObjects[2] = vehicle3;
        vehicleObjects[3] = vehicle4;
        vehicleObjects[4] = vehicle5;
        vehicleObjects[5] = vehicle6;


    }
}
