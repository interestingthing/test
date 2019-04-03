package path;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num);
		int sum = 0;
		List<Product> list = new ArrayList<>();
		Product p = new Product(sc.nextInt(), sc.nextInt(), sc.nextInt());
		list.add(p);
		for (int i = 1; i < num; i++) {
			p = new Product(sc.nextInt(), sc.nextInt(), sc.nextInt());
			int size = list.size();
			System.out.println("-----" + i);
			int flag = 0;
			for (int j = 0; j < size; j++) {
				System.out.println("++++" + j);
				Product pro = list.get(j);
				if (pro.compareTo(p) == 1) {
					sum++;
					flag = 1;
					break;
				} else if (pro.compareTo(p) == 0) {
					/*
					 * list.add(pro); size++;
					 */
				} else {
					list.remove(pro);
					j--;
					list.add(p);
					sum++;
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				list.add(p);
			}
			// ʵ��Comparable�ӿڸ�����Ŀ�еĹ���
			// ����Ҫ����list�еĶ���p��list�еĶ���pro�Ƚ�
			// 1�� ���������һ��һС������Ĵ��뼯�ϣ�С�ĴӼ��������������+1
			// 2�� ����Ȳ�����С����p����list

		}
		System.out.println(list);
		System.out.println(sum);
	}
}

class Product implements Comparable {
	public Integer a;
	public Integer b;
	public Integer c;

	public Product() {
	}

	public Product(Integer a, Integer b, Integer c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public int compareTo(Object pp) {
		Product p = (Product) pp;

		if (this.a > p.a && this.b > p.b && this.c > p.c)
			return 1;
		else if (this.a < p.a && this.b < p.b && this.c < p.c)
			return -1;
		else
			return 0;
	}

}