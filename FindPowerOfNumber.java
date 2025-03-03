import java.util.Scanner;

public class FindPowerOfNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: "); //input of number
        int number = scanner.nextInt();
        System.out.print("Enter the power: ");
        int power = scanner.nextInt(); //input the power
        
        if (number > 0 && power >= 0) {
            int result = 1; //initialising with 1
            for (int i = 1; i <= power; i++) {
                result *= number;
            }
            System.out.println("Result: " + result); //printing result
        } else {
            System.out.println("Please enter a positive base and a non-negative exponent."); //if number is not positive
        }
    }
}
