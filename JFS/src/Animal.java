
public class Animal {

	public void eats() {
		System.out.println("Animal eats");
	}
}

class Dog extends Animal {
	@Override
	public void eats() {
		System.out.println("Dog eats...");
	}
}

class Cat extends Animal {
	@Override
	public void eats() {
		System.out.println("Cat eats....");
	}
}