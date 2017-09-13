
public class Dog extends Animal{
	
	public Dog (String breed, String name, int age) {
		
		this.breed = breed;
		this.name = name;
		this.age = age;
		
	}
	
	
	public void makeNoises () {
		
		System.out.println("Ruh Roh!");
		
	}
	
	public String ToString() {
		return "Name: " + getName() + ", Breed: " + getBreed();
	}
	
}
