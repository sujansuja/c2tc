
public class Animal {

	public void eats() {
		System.out.println("Animal eats");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Dog extends Animal{
	@Override
	public void eats() {
		System.out.println("Dog eats...");
	}
}

class Cat extends Animal{
	@Override
	public void eats() {
		System.out.println("Cat eats....");
	}
}