
public class MethodOverloading {

	public static int add(int a, int b) {
		return a + b;
	}

	public static float add(float a, float b) {
		return a + b;
	}

//	Duplicate method: add(float,float)in type MethodOverloading
//	public static int add(float a, float b) {
//		return a + b;
//	}

	public static float add(int a, float b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println("Method overloading is achieved");
		System.out.println("Addition of two integers: " + add(10, 20));
		System.out.println("Addition of two float: " + add(20.0f, 50.2f));
		System.out.println("Addition of int and float: " + add(12, 20.5f));
	}
}
