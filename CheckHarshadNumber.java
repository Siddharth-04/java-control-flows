import java.util.Scanner;

public class HarshadNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); //input number
        int originalNumber = number;
        int sum = 0;
        
        while (originalNumber > 0) {
            sum += originalNumber % 10;
            originalNumber /= 10;
        }
        
        if (number % sum == 0) { //condition
            System.out.println(number + " is a Harshad Number");
        } else {
            System.out.println(number + " is not a Harshad Number");
        }
    }
}
