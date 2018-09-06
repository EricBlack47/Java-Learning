package chapter4.usb;

public class Iphone implements USB {
	
	@Override
	public void start() {
		System.out.println("连接手机");
	}

	@Override
	public void stop() {
		System.out.println("断开连接");
		
	}
		
}
