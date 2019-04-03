package test1;

public class Test1 {

	public static void main(String[] args) {

		Count count = new Count();

		count.count(count.getCount()).getCount();

		System.out.println("--------------");
		new Count().count(count.getCount());

	}

}

class Count {
	private volatile int count = 2018;

	public int getCount() {
		System.out.println(++count);

		return count;
	}

	public Count count(int count) {
		System.out.println(++count);
		return this;
	}

}
