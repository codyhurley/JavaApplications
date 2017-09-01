
public class Vehicle {
	
	int year;
	double weight;
	
	public Vehicle() {
		year = 1975;
		weight = 2000;
	}
	
	public Vehicle(int year, double weight) {
		
		this.year = year;
		this.weight = weight;
		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return super.toString() + "The model year is " + getYear() + ", and the weight is " + getWeight() + ".";
	}
	
	
	
	
	
}
