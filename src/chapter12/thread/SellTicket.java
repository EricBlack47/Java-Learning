package chapter12.thread;

public class SellTicket extends Thread{
	
	private Integer counts=5;
	public SellTicket() {
			
	}
	@Override
	public void run() {
		while(counts>0) {
			System.out.println(Thread.currentThread().getName()+"售出一张票");
			counts--;
			
	}

}
}