package chapter3.abstrctuse;

public  class TimeExcute extends Template{

	@Override
	public void code() {
		for(long i=0;i<1000000;i++) {
			System.out.println(i);	
		}				
	}	
	
	public static void main(String[] args) {
		TimeExcute t1=new TimeExcute();
		t1.code();
		System.out.println("ִ��ʱ��Ϊ:"+t1.getTime()+"����");
	}
	
}
