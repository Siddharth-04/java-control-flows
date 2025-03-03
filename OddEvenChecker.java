import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //input natural number
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();
        
        if (number <= 0) {
            System.out.println("Please enter a natural number : "); //check if number is greater than 0 or not
        } else {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number."); //print even
                } else {
                    System.out.println(i + " is an odd number."); //print odd
                }
            }
        }
    }
}