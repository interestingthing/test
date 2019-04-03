package baiwan;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//14:35
import java.util.TreeMap;

import org.junit.Test;

public class BaiWan {
	@Test
	@SuppressWarnings("resource")
	public void reader() throws Exception {
		FileInputStream fis = new FileInputStream(new File("a.txt"));
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader reader = new BufferedReader(isr);
		TreeMap<Integer, Integer> treeMap = new TreeMap<>();
		int i = 1;
		long startTime = System.currentTimeMillis();
		while (reader.ready()) {
			String number = reader.readLine();
			treeMap.put(Integer.valueOf(number), i++);

			if (i % 10000 == 0) {
				System.out.println(number + "----------------------");
				

			}

		}
		long endTime = System.currentTimeMillis();
		System.out.println("��ȡ�ļ�ʱ��" + (endTime - startTime));
		System.out.println("treeMap.size()��" + treeMap.size());
		long endTime1 = System.currentTimeMillis();
		System.out.println("treeMap.size()ʱ�䣺" + (endTime1 - endTime));

		if (treeMap.containsKey(123456))
			System.out.println("������" + treeMap.get(9993456));
		long endTime2 = System.currentTimeMillis();
		System.out.println("����9993456ʱ�䣺" + (endTime2 - endTime1));
		System.out.println("�ܹ�ʱ�䣺" + (endTime2 - startTime));
		fis.close();
		isr.close();
		reader.close();
		treeMap.clear();

	}

	@Test
	@SuppressWarnings("resource")
	public void writer() throws Exception {
		File file = new File("a.txt");
		System.out.println(file.getAbsolutePath());
		FileOutputStream fos = new FileOutputStream(file);
		OutputStreamWriter osw = new OutputStreamWriter(fos);

		BufferedWriter writer = new BufferedWriter(osw);
		int i = 1;
		while (i <= 10000000) {
			
			 if(i%1000000==0) System.out.println(i+"----------------------");
			 
			writer.write(String.valueOf(i));
			writer.newLine();
			i++;
		}
		writer.close();
		osw.close();
		fos.close();
		System.out.println("+++++++++++++++++����+++++++++++++++++++++++");

	}

	// 1000����82353ms
	@Test
	public void testReader() throws Exception {
		MethodExecuteTimeUtils.getMethodExecuteTime(new BaiWan(), null, "reader", null, true, false);
	}

	// 1000����7150ms
	@Test
	public void testWriter() throws Exception {
		MethodExecuteTimeUtils.getMethodExecuteTime(new BaiWan(), null, "writer", null, true, false);
	}

}