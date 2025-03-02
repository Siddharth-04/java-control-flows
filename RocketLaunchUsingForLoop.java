import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the countdown value: ");
        int counter = scanner.nextInt();

        for(int i = counter ; i>=1 ; i--) {
            System.out.println(i);
        }
    }
}
