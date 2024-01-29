package oop;

// Multilevel Inheritance
public class BabyDog extends Dog {

    public BabyDog(String name) {
        // In Java, when a subclass is instantiated, the constructors of all superclasses must be called.
        // This starts with the topmost superclass and moves down the hierarchy.
        // By default, the no-argument constructor of the superclass is called.
        // If the superclass doesn't have a no-argument constructor, you must explicitly call a different constructor using super.
        super(name);
        weep();
    }

    void weep() {
        System.out.println("Weeping...");
    }

    public static void main(String[] args) {
        // lion is Object (instance of a class)
        BabyDog babyDog = new BabyDog("Bak Jun");
        // Accessing protected method
        babyDog.display();
    }
}
