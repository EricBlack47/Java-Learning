package chapter12.thread;
/**
 * 线程创建
 * 1.实现Runnable接口
 * 2.实例化Runnable对象
 * 3.创建线程（通过Runnable对象）
 * 4.启动线程
 * @author Administrator
 *
 */
public class CreatThread2 implements Runnable{

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
		CreatThread2 ct2=new CreatThread2();
		Thread th1=new Thread(ct2,"1");
		th1.start();
		while(true) {
			System.out.println("主线程");
			Thread.sleep(5000);
		}
	}
}
