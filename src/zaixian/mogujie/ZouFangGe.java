package zaixian.mogujie;

import java.util.Scanner;

public class ZouFangGe {

	static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		fun(1, 1, x+1, y+1);
		System.out.println(count);
	}
	
	
	static void fun(int xx, int yy, int x, int y) {
		if (xx == x && yy == y)
			count++;
		else if (xx <= x && yy <= y) {
				fun(xx + 1, yy, x, y);
				fun(xx, yy + 1, x, y);
		}
	}
}
