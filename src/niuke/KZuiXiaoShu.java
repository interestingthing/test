package niuke;

import java.util.Scanner;

public class KZuiXiaoShu {

	static int[] array = new int[100005];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int index = 0;
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
			if (array[i] == 1) {
				index = i;
			}
		}
		int s = (index + k - 2) / (k - 1);// 前面
		int e = (n - index - 1 + k - 2) / (k - 1);// 后面
		System.out.println(s + e);
	}
}
