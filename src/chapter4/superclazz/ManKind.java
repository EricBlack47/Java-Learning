package chapter4.superclazz;

public class ManKind {
	private int sex;
	private int salary;
	
	public void manOrWoman() {
		if(sex==1)
			System.out.println("man");
		else
			System.out.println("woman");
				
	}
	public void employeed() {
		if(salary==0)
			System.out.println("no job");
		else
			System.out.println("rich bitch");
	}

}
