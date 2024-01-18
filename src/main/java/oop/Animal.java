package oop;

public class Animal {
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Class method
    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}
