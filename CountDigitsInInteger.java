import java.util.Scanner;

public class CountDigitInInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); //input number
        int count = 0;
        
        if (number == 0) {
            count = 1;
        } else {
			//divide by 10 and count every digit
            while (number != 0) {
                number /= 10;
                count++;
            }
        }
         
        System.out.println("Number of digits: " + count); //print digits
    }
}
