import java.util.InputMismatchException;
import java.util.Scanner;
public class InvalidNumbers {

	public static void main(String[] args) {
		
		boolean error = false;
		
		Scanner input = new Scanner(System.in);
		int positiveInteger = 0;
		
		do {
			
			System.out.println("Enter a positive integer:");
			
			try {
				
				positiveInteger = input.nextInt();
				
				if (positiveInteger <= 0) {
					throw new InputMismatchException ("I asked for a POSITIVE integer.");
				}
				error = true;
				
			} catch (InputMismatchException e) {
				System.out.println("I asked for an POSITIVE INTEGER.");
			}
			
		} while (positiveInteger <= 0);
	}

}
