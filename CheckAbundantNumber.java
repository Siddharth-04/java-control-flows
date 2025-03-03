import java.util.Scanner;

public class CheckAbundantNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); //input number
        int sum = 0;
        
		//for loop for iterating
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        
        if (sum > number) {
            System.out.println(number + " is an Abundant Number"); //if yes
        } else {
            System.out.println(number + " is not an Abundant Number"); //if no
        }
    }
}
