package chapter3.extendz;



public class Cop extends Person {
	
	private String job;
	
	public Cop() {
		super("");
		System.out.println("hey");	
	}
	
	
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	public void hello() {
		System.out.println("hello cop");
	}
	@Override
	public String toString() {
		return "Cop [job=" + job + "]";
	}

}
