import java.util.Scanner;
public class TestShape {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Circle c1 = new Circle();
		Rectangle r1 = new Rectangle();
		
		System.out.println("Please enter the radius of the circle:");
		c1.setRadius(sc.nextDouble());
		
		System.out.println("Is it filled? Type 'True' or 'False'.");
		c1.setFilled(sc.nextBoolean());
		
		System.out.println("What color is it?");
		c1.setColor(sc.next());
		
		System.out.println(" ");
		
		System.out.println("Please enter the length and width of the rectangle.");
		r1.setLength(sc.nextDouble());
		r1.setWidth(sc.nextDouble());
		
		System.out.println("Is it filled? Type 'True' or 'False'.");
		r1.setFilled(sc.nextBoolean());
		
		System.out.println("What color is it?");
		r1.setColor(sc.next());
		
		
		System.out.println(" ");
		
		
		
		System.out.println("The area of the circle is " + c1.getArea() + ".");
		System.out.println("The diameter is " + c1.getDiameter() + ".");
		if (c1.isFilled() == true) {
			System.out.println("It is filled");
		} else {
			System.out.println("It is not filled.");
		}
		
		System.out.println("It is " + c1.getColor() + "-colored.");
		
		System.out.println(" ");
		
		System.out.println("The area of the rectangle is " + r1.getArea() + ".");
		System.out.println("The perimeter is " + r1.getPerimeter() + ".");
		if (r1.isFilled() == true) {
			System.out.println("It is filled");
		} else {
			System.out.println("It is not filled.");
		}
		System.out.println("It is " + r1.getColor() + "-colored.");
		
		
	

	}

}
