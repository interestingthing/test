package tujia;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		// ���Լ��
		System.out.println(fun(m, n));
		// ��С������
		System.out.println(m * n / fun(m, n));
	}

	public static int fun(int m, int n) {
		if (m % n == 0)
			return n;
		else
			return fun(n, m % n);
	}
}
