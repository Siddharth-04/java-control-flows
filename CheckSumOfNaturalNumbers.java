import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number : ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            int sumFromFormula = n * (n + 1) / 2;

            int sumFromLoop = 0, counter = 1;
            while (counter <= n) {
                sumFromLoop += counter;
                counter++;
            }

            System.out.println("Sum using formula: " + sumFromFormula);
            System.out.println("Sum using while loop: " + sumFromLoop);

            if (sumFromFormula == sumFromLoop) {
                System.out.println("Both sum are same");
            } else {
                System.out.println("Both sum are not same");
            }
        }
    }
}
