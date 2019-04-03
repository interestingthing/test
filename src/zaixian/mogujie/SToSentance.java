package zaixian.mogujie;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class SToSentance {

	// s ="catsanddog"
	// dict ="cat","cats","and","sand","dog"
	//
	static HashSet<String> set;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String d = sc.nextLine();
		// 句子
		String re = s.substring(s.indexOf("=") + 1).replaceAll("\"", "");

		String sub = d.substring(d.indexOf("=") + 1);
		String[] dict = sub.replaceAll("\"", "").split(",");

		set = new HashSet<>();
		// 单词集合
		for (String ss : dict) {
			set.add(ss);
		}

		ArrayList<StringBuilder> list = new ArrayList<>();
		LinkedBlockingDeque<StringBuilder> deque = new LinkedBlockingDeque<>();
		for (String word : set) {
			if (re.startsWith(word)) {
				deque.addLast(new StringBuilder(word));
			}
		}

		while (!deque.isEmpty()) {
			StringBuilder sb = deque.pollFirst();
			if (sb.toString().replaceAll(" ", "").length() == re.length())
				list.add(sb);
			else
				for (String sss : set) {
					if (re.substring(sb.toString().replaceAll(" ", "").length()).startsWith(sss)) {
						deque.addLast(new StringBuilder(sb).append(" ").append(sss));
					}
				}

		}

		System.out.print("[");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
			if (i != list.size() - 1)
				System.out.print(", ");
		}
		System.out.print("]");
	}
}
