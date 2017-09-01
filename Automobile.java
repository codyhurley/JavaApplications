
public class Automobile extends Vehicle{
	
	String licensePlate;
	String make;
	
	public Automobile() {
		
		licensePlate = "unknown";
		
	}
	
	public Automobile(int year, double weight, String licensePlate, String make) {
		
		this.year = year;
		this.weight = weight;
		this.licensePlate = licensePlate;
		this.make = make;
		
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	@Override
	public String toString() {
		return super.toString() + "The License Plate number is " + getLicensePlate() + ", and the make is " + getMake() + ".";
	}
	
	
	
	
	
}
