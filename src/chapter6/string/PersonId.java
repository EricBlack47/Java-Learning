package chapter6.string;

import java.util.Scanner;

public class PersonId {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("�������������֤��:");
		String x=s.nextLine();
			if(x.length()!=18)
				System.out.println("��������ȷ�����֤��");
			else
				if(Integer.parseInt(x.substring(16))%2==0){
					System.out.println("�������ĳ�����Ϊ:"+x.substring(6, 10)+"��Ϊ"+x.substring(11,12)+"��Ϊ:"+x.substring(13,14));}
					else
						System.out.println("Ůʿ���ĳ�����:"+x.substring(6, 10)+"��Ϊ"+x.substring(11,12)+"��Ϊ:"+x.substring(13,14));
					
	}		
	
}

