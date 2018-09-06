package chapter3.compare;

public class ComparableCircle extends Circle implements Compare {
	
	public void  ComparableCircle() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int compareTo(Object o) {
		double cArea=this.getArea();
		double otherArea=((ComparableCircle)o).getArea();
		double diff=cArea-otherArea;
		int f=diff>0?1:diff<0?-1:0;
		return  f;
	}

}
