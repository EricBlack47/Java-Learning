package chapter3.compare;

public class Rectangle {
	
	private int chang;
	private int kuan;
	private int rArea;
	
	
	public void setChang(int chang) {
		this.rArea=chang*kuan;
		this.chang = chang;
	}
	public int getrArea() {
		return rArea;
	}
	public void setKuan(int kuan) {
		this.kuan = kuan;
	}
	
	

}
