package chapter3.compare;

public class Test {
	
	public static void main(String[] args) {
		
		/*Person p1=new Person("Eric",22,"Kuming");
		Person p2=new Person("Alice",18,"Kunming");
		
		int f=p1.compareTo(p2);
		
		if(f>0)
			System.out.println(p1.getName()+"大于"+p2.getName());
		else
			if(f==0)
				System.out.println(p1.getName()+"等于"+p2.getName());
			else
				System.out.println(p1.getName()+"小于"+p2.getName());
	}*/
		
		ComparableCircle c1=new ComparableCircle();
		ComparableCircle c2=new ComparableCircle();
		c1.setBanjin(5);
		c2.setBanjin(5);
		int f=c1.compareTo(c2);
		if(f>0)
			System.out.println("c1>c2");
		else
			if(f==0)
				System.out.println("c1=c2");
			else
				System.out.println("c1<c2");
		
		ComparableRectangle cr1=new ComparableRectangle(4,3);
		ComparableRectangle cr2=new ComparableRectangle(4,3);
		int z=cr1.compareTo(cr2);
		if(z>0)
			System.out.println("cr1>cr2");
		else
			if(z==0)
				System.out.println("cr1=cr2");
			else
				System.out.println("cr1<cr2");
		

}
}