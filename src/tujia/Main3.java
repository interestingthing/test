package tujia;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		Integer[] array = new Integer[n];
		int i = 0;
		while (i < n) {
			array[i] = scanner.nextInt();
			i++;
		}
		Arrays.sort(array, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 < o2 ? 1 : -1;
			}
		});
		System.out.println(array[k - 1]);
	}

}
