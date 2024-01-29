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
        // lion is Object (instance of a class)
        Dog dog = new Dog("Bak");
//        dog.makeSound();

    }
}
