package chapter12.thread;

public class Client implements Runnable{
	private Integer money=6000;
	
	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			synchronized (money) {
				this.money = this.money - 1000;
				System.out.println(Thread.currentThread().getName()+" È¡Ç®ºóÓà¶î= "+this.getMoney());
			}		
		}
	}   
	
	public Integer getMoney() {
		return money;
	}
	
	public static void main(String[] args) {		
		Client c=new Client();
		Thread t1=new Thread(c,"Tom");
		Thread t2=new Thread(c,"Jerry");
		t1.start();
		t2.start();
		while(true) {
			if(!t1.isAlive()&&!t2.isAlive()) {
				System.out.println("ÕËºÅÓà¶î£º"+c.getMoney());
				break;
			}
		}
	}
}
