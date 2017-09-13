
public class TestAnimal {

	public static void main(String[] args) {
		
		Dog d = new Dog("Great Dane", "Scoobert", 6);
		Cat c = new Cat("Orange Tabby", "Garfield", 7);
		
		System.out.println(d.getName() + ", " + d.getBreed() + ", Age " + d.getAge());
		d.makeNoises();
		
		System.out.println(" ");
		
		System.out.println(c.getName() + ", " + c.getBreed() + ", Age " + c.getAge());
		c.makeNoises();
	}

}
