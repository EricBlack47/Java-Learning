package chapter3.abstrctuse;

public abstract class Template {
	
	public final long getTime() {
		long start=System.currentTimeMillis();
		code();
		long end=System.currentTimeMillis();
		return end-start;		
	}	
	public abstract void code(); 

}
