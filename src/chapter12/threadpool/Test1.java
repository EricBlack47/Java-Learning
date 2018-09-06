package chapter12.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1 {
	
	static Integer i=0;
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println("First Mission");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println();
			}
		});
		
		es.execute(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<15;i++) {
					System.out.println("Second Mission");
					try {
						Thread.sleep(600);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println();
			}		
		});
		
		es.execute(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<15;i++) {
					System.out.println("Thrid Mission");
					try {
						Thread.sleep(600);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
	            System.out.println();
			}	
		});
	}
}
