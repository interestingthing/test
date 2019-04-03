package test;

import java.util.Arrays;

public class Tree {

	static int[] preSort = { 1, 2, 4, 7, 3, 5, 6, 8 };

	static int[] inSort = { 4, 7, 2, 1, 5, 3, 8, 6 };

	public static void main(String[] args) {

		
		Node tree = buildTree(0, preSort.length, 0, inSort.length);
		deprePrint(tree);
	}

	static Node buildTree(int pres, int pree, int ins, int ine) {
		Node root = null;
		for (int i = ins; i < ine; i++) {
			if (inSort[i] == preSort[pres]) {
				root = new Node(preSort[pres]);
				System.out.println(preSort[pres]);
				root.left = buildTree(pres + 1, pres + 1 + i - ins, ins, i);
				root.right = buildTree(pres + 1 + i - ins, pree, i + 1, ine);
			}
		}
		
		return root;
	}

	static void prePrint(Node tree) {
		if (tree == null)
			return;
		System.out.print(tree.data + ",");

		prePrint(tree.left);
		prePrint(tree.right);
	}

	static void deprePrint(Node tree) {
		if (tree == null)
			return;
		deprePrint(tree.left);
		deprePrint(tree.right);
		System.out.print(tree.data + ",");

	}

}

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		super();
		this.data = data;
	}

}
