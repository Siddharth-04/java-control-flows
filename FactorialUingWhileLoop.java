import java.util.Scanner;

public class FactorialUingWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("The number is negative");
        } else {
            int factorial = 1;
            int i = n;

            while (i > 0) {
                factorial *= i;
                i--;
            }

            System.out.println("The factorial of " + n + " is " + factorial);
        }
    }
}
