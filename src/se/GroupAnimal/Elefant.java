package se.GroupAnimal;

public class Elefant implements Animal{
    public String name;

    public Elefant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Elefant{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String makeSound() {
        return "Pawooooo!";
    }

    @Override
    public void run() {
        System.out.println("As fast as 40km/h");
    }

    @Override
    public void sleep() {
        System.out.println("2h sleep per day");
    }
}
