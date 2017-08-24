import java.util.Scanner;
public class TestPoint {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x1 = 0;
		int x2 = 0;
		int y1 = 0;
		int y2 = 0;
		
		
		System.out.println("Please enter the x value for point 1:");
		x1 = sc.nextInt();
		
		System.out.println(" ");
		
		System.out.println("Please enter the y value for point 1:");
		y1 = sc.nextInt();
		
		System.out.println(" ");
		
		System.out.println("Please enter the x value for point 2:");
		x2 = sc.nextInt();
		
		System.out.println(" ");
		
		System.out.println("Please enter the y value for point 2:");
		y2 = sc.nextInt();
		
		System.out.println(" ");
		
		
		ThePoint p1 = new ThePoint(x1, y1);
		ThePoint p2 = new ThePoint(x2, y2);
		
		System.out.println("Your coordinates are (" + x1 + ", " + y1 + "), and (" + x2+ ", " + y2 +").");
		
		System.out.println("The distance between these two points is " + p1.getDistance(p2));
		
		
		
	}

}
