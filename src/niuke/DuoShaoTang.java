package niuke;

import java.util.Scanner;

public class DuoShaoTang {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0, temp;
		for (int i = 0; i < n; i++) {
			temp = sc.nextInt();
			while (temp % 2 == 0) {
				temp /= 2;
				result++;
			}
		}
		System.out.println(result);
	}
}
