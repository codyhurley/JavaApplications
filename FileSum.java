import java.io.*;
import java.util.*;
public class FileSum {
	
	
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		File f = new File ("FileSum.txt");
		PrintWriter p = new PrintWriter(f);
		int summand;
		int sum = 0;
		
		
		System.out.println("Gimme some numbers to add up, okay?");
		
		do {
			
			summand = sc.nextInt();
			
			p.println(summand);
			p.println(" ");
			
			sum = sum + summand;
			
		} while (summand != -1);
		
		System.out.println(sum+1);
		
		
		p.close();
	}
	

}
