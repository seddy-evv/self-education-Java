package oop;

// Single Inheritance
public class Dog extends Animal {

    public Dog(String name) {
        // Invoke parent class constructor
        super(name);
        bark();
    }

    void bark() {
        System.out.println("Barking...");
    }

    void loudBark() {
        System.out.println("Barking loudly");
    }

    // parent Method Overriding, part of Polymorphism (Run-time Polymorphism)
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    // Method Overloading, part of Polymorphism (Compile-time Polymorphism)
    public void makeSound(int i) {
        System.out.println(name + " makes a quiet sound " + i + " times.");
    }

    public static void main(String[] args) {
        // dog is Object (instance of a class)
        Animal dog = new Dog("Bak"); // Polymorphism
//        dog.makeSound();

    }
}
