import java.util.Scanner;

public class FizzBuzzUsingFopLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt(); //input number
        
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) { //multiple of 3 and 5
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0 ) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a positive integer."); //if number is less than 0
        }
    }
}