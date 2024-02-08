package oop;

// In Java, the keyword static is used to denote elements of a class that are shared among all instances of the class.
// These elements belong to the class itself, rather than to any particular object instance.
class Outer {
    // A static variable gets memory only once in the class area at the time of class loading. It makes it a
    // common property for all objects (instances) of that class. This is why changing the value of a static
    // variable by one object affects all other instances.
    private static String msgAll = "Hello all"; // Common for all instances
    private String msg = "Hello"; // Individual for each instance
    static String dbURL;

    // Static methods can’t access instance methods and instance variables directly; they need an object reference.
    static int add(int a, int b) {
        return a + b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    // Static blocks are executed before the main method, at the time of class loading. It's mainly used for
    // initializing static variables. It can't access non-static data (variables and methods)
    static {
        // This block of code is executed once when the class is loaded.
        dbURL = System.getenv("DATABASE_URL");
    }


    // A static inner class is associated with its outer class. Unlike inner classes, it doesn't need a reference to an
    // instance of the outer class. It can access static data members of the outer class including private ones.
    static class Inner {
        void display() {
            System.out.println(msgAll); // Can access outer class's static variable
        }
    }

    public static void main(String[] args) {
        Outer.Inner innerObj = new Outer.Inner();
        innerObj.display();

        // Access static variable without an object:
        System.out.println(Outer.msgAll);
        // Static method called without an object:
        System.out.println(Outer.add(3, 2));
        // Non-static method called with an object:
        System.out.println(new Outer().multiply(5, 3));
    }
}

