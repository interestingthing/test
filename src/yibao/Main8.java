package yibao;

public class Main8 {
	
	static {
		System.out.println("Main7 static");
	}
	

	
	public Main8() {
		System.out.println("a");
	}



	public static void main(String[] args) {
		Main88 main88 = new Main88();
		
	}

}

class Main88 extends Main8 {
	
	public Main88() {
		System.out.println("b");
	}
	static {
		System.out.println("Main7 static");
	}
	
	

}
