package tujia;

public class Singleton2 {
	int i;
	private static class LazyHolder {
		public void ff(){
			
		}
		private static final Singleton2 INSTANCE = new Singleton2();
	}

	private Singleton2() {
	}

	public static final Singleton2 getInstance() {
		return LazyHolder.INSTANCE;
	}
	
	
	public static void main(String[] args) {
		Singleton singleton = new Singleton();
		
	}
}