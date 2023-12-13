package examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * A simple example of getting values from the console
 **/

public class InputValue
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String:");
        String s = br.readLine();
        System.out.print("Enter Integer:");
        int i = 0;
        try {
            i = Integer.parseInt(br.readLine());
        } catch(NumberFormatException nfe) {
            System.err.println("Invalid Format!");
        }
        System.out.println("String - " + s + "\n" + "Integer - " + i);
//        Another approach
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}