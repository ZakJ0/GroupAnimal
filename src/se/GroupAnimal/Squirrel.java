/*
*Squirrel class implementing Animal interface
*  Author: Robert Tronhage, robert.tronhage@iths.se
* 2024-01-26
* */

package se.GroupAnimal;

public class Squirrel implements Animal{

    private String name;
    private int age;
    private String color;
    private int tailLength;
    private boolean isFluffy;

    public Squirrel(String name, int age, String color, int tailLength, boolean isFluffy) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.tailLength = tailLength;
        this.isFluffy = isFluffy;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTailLength() {
        return tailLength;
    }

    public void setTailLength(int tailLength) {
        this.tailLength = tailLength;
    }

    public boolean isFluffy() {
        return isFluffy;
    }

    public void setFluffy(boolean fluffy) {
        isFluffy = fluffy;
    }

    @Override
    public String toString() {
        return "Squirrel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", tailLength=" + tailLength +
                ", isFluffy=" + isFluffy +
                '}';
    }

    @Override
    public void makeSound() {
        System.out.println("Squeak! Im a Squirrel!");
    }

    @Override
    public void run() {
        System.out.println("tiptap");
    }

    @Override
    public void sleep() {
        System.out.println("zzZzzZzZZZz");
    }
}
