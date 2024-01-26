/*
* Senior class describing an elderly person, implements Person interface
* Author: Robert Tronhage, robert.tronhage@iths.se
* 2024-01-26
* */

package se.GroupAnimal;

public class Senior implements Person{
    private String name;
    private int age;
    private String Gender;
    private boolean isRetired;

    public Senior(String name, int age, String gender, boolean isRetired) {
        this.name = name;
        this.age = age;
        Gender = gender;
        this.isRetired = isRetired;
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

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public boolean isRetired() {
        return isRetired;
    }

    public void setRetired(boolean retired) {
        isRetired = retired;
    }

    @Override
    public String toString() {
        return "Senior{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Gender='" + Gender + '\'' +
                ", isRetired=" + isRetired +
                '}';
    }

    @Override
    public void greet() {
        System.out.println("hello, *aah!*\nMy back hurts!");
    }

    @Override
    public void sayBye() {
        System.out.println("Goodbye! :)");
    }
}
