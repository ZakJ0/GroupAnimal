package se.GroupAnimal;

public class Personne implements Person{
    private String name;
    private int age;

    public Personne(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Personne{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void greet() {
        System.out.println("Hello");
    }

    @Override
    public void sayBye() {

    }
}
