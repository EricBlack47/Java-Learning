package chapter12.thread;

public class Account {
	
	public static void main(String[] args) {
		ClientRun cr=new ClientRun();
		Thread t1=new Thread(cr,"ÕÉ·ò");
		Thread t2=new Thread(cr,"ÆŞ×Ó");
		t1.start();
		t2.start();
		
	}
}
