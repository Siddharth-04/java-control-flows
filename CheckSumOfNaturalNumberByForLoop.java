import java.util.Scanner;

public class CheckSumOfNaturalNumberByForLoop{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number : ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            int sumFormula = n * (n + 1) / 2;

            int sumLoop = 0;

            for(int i=1 ;i<= n ; i++) {
                sumLoop += i;
            }

            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using while loop: " + sumLoop);

            if (sumFormula == sumLoop) {
                System.out.println("Both sum are equal");
            } else {
                System.out.println("Both sum are not equal");
            }
        }
    }
}
