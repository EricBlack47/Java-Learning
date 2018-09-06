package chapter12.thread;
/**
 * 线程创建
 * 1.继承Thread类
 * 2.重写run方法
 * 3.创建线程对象
 * 4.启动线程（调用线程对象的start方法）
 * @author Administrator
 *
 */
public class CreatThread1 extends Thread{

	@Override
	public void run() {
		while(true) {
			System.out.println("我是线程"+Thread.currentThread().getName());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		CreatThread1 ct1= new CreatThread1();
		ct1.start();
		while(true) {
			System.out.println("主线程");
			Thread.sleep(5000);
		}
	}
}
