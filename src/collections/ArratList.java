package collections;

import java.util.ArrayList;

public class ArratList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		System.out.println(list.listIterator(list.size()).toString());
	}
}
