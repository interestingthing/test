package zaixian.youzan;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		String[] number = input.substring(1, input.length() - 1).split(",");
		int[] num = new int[number.length];
		for (int i = 0; i < number.length; i++) {
			num[i] = Integer.valueOf(number[i]);
		}

		int result = partition(num, 0, num.length - 1);

		System.out.println(result);
	}

	public static boolean LT(int a, int b) {
		if (a < b)
			return true;
		return false;
	}

	public static int partition(int[] array, int low, int high) {

		int templow = low;
		int temphigh = high;
		int temp = array[low];
		while (low < high) {
			while (low < high && !LT(array[high], temp))
				high--;
			array[low] = array[high];
			while (low < high && !LT(temp, array[low]))
				low++;
			array[high] = array[low];
		}
		array[low] = temp;
		if (low == array.length - 3)
			return array[low];
		else if (low <= array.length - 3)
			return partition(array, low + 1, temphigh);
		else
			return partition(array, templow, low - 1);
	}
}
