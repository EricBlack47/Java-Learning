package chapter4.usb;

public class KeyBorad implements USB {

	@Override
	public void start() {
		System.out.println("���Ӽ���");
	}

	@Override
	public void stop() {
		System.out.println("�Ƴ�����");		
	}
	

}
