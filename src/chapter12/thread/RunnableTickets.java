package chapter12.thread;

public class RunnableTickets implements Runnable{
	
	private Integer counts=5;
	public RunnableTickets() {		
	}
	@Override
	public void run() {
		while(true) {
			if(!sell())break;
		System.out.println(Thread.currentThread().getName()+"�۳�һ��Ʊ");
	}
}
	private boolean sell() {
		if(counts<=0) {
			return false;
		}
		counts--;
		return true;
	}
}
