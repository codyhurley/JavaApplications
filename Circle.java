
public class Circle extends Shape {
		
		private double radius;
		
		public Circle () {
			
			radius = 0;
			
		}
		
		public Circle (double radius) {
			
			this.radius = radius;
			
		}

		public double getRadius() {
			return radius;
		}

		public void setRadius(double radius) {
			this.radius = radius;
		}
		
		public double getArea () {
			
			return radius * radius * Math.PI;
			
		}
		
		public double getPerimeter () {
			
			return 2 * radius * Math.PI;
			
		}
		
		public double getDiameter () {
			
			return radius * 2;
			
		}
	//you may want to add a toString() method
		
}
