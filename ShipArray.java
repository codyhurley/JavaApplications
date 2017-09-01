
public class ShipArray {

	public static void main(String[] args) {
		
		Ship[] shipArray = new Ship[3];
		
		shipArray[0] = new Ship ("Vindication", 2016);
		shipArray[1] = new CruiseShip ("Sea Limousine", 9000);
		shipArray[2] = new CargoShip("Behemoth", 80000);
		
		for (Ship i: shipArray) {
			
			System.out.println(i);
			System.out.println("--------------------------");
			
		}
		
		
	}

}
