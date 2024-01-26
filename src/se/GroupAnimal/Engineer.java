//Depinder Kaur, 2024-01-26, depinder.kaur@iths.se

package se.GroupAnimal;
public class Engineer implements Person {
    private String name;
    private String type;

    public Engineer(String name) {
        this.name = name;
    }

    @Override
    public String greet() {
        return "Hello, I'm an engineer!";
    }

    @Override
    public void sayBye() {
        System.out.println("See ya later!");
    }

}
