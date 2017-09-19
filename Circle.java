
public class Circle {
	
	public double radius;
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		
		this.radius = radius;
		
	}

	public double getRadius() {
		return radius;
	}
	
	public abstract double getArea() {
		
		return Math.PI + Math.pow(radius, 2);
		
	}
	
	public abstract double getPerimeter() {
		
		return 2 * Math.PI * radius;
		
	}
	

}
