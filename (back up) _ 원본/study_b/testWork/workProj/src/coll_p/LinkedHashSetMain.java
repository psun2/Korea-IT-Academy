package coll_p;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class ArrayCom implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return -1;
	}
	
}


class DescCom implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		System.out.println(o1+":"+o2);
		int me = (int)o1;
		int you = (int)o2;
		return you-me;
	}
	
}

public class LinkedHashSetMain {

	public static void main(String[] args) {
		Object [] arr = {11,44,33,77,88,22,44,11,99,123,456,123,66,33};

		HashSet set1 = new HashSet();
		LinkedHashSet set2 = new LinkedHashSet();
		TreeSet set3 = new TreeSet();
		TreeSet set4 = new TreeSet(new ArrayCom());
		TreeSet set5 = new TreeSet(new DescCom());
		
		for (Object oo : arr) {
			set1.add(oo);
			set2.add(oo);
			set3.add(oo);
			set4.add(oo);
			set5.add(oo);
			System.out.println("----------------");
		}
		
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
		System.out.println(set4);
		System.out.println(set5);
	}

}
