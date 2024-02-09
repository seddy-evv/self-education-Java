package oop;

public class EnumExample {

    public static void navigate(Direction direction) {
        switch (direction) {
            case NORTH:
                System.out.println("Going North");
                break;
            case EAST:
                System.out.println("Going East");
                break;
            case SOUTH:
                System.out.println("Going South");
                break;
            case WEST:
                System.out.println("Going West");
                break;
        }
    }

    public static void main(String[] args) {
        navigate(Direction.NORTH); // Correct and readable
        // navigate(3); // Compile-time error, type safety
    }
}
