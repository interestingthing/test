package zaixian.sf;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		// ��¼ÿ������Ӧ��λ��
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
ʱ�����ƣ�C/C++���� 1000MS���������� 3000MS
�ڴ����ƣ�C/C++���� 65536KB���������� 589824KB
��Ŀ������
��Ŀ/����	���� 		����			�ϸ�			���ϸ�
100����		12s���� 		12s1~12s4	12s5~12s9	13s����
800����		2m15����		2m24~2m16	2m25~2m31	2m32����
������Զ		266cm����	256m~265cm	246cm~255cm	245cm����
Ǧ��			10.4m����	9.6m~10.3m	8.7m~9.5m	8.6m����
���������ִ��������˸���Ŀ������¼�ɼ�������ѧ�ż������ֵ�������������ɼ�����ͳ�Ʋ�����

����
���������ж��飬ÿ��ռһ�У�����ѧ�ţ���4��ɼ����ɼ����������롿�м�ո�ָ�
100�׳ɼ���ʽΪ��N��s��M��
800�׳ɼ���ʽΪ��N��m��M��
������Զ�ɼ�Ϊ��N��cm 
Ǧ��ɼ���ʽΪ��N��M NΪС��
ѧ��Ϊ4λ�����ַ���
���һ������end�ύͳ��

���
�����ʽ���£� ѧ�� 100������ 800m���� ������Զ���� Ǧ������
����������£�
1�����Ȱ������ߵͼ��������н������У����� ���� �ϸ� ���ϸ�
2��Ȼ�󰴳ɼ����������������100��-800��-������Զ-Ǧ��
3�����ѧ����������
4���м��Ʊ���ָ�
5��ѧ�ųɼ���ʽ����������ERROR


��������
6789  11s9 	2m22 	240cm 	10.5m
8901  12s 	9.7m 	2m18 	260cm
0002  2m22 	10m 	258cm 	11s5
5678  11.1m 266cm 	2m10 	12s3
7890  12s4 	10.2m 	270cm 	2m08
end
�������
NO.		100M	800M	JUMP	BALL
6789	GREAT	GOOD	FAIL	GREAT
0002	GREAT	GOOD	GOOD	GOOD
8901	GREAT	GOOD	GOOD	GOOD
5678	GOOD	GREAT	GREAT	GREAT
7890	GOOD	GREAT	GREAT	GOOD
*/