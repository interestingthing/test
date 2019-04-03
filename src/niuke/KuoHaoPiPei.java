package niuke;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class KuoHaoPiPei {

	static ArrayList<Integer> ll = new ArrayList<>();

	public static void main(String[] args) {
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0, temp = 0;
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			flag = judge(sc.nextLine(), 1);
			if (flag == 1)
				temp++;

		}
		for (int i = 0; i < ll.size(); i++) {
			for (int j = i; j < ll.size(); j++) {
				if (ll.get(i) + ll.get(j) == 0) {
					result++;
				}
			}
		}
		System.out.println(result + temp * temp);
	}

	static Stack<Character> stack = new Stack<>();

	static StringBuilder sb = new StringBuilder();

	private static int judge(String s1, int shiFouJiaRuList) {
		for (int i = 0; i < s1.length(); i++) {
			if (!stack.empty() && stack.peek() == '(' && s1.charAt(i) == ')')
				stack.pop();
			else {
				stack.add(s1.charAt(i));
			}
		}
		if (stack.empty())
			return 1;
		else {
			if (sb.length() > 0)
				sb.delete(0, sb.length());
			while (!stack.empty()) {
				sb.append(stack.pop());
			}

			if (sb.toString().contains("(")) {
				if (!sb.toString().contains(")"))
					ll.add(sb.length());
				System.out.println("----------" + sb.length());
			} else if (sb.toString().contains(")")) {
				System.out.println("+++++++++++" + -sb.length());
				ll.add(-sb.length());
			}
		}
		stack.removeAllElements();
		return 0;
	}
}

