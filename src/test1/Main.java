package test1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		/*Scanner scanner = new Scanner(System.in);
		ArrayList<Object> list = new ArrayList<>();
		int a = scanner.nextInt();*/
		/*for (int i = 0; i < args.length; i++) {
			
		}
		System.out.println();*/
		
		int array[] = {1,2,0,3,4,0,5,6,0};
		int[] fun = fun(array);
		for (int i : fun) {
			System.out.print(i+"  ");
		}
	}
	
	/**
	 * 两个滑动指针
	 * @param array
	 * @return
	 */
	static int[] fun(int[] array){
		int i=0,j=0,k=array.length-1;
		//第一个0的位置
		while(array[i]!=0)
			i++;
		
		while(i<k){
			j=i;
			//第一个非0的位置
			while(array[i]==0&&i<k)
				i++;
			while(i<=k){
				while(array[i]==0&&i<k)
					i++;
				array[j++]=array[i++];
			}
		}
		while(j<=k){
			array[j++]=0;
		}
		return array;
		
	}
}
