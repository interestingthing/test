package niuke;

import java.util.Scanner;


public class BuEr {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int[][] arr=new int[1000][1000];
		Scanner scanner = new Scanner(System.in);
		int w = scanner.nextInt();
		int h = scanner.nextInt();
		
		
		int ww=w/4;
		int hh=h/4;
		
		
		int sum=ww*hh*8;
		System.out.println(sum);
		
	}
}
