package sort;

import java.util.Arrays;

public class Sort {

	public static boolean LT(int a, int b) {
		if (a < b)
			return true;
		return false;
	}

	// 简单插入排序
	// 将第一个数看作有序队列，然后将剩下的数一一插入到有序队列
	public static void insertSort(int[] array) {
		int temp = 0, count = 0;
		for (int i = 1; i < array.length; i++) {
			if (LT(array[i], array[i - 1])) {
				temp = array[i];
				array[i] = array[i - 1];
				int j;
				for (j = i - 1; j >= 0 && LT(temp, array[j]); j--) {
					array[j + 1] = array[j];
					count++;
				}
				array[j + 1] = temp;
				System.out.println(Arrays.toString(array));
			}
		}
		System.out.println("移动次数" + count);
	}

	// 折半插入排序
	public static void bInsertSort(int[] array) {
		int temp = 0;
		for (int i = 1; i < array.length; i++) {
			temp = array[i];
			int low = 0, high = i - 1, m, j;
			while (low <= high) {
				m = (low + high) / 2;
				if (LT(temp, array[m]))
					high = m - 1;
				else
					low = m + 1;

			}
			for (j = i - 1; j > high; j--) {
				array[j + 1] = array[j];
			}
			array[high + 1] = temp;
		}
	}

	// 希尔排序（缩小增量排序）
	public static int shellInsert(int[] array, int dk) {
		int temp = 0, j;
		int count = 0;
		for (int i = dk; i < array.length; i++) {
			if (LT(array[i], array[i - dk])) {
				temp = array[i];
				array[i] = array[i - dk];
				for (j = i - dk; j >= 0 && LT(temp, array[j]); j -= dk) {
					array[j + dk] = array[j];
					count++;
				}
				array[j + dk] = temp;
			}
		}
		return count;

	}

	// 希尔排序
	public static void shellSort(int[] array) {
		int c = 0;
		double log = Math.log(array.length - 1 - 1);
		int max = (int) Math.floor(log) + 1;
		int dk[] = new int[max + 1];
		for (int i = max; i >= 0; i--) {
			dk[i] = (int) (Math.pow(2, i)) + 1;
			shellInsert(array, dk[i]);
		}
		shellInsert(array, 1);

	}

	// 冒泡
	public static void bubbleSort(int[] array) {
		boolean flag = true;
		for (int i = 0; i < array.length && flag; i++) {
			flag = false;
			for (int j = 1; j < array.length - i; j++) {
				if (LT(array[j], array[j - 1])) {
					array[i] += array[i - 1];
					array[i - 1] = array[i] - array[i - 1];
					array[i] -= array[i - 1];
					flag = true;
				}
			}
		}

	}

	// 快排
	public static int partition(int[] array, int low, int high) {

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
		return low;
	}

	public static void qSort(int[] array, int low, int high) {
		if (low < high) {
			int m = partition(array, low, high);
			qSort(array, low, m - 1);
			qSort(array, m + 1, high);
		}
	}

	public static void selectSort(int[] array) {
		int index;
		for (int i = 0; i < array.length; i++) {
			int min = array[i];
			index = i;
			for (int j = i + 1; j < array.length; j++) {
				if (LT(array[j], min)) {
					min = array[j];
					index = j;
				}
			}
			if (i != index) {
				array[i] += array[index];
				array[index] = array[i] - array[index];
				array[i] -= array[index];
			}
		}
	}

	public static void main(String[] args) {
		int[] array = new int[] { 5, 2, 1, 11, 1, 1 };
		// bInsertSort(array);
		// shellSort(array);
		// qSort(array, 0, 5);
		selectSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}

	}
	//1 2 3 4 5 6
	//2 3 4 5 6 7
}
