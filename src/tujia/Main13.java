package tujia;

import java.util.Scanner;

public class Main13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		// 1��������3,4,7��
		// 2��������ת֮���ܵ����Լ�Ϊ������2��5��6��9��������һ����
		for (int i = 2; i <= n; i++) {
			String s = String.valueOf(i);

			if (!s.contains(String.valueOf(3)) && !s.contains(String.valueOf(4)) && !s.contains(String.valueOf(7))
					&& (s.contains(String.valueOf(2)) || s.contains(String.valueOf(5)) || s.contains(String.valueOf(6))
							|| s.contains(String.valueOf(9)))) {

				count++;
			}
		}
		System.out.println(count);

	}

}
