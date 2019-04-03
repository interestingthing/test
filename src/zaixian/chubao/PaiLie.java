package zaixian.chubao;

import java.util.Arrays;

public class PaiLie {

	public static void main(String[] args) {
		int[] array = { 1, 2, 2, 4, 5 };
		int[] flag = new int[array.length];
		long start = System.currentTimeMillis();
		// fun(array, flag, new StringBuilder(), array.length);
		fun(array, 0, array.length);
		long end = System.currentTimeMillis();
		System.out.println(count);

		/*
		 * System.out.println(end - start);
		 * 
		 * ZonedDateTime now = Instant.now().atZone(ZoneId.systemDefault());
		 * ZonedDateTime minus = now.minus(13, ChronoUnit.DAYS);
		 * System.out.println(minus);
		 */
	}

	static int count = 0;

	// 120+5*24+10*6+10*2+5
	private static void fun(int[] array, int n, int m) {
		if (n == m) {

			System.out.println(Arrays.toString(array).replaceAll(", ", "").replaceAll("[\\[\\]]+", ""));
			/*
			 * for (int i = 0; i < array.length; i++) { System.out.println(
			 * Arrays.toString(array).replaceAll(", ",
			 * "").replaceAll("[\\[\\]]+", "").substring(0, i + 1)); count++; }
			 */
			count++;
			return;
		}

		for (int i = n; i < m; i++) {
			if (i != n && array[i - 1] != array[i] && array[n] != array[i] || i == n) {
				swap(array, n, i);
				fun(array, n + 1, m);
				swap(array, n, i);
			}
		}
	}

	// 5+10+10+5+1
	private static void swap(int[] array, int n, int i) {
		if (i != n) {
			array[n] += array[i];
			array[i] = array[n] - array[i];
			array[n] -= array[i];
		}

	}

	private static void fun(int[] array, int[] flag, StringBuilder sb, int n) {
		if (sb.length() >= n) {
			count++;
			System.out.println(sb);

			return;
		} else if (sb.length() < n) {
			for (int i = 0; i < array.length; i++) {
				if (flag[i] == 0) {
					sb.append(array[i]);
					flag[i] = 1;
					fun(array, flag, sb, n);
					flag[i] = 0;
					sb.deleteCharAt(sb.length() - 1);
				}

			}
		}

	}

}
