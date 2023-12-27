package syntax;

public class MultidimensionalArray {
    public static void main(String[] args)
    {
        // Syntax:
        // dataType[][] arrayName = new dataType[numberOfRows][numberOfColumns];

        int[][] matrix = new int[3][3];
        int[][] matrix1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        // Looping through a Two-Dimensional Array
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
            System.out.print(matrix1[i][j] + " ");
            }
        System.out.println();
        }
    }
}
