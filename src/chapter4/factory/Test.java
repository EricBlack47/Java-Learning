package chapter4.factory;

public class Test {
	
	public static void main(String[] args) {
		
		IWorkFactory wf1=new TeacherWorkFactory();
		IWorkFactory wf2=new StudentWorkFactory();
		Work w1=wf1.create();
		Work w2=wf2.create();
		w1.dowork();
		w2.dowork();
	}

}
