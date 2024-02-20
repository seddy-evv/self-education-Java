package syntax;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryCatch {
    public static void main(String[] args) {
        try {
            // Code that might throw an exception
            int divideByZero = 5 / 0;
        } catch (ArithmeticException e) {
            // This block is to catch and handle ArithmeticException
            System.out.println("Arithmetic exception caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array Index Out Of Bounds Exception caught: " + e.getMessage());
        } finally {
            // This code is always executed
            System.out.println("This is the finally block.");
        }

        // Introduced in Java 7, the Try-With-Resources statement is an enhancement to the traditional try-catch-finally
        // block, providing a simpler way to handle resources like files, sockets, or database connections. It ensures
        // that each resource is closed at the end of the statement, which helps to avoid potential resource leaks.

        // Resource Declaration: Resources that implement the AutoCloseable or Closeable interface are
        // declared within the parentheses following the try keyword.
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
