package chapter12.thread;

public class Account {
	
	public static void main(String[] args) {
		ClientRun cr=new ClientRun();
		Thread t1=new Thread(cr,"�ɷ�");
		Thread t2=new Thread(cr,"����");
		t1.start();
		t2.start();
		
	}
}
