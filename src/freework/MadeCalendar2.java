package freework;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MadeCalendar2 {
	public static void main(String[] args) {
		int y,m,d;
		Scanner sc = new Scanner(System.in);
		System.out.println("������������(yyyy mm dd):");
		y=sc.nextInt();
		m=sc.nextInt();
		d=sc.nextInt();
		Calendar c=Calendar.getInstance();
		c.set(y,m-1,1);
		int dayOfWeek=c.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek);
		Date d1=c.getTime();//�¸��µ�һ��
		c.set(y,m,1);
		Date d2=c.getTime();//���µ�һ��
		long days=(d2.getTime()-d1.getTime())/1000/60/60/24;//����µ�����
		c.set(y,m-1,d);
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy��MM��dd��");
		System.out.println("\t\t"+sdf.format(c.getTime()));//���ɱ��µ�����
		System.out.println("����\t��һ\t�ܶ�\t����\t����\t����\t����");
		for(int i=0;i<dayOfWeek;i++) {
			System.out.print("\t");//ȷ����һ��Ϊ���ڼ�
		}
		for(long i=dayOfWeek;i<days+dayOfWeek;i++) {
			if(i-dayOfWeek+1==d)
				System.out.print(i-dayOfWeek+1+"*\t");
			else
				System.out.print(i-dayOfWeek+1+"\t");
			if(i%7==0)
			System.out.println();
		}
	}

}
