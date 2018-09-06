package chapter12.threadstate;

public class DeadLock {

	static StringBuffer s1 = new StringBuffer();
	static StringBuffer s2 = new StringBuffer();
	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				synchronized (s1) {
					s1.append("a");
					for(int i=0;i<30;i++) {
						System.out.print("*");
					}				
				}
				synchronized (s2) {
					s2.append("b");
				}
				System.out.println(s1);
				System.out.println(s2);
			};
		}.start();;
       new Thread() {
    	   @Override
    	public void run() {
    		synchronized (s2) {
				s2.append("c");
				for(int i=0;i<30;i++) {
					System.out.print("@");
				}
    		}
    		synchronized (s1) {
    			s1.append("d");
			}
    		System.out.println(s2);
    		System.out.println(s1);
			}
    	}.start();;
       };
	}


