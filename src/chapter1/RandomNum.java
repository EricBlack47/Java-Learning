package chapter1;

import java.util.Random;

public class RandomNum {

	public static void main(String[] args) {
		
		int i;
		int [] a=new int[10];
		//生成随机数组
		setRandomNum(a);
		out(a);
		//找最小值
		int min = min(a);
		System.out.print("\r"+"最小值:"+min);
		//找最大值
		int max = findBigestNum(a);
		System.out.print("\r"+"最大值:"+max);
		//求和
		int sum = sum(a);
		System.out.print("\r"+"sum="+sum);
		//求平均数
		int avg = avg(a);
		System.out.println("\r"+"avg="+avg);
		//
}
	/**
	 * 
	 * @param a
	 * @return
	 */
	private static int min(int[] a) {
		int i;
		int min=a[0];
		for(i=1;i<a.length;i++) {			
		   if(min>a[i])
		  min=a[i];			
		}
		return min;
	}
	/**
	 * 平均
	 * @param a
	 * @return
	 */
	private static int avg(int[] a) {
		int i;
		int s = 0, avg = 0;
		for (i = 0; i < a.length; i++) {
			s += a[i];
		}
		avg = s / a.length;
		return avg;
	}
	/**
	 * 总和
	 * @param a
	 * @return
	 */
	private static int sum(int[] a) {
		int i;
		int sum=0;
		for(i=0;i<a.length;i++) {
			sum+=a[i];			
		}
		return sum;
	}
	/**
	 * 最大值
	 * @param a
	 * @return
	 */
	private static int findBigestNum(int[] a) {
		int i;
		int max=a[0];
		for(i=1;i<a.length;i++) {			
		   if(max<a[i])
		   max=a[i];			
		}
		return max;
	}

	/**
	 * 输出数组
	 * @param a
	 * @return
	 */
	private static int out(int[] a) {
		int i;
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
		return i;
	}

	/**
	 * 生成随机数组
	 * @param a
	 * @return
	 */
	private static int setRandomNum(int[] a) {
		int i;
		for(i=0;i<a.length;i++) {
	    Random random=new Random();
		a[i]=random.nextInt(100);	    
	}
		return i;
	}
	
}