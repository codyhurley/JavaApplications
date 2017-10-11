import java.io.*;
import java.util.*;
public class BinarySum {

	public static void main(String[] args) throws IOException {
		
		int number = 0;
		int sum = 0;
		boolean endFile = false;
		Scanner sc = new Scanner(System.in);
		FileOutputStream output = new FileOutputStream("BinarySum.dat");
		DataOutputStream outputFile = new DataOutputStream(output);
		
		FileInputStream input = new FileInputStream ("BinarySum.dat");
		DataInputStream inputFile = new DataInputStream(input);
		
		
		System.out.println("Gimme some numbers to add. Enter -1 to stop.");
		
		do {
			
			number = sc.nextInt();
			if (number == -1) {
				break;
			}
			
			outputFile.writeInt(number);
			
		} while (number != -1);
		
		outputFile.close();
		
		do {
			try {
				sum += inputFile.readInt();
			} catch (EOFException e) {
				endFile = true;
			}
			
			
		} while (!endFile);
		
		System.out.println(sum);
		
		input.close();
		
		System.out.println("All done!");
		
	}

}
