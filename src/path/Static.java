package path;

public class Static {

	public static void main(String[] args) throws ClassNotFoundException {
		//Test tes = new Test();
		//Class.forName("path.Test");
		System.out.println(Test.a);
		System.out.println();
		System.out.println(Test.b);
	}
}

class Test{
	{
		System.out.println("��������1");
	}
	static{
		System.out.println("��̬�����1");
	}
	//public static Test test = new Test();
	public static final int a=123;
	public static final int b=456;
	static{
		System.out.println("��̬�����2");
	}
	{
		System.out.println("��������2");
	}
}