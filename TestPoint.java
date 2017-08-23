import java.util.Scanner;
public class TestPoint {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x1 = 0;
		int x2 = 0;
		int y1 = 0;
		int y2 = 0;
		double distance = 0;
		
		ThePoint p1 = new ThePoint(x1, y1);
		ThePoint p2 = new ThePoint(x2, y2);
		
		System.out.println("Please enter the x value for point 1:");
		p1.setX(sc.nextInt());
		
		System.out.println(" ");
		
		System.out.println("Please enter the y value for point 1:");
		p1.setY(sc.nextInt());
		
		System.out.println(" ");
		
		System.out.println("Please enter the x value for point 2:");
		p2.setX(sc.nextInt());
		
		System.out.println(" ");
		
		System.out.println("Please enter the y value for point 2:");
		p2.setY(sc.nextInt());
		
		System.out.println(" ");
		
		
		distance = Math.sqrt(Math.pow(p1.getX(), p1.getY()) + Math.pow(p2.getX(), p2.getY()));
		
		System.out.println("The distance between these two points is " + distance + ".");
		
		
		
		
	}

}
