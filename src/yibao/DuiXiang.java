package yibao;

public class DuiXiang {
	
	int i = 0;
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	public static void main(String[] args) {
		DuiXiang duiXiang = new DuiXiang();
		duiXiang.setI(1);
		fun(duiXiang);
		System.out.println(duiXiang.getI());
	}

	private static void fun(DuiXiang duiXiang) {
		duiXiang=new DuiXiang();
	}
	
}
