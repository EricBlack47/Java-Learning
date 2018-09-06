package chapter2.ifforwhile;

public class ForWhile {
	public static void main(String[] args) {
		/*
		 * public static void main(String[] args) { int a=0,b=0,c=0; for(int
		 * i=0;i<2;i++) { a++; for(int k=0;k<4;k++) { b++; } c++; }
		 * System.out.println(a+","+b+","+c);
		 */

		/*
		 * //乘法表 for(int x=1;x<=9;x++) { for(int y=1;y<=x;y++) { if(x*y<10)
		 * System.out.print(y+"*"+x+"="+x*y+"  "); else
		 * System.out.print(y+"*"+x+"="+x*y+" "); } System.out.print("\n"); }
		 */

		// 打印1~100之间所有奇数的和
		/*
		 * for(int i=1,s=0;i<=100;i+=2) { s=s+i; System.out.println(s);
		 */

		// 打印1~100之间所有是7的倍数的整数的个数及 总和
		/*
		 * for(int i=1,s=0;i<100;i++) {
		 * 
		 * if(i%7==0) s=s+i; System.out.println(s); }
		 */

		// 请在控制台输出满足如下条件的五位数,个位等于万位,十位等于千位,个位+十位+千位+万位=百位
		/*
		 * int g, s, b, q, w; for (int i = 10000; i <= 99999; i++) { g = i % 10; s = (i
		 * % 100) / 10; b = (i % 1000) / 100; q = (i % 10000) / 1000; w = i / 10000; if
		 * (g == w && s == q && (g + s + q + w) == b) { System.out.println(i); }
		 * 
		 * }
		 */

		// 请统计1-1000之间同时满足如下条件的数据有多少个：对3整除余2,对5整除余3,对7整除余2
		/*
		 * int a, b, c; for (int i = 1, s = 0; i <= 1000; i++) { a = i % 3; b = i % 5; c
		 * = i % 7; if (a == 2 && b == 3 && c == 2) { System.out.println(i); }
		 * 
		 * }
		 */

		// 水仙花问题：所谓水仙花数是指一个3位数，并统计水仙花数的个数，其各个位上数字立方和等于其本身。例如： 153 = 1*1*1 + 3*3*3 +
		// 5*5*5
		/*
		 * int a,b,c; for(int i=100;i<=999;i++) { a=i%10; b=(i%100)/10; c=i/100;
		 * if((a*a*a)+(b*b*b)+(c*c*c)==i) { System.out.println(i); }
		 * 
		 * }
		 */

		// 求5的阶乘
		/*
		 * for(int i=5;i<100;i++) { if(i%5==0) System.out.println(i); }
		 */

		// 我国最高山峰是珠穆朗玛峰：8848m，我现在有一张足够大的纸张，厚度为：0.01m。请问，我折叠多少次，就可以保证厚度不低于珠穆朗玛峰的高度?
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
