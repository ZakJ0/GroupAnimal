/*
 * Computer class, implements Insurable interface
 * Author: Robert Tronhage, robert.tronhage@iths.se
 * 2024-01-26
 * */
package se.GroupAnimal;

public class Computer implements Insurable{
    private String brand;
    private String model;
    private int yearOfManufacture;
    private double purchasePrice;

    public Computer(String brand, String model, int yearOfManufacture, double purchasePrice) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.purchasePrice = purchasePrice;
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

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", purchasePrice=" + purchasePrice +
                '}';
    }

    @Override
    public double calculateMonthlyPayment() {
        return 0.01 * purchasePrice;
    }

    @Override
    public double calcualteDeductable() {
        return 0.05 * purchasePrice;
    }
}
