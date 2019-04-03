package yibao;


//∂‡Ã¨
public class Y1 {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("a");

		Person person = s;
		person.setName("b");
		System.out.println(s.getName());
		System.out.println(person.getName());
	}

}

class Person {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Student extends Person {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}