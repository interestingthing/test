package tujia;

import java.util.Scanner;

public class Main12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fun(n, 0);
		System.out.println(count);
	}

	static int count = 0;
	public static void fun(int n, int cur) {
		if (n == cur)
			count++;
		else if (n > cur) {
			for (int j = 1; j <= 2; j++) {
				fun(n, cur + j);
			}
		}
	}
}
