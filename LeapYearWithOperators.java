import java.util.Scanner;

public class LeapYearWithOperators{
    public static void checkLeapYear(int year) {
        if (year >= 1582 && (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter a year : ");
        int year = scanner.nextInt();
        if (year == -1) {
            System.out.println("Enter a valid year");
        }
        checkLeapYear(year);
    
    }
}
