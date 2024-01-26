package se.GroupAnimal;

/**
 * En vargklass som implementerar Animal
 *
 * @version	0.1 2024-01-26
 * @author	Johannes Randén
 */
public class Wolf implements Animal{
    private String name;
    private int age;
    private String location;

    public Wolf(String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String makeSound() {
        return "Awooooooo";
    }

    @Override
    public void run() {
        System.out.println("wolf pack runs");
    }

    @Override
    public void sleep() {
        System.out.println("zzZZzzzz");
    }
}
