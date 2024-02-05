package oop;

// The abstract class AbstractAnimal cannot be instantiated and is used as a base for other classes.
// Abstract classes can have a mix of methods with and without implementation, but all methods in interfaces are abstract
// (except default and static methods in Java 8 onwards).
// Use an abstract class when creating a class hierarchy with shared code.
abstract class AbstractAnimal {
    // Abstract method (without an implementation)
    // When a class inherits from an abstract class, it must implement all its abstract methods/
    abstract void makeSound();

    // Concrete method (with an implementation)
    public void eat() {
        System.out.println("I can eat.");
    }
}
