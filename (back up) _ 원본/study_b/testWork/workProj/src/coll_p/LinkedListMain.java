package coll_p;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {

	static void add_1(String title, List list) {
		
		long ff = System.currentTimeMillis();
		
		for (int i = 0; i < 1000000; i++) {
			list.add(1234);
		}
		System.out.println("순차추가 "+title+":"+(System.currentTimeMillis()-ff));	
	}
	
	
	static void add_2(String title, List list) {
		
		long ff = System.currentTimeMillis();
		
		for (int i = 0; i < 10000; i++) {
			list.add(100,1234);
		}
		System.out.println("비순차추가 "+title+":"+(System.currentTimeMillis()-ff));	
	}
	
	static void remove_2(String title, List list) {
		
		long ff = System.currentTimeMillis();
		
		for (int i = 0; i < 10000; i++) {
			list.remove(100);
		}
		System.out.println("비순차삭제 "+title+":"+(System.currentTimeMillis()-ff));	
	}
	
	
	static void remove_1(String title, List list) {
		
		long ff = System.currentTimeMillis();
		
		for (int i = list.size()-1; i >= 0; i--) {
			list.remove(i);
		}
		System.out.println("순차삭제 "+title+":"+(System.currentTimeMillis()-ff));	
	}
	
	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		LinkedList link = new LinkedList();
		
		add_1("ar", ar);
		add_1("link", link);
		
		add_2("ar", ar);
		add_2("link", link);
		
		remove_2("ar", ar);
		remove_2("link", link);

		remove_1("ar", ar);
		remove_1("link", link);
	}

}
