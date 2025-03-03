import java.util.Scanner;

public class FindFactorOfNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt(); //input from user
        
        if (number <= 0) {
            System.out.println("Please enter a positive integer."); //check for positive number
        } else {
            System.out.println("Factors of " + number + " are:");
			//loop for finding factors
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
