package oop;

public class Zoo {

    // Static methods can be called without creating objects
    static void myStaticMethod() {
        System.out.println("Static method");
    }

    // Public methods must be called by creating objects
    public void myPublicMethod() {
        System.out.println("Public method");
    }

    public static void main(String[] args) {
        // lion is Object (instance of a class)
        Animal lion = new Animal("Leo");
        lion.makeSound();
        System.out.println(lion.getUpperName());
        lion.display();

        Plant chamomile = new Plant();
        chamomile.print();

        myStaticMethod();

        Zoo newZoo = new Zoo();
        newZoo.myPublicMethod();
    }
}
