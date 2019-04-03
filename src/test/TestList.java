package test;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i+"size"+list.size());
            if ("1".equals(list.get(i))){
                list.add("4");
                list.remove("1");
            }
        }
	}
}
