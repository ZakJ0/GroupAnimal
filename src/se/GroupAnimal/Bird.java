package se.GroupAnimal;

/**
 * En fågelklass som implementerar Animal och Insurable
 *
 * @version	0.1 2024-01-26
 * @author	Johannes Randén
 */

public class Bird implements Animal, Insurable{
    private int age;
    private String type;
    private String name;

    public Bird(int age, String type, String name) {
        this.age = age;
        this.type = type;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Khaa Khaa!");
    }

    @Override
    public void run() {
        System.out.println("Flax flax");
    }

    @Override
    public void sleep() {
        System.out.println("zzzZzz");
    }

    @Override
    public double calculateMonthlyPayment() {
        return age < 10 ? 100 : 150;
    }

    @Override
    public double calcualteDeductable() {
        return type.equalsIgnoreCase("Crow") ? 1000 : 1500;
    }
}
