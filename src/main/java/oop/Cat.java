package oop;

// Hierarchical Inheritance
public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    void meow() {
        System.out.println("Meowing...");
    }

}
