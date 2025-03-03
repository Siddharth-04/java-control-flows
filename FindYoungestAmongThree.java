import java.util.Scanner;

public class FindYoungestAmongThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter age of Amar: ");
        int ageAmar = scanner.nextInt(); //input Amar age
        System.out.print("Enter height of Amar: ");
        double heightAmar = scanner.nextDouble(); //input Amar height
        
        System.out.print("Enter age of Akbar: ");
        int ageAkbar = scanner.nextInt(); //input Akbar age
        System.out.print("Enter height of Akbar: ");
        double heightAkbar = scanner.nextDouble(); //input Akbar age
        
        System.out.print("Enter age of Anthony: "); //input Anthony age
        int ageAnthony = scanner.nextInt();
        System.out.print("Enter height of Anthony: "); //input Anthony height
        double heightAnthony = scanner.nextDouble();
        
        int youngestAge = ageAmar;
        String youngestFriend = "Amar";

        if (ageAkbar < youngestAge) {
            youngestAge = ageAkbar;
            youngestFriend = "Akbar";
        } //check for akbar
        
        if (ageAnthony < youngestAge) {
            youngestAge = ageAnthony;
            youngestFriend = "Anthony";
        } //check for anthony
        
        double tallestHeight = heightAmar;
        String tallestFriend = "Amar";
        
        if (heightAkbar > tallestHeight) {
            tallestHeight = heightAkbar;
            tallestFriend = "Akbar";
        } //check for height of akbar
        
        if (heightAnthony > tallestHeight) {
            tallestHeight = heightAnthony;
            tallestFriend = "Anthony";
        } //check for height of anthony
        
        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);
    }
}
