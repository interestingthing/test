package zaixian.MeiTuan;

import java.util.Scanner;

public class M2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt(), n;
		int sum;
		for (int i = 0; i < T; i++) {
			sum = 0;
			n = scanner.nextInt();
			for (int j = 0; j < n; j++) {
				sum += scanner.nextInt();
			}
			if ((n - 1) * 2 == sum)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}

}
