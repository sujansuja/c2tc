
public class MethodOverriding {

	public static void main(String[] args) {
//		Early Binding / static Binding
		Dog dog = new Dog();
		dog.eats();

//		Late Binding / Dynamic Binding
		Animal a = new Dog();
		a.eats();
	}
}
