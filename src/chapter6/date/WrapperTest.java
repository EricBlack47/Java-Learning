package chapter6.date;

public class WrapperTest {
	
	public static void main(String[] args) {
		Integer a=666;	//装包
		int b=a;// 拆包
		System.out.println(b);
		
		//int转String
		String s1=a.toString();
		System.out.println(s1);
		String s2=a+" ";
		System.out.println(s2);
		String s3=String.valueOf(a);
		System.out.println(s3);
		System.out.println("=======================");
		
		//String转int
		String str="999";
		int a1=Integer.valueOf(str);
		System.out.println(a1);
		int a2=Integer.parseInt(str);
		System.out.println(a2);
		Integer a3=new Integer(str);
		System.out.println(a3);
	
		//字符串转换字符数组
		String str1="fdsf4245fe4";
		char[] chs=str1.toCharArray();
		System.out.println(chs);
	}

}
