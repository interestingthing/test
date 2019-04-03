package zaixian.sf;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		// 记录每个数对应的位置
		for (int i = 0; i < n; i++) {
			a[sc.nextInt()] = i;
		}
		for (int i = 0; i < n; i++) {
			b[sc.nextInt()] = i;
		}
		
		int t = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if ((a[i] - a[j]) * (b[i] - b[j]) < 0) {
					t++;
					System.out.println(i + "  " + j);
				}
			}
		}
		System.out.println(t);
	}
	
}
/*
时间限制：C/C++语言 1000MS；其他语言 3000MS
内存限制：C/C++语言 65536KB；其他语言 589824KB
题目描述：
项目/评级	优秀 		良好			合格			不合格
100米跑		12s以内 		12s1~12s4	12s5~12s9	13s以外
800米跑		2m15以内		2m24~2m16	2m25~2m31	2m32以外
立定跳远		266cm以上	256m~265cm	246cm~255cm	245cm以下
铅球			10.4m以上	9.6m~10.3m	8.7m~9.5m	8.6m以下
考生分批分次轮流考核个项目，并记录成绩，输入学号及各项考核值，计算评级，成绩汇总统计并排序。

输入
输入数据有多组，每组占一行，包括学号，加4项成绩【成绩可乱序输入】列间空格分隔
100米成绩格式为（N）s（M）
800米成绩格式为（N）m（M）
立定跳远成绩为（N）cm 
铅球成绩格式为（N）M N为小数
学号为4位数字字符串
最后一行输入end提交统计

输出
输出格式如下： 学号 100米评级 800m评级 立定跳远评级 铅球评级
排序规则如下：
1、首先按评级高低级个数进行降序排列，优秀 良好 合格 不合格
2、然后按成绩评级排序逐个排序100米-800米-立定跳远-铅球。
3、最后按学号升序排序
4、列件制表符分隔
5、学号成绩格式错误该列输出ERROR


样例输入
6789  11s9 	2m22 	240cm 	10.5m
8901  12s 	9.7m 	2m18 	260cm
0002  2m22 	10m 	258cm 	11s5
5678  11.1m 266cm 	2m10 	12s3
7890  12s4 	10.2m 	270cm 	2m08
end
样例输出
NO.		100M	800M	JUMP	BALL
6789	GREAT	GOOD	FAIL	GREAT
0002	GREAT	GOOD	GOOD	GOOD
8901	GREAT	GOOD	GOOD	GOOD
5678	GOOD	GREAT	GREAT	GREAT
7890	GOOD	GREAT	GREAT	GOOD
*/