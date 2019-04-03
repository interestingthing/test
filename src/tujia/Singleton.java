package tujia;

class Singleton {
	private int i;
	private static class LazyHolder {
		public void ff(){
			
		}
		private static final Singleton INSTANCE = new Singleton();
	}

	public  Singleton() {
	}

	public static final Singleton getInstance() {
		return LazyHolder.INSTANCE;
	}
	
	
	/*public static void main(String[] args) {
		Singleton singleton = new Singleton();
	}*/
}