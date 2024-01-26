package se.GroupAnimal;

public class Cow implements Animal{
    private String name;
    Status status;

    public Cow(String name, Status status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animale{" +
                "name='" + name + '\'' +
                ", status=" + status +
                '}';
    }

    @Override
    public void makeSound() {
        System.out.println("muuuu");
    }

    @Override
    public void run() {
        System.out.println("as fast as: 30-40km/h");
    }

    @Override
    public void sleep() {
        System.out.println("2h sleep per day");
    }
}
