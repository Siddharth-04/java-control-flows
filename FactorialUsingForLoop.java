import java.util.Scanner;

public class FactorialUsingForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("The Number is negative");
        } else {
            long factorial = 1;
            int i = n;

            for(int num = i ; num > 0 ; num--) {
                factorial *= num;
            }

            System.out.println("The factorial of " + n + " is " + factorial);
        }
    }
}
