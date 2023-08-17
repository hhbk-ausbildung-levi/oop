package de.levihessmann.oop.example;

public class Kfz {
    private String brand;
    private String model;
    private String licensePlate;

    private long mileage = 0;

    public Kfz(String brand, String model, String licensePlate) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public long getMileage() {
        return mileage;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }

    public void drive(long miles) {
        this.mileage += miles;
    }
}
