package se.GroupAnimal;

public class Horse implements Animal{
    public String name;

    public Horse(String name) {
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
        return "Whiiiiinny!";
    }

    @Override
    public void run() {
        System.out.println("As fast as 71km/h");
    }

    @Override
    public void sleep() {
        System.out.println("3-5h sleep per day");
    }
}

