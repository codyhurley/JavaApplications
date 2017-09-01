
public class Truck extends Automobile{
	
	double towCapacity;
	
	public Truck () {
		
		towCapacity = 2500;
		
	}
	
	public Truck (int year, double weight, String licensePlate, String make, double towCapacity) {
		
		this.year = year;
		this.weight = weight;
		this.licensePlate = licensePlate;
		this.make = make;
		this.towCapacity = towCapacity;
		
	}

	public double getTowCapacity() {
		return towCapacity;
	}

	public void setTowCapacity(double towCapacity) {
		this.towCapacity = towCapacity;
	}
	
	public String toString() {
		
		return super.toString() + "The maximum tow capacity of this truck is " + getTowCapacity() + ".";
		
	}
}
