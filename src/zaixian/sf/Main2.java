package zaixian.sf;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		String ss;
		ArrayList<Student> list = new ArrayList<>();
		// 输入数据有多组，每组占一行，包括学号，加4项成绩【成绩可乱序输入】列间空格分隔
		while (!(ss = sc.nextLine()).equals("end")) {
			String[] score = ss.split(" ");
			Student stu = new Student();
			// 学号为4位数字字符串
			String num = score[0];
			/*
			 * for (int i = 0; i < num.length(); i++) { if (!(num.charAt(i) >
			 * '0' && num.charAt(i) < '9')) { stu.setNum("ERROR"); } }
			 */
			if (stu.getNum() == null)
				stu.setNum(num);
			for (int i = 1; i < score.length; i++) {
				if (score[i].contains("s")) {

					// 100米成绩格式为（N）s（M）
					stu.set_100M(score[i]);
				} else if (score[i].contains("m") && !score[i].contains("c")) {
					// 800米成绩格式为（N）m（M）
					stu.set_800M(score[i]);
				} else if (score[i].contains("cm")) {
					// 立定跳远成绩为（N）cm
					stu.setJUMP(score[i]);
				} else if (score[i].contains("M")) {
					// 铅球成绩格式为（N）M N为小数
					stu.setJUMP(score[i]);
				}
			}

			list.add(stu);
			/**
			 * 排序规则如下： 1、首先按评级高低级个数进行降序排列，优秀 良好 合格 不合格
			 * 2、然后按成绩评级排序逐个排序100米-800米-立定跳远-铅球。 3、最后按学号升序排序 4、列件制表符分隔
			 * 5、学号成绩格式错误该列输出ERROR
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
	// 100米成绩格式为（N）s（M）
	// 800米成绩格式为（N）m（M）
	String _800M;
	// 立定跳远成绩为（N）cm
	String JUMP;
	// 铅球成绩格式为（N）M N为小数
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
		// 100米跑 12s以内 12s1~12s4 12s5~12s9 13s以外
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
		// 800米跑 2m15以内 2m24~2m16 2m25~2m31 2m32以外
		_800M = _800m;
	}

	public String getJUMP() {
		return JUMP;
	}

	public void setJUMP(String jUMP) {
		// 立定跳远 266cm以上 256m~265cm 246cm~255cm 245cm以下
		JUMP = jUMP;
	}

	public String getBALL() {
		return BALL;
	}

	public void setBALL(String bALL) {
		// 铅球 10.4m以上 9.6m~10.3m 8.7m~9.5m 8.6m以下
		BALL = bALL;
	}

	@Override
	public String toString() {
		return num + "\t" + _100M + "\t" + _800M + "\t" + JUMP + "\t" + BALL;
	}

	/*
	 * 1、首先按评级高低级个数进行降序排列，优秀 良好 合格 不合格 2、然后按成绩评级排序逐个排序100米-800米-立定跳远-铅球。
	 * 3、最后按学号升序排序 4、列件制表符分隔 5、学号成绩格式错误该列输出ERROR
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
