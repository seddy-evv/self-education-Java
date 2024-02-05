package oop;

class Tiger extends AbstractAnimal {

    public void makeSound() {
        // Implementing abstract method
        System.out.println("Rrrrr");
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.makeSound(); // Outputs: Rrrrr
        tiger.eat();       // Outputs: I can eat.
    }
}
