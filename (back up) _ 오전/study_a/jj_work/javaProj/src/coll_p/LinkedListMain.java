package coll_p;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {
	
	static void add_1(String name,List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i <1000000; i++) {
			list.add(1234);
		}
		
		System.out.println("순차추가=>"+name+":"+(System.currentTimeMillis()-start));
	}
	
	static void add_2(String name,List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i <50000; i++) {
			list.add(100,1234);
		}
		
		System.out.println("비순차추가=>"+name+":"+(System.currentTimeMillis()-start));
	}
	
	static void remove_2(String name,List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i <50000; i++) {
			list.remove(100);
		}
		
		System.out.println("비순차 삭제=>"+name+":"+(System.currentTimeMillis()-start));
	}
	
	static void remove_1(String name,List list) {
		long start = System.currentTimeMillis();
		for (int i = list.size()-1; i>=0; i--) {
			list.remove(i);
		}
		
		System.out.println("순차 삭제=>"+name+":"+(System.currentTimeMillis()-start));
	}
	

	public static void main(String[] args) {
		List arr = new ArrayList();
		List link = new LinkedList();
		add_1("arr", arr);
		add_1("link", link);
		System.out.println();
		add_2("arr", arr);
		add_2("link", link);
		System.out.println("-----------------");
		remove_2("arr", arr);
		remove_2("link", link);
		System.out.println();
		remove_1("arr", arr);
		remove_1("link", link);
		System.out.println("arr:"+arr);
		System.out.println("link:"+link);
		
	}

}
