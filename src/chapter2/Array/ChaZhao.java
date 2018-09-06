package chapter2.Array;

import java.util.Random;
import java.util.Scanner;

public class ChaZhao {
	public static void main(String[] args) {
		int i;
		// ���������
		int[] a = new int[10];
		setRandomValue(a);
		out(a);
        //���û�����һ������Ǳ�
		Scanner sc = new Scanner(System.in);
		System.out.print("\r" + "������һ����: ");
		int s1;
		s1 = sc.nextInt();
		// ���ҽǱ�
		i = indexFound(a, s1);
		System.out.println(i);
		// ��ƽ��ֵ
		int avg = findAvg(a);
		System.out.println("ƽ��ֵΪ:" + avg);
		// ���
		int s = sum(a);
		System.out.println("��Ϊ:" + s);
	}

	/**
	 * @param a      ���
	 * @param random
	 * @return
	 */
	private static int sum(int[] a) {
		int s = 0;
		for (int i = 0; i < a.length; i++) {
			s += a[i];
		}
		return s;
	}

	/**
	 * @param a      ��ƽ��ֵ
	 * @param random
	 * @return
	 */
	private static int findAvg(int[] a) {
		int s = 0, avg = 0;
		for (int i = 0; i < a.length; i++) {
			s += a[i];
		}
		avg = s / a.length;
		return avg;
	}

	/**
	 * @param a �����������
	 * @return
	 */
	private static void setRandomValue(int[] a) {
		int i;
		for (i = 0; i < a.length; i++) {
			Random random = new Random();
			a[i] = random.nextInt(100);
			System.out.print(a[i] + "\t");
		}
	}

	/**
	 * @param a ���
	 * @return
	 */
	private static void out(int[] a) {
		int i;
		for (i = 0; i < a.length; i++) {
		}
	}

	/**
	 * @param a ���ҽǱ�
	 * @param s
	 * @return
	 */
	private static int indexFound(int[] a, int s1) {
		int i;
		int result = -1;
		for (i = 0; i < a.length; i++) {
			if (s1 == a[i]) {
				result = i;
				break;
			}
		}
		return result;
	}
}