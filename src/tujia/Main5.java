package tujia;

public class Main5 {

	public static void main(String[] args) {

		/*
		 * Scanner scanner = new Scanner(System.in); int n = scanner.nextInt();
		 * int[] ss = new int[n + 1];
		 */

		for (int i = 0; i < 5; i++) {
			flag[num[i]]++;
		}
		int ss[] = new int[5];
		fun(ss, 4, 5);
		System.out.println(count);
	}

	static int[] num = { 1, 2, 2, 3, 3 };
	static int count = 0;
	static int[] flag = new int[100];

	private static void fun(int[] ss, Integer n, Integer m) {
		if (n + m == ss.length - 1) {
			String s = "";
			for (int i : ss) {
				s += i;
			}
			System.out.println(s);
			count++;
		} else
			for (int i = 0; i < ss.length; i++) {
				if (flag[num[i]] > 0) {
					flag[num[i]]--;
					ss[n] = num[i];
					fun(ss, n - 1, m);
					/*while(i-1>0&&num[i]==num[i-1]){
						
						n++;
						flag[num[i]]++;
					}*/
					flag[num[i]]++;

				}
			}

	}

}
