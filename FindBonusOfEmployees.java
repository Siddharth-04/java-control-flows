import java.util.Scanner;

public class FindBonusOfEmployee{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
		//enter service
        System.out.print("Enter the salary: ");
        double salary = scanner.nextDouble();
        
		//input year of service
        System.out.print("Enter years of service: ");
        int yearsOfService = scanner.nextInt();
        
		//check if service greater than 5 if yes then award bonus 
        if (yearsOfService > 5) {
            double bonus = 0.05 * salary;
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus awarded.");
        }
    }
}
