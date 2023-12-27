package syntax;

public class Array {
    public static void main(String[] args)
    {
        // Syntax for Declaring an Array:
        // dataType[] arrayName;

        // Syntax for Instantiating an Array:
        // arrayName = new dataType[arraySize];

        int[] numbers;
        numbers = new int[10];
        // OR
        int[] numbers1 = new int[10];

        int[] numbers2 = {1, 2, 3, 4, 5};
        numbers2[2] = 50;
        int x = numbers2[2];
        System.out.println(x);
        int len = numbers2.length;
        System.out.println(len);

        // Looping Through an Array:
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }
        // OR
        for (int num : numbers2) {
            System.out.println(num);
        }

    }

}
