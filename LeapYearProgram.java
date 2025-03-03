import java.util.Scanner;

public class LeapYearProgram {
    public static void checkLeapYear(int year) {
        if (year < 1582) { //Year condition
            System.out.println("Invalid input. Year should be >= 1582.");
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year");
                    } else {
                        System.out.println(year + " is not a Leap Year");
                    }
                } else {
                    System.out.println(year + " is a Leap Year");
                }
            } else {
                System.out.println(year + " is not a Leap Year");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a year : ");
        int year = scanner.nextInt(); //input year
        if (year == -1) {
            System.out.println("Not a valid year");
        }
        
        else checkLeapYear(year); 
        
    }
}
