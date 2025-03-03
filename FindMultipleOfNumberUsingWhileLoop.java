import java.util.Scanner;

public class FindMultiplesOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: "); 
        int number = scanner.nextInt(); //input from user
        
        if (number > 0 && number < 100) { //checking number between 0 and 100
			int i = 100;
            while( i > 0) { //while loop
                if (i % number == 0) { //finding multiple
                    System.out.println(i);
                }
				i--;
            }
        } else {
            System.out.println("Please enter a positive integer less than 100."); //if user input out of rangle
        }
    }
}
