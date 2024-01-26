package se.GroupAnimal;

public class Glasses implements Insurable{
    private double marketPrice;
    private String type;
    private String brand;

    public Glasses(double marketPrice, String type, String brand) {
        this.marketPrice = marketPrice;
        this.type = type;
        this.brand = brand;
    }

    public double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public double calculateMonthlyPayment() {
        return type.equalsIgnoreCase("sunglasses") ? 50 : 100;
    }

    @Override
    public double calcualteDeductable() {
        return brand.equalsIgnoreCase("Armani") ? 1000 : 500;
    }
}
