package chapter12.thread;

public class ClientRun extends Thread {
	private Integer account = 6000;

	public ClientRun() {
	}

	@Override
	public void run() {
		int k = 3;
		while (k > 0) {
			synchronized (this) {
				account -= 1000;				
			}
			System.out.println(Thread.currentThread().getName() + account);
			k--;
		}
	}
}
