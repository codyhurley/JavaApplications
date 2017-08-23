import java.util.Scanner;
public class TestShape {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Circle c1 = new Circle();
		Rectangle r1 = new Rectangle();
		
		System.out.println("Please enter the radius of the circle:");
		c1.setRadius(sc.nextDouble());
		System.out.println(" ");
		
		System.out.println("Please enter the length and width of the rectangle.");
		r1.setLength(sc.nextDouble());
		r1.setWidth(sc.nextDouble());
		
		System.out.println(" ");
		
		System.out.println("The area of the circle is " + c1.getArea() + ".");
		System.out.println("The diameter is " + c1.getDiameter() + ".");
		
		System.out.println(" ");
		
		System.out.println("The area of the rectangle is " + r1.getArea() + ".");
		System.out.println("The perimeter is " + r1.getPerimeter() + ".");
		
		
		
		

	}

}
