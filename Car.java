
public class Car extends Automobile{
	
	int maxPassengers;
	
	public Car () {
		
		maxPassengers = 6;
		
	}
	
	public Car(int year, double weight, String licensePlate, String make, int maxPassengers) {
		
		this.year = year;
		this.weight = weight;
		this.licensePlate = licensePlate;
		this.make = make;
		this.maxPassengers = maxPassengers;
		
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}

	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}
	
	public String toString() {
		
		return super.toString() + "The maximum passenger capacity is " + getMaxPassengers() + ".";
		
	}

}
