
public class CargoShip extends Ship{
	
	int cargoStorage;
	
	public CargoShip() {
		
		cargoStorage = 70000;
		
	}

	public CargoShip(String name, int cargoStorage) {
		
		this.name = name;
		this.cargoStorage = cargoStorage;
		
	}

	public int getCargoStorage() {
		return cargoStorage;
	}
	
	public void setCargoStorage(int cargoStorage) {
		this.cargoStorage = cargoStorage;
	}

	public String ToString() {
		
		return "Ship Name: " + getName() + "Cargo Capacity: " + getCargoStorage() + " tons";
		
	}
	
}
