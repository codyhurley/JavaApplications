import java.util.Scanner;
public class TestPhoneBill {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LongDistanceBill bill = new LongDistanceBill();
		
		System.out.println("This program will calculate your phone bill for you.");
		System.out.println("What is your call rate?");
		bill.setCallRate(sc.nextInt());
		System.out.println("What is your monthly rate?");
		bill.setMonthlyRate(sc.nextDouble());
		System.out.println("How many minutes did you talk?");
		int time = sc.nextInt();
		
		
		double theBill = bill.calculateBill(time);
		
		System.out.println("Your monthly bill is " + theBill + ".");
		
	}

}
