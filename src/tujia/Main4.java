package tujia;

public class Main4 {

	public static void main(String[] args) {

		/*
		 * Scanner scanner = new Scanner(System.in); int n = scanner.nextInt();
		 * int[] ss = new int[n + 1];
		 */
		int[] ss = new int[1 + 1];
		fun(ss, 1, 1);
		System.out.println(count);
	}

	static int count = 0;
	static int[] flag = new int[100];

	private static void fun(int[] ss, Integer n, Integer m) {
		if (n + m == ss.length-1) {
			String s = "";
			for (int i : ss) {
				s += i;
			}
			System.out.println(s);
			count++;
		} else
			for (int i = 0; i < ss.length; i++) {
				if (flag[i] == 0) {
					flag[i] = 1;
					ss[n] = i;
					fun(ss, n - 1, m);
					flag[i] = 0;

				}
			}

	}

}

/**
 * int sum=0; f(int n,int a[],int cur){ int i,j,k; if(cur==n) { sum++;
 * for(i=0;i<n;i++) printf("%d",a[i]); printf("\n"); } else
 * for(k=1;k<=n;k++){//ÌîÈëµÄÊý×Ö int ok=1; for(j=0;j<cur;j++) if(a[j]==k) ok=0;
 * if(ok) { a[cur]=k; f(n,a,cur+1); } } } int main() { int a[9]={0}; f(9,a,0);
 * printf("%d",sum); return 0; }
 */
