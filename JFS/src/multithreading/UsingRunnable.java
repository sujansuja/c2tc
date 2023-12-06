package multithreading;

public class UsingRunnable implements Runnable {

	private int a, n;
	private String str;

	UsingRunnable(int a, int n, String str) {
		this.a = a;
		this.n = n;
		this.str = str;
	}

	@Override
	public void run() {
		for (int i = a; i <= n; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Thread is interrupted! " + e.getMessage());
			}
			System.out.println(str + i + " " + Thread.currentThread().getName());
		}
	}

}
