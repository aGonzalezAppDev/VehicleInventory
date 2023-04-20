package com.learntocode;

public class Vehicle {
    private long vehicleId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private double price;

    public Vehicle(long vehicleId, String makeModel, String color, int odometerReading, double price){
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }
    // getters and setter for vehicleID
    public long getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    // getters and setters for makeModel
    public String getMakeModel() {
        return makeModel;
    }
    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    // getters and setters for color
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // getters and setters fir odometerReading
    public int getOdometerReading() {
        return odometerReading;
    }
    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    // getters and setters for price
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }



}
