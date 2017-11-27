import java.util.Scanner;

public class BMICalculator {
	public static void main(String[] arguments) {
		Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi;
		
		System.out.print("Your height in m: ");
		m = keyboard.nextDouble(); // record value in meters
		
		System.out.print("Your weight in kg: ");
		kg = keyboard.nextDouble(); // record value in kilograms
		
		bmi = kg / (m*m); // calculate body mass index
		
		System.out.println("Your BMI is " + bmi);
	}
}