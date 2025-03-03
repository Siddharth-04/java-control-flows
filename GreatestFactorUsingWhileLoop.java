import java.util.Scanner;

public class GreatestFactorUsingWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt(); //taking input 
        
        if (number <= 1) {
            System.out.println("No greatest factor exists."); //check if number is grater than 0
        } else {
            int greatestFactor = 1;
			
			//loop for finding factor
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i; //comparing and storing greater values 
                    break;
                }
            }
            System.out.println("The greatest factor of " + number + " is: " + greatestFactor); //printing greatest value
        }
    }
}
