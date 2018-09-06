package chapter3.extendztest;

public  class CommonEmployee extends Employee{

	@Override
	public void work() {
		System.out.println("working hard!");		
	}

	public CommonEmployee() {
		
	}
	
	public CommonEmployee(String name,int id,double salary) {
		super(name,id,salary);
	}

	
}
