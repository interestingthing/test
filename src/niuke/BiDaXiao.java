package niuke;

import java.util.Scanner;

public class BiDaXiao {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		double result = y * Math.log(x) / (x * Math.log(y));
		if (result < 1.0)
			System.out.println("<");
		else if (result - 1.0 > 0.000001)
			System.out.println(">");
		else {
			System.out.println("=");

		}
	}
}
