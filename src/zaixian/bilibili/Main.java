package zaixian.bilibili;

import java.nio.ByteOrder;

//ษ๎หั
public class Main {
	private static StringBuilder stb = new StringBuilder();

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN)
			System.out.println("big endian");
		else
			System.out.println("little endian");
		/*
		 * Scanner scanner = new Scanner(System.in); int n = scanner.nextInt();
		 * StringBuilder sb = new StringBuilder(); fun(0, n, sb);
		 * System.out.println(stb);
		 */
	}

	private static void fun(int s, int n, StringBuilder sb) {

		if (s == n) {
			if (stb.length() == 0 || sb.length() > 0 && stb.length() > sb.length()) {
				stb = new StringBuilder(sb);
			}
		} else if (s < n) {
			sb.append("2");
			fun(2 * s + 1, n, sb);
			sb.deleteCharAt(sb.length() - 1);

			sb.append("3");
			fun(2 * s + 2, n, sb);
			sb.deleteCharAt(sb.length() - 1);

		}
	}
}
