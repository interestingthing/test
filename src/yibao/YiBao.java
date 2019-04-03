package yibao;

public class YiBao {

	static int sum = 0;

	public static void main(String[] args) {
		fun1(4, 4);
		System.out.println(sum);
	}

	static void fun(int p, int g) {
		if (p < 2 && g < 4) {
			return;
		}
		sum += p;
		fun(p / 2 + p % 2 + g / 4, g / 4 + g % 4 + p / 2);
	}

	static void fun1(int p, int g) {
		int temp = 0;
		while (!(p < 2 && g < 4)) {
			sum += p;
			temp = p;
			p = p / 2 + p % 2 + g / 4;
			g = g / 4 + g % 4 + temp / 2;
		}
	}

}
