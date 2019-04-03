package yibao;

//пн╡н
public class Y3 {

	
	@SuppressWarnings("finally")
	public static void main(String[] args) throws Exception {
		try {
			
			System.out.println(111);
			throw new Exception();
		} catch (Exception e) {
			System.out.println(333);
			System.out.println(333);
			throw new Exception();
		}finally {
			System.out.println(222);
		}
	}
}
