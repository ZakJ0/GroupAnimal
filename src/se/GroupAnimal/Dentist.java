//Depinder Kaur, 2024-01-26, depinder.kaur@iths.se

package se.GroupAnimal;

public class Dentist implements Person{
    private String name;
    private String type;

    public Dentist(String name) {
        this.name = name;
    }

    @Override
    public String greet() {
        return "Hi there! I'm a dentist :)";
    }

    @Override
    public void sayBye() {
        System.out.println("See ya later!");
    }
}