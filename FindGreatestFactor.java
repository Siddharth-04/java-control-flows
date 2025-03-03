import java.util.Scanner;

public class FindGreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt(); //taking input
        
        if (number <= 1) {
            System.out.println("No greatest factor exists."); //if number is less than 1 then no factors
        } else {
            int greatestFactor = 1;
			//loop for finding factors
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break;
                }
            }
            System.out.println("The greatest factor of " + number + " is: " + greatestFactor); //print greatest factor
        }
    }
}
