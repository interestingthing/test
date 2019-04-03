package tujia;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String gi = sc.nextLine();
		String si = sc.nextLine();
		String[] g = gi.split(" ");
		String[] s = si.split(" ");
		int[] gii = new int[g.length];// 胃
		int[] sii = new int[s.length];// 糖
		for (int i = 0; i < g.length; i++) {
			gii[i] = Integer.valueOf(g[i]);
		}
		for (int i = 0; i < s.length; i++) {
			sii[i] = Integer.valueOf(s[i]);
		}
		Arrays.sort(gii);
		Arrays.sort(sii);
		int count = 0;
		HashSet<Object> set = new HashSet<>();
		// 把最小的糖给胃口降序依次遍历

		for (int i = gii.length - 1; i >= 0; i--) {
			for (int j = 0; j < sii.length; j++) {
				if (gii[i] <= sii[j] && !set.contains(j)) {
					count++;
					set.add(j);
					break;
				}
			}
		}

		System.out.println(count);
	}

}
