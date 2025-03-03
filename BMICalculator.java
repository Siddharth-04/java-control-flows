import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble(); //input weight
        
        System.out.print("Enter height in cm: ");
        double heightCm = scanner.nextDouble();
        
        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);
        
        System.out.println("BMI: ", bmi);
        
        String status;
        if (bmi < 18.4) {
            status = "Underweight"; //underweight condition
        } else if ( bmi >=18.5 && bmi <= 24.9) { //normal condition
            status = "Normalt";
        } else if (bmi>=25.0 && bmi <= 39.9) { //overweight condition
            status = "Overweight";
        } else {
            status = "Obese"; //obese condition
        }
        
        System.out.println("Weight Status: " + status); //print status
    }
}
