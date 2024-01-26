import se.GroupAnimal.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal Cat = new Cat("Måns", 12, "banan", true, 30000, "Robert");
        Animal Elphant = new Elefant("yo");
        Person p1 = new Personne("Anders", 20);
        Insurable in = new Insurrance(2, "890000", "Zack", 100);

        speed(Cat);
        speed(Elphant);
        greetings(p1);
        pay(in);
        Animal wolf = new Wolf("Buster", 4, "Canada");
        Animal bird = new Bird(4, "Hummingbird", "sqwaky");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(wolf);
        animals.add(bird);

        printAnimalSounds(animals);

        Insurable toaster = new Toaster("filips", 300, 5);
        printInsuranceCost(toaster);

        Person dentist = new Dentist("Anne");
        Person engineer = new Engineer("Bob");
        Person developer = new Developer("Charlie");

        System.out.println();
        sayHello(dentist);
        sayHello(engineer);
        sayHello(developer);

        Animal dog = new Dog("Bruno", "Golden Retriever");
        sleeping(dog);
    }

    public static void pay(Insurable in) {
        in.calculateMonthlyPayment();
    }

    public static void speed(Animal a) {
        a.run();
    }

    public static void greetings(Person p1) {
        p1.greet();
    }

    public static void printInsuranceCost(Insurable insurable) {
        System.out.println("Monthly cost: " + insurable.calculateMonthlyPayment()
                + " kr\nDeductable: " + insurable.calcualteDeductable() + " kr");
    }

    public static void printAnimalSounds(ArrayList<Animal> animals) {
        for (Animal a : animals) {
            System.out.println(a.makeSound());
        }
    }

    public static void sayHello(Person p) {
        p.greet();
    }
    public static void sleeping(Animal a) {
        a.sleep();
    }
}
