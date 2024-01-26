package se.GroupAnimal;
/**
 * En brödrostklass som implementerar Insurable
 *
 * @version	0.1 2024-01-26
 * @author	Johannes Randén
 */

public class Toaster implements Insurable{
    private String name;
    private double marketPrice;
    private int rating;

    public Toaster(String name, double marketPrice, int rating) {
        this.name = name;
        this.marketPrice = marketPrice;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public double calculateMonthlyPayment() {
        return marketPrice / 10;
    }

    @Override
    public double calcualteDeductable() {
        return rating < 5 ? 500 : 250;
    }
}
