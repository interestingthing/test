package test;

public class test {

	
	void fun1(){}
	public static void main(String[] args) {
		
		Object s1 = "string";
		
		String s2 = "string";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println("--------------------------------");
		String s3 = new String("string");
		String s4 = new String("string");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		System.out.println("--------------------------------");
		System.out.println(s3==s1);
		int i =fun();
		System.out.println(i);
		
	}
	public static int fun(){
		int a=0;
		try {
			//int i = 1/0;
			return a;
		} catch (Exception e) {
			System.out.println(11);
			return a;
		}finally {
			++a;
		}
		//return a;
	}
	
}
