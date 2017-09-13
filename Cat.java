
public class Cat extends Animal{
	
	public Cat(String breed, String name, int age){
		
		this.breed = breed;
		this.name = name;
		this.age = age;
		
	}
	
	public void makeNoises () {
		
		System.out.println("I hate Mondays...");
		
	}
	
	public String ToString() {
		return "Name: " + getName() + ", Breed: " + getBreed();
	}

}
