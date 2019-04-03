package zaixian.MeiTuan;

import java.util.Scanner;

public class M {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = scanner.nextInt();
		int[] array = new int[1000];
		int i = 0;
		while (i < n) {
			array[i] = scanner.nextInt();
			i++;
		}
		int result = Integer.MAX_VALUE;
		int c[] = new int[n * 100 + 5];
		for (int k = 0; k < n; k++) {
			for (int j = n * 100; j >= 0; j--) {
				c[j] = Math.max(j >= array[k] ? c[j - array[k]] + array[k] : c[j], c[j]);
			}
		}
		System.out.println(123);
		for (int j = sum; j < n*100; j++) {
			if(c[j]>=sum){
				System.out.println(c[j]);
				break;
			}
		}
	}

}
