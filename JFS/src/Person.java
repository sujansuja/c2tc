
public class Person {
	int i;
	String name;

	public Person() {
		i = 0;
		name = "Chandan";
		System.out.println("Name: " + name + ", i = " + i);
	}

	public Person(int i, String name) {
		this.i = i;
		this.name = name;
		System.out.println("Name: " + name + ", i = " + i);
	}

	public Person(int i) {
		this.i = i;
		name = "Chandan";
		System.out.println("Name: " + name + ", i = " + i);
	}

	public Person(String name) {
		i = 0;
		this.name = name;
		System.out.println("Name: " + name + ", i = " + i);
	}
}
