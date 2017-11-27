import java.util.Scanner;

public class BMICalculatorInches {
	public static void main(String[] arguments) {
		Scanner keyboard = new Scanner(System.in);
		double inches, pounds, bmi;
		
		System.out.print("Your height in inches: ");
		inches = keyboard.nextDouble(); // record value in inches
		inches = inches * 0.0254; //convert to meters
		
		System.out.print("Your weight in pounds: ");
		pounds = keyboard.nextDouble(); // record value in pounds
		pounds = pounds * 0.45359237;//convert to kilograms
		
		bmi = pounds / (inches*inches); // calculate body mass index
		
		System.out.println("Your BMI is " + bmi);
	}
}