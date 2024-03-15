package oop;

// The public access modifier makes the Animal class accessible from any other class in any package
public class Animal {
    String name;
    // The private field upperName are accessible only within the Animal class it's declared in
    private String upperName;
    // The transient attributes and methods are skipped when serializing the object containing them
    private transient int age;
    // The value of an attribute is not cached thread-locally, and is always read from the "main memory"
    public volatile long x = 2222222222222222222L;

    // Constructor
    public Animal(String name) {
        System.out.println("Silence...");
        this.name = name; // Using 'this' to refer to instance variables
        this.upperName = name.toUpperCase();
    }

    // Getter method
    public String getUpperName() {
        return upperName;
    }
    // The synchronized methods can only be accessed by one thread at a time
    public synchronized String getName() {
        return name;
    }

    // Setter method
    public void setUpperName(String prefix) {
        this.upperName = prefix + this.upperName;
    }

    // The protected display() method/field is accessible within all classes in the same package and
    // within subclasses even if they are in different packages.
    protected void display() {
        System.out.println("I am an animal.");
    }

    // Class method
    // The public access modifier makes the makeSound method accessible from any other class in any package
    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}
