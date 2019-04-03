package yibao;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

//пн╡н
public class Y2 {

	public static void main(String[] args) {
		ArrayDeque<Object> q = new ArrayDeque<>();
		Object poll = q.poll();
		
		Stack<Integer> s11 = new Stack<>();
		//s.
		int n = 0;
		boolean m=n > 0 && (n & (n - 1)) == 0;
		System.out.println((6&5)==0);
		System.out.println((3&2)==0);
		//011  010  110
		//010  001  101
		//010  000  100
		//0000 1000
		//1111 1000
		//
		System.out.println(-1&1);
		System.out.println((-8)&8);
		Sample s = new Sample();
		Sample s1 = new Sample();
		System.out.println(s);
		s1.setName(s);
		System.out.println(s.getName());
		System.out.println(s);
		
	}
}

class Sample {

	String name = "aaa";

	public String getName() {
		return name;
	}

	public void setName(Sample s) {
		System.out.println(s);
		s = new Sample();
		System.out.println(s);
	}
}