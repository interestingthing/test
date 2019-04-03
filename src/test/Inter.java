package test;

public interface Inter {

	
	int inter = 0;

	static void fun1() {
		System.out.println("static");
	}

	default void fun2() {
		System.out.println("default");
	}

	void fun3();

	public static void main(String[] args) {
		fun1();

		Inter2 inter2 = new Inter2();

		inter2.fun2();
	}
}

class Inter2 implements Inter {

	@Override
	public void fun3() {
		// TODO Auto-generated method stub

	}

}