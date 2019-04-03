package jiujiu;

import java.util.ArrayList;
import java.util.HashMap;

public class SiSuo {

	public static void main(String[] args) {
		/*
		 * HashMap<Object, Object> hashMap = new HashMap<>(); Object l1 = new
		 * Object(); Object l2 = new Object(); new Thread("neicun") {
		 * 
		 * @Override public void run() { ArrayList list = new ArrayList();
		 * 
		 * for (int i = 0; ; i++) { list.add(i); } }
		 * 
		 * }.start(); new Thread("123456") {
		 * 
		 * @Override public void run() { synchronized (l1) { try { sleep(1000);
		 * } catch (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } synchronized (l2) {
		 * System.out.println("111111"); } } }
		 * 
		 * }.start(); new Thread("123456") {
		 * 
		 * @Override public void run() { synchronized (l2) { try { sleep(1000);
		 * } catch (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } synchronized (l1) {
		 * System.out.println("222222"); } } }
		 * 
		 * }.start();
		 */
		/*System.out.println(1 & 6);
		System.out.println(2 & 6);
		System.out.println(3 & 6);
		System.out.println(4 & 6);
		System.out.println(5 & 6);
		System.out.println(6 & 6);*/
		/*System.out.println(Integer.MAX_VALUE);
		long currentTimeMillis = System.currentTimeMillis();
		int a = 0;
		int times = 100000000;
		for (int i = 0; i < times; i++) {
			a = i % 1024;
			
		}
		long currentTimeMillis2 = System.currentTimeMillis();
		int b = 0;
		for (int i = 0; i < times; i++) {
			b = i & (1024 - 1);
		}
		long currentTimeMillis3 = System.currentTimeMillis();
		System.out.println("%: " + (currentTimeMillis2 - currentTimeMillis));
		System.out.println("&: " + (currentTimeMillis3 - currentTimeMillis2));*/
		System.out.println(1025&1023);
		

	}
}
