package chapter6.string;

import java.io.UnsupportedEncodingException;

public class Test1 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String s="abcderf����ssdaweqwds4561";

		/*String s1 = new String();
		System.out.println(s1);

		byte[] b = { 'a', 'b', 'c' };
		String s2 = new String(b);
		System.out.println(s2);

		char[] c = { 0x4e91, 0x5357, 0x6606, 0x660e };
		String s3 = new String(c);
		System.out.println(s3);

		int[] a = { 69, 114, 105, 99 };
		String s4 = new String(a, 0, a.length);
		System.out.println(s4);
		*/
		
		System.out.println(s.replaceAll("a", "&"));
		
		
		
		char[] carr=s.toCharArray();//�ַ���ת����
		for(char c: carr) {
			System.out.print((int)c+" ");
		}
		System.out.println("\r"+"--------------------------------");	
		byte [] barr=s.getBytes();//�ַ���ת�ֽ�����
		for(byte b: barr ) {
			System.out.print(b+" ");
		}
		System.out.println("\n"+new String(s));
		byte [] bbarr=s.getBytes("utf8");//utf8��
		System.out.print("\n"+bbarr.length);
			for(byte b:bbarr) {
				System.out.print(b+" ");
			}
		System.out.println("\n"+new String(bbarr,"utf8"));
	}   

}
