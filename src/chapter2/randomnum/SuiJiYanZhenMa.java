package chapter2.randomnum;

import java.util.Random;
import java.util.Scanner;

public class SuiJiYanZhenMa {
	 public static void main(String[] args) {	 
		 Scanner input=new Scanner(System.in);
         System.out.println("������һ���ַ���:");
         String str=input.nextLine();
         StringBuilder sb=new StringBuilder();
         char[]c=str.toCharArray();
         for(int i=0;i<6;i++) {
        	 Random r=new Random();
        	 sb.append(c[r.nextInt(10)]);      	 
         }
         System.out.println("��֤��Ϊ:"+sb);
	}	
}
