
public class Tank extends Vehicle{
	
	double armorWidth;
	
	public Tank() {
		
		armorWidth = 3.4;
		
	}
	
	public Tank(int year, double weight, double armorWidth) {
		
		this.year = year;
		this.weight = weight;
		this.armorWidth = armorWidth;
		
	}

	public double getArmorWidth() {
		return armorWidth;
	}

	public void setArmorWidth(double armorWidth) {
		this.armorWidth = armorWidth;
	}
	
	public String toString() {
		return super.toString() + "The weight of this tank's armor is " + getArmorWidth() + ".";
	}

}
