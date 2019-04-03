package tujia;

import java.util.Arrays;
import java.util.Scanner;

public class Main9 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		
		int m = scanner.nextInt();
		int p = scanner.nextInt();
		int[] nn = new int[n];
		int[][] mm = new int[m][2];
		for (int i = 0; i < n; i++) {
			nn[i] = scanner.nextInt();
		}
		// AÂòB³Ô
		for (int i = 0; i < m; i++) {
			if (scanner.next().equals("A"))
				nn[scanner.nextInt() - 1]++;
			else {
				int index=scanner.nextInt() - 1;
				if(nn[index]>0)
					nn[index]--;
			}
		}

		int temp = nn[p - 1];
		Arrays.sort(nn);
		for (int k = n - 1; k >= 0; k--) {
			if (nn[k] == temp) {
				System.out.println(n - k);
			}
		}
	}
}

/**
 * 3 4 2 5 3 1 B 1 A 2 A 2 A 3
 */