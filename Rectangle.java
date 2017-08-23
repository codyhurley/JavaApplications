
public class Rectangle extends Shape {
		
		double width, length;
		
		public Rectangle () {
			
			width = 0;
			length = 0;
			
		}
		
		public Rectangle (double width, double length) {
			
			this.width = width;
			this.length = length;
			
		}
		
		public double getWidth() {
			return width;
		}

		public void setWidth(double width) {
			this.width = width;
		}

		public double getLength() {
			return length;
		}

		public void setLength(double length) {
			this.length = length;
		}

		public double getArea () {
			
			return width * length;
			
		}
		
		public double getPerimeter () {
			
			return (2 * width) + (2 * length);
			
		}
		
}
