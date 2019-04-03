package niuke;

import java.util.Scanner;

public class BaoLiuZuiDaShu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String number = sc.nextLine();
		StringBuilder sb = new StringBuilder(number);
		StringBuilder s = new StringBuilder();
		int n = sc.nextInt();
		int flag = 0;
		int count = 0;
		int j;
		int i;
		end: for (i = 0; i < sb.length();) {
			char max = '0' - 1;
			for (j = i; j < i + n - count + 1; j++) {

				if (max < sb.charAt(j)) {
					max = sb.charAt(j);
					flag = j;
				}
			}
			s.append(max);
			count += flag - i;
			i = flag + 1;
			if (count == n) {
				s.append(sb.substring(i));
				System.out.println(s);
				return;
			} else if (n - count == sb.length() - i) {
				System.out.println(s);
				return;
			}
		}
	}
}
