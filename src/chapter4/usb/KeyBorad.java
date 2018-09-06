package chapter4.usb;

public class KeyBorad implements USB {

	@Override
	public void start() {
		System.out.println("Á¬½Ó¼üÅÌ");
	}

	@Override
	public void stop() {
		System.out.println("ÒÆ³ı¼üÅÌ");		
	}
	

}
