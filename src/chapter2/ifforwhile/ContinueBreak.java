package chapter2.ifforwhile;

import java.util.Scanner;

public class ContinueBreak {
	public static void main(String[] args) {
		// ��100���ڵ���������
		int a, i;
		for (a = 2; a <= 100; a++) {
			for (i = 2; i < a; i++)
				if (a % i == 0)
					break;
			if (i == a)
				System.out.print(a + " ");
		}

	}

}
