package zaixian.chubao;

public class PaiLie2 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 2, 4, 5 };
		int[] flagh = new int[array.length];
		int[] flags = new int[array.length];
		fun(array, flagh,flags, new StringBuilder(), 5);
		System.out.println(count);
	}

	static int count;

	private static void fun(int[] array, int[] flagh,int[] flags, StringBuilder sb, int n) {
		if (sb.length() > n) {
			return;
		} else if (sb.length() < n) {
			for (int i = 0; i < array.length; i++) {
				if (flagh[i] == 0 && (i == 0 ? true : array[i] != array[i - 1])||flags[i] == 0) {
					
					sb.append(array[i]);
					System.out.println(sb);
					count++;
					flagh[i] = 1;
					flags[i] = 1;
					fun(array, flagh,flags, sb, n);
					flagh[i] = 0;
					flags[i] = 0;
					sb.deleteCharAt(sb.length() - 1);
					/*
					 * if (sb.length() >= 2 && sb.charAt(sb.length() - 1) ==
					 * sb.charAt(sb.length() - 2)) { flag[i] = 0; flag[i - 1] =
					 * 0; sb.deleteCharAt(sb.length() - 1);
					 * sb.deleteCharAt(sb.length() - 1); } else { flag[i] = 0;
					 * sb.deleteCharAt(sb.length() - 1); }
					 */
				}
			}
		}
	}

}
