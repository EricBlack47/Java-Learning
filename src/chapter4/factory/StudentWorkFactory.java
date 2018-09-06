package chapter4.factory;

public class StudentWorkFactory implements IWorkFactory{

	@Override
	public Work create() {
		
		return new Student();
		
	}
}
