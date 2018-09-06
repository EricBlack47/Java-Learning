package chapter4.factory;

public class TeacherWorkFactory implements IWorkFactory{

	@Override
	public Work create() {
		
		return new Teacher();
	
	}
}
