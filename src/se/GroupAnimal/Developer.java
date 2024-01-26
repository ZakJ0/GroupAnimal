//Depinder Kaur, 2024-01-26, depinder.kaur@iths.se

package se.GroupAnimal;
public class Developer implements Person{
    private String name;
    private String type;

    public Developer(String name) {
        this.name = name;
    }

    @Override
    public String greet() {
        return "Hello, I'm a software developer!";
    }

    @Override
    public void sayBye() {
        System.out.println("See ya later!");
    }

}
