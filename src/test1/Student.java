package test1;

public class Student {
	private String sname = "ÕÅÈı";
	int sage = 0;

	
	public static void main(String[] args) {
		System.out.println(2015&2014);
		System.out.println(2014&2013);
		System.out.println(2013&2012);
		System.out.println(2012&2011);
		System.out.println(func(2015));
	}
	public static int func(int x) {
		int count = 0;
		while (x!=0) {
			count++;
			x = x & (x - 1);
		}
		return count;
	}
}