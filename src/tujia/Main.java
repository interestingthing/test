package tujia;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		// 最大公约数
		System.out.println(fun(m, n));
		// 最小公倍数
		System.out.println(m * n / fun(m, n));
	}

	public static int fun(int m, int n) {
		if (m % n == 0)
			return n;
		else
			return fun(n, m % n);
	}
}
