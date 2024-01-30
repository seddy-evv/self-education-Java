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

    // parent Method Overriding
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    public static void main(String[] args) {
        // dog is Object (instance of a class)
        Animal dog = new Dog("Bak"); // Polymorphism
//        dog.makeSound();

    }
}
