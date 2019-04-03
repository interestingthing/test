package jiujiu;

import java.lang.reflect.Field;

public class ClassInit extends Parent {

	static {
		System.out.println("子类静态代码块");
	}

	{
		System.out.println("子类构造代码块");
	}

	static int i;
	int j;

	public ClassInit() {
		System.out.println("子类构造函数");
	}

	public  static void main(String[] args) {
		Parent p = new ClassInit();
		System.out.println("-------------------");
		ClassInit c = new ClassInit();
		int aaa = c.hashCode();
		ClassLoader classLoader = Parent.class.getClassLoader();
		
		byte b=0;
		b=b++;
		System.out.println(b);
	}
}

class Parent {
	
	
	
	@Override
	public int hashCode() {
		
		Class<? extends Parent> class1 = this.getClass();
		Field[] declaredFields = class1.getDeclaredFields();
		for (int i = 0; i < declaredFields.length; i++) {
			System.out.println(declaredFields[i].getName());
		}
		final int prime = 31;
		int result = 1;
		result = prime * result + j;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parent other = (Parent) obj;
		if (j != other.j)
			return false;
		return true;
	}

	static {
		System.out.println("父类静态代码块");
	}

	{
		System.out.println("父类构造代码块");
	}

	static int i;
	int j;

	public Parent() {
		System.out.println("父类构造函数");
	}

}