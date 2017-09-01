
public class Ship {
	
	String name;
	int year;
	
	public Ship () {
		
		name = "Unnamed";
		year = 2011;
		
	}
	
	public Ship (String name, int year) {
		
		this.name = name;
		this.year = year;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString() {
		
		return "Ship Name: " + getName() + ", Year: " + getYear();
		
	}
	
}
