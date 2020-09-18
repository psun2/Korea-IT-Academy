package coll_p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorMain {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(12);
		arr.add(45);
		arr.add(67);
		arr.add(78);
		arr.add(90);
		
		Iterator it = arr.iterator();
		
		while(it.hasNext()) {
			int i = (int)it.next();
			System.out.println(i);
		}
		
//		System.out.println("-------------------");
//		while(it.hasPrevious()) {
//			int i = (int)it.previous();
//			System.out.println(i);
//		}
//		//it.next();
		
		System.out.println(arr);
		ListIterator lit = arr.listIterator();
		
		
		
		System.out.println("-------------------");
		while(lit.hasNext()) {
			int i = (int)lit.next();
			System.out.println(i);
		}
		System.out.println("-------------------");
		while(lit.hasPrevious()) {
			int i = (int)lit.previous();
			System.out.println(i);
		}
		System.out.println("-------------------");
		System.out.println(arr);
		it = arr.iterator();
		
		while(it.hasNext()) {
			int i = (int)it.next();
			if(i==67)
				//arr.remove((Object)i);
				it.remove();
			
			System.out.println(i);
		}
		System.out.println(arr);
	}

}
