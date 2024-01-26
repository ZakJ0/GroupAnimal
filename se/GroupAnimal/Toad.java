/*
 * Toad class, implements Animal interface
 * Author: Robert Tronhage, robert.tronhage@iths.se
 * 2024-01-26
 * */
package se.GroupAnimal;

public class Toad implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Ribbit Ribbit");
    }

    @Override
    public void run() {
        System.out.println("jumping fast!");
    }

    @Override
    public void sleep() {
        System.out.println("zzZZz Ribbit zzZzz");
    }
}
