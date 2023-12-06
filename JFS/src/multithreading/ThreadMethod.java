package multithreading;

public class ThreadMethod {

	public static void main(String[] args) {
		ChildThread tOne = new ChildThread(5, "first");
		ChildThread tTwo = new ChildThread(10, "second");

		System.out.println("Current Thread: " + Thread.currentThread());

		tOne.start();
		tTwo.start();

		Thread.currentThread().setName("parent thread");
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);

		System.out.println("Current Thread: " + Thread.currentThread());
	}

}
