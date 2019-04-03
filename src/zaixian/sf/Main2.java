package zaixian.sf;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		String ss;
		ArrayList<Student> list = new ArrayList<>();
		// ���������ж��飬ÿ��ռһ�У�����ѧ�ţ���4��ɼ����ɼ����������롿�м�ո�ָ�
		while (!(ss = sc.nextLine()).equals("end")) {
			String[] score = ss.split(" ");
			Student stu = new Student();
			// ѧ��Ϊ4λ�����ַ���
			String num = score[0];
			/*
			 * for (int i = 0; i < num.length(); i++) { if (!(num.charAt(i) >
			 * '0' && num.charAt(i) < '9')) { stu.setNum("ERROR"); } }
			 */
			if (stu.getNum() == null)
				stu.setNum(num);
			for (int i = 1; i < score.length; i++) {
				if (score[i].contains("s")) {

					// 100�׳ɼ���ʽΪ��N��s��M��
					stu.set_100M(score[i]);
				} else if (score[i].contains("m") && !score[i].contains("c")) {
					// 800�׳ɼ���ʽΪ��N��m��M��
					stu.set_800M(score[i]);
				} else if (score[i].contains("cm")) {
					// ������Զ�ɼ�Ϊ��N��cm
					stu.setJUMP(score[i]);
				} else if (score[i].contains("M")) {
					// Ǧ��ɼ���ʽΪ��N��M NΪС��
					stu.setJUMP(score[i]);
				}
			}

			list.add(stu);
			/**
			 * ����������£� 1�����Ȱ������ߵͼ��������н������У����� ���� �ϸ� ���ϸ�
			 * 2��Ȼ�󰴳ɼ����������������100��-800��-������Զ-Ǧ�� 3�����ѧ���������� 4���м��Ʊ���ָ�
			 * 5��ѧ�ųɼ���ʽ����������ERROR
			 */

		}
		System.out.println("NO.\t100M\t800M\tJUMP\tBALL");

	}
}

enum Score {
	FAIL, PASS, GOOD, GREAT
}

class Student implements Comparable<Object> {
	private final String GREAT = "GREAT";
	private final String GOOD = "GOOD";
	private final String PASS = "PASS";
	private final String FAIL = "FAIL";
	String num;
	String _100M;
	// 100�׳ɼ���ʽΪ��N��s��M��
	// 800�׳ɼ���ʽΪ��N��m��M��
	String _800M;
	// ������Զ�ɼ�Ϊ��N��cm
	String JUMP;
	// Ǧ��ɼ���ʽΪ��N��M NΪС��
	String BALL;

	public Student() {

	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String get_100M() {
		return _100M;
	}

	public void set_100M(String _100m) {
		// 100���� 12s���� 12s1~12s4 12s5~12s9 13s����
		if (_100m.compareTo("12s") <= 0)
			_100M = GREAT;
		else if (_100m.compareTo("12s1") > 0 && _100m.compareTo("12s4") <= 0)
			_100M = GOOD;
		else if (_100m.compareTo("12s5") > 0 && _100m.compareTo("12s9") <= 0)
			_100M = PASS;
		else if (_100m.compareTo("13s") > 0)
			_100M = FAIL;
	}

	public String get_800M() {
		return _800M;
	}

	public void set_800M(String _800m) {
		// 800���� 2m15���� 2m24~2m16 2m25~2m31 2m32����
		_800M = _800m;
	}

	public String getJUMP() {
		return JUMP;
	}

	public void setJUMP(String jUMP) {
		// ������Զ 266cm���� 256m~265cm 246cm~255cm 245cm����
		JUMP = jUMP;
	}

	public String getBALL() {
		return BALL;
	}

	public void setBALL(String bALL) {
		// Ǧ�� 10.4m���� 9.6m~10.3m 8.7m~9.5m 8.6m����
		BALL = bALL;
	}

	@Override
	public String toString() {
		return num + "\t" + _100M + "\t" + _800M + "\t" + JUMP + "\t" + BALL;
	}

	/*
	 * 1�����Ȱ������ߵͼ��������н������У����� ���� �ϸ� ���ϸ� 2��Ȼ�󰴳ɼ����������������100��-800��-������Զ-Ǧ��
	 * 3�����ѧ���������� 4���м��Ʊ���ָ� 5��ѧ�ųɼ���ʽ����������ERROR
	 */
	int _100MCount = 0;
	int _800MCount = 0;
	int JUMPCount = 0;
	int BALLCount = 0;

	@Override
	public int compareTo(Object o) {
		Student student = (Student) o;

		return 0;
	}

}
