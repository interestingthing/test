package tujia;

import java.util.Arrays;
import java.util.Scanner;

public class Beibao01 {

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

		int count = 0;
		int c[] = new int[1001];
		for (int j = 0; j <= 25; j++)
			for (int k = 0; k < n; k++) {
				c[j] = j>array[k]?c[j - array[k]]+array[k]:c[j];
				
			}

		System.out.println(Arrays.toString(c));
		System.out.println(count);
	}

}
