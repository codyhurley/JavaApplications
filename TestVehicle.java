import java.util.Scanner;
public class TestVehicle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Car c = new Car();
		Truck t = new Truck();
		Tank war = new Tank();
		
		c.setMake("Hyundai");
		c.setLicensePlate("342YT3S1");
		c.setYear(2015);
		
		
		t.setMake("Dodge");
		t.setLicensePlate("4656DSI3");
		t.setYear(2017);
		
		war.setYear(2010);
		war.setWeight(7500.00);
		
		System.out.println(" ");
		
		System.out.println(c.getMake() + ": Year: " + c.getYear() + ", Weight: " + c.getWeight() + ", License Plate: " + c.getLicensePlate() + ", Maximum Passenger Capacity: " + c.getMaxPassengers());
		System.out.println(t.getMake() + ": Year: " + t.getYear() + ", Weight: " + t.getWeight() + ", License Plate: " + t.getLicensePlate() + ", Maximum Towing Capacity: " + t.getTowCapacity());
		System.out.println("Tank: Year: " + war.getYear() + ", Weight: " + war.getWeight() + ", Armor Width: " + war.getArmorWidth());
		
		
	}

}
