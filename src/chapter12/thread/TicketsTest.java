package chapter12.thread;

public class TicketsTest {
	
	public static void main(String[] args) {
		RunnableTickets rt=new RunnableTickets();
		Thread t1=new Thread(rt,"�Ϻ�");
		Thread t2=new Thread(rt,"�ϵ�");
		Thread t3=new Thread(rt,"�ϳ�");
	    t1.start();
	    t2.start();
	    t3.start();
	}
}
