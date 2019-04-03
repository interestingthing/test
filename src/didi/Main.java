package didi;

public class Main {

	private static int count = 0;

	static int day[] = new int[70];

	public static void main(String[] args) {

		fun(0, 0, 6, 2, 0);
		// fun(0, 0, 6, 2, 1);
		System.out.println(count);
	}

	static void fun(int m1, int m2, int n, int d, int flag) {
		System.out.println(m1 + " " + m2);
		if (m1 + m2 == n) {
			if (day[0] != day[1])
				count++;
			return;
		}

		for (int i = 1; i <= d; i++) {

			if (m1 + i <= n / 2) {
				if (m1 + m2 + i == 0)
					day[0] = 0;
				if (m1 + m2 + i == n)
					day[1] = 0;
				fun(m1 + i, m2, n, d, 1);

			}

		}

		for (int i = 1; i <= d; i++) {
			if (m2 + i <= n / 2) {
				if (m1 + m2 + i == 0)
					day[0] = 1;
				if (m1 + m2 + i == n)
					day[1] = 1;

				fun(m1, m2 + i, n, d, 1);
			}
		}

	}
}
