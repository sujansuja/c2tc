package multithreading;

public class RunnableDemo {

	public static void main(String[] args) {
		UsingRunnable ur = new UsingRunnable(10, 20, "hello");
		Thread tOne = new Thread();
		tOne.start();
//		tOne.start();
	}

}
