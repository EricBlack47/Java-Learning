package chapter12.threadstate;

public class B extends Thread{

	@Override
	public void run() {
		for(int i=0;i<100;i++)
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("x");
		
	}
	public static void main(String[] args) {
	
		B b=new B();
		A a=new A(b);
		B b2=new B();
		b2.setDaemon(true);
		b2.start();
		System.out.println(b2.getState());
		b.start();
		a.start();
		while(true) {
			System.out.println("------"+a.getState());
			if(!a.isAlive()) break;
		}
	}
	

}
