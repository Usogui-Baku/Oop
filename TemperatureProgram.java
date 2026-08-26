//Exercise 2
import java.util.Scanner;

public class TemperatureProgram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int degrees;

		System.out.print("Enter the degrees Fahrenheit: ");
		degrees = input.nextInt();
		
		if ( degrees <= 32 ) {
			System.out.println("Freezing");
		} else if ( degrees <= 50 ) {
			System.out.println("Cold");
		} else if ( degrees <= 85 ) {
			System.out.println("Warm");
		} else {
			System.out.println("Hot");
		}
		
		input.close();
	}
}