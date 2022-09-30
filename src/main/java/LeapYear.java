/**
 * The class receives the year and check if it's a leap year
 * year - int - year to check
 **/

public class LeapYear
{
    public static void main(String[] args)
    {
//        int year = Integer.parseInt(args[0]);
        myMethod(1600);
    }
    static void myMethod(int year)
    {
        boolean isLeapYear;
        isLeapYear = (year % 4 == 0);
        isLeapYear = isLeapYear && (year % 100 != 0);
        isLeapYear = isLeapYear || (year % 400 == 0);
        System.out.println(isLeapYear);;
    }
}