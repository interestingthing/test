package compile;

import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class CiFaFenXi {

	/*
	 * 1�����������������(��[�� ����]��) ,����С���ţ���(������)��), �ֺţ���;��), �ո�(�� ��)�����ţ���,��),������(��{������}��), ˫���ţ��� �� ���������ţ���#������
	 * 2����������������� *, /, +=, ++�� --�� *=, -=, * /=, ==, &, &&, |, || 
	 * 3�����֣�����������ɵļ��ϡ�
	 * 4����ʶ�������»��߻�����Ϊ��ͷ�����������֣��»��ߣ���ĸ������ɵļ��ϡ� 
	 * 5���ؼ��֣�c���Ա�����ĳ��ùؼ��ּ��ϡ�������int, long,float, double, short�ȵȣ���
	 */
	/**
	 * ���ֵ�����
	 */
	private static String NUM_REGEX = "[\\D]+";
	private static Pattern numPattern=null;
	/**
	 * ��ʶ��������
	 */
	private static String FLAG_REGEX = "^[a-zA-Z_].*$";
	private static Pattern flagPattern=null;
	
	//�ѽ�� ����� �ؼ� �浽���鵼�뵽������(�Ա��ڲ���)
	private static char setLimitSymbol1[]={'[',']','(',')',';',' ',',','{','}','"',' ','\t'};
	private static String setOperator1[]={"+","-","*","/","=","+=","++","--","*=","-=","/=","==","&","&&","<",">"};
	private static String setKeyWords1[]={"int","for","return","#include"};
	
	private static Set<Character> setLimitSymbol = new TreeSet<>();
	private static Set<String> setOperator = new TreeSet<>();	
	private static Set<String> setKeyWords = new TreeSet<>();
	static{
		for (char c : setLimitSymbol1) {
			setLimitSymbol.add(new Character(c));
		}
		for (String c : setOperator1) {
			setOperator.add(c);
		}
		for (String c : setKeyWords1) {
			setKeyWords.add(c);
		}
		numPattern = Pattern.compile(NUM_REGEX);
		flagPattern = Pattern.compile(FLAG_REGEX);
	}
	private static String input="#include <stdio.h> "
			+ "int main(){ "
			+ "int i = 0;	"
			+ "for(i=0;i<10;i++){"
			+ "		printf(\"hello world\");"
			+ "}		"
			+ "return 0;	"
			+ "}";
	
	public static void main(String[] args) {
			ciFaFenXi(input);
	
		
	}
	static boolean isLImitSymbol(char ch){
		if(setLimitSymbol.contains(ch))
			return true;
		return false;
	}
	
	static boolean isOperator(String operator){
		if(setOperator.contains(operator.trim()))
			return true;
		return false;
	}
	static boolean isKeyWord(String keyword){
		if(setKeyWords.contains(keyword.trim()))
			return true;
		return false;
	}
	static boolean isNumber(String number){	
		if(number.length()==0)
			return false;
		Matcher matcher = numPattern.matcher(number);
		if(matcher.find())
			return false;
		return true;
	}
	
	static void ciFaFenXi(String input){
		if(input.length()==0)
			return;
		char[] array = input.toCharArray();
		int cur=0,pre=0;
		String string = new String(array);
		while(cur<array.length){
			while(cur<array.length&&!(isLImitSymbol(array[cur])||isOperator(String.valueOf(array[cur])))){
				cur++;
			}
			String substring = string.substring(pre,cur).trim();
			if(isKeyWord(substring))
				System.out.println("�ؼ��֣�\t"+substring);
			else if(isNumber(substring))
				System.out.println("���֣�\t"+substring);
			else if(isFlag(substring))
				System.out.println("��ʶ����\t"+substring);
			if(isOperator(String.valueOf(array[cur]))){
				if(isOperator(String.valueOf(array[cur+1]))){
					System.out.println("�������\t"+String.valueOf(array[cur])+String.valueOf(array[cur+1]));
					cur++;
				}else
					System.out.println("�������\t"+String.valueOf(array[cur]));
				cur++;
			}else if(array[cur]!=' '&&array[cur]!='\t'){
				if(array[cur]=='"'){
					cur++;
					while(array[cur]!='"')
						cur++;
					System.out.println("������\t"+input.substring(pre,cur+1));
					cur++;
				}else{
					System.out.println("�ָ�����\t"+array[cur]);
					cur++;
				}
			}
			//��������ո�
			while(cur<array.length&&(array[cur]==' '||array[cur]=='\t'))
				cur++;
			pre=cur;
		}
	}
	static boolean isFlag(String flag){
		Matcher matcher = flagPattern.matcher(flag);
		if(matcher.find())
			return true;
		return false;
	}
}
