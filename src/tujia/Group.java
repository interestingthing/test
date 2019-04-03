package tujia;

public class Group {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Group [name=" + name + "]";
	}

	//³Ë·¨±í
	public static void fun() {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		fun();
		Group group = new Group();
		group.setName("zhangSan");
		System.out.println(group.getName());
	}
}
