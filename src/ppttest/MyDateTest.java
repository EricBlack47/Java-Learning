package ppttest;

public class MyDateTest {
	public static void main(String[] args) {

		MyDate m1=new MyDate(1996,06,06);
		MyDate m2=new MyDate(1996,06,06);
		
		if(m1==m2) {
			System.out.println("ture");
		}
		else
			System.out.println("false");
	}
	
	

}
