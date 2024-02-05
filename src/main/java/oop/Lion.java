package oop;

class Lion implements InterfaceAnimal {
    public void makeSound() {
        // Implementing the interface method
        System.out.println("Rrrrr");
    }

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.makeSound(); // Outputs: Rrrrr
    }


}
