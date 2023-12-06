package multithreading;

public class ThreadDemo {
	public static void main(String[] args) {
		ChildThread tOne = new ChildThread(5, "first");
		ChildThread tTwo = new ChildThread(10, "second");

		tOne.start();
		tTwo.start();
	}

}
