/**
 * Hello world nth times
 **/

public class HelloWorld
{
    public static void main(String[] args)
    {
        myMethod(5);
    }
    static void myMethod(int n)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.println("Hello, new world");
        }
    }
}
