package chapter12.threadtest;

import java.util.Random;

public class SellMantou {

	private static Prodoucer<Mantou> p = new Prodoucer<>(10);

	public static void main(String[] args) {

		new Thread(new Runnable() { // 做馒头
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					Mantou mt = new Mantou();
					mt.setName("馒头"+(i+1));
					mt.setPrice(1.5);
					p.put(mt);
					System.out.println("做馒头:" + mt);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					Mantou mt =p.get();
					System.out.println("购买馒头:" + mt);
					Random rd = new Random();
					try {
						Thread.sleep(100 + rd.nextInt(100));
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
}