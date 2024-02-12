package syntax;

import java.util.Arrays;
import java.util.List;

public class TestLambda {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        // Lambda expressions in Java, introduced in Java 8, are a significant feature that allows you to implement
        // functional programming aspects. They provide a clear and concise way to represent one method interface using
        // an expression. Lambda expressions are used primarily to define inline implementation of a functional
        // interface, i.e., an interface with a single method only.

        // Here's a basic structure of a lambda expression in Java:

        // (parameters) -> expression
        // or
        // (parameters) -> {statements;}

        // Java 8+
        // list.forEach(n -> System.out.println(n));

        String[] strings = {"One", "Two", "Three"};
        // Java 8+
        // Arrays.sort(strings, (String a, String b) -> {
            // return a.compareTo(b);
        // });
    }
}