package chapter2.ifforwhile;

public class ForWhile {
	public static void main(String[] args) {
		/*
		 * public static void main(String[] args) { int a=0,b=0,c=0; for(int
		 * i=0;i<2;i++) { a++; for(int k=0;k<4;k++) { b++; } c++; }
		 * System.out.println(a+","+b+","+c);
		 */

		/*
		 * //�˷��� for(int x=1;x<=9;x++) { for(int y=1;y<=x;y++) { if(x*y<10)
		 * System.out.print(y+"*"+x+"="+x*y+"  "); else
		 * System.out.print(y+"*"+x+"="+x*y+" "); } System.out.print("\n"); }
		 */

		// ��ӡ1~100֮�����������ĺ�
		/*
		 * for(int i=1,s=0;i<=100;i+=2) { s=s+i; System.out.println(s);
		 */

		// ��ӡ1~100֮��������7�ı����������ĸ����� �ܺ�
		/*
		 * for(int i=1,s=0;i<100;i++) {
		 * 
		 * if(i%7==0) s=s+i; System.out.println(s); }
		 */

		// ���ڿ���̨�������������������λ��,��λ������λ,ʮλ����ǧλ,��λ+ʮλ+ǧλ+��λ=��λ
		/*
		 * int g, s, b, q, w; for (int i = 10000; i <= 99999; i++) { g = i % 10; s = (i
		 * % 100) / 10; b = (i % 1000) / 100; q = (i % 10000) / 1000; w = i / 10000; if
		 * (g == w && s == q && (g + s + q + w) == b) { System.out.println(i); }
		 * 
		 * }
		 */

		// ��ͳ��1-1000֮��ͬʱ�������������������ж��ٸ�����3������2,��5������3,��7������2
		/*
		 * int a, b, c; for (int i = 1, s = 0; i <= 1000; i++) { a = i % 3; b = i % 5; c
		 * = i % 7; if (a == 2 && b == 3 && c == 2) { System.out.println(i); }
		 * 
		 * }
		 */

		// ˮ�ɻ����⣺��νˮ�ɻ�����ָһ��3λ������ͳ��ˮ�ɻ����ĸ����������λ�����������͵����䱾�����磺 153 = 1*1*1 + 3*3*3 +
		// 5*5*5
		/*
		 * int a,b,c; for(int i=100;i<=999;i++) { a=i%10; b=(i%100)/10; c=i/100;
		 * if((a*a*a)+(b*b*b)+(c*c*c)==i) { System.out.println(i); }
		 * 
		 * }
		 */

		// ��5�Ľ׳�
		/*
		 * for(int i=5;i<100;i++) { if(i%5==0) System.out.println(i); }
		 */

		// �ҹ����ɽ������������壺8848m����������һ���㹻���ֽ�ţ����Ϊ��0.01m�����ʣ����۵����ٴΣ��Ϳ��Ա�֤��Ȳ��������������ĸ߶�?
		double i = 0.01;
		int s = 1;
		while (i <= 8848.0) {
			i *= 2;
			s++;
			System.out.println(s);
			System.out.println(i);
		}
		
		
		
		
		
	}
	
}
