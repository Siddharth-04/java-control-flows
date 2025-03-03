import java.util.Scanner;

public class actorOfNumberUsingWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt(); //input number
        
        if (number <= 0) {
            System.out.println("Please enter a positive integer."); //check for positive number
        } else {
            System.out.print("Factors of " + number + " are:");
			
			//loop for finding factors
			int i = 1;
            while( i <= number) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
				i++;
            }
        }
    }
}
