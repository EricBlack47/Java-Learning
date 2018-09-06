package chapter12.threadstate;

public class A extends Thread{
	
	private B b;
	
	public A(B b) {
		super();
		this.b = b;
	}

	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			if(i==20) {
				System.out.println();
				try {
					b.join(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(i);
		}

	}		
}
