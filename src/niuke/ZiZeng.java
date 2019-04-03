package niuke;

public class ZiZeng {

	
	public static void main(String[] args) {
		int index=0;
		boolean flag=false;
		System.out.println((flag!=!flag?index--:index++)==index?flag:++index);
	}
}
