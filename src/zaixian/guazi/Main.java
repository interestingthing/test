package zaixian.guazi;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		String string="";
		ArrayList<Object> l = new ArrayList<>();
	}
	
	/*H     H
	3 5 7 2 ...  n
	3 9 7 8      100
	最快 = 跳的次数最少*/
	//max(i+a[i])
	public void fun(int[] array){
	    if(array.length==0)
	        return;
	        
	    int cur=0;
	    int max,temp=0;
	    while(cur<array.length){
	    
	        if(cur+array[cur]>array.length-1)
	            return;
	        
	        max=array[cur];
	        for(int i=cur+1;i<=Math.max(cur+array[i],array.length);i++){
	            if(max<=(i+array[i])){
	                max=i+array[i];
	                temp=i;
	            }  
	        }
	        System.out.println(temp);
	        
	        if(temp+array[temp]>array.length-1)
	            return;
	        cur=temp;
	    }
	}
}

class A<T>{
	T aT;
	
	A a;
}
