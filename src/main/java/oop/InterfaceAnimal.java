package oop;

// The  interface class InterfaceAnimal is a completely abstract class that is used to group related methods with empty bodies.
// Classes can implement multiple interfaces, but they can extend only one abstract class.
// Use an interface when different classes from disparate class hierarchies need to share a contract for what methods they implement.
interface  InterfaceAnimal {
    void makeSound();

    // Default method in the interface (Java 8+)
    default void breathe() {
        System.out.println("I can breathe.");
    }

    // Static method in the interface (Java 8+)
    static void info() {
        System.out.println("I am an animal.");
    }
}
