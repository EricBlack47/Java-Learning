package chapter3.compare;

public class Circle {
	
	public static final double PI=3.1415926;
	private double banjin;
	private double area;
	
	
	
	public double getArea() {
		return area;
	}


	public void setBanjin(double banjin) {
		this.area=PI*banjin*banjin;
		this.banjin = banjin;
	}


	public double getBanjin() {
		return banjin;
	}
	

}
