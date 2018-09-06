package chapter3.compare;

public class Person implements Compare{
	private String name;
	private int age;
	private String addr;
	
	@Override
	public int compareTo(Object o) {
		Person other=(Person) o;
		int result=this.name.compareTo(other.name);
		if(result==0) {
			result=this.age-other.age;
			if(result==0) {
				result=this.addr.compareTo(addr);
			}
		}
		return result;
	}
	
	public Person() {
		
	}
	
	public Person(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	

}
