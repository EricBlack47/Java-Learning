package chapter1;

import java.io.InputStream;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class AnyOthers {
	public static void main(String[] args) {
	/*
	 * //ȡ��λ 
	 * public static void main(String[] args) { Scanner sc=new
	 * Scanner(System.in); int a,b,c,d,e,f,g; System.out.println("����һ����λ��: ");
	 * a=sc.nextInt(); b=a%10; c=a%100/10; d=a%1000/100; e=a%10000/1000;
	 * f=a%100000/10000; g=a/100000; System.out.println("��λ����: "+b);
	 * System.out.println("ʮλ����: "+c); System.out.println("��λ����: "+d);
	 * System.out.println("ǧλ����: "+e); System.out.println("��λ����: "+f);
	 * System.out.println("ʮ��λ����: "+g);
	 */

	/*
	 * public static void main(String[] args) {
	 * 
	 * //�ж�����ż�� 
	 * Scanner sc1=new Scanner(System.in); int a1;
	 * System.out.println("������һ������: "); a1=sc1.nextInt(); String
	 * str1=a1%2!=0?"����":"ż��"; System.out.println("�������Ϊ: "+str1);
	 */

	/*
	 * //�������˿��ƽ��� 
	 * public static void main(String[] args) { String left="����8"; String
	 * right="����A"; String temp=left;
	 * System.out.println("�����õ���: "+left+" �����õ���: "+right); left=right; right=temp;
	 * System.out.println("������ "+"�����õ���: "+left+" �����õ���: "+right);
	 * 
	 * int a=10,b=20,c,c1,c3; a=a^b; b=a^b; a=a^b;
	 * System.out.println("a: "+a+" b: "+b);
	 * 
	 * c=10^20; System.out.println("c: "+c); c1=30^20;
	 * System.out.println("c1: "+c1); c3=30^10; System.out.println("c3: "+c3); }
	 */
	/*// �ֶν���
	 * public static void main(String[] args) { //if������� int a; String b; Scanner
	 * sc=new Scanner(System.in); a=sc.nextInt(); System.out.println("�ɼ�: ");
	 * if(a>=60) if(a>=80) if(a>99) b="BMW"; else b="iphone"; else b="��"; else
	 * b="���"; System.out.println("����: "+b);
	 */
	/*  //�ж���������С
	 * int num1,num2,num3; String s;
	 *  Scanner sc1=new Scanner(System.in);
	 * System.out.println("������������: ");
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
	/*  //ifת��
	 * int x = 4; int y = 1; if (x > 2) { if (y > 2) System.out.println(x + y);
	 * System.out.println("hello"); } else System.out.println("x is " + x); boolean
	 * b = true; if(b = false) //���д��if(b=false)�ܱ���ͨ��������ܣ�����ǣ�
	 * System.out.println("a"); else if(b) System.out.println("b"); else if(!b)
	 * System.out.println("c"); else System.out.println("d");
	 * 
	 */

	/*  //�ж��·�
	 * int a; System.out.println("������һ���·�: "); Scanner sc=new Scanner(System.in);
	 * a=sc.nextInt();
	 * 
	 * switch(a) { case 1: case 3: case 5: case 7: case 9: case 11:
	 * System.out.println("31��"); break; case 2: System.out.println("28��"); break;
	 * case 4: case 6: case 8: case 10: case 12: System.out.println("30��"); break;
	 * default: System.out.println("δ֪����"); break; }
	 * System.out.println("�·�: "+a+"��");
	 */

	/*  //�жϳɼ�
	 * int b; System.out.println("���������ĳɼ�: "); Scanner sc1=new Scanner(System.in);
	 * b=sc1.nextInt();
	 * 
	 * switch(b/10) { case 6: case 7: System.out.println("�ϸ�"); break; case 8:
	 * System.out.println("����"); break; case 9: case 10: System.out.println("����");
	 * break; default: System.out.println("���ϸ�"); break; }
	 * System.out.println("���ĳɼ�Ϊ: "+b+"��");
	 */

	/*  //�жϴ�Сд��ĸ
	 * char x; System.out.println("������һ����ĸ: "); Scanner sc=new Scanner(System.in);
	 * x=sc.next().charAt(0); System.out.println("�����ĸ��дΪ: "); switch (x) {
	 * 
	 * case 'a' : System.out.println("A"); break; case 'b' :
	 * System.out.println("B"); break; case 'c' : System.out.println("C"); break;
	 * case 'd' : System.out.println("D"); break; case 'e' :
	 * System.out.println("E"); break; default: System.out.println("other");
	 * 
	 * }
	 */

	/*//��**
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

	/*//�����ۼ�
	 * int i=1,s=0;
	 * 
	 * while(i<=100) { s=s+i; i=i+2; } System.out.println("1+3+5+7...99="+s);
	 */

	/*//С���������ۼ�
	 * 
	 * double n=1.0,s1=0.0;
	 * 
	 * while(n<=100) { s1=s1+1.0/n; n++; }
	 * System.out.println("1+1/2+1/3...+1/100="+s1);
	 */
		
	/*//10���ڳ˻�
	 * int s = 1, i = 1; while (i <= 10) { s = s * i; i++; }
	 * System.out.println("1*2*3*...10=" + s);
	 */

	// s=x��y�η�
	/*
	 * int s = 1, x, y, i = 1; Scanner sc = new Scanner(System.in);
	 * System.out.println("������x: "); x = sc.nextInt(); System.out.println("������y: ");
	 * y = sc.nextInt(); while (i <= y) { s = s * x; i++;
	 * 
	 * } System.out.println(x+"��"+y+"�η�: " + s);
	 */

	/*
	 * int s=0; for(int i=1;i<=100;s=s+i,i++); { System.out.println(s); }
	 */
	// ������
	/*
	 * public static void main(String[] args) {
	 * 
	 * int a,b,c; System.out.println("������һ����: "); Scanner sc=new Scanner(System.in);
	 * a=sc.nextInt(); for(c=a,b=0;a!=0;a=a/10) { b=10*b+a%10; }
	 * System.out.println(b); if(b==c) { System.out.println("������ǻ�����"); } else
	 * System.out.println("��������ǻ�����"); } }
	 */
	
    //����֮��
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