package test1;

import java.util.Scanner;

class MyTest {
	int i;
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		
		
		Integer first = new Integer(3); 
		Integer second = 3;	//»º´æ
		int three = 3;				
		System.out.println(first == second);//false
		System.out.println(first == three);	//true
		System.out.println(second == three);//true
	}
	public void MyTest(){
		
		int a = 10, b = 4, c = 5, d = 9;
		System.out.println(++a * b + c * --d);
	}
}