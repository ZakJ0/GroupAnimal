//Depinder Kaur, 2024-01-26, depinder.kaur@iths.se

package se.GroupAnimal;
public class Dog implements Animal, Insurable {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    @Override
    public String makeSound() {
        return this.getName() + " does Woof! Woof!";
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " is running to catch the ball!");
    }

    @Override
    public void sleep() {
        System.out.println(this.getName() + " is snoring while sleeping!");
    }

    @Override
    public double calculateMonthlyPayment() {
        return 100;
    }

    @Override
    public double calcualteDeductable() {
        return 30;
    }


}
