package chapter12.thread;
/**
 * �̴߳���
 * 1.ʵ��Runnable�ӿ�
 * 2.ʵ����Runnable����
 * 3.�����̣߳�ͨ��Runnable����
 * 4.�����߳�
 * @author Administrator
 *
 */
public class CreatThread2 implements Runnable{

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
		CreatThread2 ct2=new CreatThread2();
		Thread th1=new Thread(ct2,"1");
		th1.start();
		while(true) {
			System.out.println("���߳�");
			Thread.sleep(5000);
		}
	}
}
