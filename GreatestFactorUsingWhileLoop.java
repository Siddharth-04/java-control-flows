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
			int counter = number - 1;
            while(counter >= 1) {
                if (number % counter == 0 ) {
                    greatestFactor = counter; //comparing and storing greater values 
					break;
                }
				counter--;
            }
            System.out.println("The greatest factor of " + number + " is: " + greatestFactor); //printing greatest value
        }
    }
}
