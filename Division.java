import java.util.InputMismatchException;
import java.util.Scanner;
public class Division {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two integers: ");
		try {
			
			
			int number1 = input.nextInt();
			int number2 = input.nextInt();
			
			
			System.out.println(number1 + " / " + number2 + " is " + (number1)/(number2) + ".");
			
		} catch (ArithmeticException e) {
			System.out.println("Are you TRYING to make this computer explode?!");
		} catch (InputMismatchException e) {
			System.out.println("No, Patrick. Mayonnaise is not a number.");
		} catch (Exception e) {
			System.out.println("No... just no.");
		}
		
	}

}
