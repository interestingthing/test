package niuke;

import java.util.LinkedList;
import java.util.Scanner;

public class GouZaoShuLie {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		LinkedList<Object> ll = new LinkedList<>();
		int arr[]=new int[T];
		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();
			arr[i]=n;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i]; j > 0; j--) {
				ll.addFirst(j);
				Object last = ll.pollLast();
				ll.addFirst(last);
			}
			
			int num=ll.size();
			for (int j = 0; j < num; j++) {
				System.out.print(ll.pollFirst());
				if(j!=num-1)
					System.out.print(" ");
			}
			System.out.println();
		}
		

	}
}
