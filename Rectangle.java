
public class Rectangle extends GeometricObject implements Comparable{
	
	public double length;
	public double width;
	
	public Rectangle () {
		
	}
	
	public Rectangle (double length, double width){
		
		this.length = length;
		this.width = width;
		
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}
	
	public abstract double getArea(){
		
		return length * width;
		
	}
	
	public abstract double getPerimeter(){
		
		return (2*length) + (2*width);
		
	}

}
