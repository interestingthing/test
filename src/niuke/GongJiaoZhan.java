package niuke;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.concurrent.LinkedBlockingDeque;

public class GongJiaoZhan {

	static int[][] tree;

	static int count = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		tree = new int[n + 1][n + 1];

		TreeSet<Node> set = new TreeSet<>();
		for (int i = 0; i < m; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			set.add(new Node(s, t));
		}

		LinkedBlockingDeque<Node> deque = new LinkedBlockingDeque<>();
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Node node = (Node) iterator.next();
			if (node.i == 0){
				
				deque.addLast(node);
				
			}
		}
	
		while(!deque.isEmpty()){
			System.out.println(deque.size());
			Node first = deque.pollFirst();
			if(first.j==n)
				count++;
			else {
				for (Node node : set) {
					if(first.i>=node.i&&first.j<node.j){
						deque.addLast(node);
					}
				}
			}
		}
		
		System.out.println(count);
	}

}

class Node implements Comparable<Node> {
	int i;
	int j;

	public Node() {

	}

	public Node(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}

	@Override
	public int compareTo(Node o) {
		if (i < o.i)
			return -1;
		else if (i > o.i)
			return 1;
		else if (j < o.j)
			return -1;
		else
			return 1;

	}

	@Override
	public String toString() {
		return "Node [i=" + i + ", j=" + j + "]";
	}

}
