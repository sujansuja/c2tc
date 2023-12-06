package multithreading;

public class ChildThread extends Thread {
	private int n;
	private String msg;

	public ChildThread(int n, String msg) {
		this.n = n;
		this.msg = msg;
	}

	public void run() {

		System.out.println("Inside the run() method is the thread alive or not? : " + this.isAlive());
		for (int i = 1; i <= n; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Thread is interrupted! " + e.getMessage());
			}
			System.out.println(msg + i + " " + Thread.currentThread().getName());
		}
	}
}
