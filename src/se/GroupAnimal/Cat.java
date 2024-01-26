/*
 * Cat class, implements Animal interface
 * Author: Robert Tronhage, robert.tronhage@iths.se
 * 2024-01-26
 * */
package se.GroupAnimal;

public class Cat implements Animal,Insurable{

    private String name;
    private int age;
    private String breed;
    private boolean isIndoor;
    private double purchasePrice;
    private String insuranceProvider;

    public Cat(String name, int age, String breed, boolean isIndoor, double purchasePrice, String insuranceProvider) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.isIndoor = isIndoor;
        this.purchasePrice = purchasePrice;
        this.insuranceProvider = insuranceProvider;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public void setIndoor(boolean indoor) {
        isIndoor = indoor;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getInsuranceProvider() {
        return insuranceProvider;
    }

    public void setInsuranceProvider(String insuranceProvider) {
        this.insuranceProvider = insuranceProvider;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", isIndoor=" + isIndoor +
                ", purchasePrice=" + purchasePrice +
                ", insuranceProvider='" + insuranceProvider + '\'' +
                '}';
    }

    @Override
    public void makeSound() {
        System.out.println("meow!!!!");
    }

    @Override
    public void run() {
        System.out.println("the cat is running");
    }

    @Override
    public void sleep() {
        System.out.println("zzZZzzZz");
    }

    @Override
    public double calculateMonthlyPayment() {
        return 0.02*purchasePrice;
    }

    @Override
    public double calcualteDeductable() {
        return 0.07*purchasePrice;
    }
}
