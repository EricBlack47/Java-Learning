package chapter2.ifforwhile;

import java.util.Scanner;

public class If {
	/*
	public static void main(String[] args) {
		
		int a,b,c,d,e;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入四个数: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=a;
		if(b>e)
		    e=b;
		if(c>e)
			e=c;
		if(d>e)
			e=d;
		System.out.println(e);
		sc.close();
				*/
/*
		int a;
		String b;
		Scanner sc=new Scanner(System.in);		
		System.out.println("请输入您的成绩: ");
		a=sc.nextInt();
		if(a>=60)
			if(a>=80)
				if(a>99)
					b="BMW";
				else
					b="iphone";
			else
				b="九阴真经";
		else
			b="面壁";
		System.out.println("等级: "+b);
		*/
	public static void main(String[] args) {
		
	
		int num1,num2,num3;
	    String s = null;
		Scanner sc1=new Scanner(System.in);
		System.out.println("请输入三个数: ");
		num1=sc1.nextInt();
		num2=sc1.nextInt();
		num3=sc1.nextInt();
		if(num1>num2)
		     if(num2>num3)
		    	 s=num1+">"+num2+">"+num3;
		     else
		    	 s=num1+">"+num3+">"+num2;		    	 
		else
			if(num2>num3)
				if(num3>num1)
				s=num2+">"+num3+">"+num1;
			else
				s=num2+">"+num1+">"+num3;
		if(num3>num1)  
			if(num1>num2)
				s=num3+">"+num1+">"+num2;
			else
				s=num3+">"+num2+">"+num1;
		System.out.println(s);
		
		
			
			
			
		
		
		
		
		
}
			
		
		
}


