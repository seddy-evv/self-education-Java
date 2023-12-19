package syntax;

public class Scope {

    private int classLevelVariable = 5;

    public void demonstrateScope() {
        int methodLevelVariable = 10;
        System.out.println("Class Level: " + classLevelVariable);
        System.out.println("Method Level: " + methodLevelVariable);

        {
            int blockLevelVariable = 15;
            System.out.println("Block Level: " + blockLevelVariable);
        }

        // Uncommenting the next line will cause a compile error
        // System.out.println(blockLevelVariable);
    }

    public static void main(String[] args) {
        // demonstrateScope(); // Issue
        Scope example = new Scope();
        example.demonstrateScope();
    }
}
