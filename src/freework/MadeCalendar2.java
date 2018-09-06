package freework;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MadeCalendar2 {
	public static void main(String[] args) {
		int y,m,d;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年月日(yyyy mm dd):");
		y=sc.nextInt();
		m=sc.nextInt();
		d=sc.nextInt();
		Calendar c=Calendar.getInstance();
		c.set(y,m-1,1);
		int dayOfWeek=c.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek);
		Date d1=c.getTime();//下个月第一天
		c.set(y,m,1);
		Date d2=c.getTime();//本月第一天
		long days=(d2.getTime()-d1.getTime())/1000/60/60/24;//这个月的天数
		c.set(y,m-1,d);
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println("\t\t"+sdf.format(c.getTime()));//生成本月的日期
		System.out.println("周日\t周一\t周二\t周三\t周四\t周五\t周六");
		for(int i=0;i<dayOfWeek;i++) {
			System.out.print("\t");//确定第一天为星期几
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
