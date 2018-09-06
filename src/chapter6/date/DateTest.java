package chapter6.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	
	public static void main(String[] args) throws ParseException {
		
		Date date=new Date();
		System.out.println(date);
		System.out.println(date.getTime());
		System.out.println(System.currentTimeMillis());	
		/**
		 * 日期化格式  yyyy MM dd  HH mm ss
		 *
		 */
		//日期转字符串
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		System.out.println(sdf.format(date));
		//字符串转日期
		String time ="1996/05/01";
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(sdf2.parse(time));	
		/**
		 * Calendar日历类
		 */
		Calendar c=Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.YEAR, 1996);
		c.set(Calendar.MONTH, 4);
		c.set(Calendar.DATE, 1);
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH)+1;
		int day=c.get(Calendar.DATE);
		Date d2=c.getTime();
		System.out.println(year+" "+month+" "+day);		
		System.out.println(d2);
	}

}
