package chapter6.string;

import java.util.Scanner;

public class PersonId {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("请输入您的身份证号:");
		String x=s.nextLine();
			if(x.length()!=18)
				System.out.println("请输入正确的身份证号");
			else
				if(Integer.parseInt(x.substring(16))%2==0){
					System.out.println("先生您的出生年为:"+x.substring(6, 10)+"月为"+x.substring(11,12)+"日为:"+x.substring(13,14));}
					else
						System.out.println("女士您的出生年:"+x.substring(6, 10)+"月为"+x.substring(11,12)+"日为:"+x.substring(13,14));
					
	}		
	
}

