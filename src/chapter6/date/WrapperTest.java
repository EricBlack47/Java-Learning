package chapter6.date;

public class WrapperTest {
	
	public static void main(String[] args) {
		Integer a=666;	//װ��
		int b=a;// ���
		System.out.println(b);
		
		//intתString
		String s1=a.toString();
		System.out.println(s1);
		String s2=a+" ";
		System.out.println(s2);
		String s3=String.valueOf(a);
		System.out.println(s3);
		System.out.println("=======================");
		
		//Stringתint
		String str="999";
		int a1=Integer.valueOf(str);
		System.out.println(a1);
		int a2=Integer.parseInt(str);
		System.out.println(a2);
		Integer a3=new Integer(str);
		System.out.println(a3);
	
		//�ַ���ת���ַ�����
		String str1="fdsf4245fe4";
		char[] chs=str1.toCharArray();
		System.out.println(chs);
	}

}
