import java.util.*;
import java.io.*;
public class Decryption {
	
	public static void main(String[] args) throws IOException{
		
		int reader;
		boolean checkLoop = false;
		
		try {
			
			FileInputStream input = new FileInputStream ("BinarySum.dat");
			DataInputStream inputFile = new DataInputStream(input);
			
			FileOutputStream output = new FileOutputStream("BinarySum.dat");
			DataOutputStream outputFile = new DataOutputStream(output);
			
			do {
				
				reader = inputFile.readChar() - 10;
				outputFile.writeChar(reader);
				System.out.println(reader);
				
			} while (!checkLoop);
			
			inputFile.close();
			output.close();
			
		} catch (EOFException e) {
			
			checkLoop = true;
			
		} finally {
			
			
			
		}
		
	}
	
}
