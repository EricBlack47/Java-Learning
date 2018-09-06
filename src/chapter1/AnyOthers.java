package chapter1;

import java.io.InputStream;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class AnyOthers {
	public static void main(String[] args) {
	/*
	 * //取数位 
	 * public static void main(String[] args) { Scanner sc=new
	 * Scanner(System.in); int a,b,c,d,e,f,g; System.out.println("输入一个六位数: ");
	 * a=sc.nextInt(); b=a%10; c=a%100/10; d=a%1000/100; e=a%10000/1000;
	 * f=a%100000/10000; g=a/100000; System.out.println("个位数是: "+b);
	 * System.out.println("十位数是: "+c); System.out.println("百位数是: "+d);
	 * System.out.println("千位数是: "+e); System.out.println("万位数是: "+f);
	 * System.out.println("十万位数是: "+g);
	 */

	/*
	 * public static void main(String[] args) {
	 * 
	 * //判断奇数偶数 
	 * Scanner sc1=new Scanner(System.in); int a1;
	 * System.out.println("请输入一个数字: "); a1=sc1.nextInt(); String
	 * str1=a1%2!=0?"奇数":"偶数"; System.out.println("这个数字为: "+str1);
	 */

	/*
	 * //左右手扑克牌交换 
	 * public static void main(String[] args) { String left="红桃8"; String
	 * right="黑桃A"; String temp=left;
	 * System.out.println("左手拿的是: "+left+" 右手拿的是: "+right); left=right; right=temp;
	 * System.out.println("交换后 "+"左手拿的是: "+left+" 右手拿的是: "+right);
	 * 
	 * int a=10,b=20,c,c1,c3; a=a^b; b=a^b; a=a^b;
	 * System.out.println("a: "+a+" b: "+b);
	 * 
	 * c=10^20; System.out.println("c: "+c); c1=30^20;
	 * System.out.println("c1: "+c1); c3=30^10; System.out.println("c3: "+c3); }
	 */
	/*// 分段奖励
	 * public static void main(String[] args) { //if控制语句 int a; String b; Scanner
	 * sc=new Scanner(System.in); a=sc.nextInt(); System.out.println("成绩: ");
	 * if(a>=60) if(a>=80) if(a>99) b="BMW"; else b="iphone"; else b="九"; else
	 * b="面壁"; System.out.println("奖励: "+b);
	 */
	/*  //判断三个数大小
	 * int num1,num2,num3; String s;
	 *  Scanner sc1=new Scanner(System.in);
	 * System.out.println("请输入三个数: ");
	 *  num1=sc1.nextInt();
	 *  num2=sc1.nextInt();
	 * num3=sc1.nextInt(); 
	 * if(num1>num2) 
	 * { if(num2>num3) 
	 * s=num1+">"+num2+">"+num3;
	 * else { if(num1>num3) s=num1+">"+num3+">"+num2; else
	 * s=num3+">"+num1+">"+num2;} } else { if(num1>num3) s=num2+">"+num1+">"+num3;
	 * else { if(num2>num3) s=num2+">"+num3+">"+num1; else s=num3+">"+num2+">"+num1;
	 * } } System.out.println(s);
	 */
	/*  //if转换
	 * int x = 4; int y = 1; if (x > 2) { if (y > 2) System.out.println(x + y);
	 * System.out.println("hello"); } else System.out.println("x is " + x); boolean
	 * b = true; if(b = false) //如果写成if(b=false)能编译通过吗？如果能，结果是？
	 * System.out.println("a"); else if(b) System.out.println("b"); else if(!b)
	 * System.out.println("c"); else System.out.println("d");
	 * 
	 */

	/*  //判断月份
	 * int a; System.out.println("请输入一个月份: "); Scanner sc=new Scanner(System.in);
	 * a=sc.nextInt();
	 * 
	 * switch(a) { case 1: case 3: case 5: case 7: case 9: case 11:
	 * System.out.println("31天"); break; case 2: System.out.println("28天"); break;
	 * case 4: case 6: case 8: case 10: case 12: System.out.println("30天"); break;
	 * default: System.out.println("未知天数"); break; }
	 * System.out.println("月份: "+a+"月");
	 */

	/*  //判断成绩
	 * int b; System.out.println("请输入您的成绩: "); Scanner sc1=new Scanner(System.in);
	 * b=sc1.nextInt();
	 * 
	 * switch(b/10) { case 6: case 7: System.out.println("合格"); break; case 8:
	 * System.out.println("良好"); break; case 9: case 10: System.out.println("优秀");
	 * break; default: System.out.println("不合格"); break; }
	 * System.out.println("您的成绩为: "+b+"分");
	 */

	/*  //判断大小写字母
	 * char x; System.out.println("请输入一个字母: "); Scanner sc=new Scanner(System.in);
	 * x=sc.next().charAt(0); System.out.println("这个字母大写为: "); switch (x) {
	 * 
	 * case 'a' : System.out.println("A"); break; case 'b' :
	 * System.out.println("B"); break; case 'c' : System.out.println("C"); break;
	 * case 'd' : System.out.println("D"); break; case 'e' :
	 * System.out.println("E"); break; default: System.out.println("other");
	 * 
	 * }
	 */

	/*//打**
	 * int a=0; while(a<10) { System.out.print("*"); a++;
	 * 
	 * }
	 * 
	 * System.out.println("over");
	 */

	/*
	 * int a=1; int x=100; switch(x) { case 1: x+=5; break; case 2: x+=10; break;
	 * case 3: x+=16; break; case 4: x+=34;
	 */

	/*//数字累加
	 * int i=1,s=0;
	 * 
	 * while(i<=100) { s=s+i; i=i+2; } System.out.println("1+3+5+7...99="+s);
	 */

	/*//小数点数字累加
	 * 
	 * double n=1.0,s1=0.0;
	 * 
	 * while(n<=100) { s1=s1+1.0/n; n++; }
	 * System.out.println("1+1/2+1/3...+1/100="+s1);
	 */
		
	/*//10以内乘积
	 * int s = 1, i = 1; while (i <= 10) { s = s * i; i++; }
	 * System.out.println("1*2*3*...10=" + s);
	 */

	// s=x的y次方
	/*
	 * int s = 1, x, y, i = 1; Scanner sc = new Scanner(System.in);
	 * System.out.println("请输入x: "); x = sc.nextInt(); System.out.println("请输入y: ");
	 * y = sc.nextInt(); while (i <= y) { s = s * x; i++;
	 * 
	 * } System.out.println(x+"的"+y+"次方: " + s);
	 */

	/*
	 * int s=0; for(int i=1;i<=100;s=s+i,i++); { System.out.println(s); }
	 */
	// 回文数
	/*
	 * public static void main(String[] args) {
	 * 
	 * int a,b,c; System.out.println("请输入一个数: "); Scanner sc=new Scanner(System.in);
	 * a=sc.nextInt(); for(c=a,b=0;a!=0;a=a/10) { b=10*b+a%10; }
	 * System.out.println(b); if(b==c) { System.out.println("这个数是回文数"); } else
	 * System.out.println("这个数不是回文数"); } }
	 */
	
    //奇数之和
		/*
		for (int i = 1, s = 0; i <= 100; s = s + i, i += 2) {
			System.out.println(s);
		}
		int i = 1, s = 0;

		while (i <= 100) {
			s = s + i;
			i = i + 2;
		}
		System.out.println("1+3+5+7...99=" + s);
		*/
		
		//
	}
}