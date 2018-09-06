package chapter3.compare;

public class ComparableRectangle extends Rectangle implements Compare{
	
	public ComparableRectangle(int chang,int kuan) {
		super();
	}

	@Override
	public int compareTo(Object o) {
		int rArea=this.getrArea();
		int otherRArea=((ComparableRectangle)o).getrArea();
		int s=rArea-otherRArea;
		return s;
	}

}
