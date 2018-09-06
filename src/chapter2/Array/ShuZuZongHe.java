package chapter2.Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ShuZuZongHe {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		// �����������
		int[] a = new int[10];
		setRandomValue(a);
		out(a);
		// ���û�����һ�������±�
		System.out.print("\r" + "������һ����: ");
		int s1;
		s1 = sc.nextInt();
		// �����±�
		i = indexFound(a, s1);
		System.out.println(i);
		// ��ƽ��ֵ
		int avg = findAvg(a);
		System.out.println("ƽ��ֵΪ:" + avg);
		// ���
		int s = sum(a);
		System.out.println("��Ϊ:" + s);
		// ��������
		System.out.println("������Ҫ�����λ�ú�ֵ:");
		int p, v;
		p = sc.nextInt();
		v = sc.nextInt();
		a = Arrays.copyOf(a, a.length + 1);
		putIn(a, p, v);
		out(a);
		// ɾ�������е���
		System.out.println("\r" + "������Ҫɾ����λ��:");
		int x;
		x = sc.nextInt();
		cutOff(a, x);
		a = Arrays.copyOf(a, a.length - 1);
		out(a);
	}

	/**
	 * ɾ��
	 * 
	 * @param a
	 * @param x
	 */
	private static void cutOff(int[] a, int x) {
		int i1;
		for (i1 = x; i1 < a.length - 1; i1++) {
			a[i1] = a[i1 + 1];
		}
	}

	/**
	 * ����
	 * 
	 * @param a
	 * @param pλ��
	 * @param vֵ
	 */
	private static void putIn(int[] a, int p, int v) {
		int i;
		for (i = a.length - 1; i > p; i--) {
			a[i] = a[i - 1];
		}
		a[p] = v;
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
		}
	}

	/**
	 * @param a ���
	 * @return
	 */
	private static void out(int[] a) {
		int i;
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
			if ((i + 1) % 10 == 0) {
				System.out.println();
				}
			}
		
		
	}

	/**
	 * @param a �����±�
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
