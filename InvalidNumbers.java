import java.util.InputMismatchException;
import java.util.Scanner;
public class InvalidNumbers {

	public static void main(String[] args) {
		
		boolean error = true;
		
		Scanner input = new Scanner(System.in);
		int positiveInteger = 0;
		
		do {
			
			System.out.println("Enter a positive integer:");
			
			try {
				
				positiveInteger = input.nextInt();
				
				if (positiveInteger <= -1) {
					throw new InputMismatchException ("I asked for a POSITIVE integer.");
				}
				
				error = false;
				
			} catch (InputMismatchException e) {
				System.out.println("I asked for an POSITIVE INTEGER.");
			} catch (Exception e) {
				System.out.println("A letter? REALLY?!");
			}
			
		} while (error);
	}

}
