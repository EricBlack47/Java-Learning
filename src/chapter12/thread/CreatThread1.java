package chapter12.thread;
/**
 * �̴߳���
 * 1.�̳�Thread��
 * 2.��дrun����
 * 3.�����̶߳���
 * 4.�����̣߳������̶߳����start������
 * @author Administrator
 *
 */
public class CreatThread1 extends Thread{

	@Override
	public void run() {
		while(true) {
			System.out.println("�����߳�"+Thread.currentThread().getName());
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
			System.out.println("���߳�");
			Thread.sleep(5000);
		}
	}
}
