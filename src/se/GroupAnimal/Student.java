package se.GroupAnimal;

/**
 * En studentklass som implementerar Person och Insurable
 *
 * @version	0.1 2024-01-26
 * @author	Johannes Randén
 */

public class Student implements Person, Insurable{
    private String name;
    private int age;
    private int averageGrade;

    public Student(String name, int age, int averageGrade) {
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
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

    public int getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(int averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public double calculateMonthlyPayment() {
        return age > 18 ? 100 : 150;
    }

    @Override
    public double calcualteDeductable() {
        return averageGrade == 5 ? 1000 : 1500;
    }

    @Override
    public String greet() {
        return "Tjena";
    }

    @Override
    public void sayBye() {
        System.out.println("Ses");
    }
}
