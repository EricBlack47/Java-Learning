package chapter3.extendztest;
	
	public abstract class Employee{
		
		public  String name;
		public  int id;
		public  double salary;		
		public  abstract void work() ;
				
		public Employee() {			
		}
			
		public Employee(String name, int id, double salary) {
			this.name=name;
			this.id=id;
			this.salary=salary;			
		}
			
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}


		@Override
		public String toString() {
			return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
		}

		public void setBonus(double d) {
			// TODO Auto-generated method stub
			
		}	
		
}

 