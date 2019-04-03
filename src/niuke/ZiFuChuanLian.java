package niuke;

import java.util.Scanner;

public class ZiFuChuanLian {

	static int[] array = new int[100005];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ss = sc.nextLine();
		String[] s = ss.split(" ");

		if (s[0].charAt(s[0].length() - 1) == s[1].charAt(0) && s[2].charAt(0) == s[1].charAt(s[1].length() - 1))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
