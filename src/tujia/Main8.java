package tujia;

public class Main8 {
	int i=2;
	
	
	public void ff(){
		int i=3;
		
		class Main888{
			public  void sys() {
				System.out.println(Main8.this.i);
				System.out.println();
			}
		}
		char a=48;
		
		System.out.println(a);
		Main888 main888 = new Main888();
		main888.sys();
		
	}
	static {
		System.out.println("Main7 static");
	}
	{
		System.out.println("Main7 block");

	}

	public Main8() {
		System.out.println("Main7 constrctor");
		print();
	}

	public void print() {
		System.out.println("Main7 print");
	}

	public static void main(String[] args) {
		Main8 main8 = new Main88();
		//System.out.println(main8.i);
		main8.ff();
		
	}

}

class Main88 extends Main8 {
	byte b=1;
	short s=1;
	int i=1;
	long l=1L;
	float f = 1.0f;
	double d=2.0;
	
	
	
	static {
		Character a='a';
		
		System.out.println("Main8 static");
	}
	{
		System.out.println("Main8 block");
	}

	public Main88() {
		System.out.println("Main8 constrctor");
	}
	public Main88(int i) {
		
		System.out.println("Main8 constrctor");
	}

	@Override
	public void print() {
		System.out.println("Main8 print");
	}

}
