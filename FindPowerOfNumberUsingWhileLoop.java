import java.util.Scanner;

public class FindPowerOfNumberUsingWhileLoop{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt(); //input the number 
        System.out.print("Enter the power: ");
        int power = scanner.nextInt(); //input the power
        
        if (number > 0 && power >= 0) {
            int result = 1;
            int counter = 0;
            while (counter < power) { //while loop
                result *= number;
                counter++;
            }
            System.out.println("Result: " + result);
        } else {
            System.out.println("Please enter a positive base and a non-negative exponent."); //if number or power is not positive
        }
        
        scanner.close();
    }
}
