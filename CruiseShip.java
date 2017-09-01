
public class CruiseShip extends Ship{
	
	int maxPassengers;
	
	public CruiseShip() {
		
		maxPassengers = 500;
		
	}
	
	public CruiseShip(String name, int maxPassengers) {
		
		this.name = name;
		this.maxPassengers = maxPassengers;
		
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}

	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}
	
	public String toString() {
		
		return "Ship Name: " + getName() + ", Max Passengers: " + getMaxPassengers();
		
	}
	
}
