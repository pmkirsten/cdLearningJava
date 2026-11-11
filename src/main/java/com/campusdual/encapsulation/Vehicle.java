package com.campusdual.encapsulation;

public class Vehicle {

    private String licensePlate;
    private String model;
    private String brand;
    private boolean available;
    private int actualFuel;
    public static final int LEGAL_MAX_SPEED = 120;

    public Vehicle(String licensePlate, String model, String brand) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.brand = brand;
        this.actualFuel = 0;
        this.available = true;
    }

    public int getActualFuel() {
        return actualFuel;
    }

    public void setActualFuel(int actualFuel) {
        if (actualFuel < 0){
            this.actualFuel = 0;
        }else{
            this.actualFuel = actualFuel;
        }
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void rentCar(){
        if (this.isAvailable() == true){
            this.setAvailable(false);
            System.out.println("The vehicle with license plate " + this.licensePlate + " has been rented.");
        } else{
            System.out.println("The vehicle with license plate " + this.licensePlate + " is not available.");
        }
    }

    public void returnCar(){
        if(this.isAvailable() == false){
            this.setAvailable(true);
            System.out.println("The vehicle with license plate " + this.licensePlate + " has been returned and is available.");
        } else {
            System.out.println("The vehicle with license plate " + this.licensePlate + " is already available.");
        }
    }

    public String getDetails(){
        return this.getBrand()+" "+this.getModel()+"\n\tLicense Plate: " + this.getLicensePlate() + "\n\tAvailable: " + (this.isAvailable() ? "Yes" : "No");
    }
}
