package chapter4.usb;

public class Iphone implements USB {
	
	@Override
	public void start() {
		System.out.println("�����ֻ�");
	}

	@Override
	public void stop() {
		System.out.println("�Ͽ�����");
		
	}
		
}
