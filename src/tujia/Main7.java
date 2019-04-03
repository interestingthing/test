package tujia;

import java.util.Arrays;
import java.util.Scanner;

public class Main7 {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int[] arr1 = new int[3];
		int[] arr2 = new int[3];
		int i = Integer.valueOf(s.charAt(0)) + Integer.valueOf(s.charAt(1)) + Integer.valueOf(s.charAt(2))-48*3;
		System.out.println(i);
		int j = Integer.valueOf(s.charAt(3)) + Integer.valueOf(s.charAt(4)) + Integer.valueOf(s.charAt(5))-48*3;
		if (i == j)
			System.out.println(0);
		else {
			for (int k = 0; k < s.length(); k++) {
				if(k<3)
				arr1[k]='9'-s.charAt(k);
				else {
					arr2[k%3]='9'-s.charAt(k);
				}
			}
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			if(Math.abs(i-j)<Math.max(arr1[2],arr2[2]))
				System.out.println(1);
			else if(Math.abs(i-j)<Math.max(arr1[1]+arr1[2],arr2[1]+arr2[2]))
				System.out.println(2);
			else {
				System.out.println(3);
			}
				
		}
		
	}
}
