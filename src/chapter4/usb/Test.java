package chapter4.usb;

public class Test {
	public static void main(String[] args) {
		MainBorad mb=new MainBorad();
		Iphone iphone=new Iphone();
		KeyBorad kb=new KeyBorad();
		mb.insert(iphone);
		mb.delete(iphone);
		mb.insert(kb);
		mb.delete(kb);
	
	}

}
