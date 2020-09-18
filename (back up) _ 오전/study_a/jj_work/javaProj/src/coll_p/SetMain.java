package coll_p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		Set ss = new HashSet();
		ArrayList arr = new ArrayList();
		
		for (int i : new int[] {67,65,43,21,98,67,43,67,24,89}) {
			ss.add(i);
			arr.add(i);
		}

		System.out.println(arr);
		ss.remove(89);
		System.out.println(ss);
		//System.out.println(ss.get());
		//System.out.println(ss.in);
		System.out.println(ss.contains(21));
		
		for (Object obj : ss) {
			System.out.print(obj+",");
		}
		System.out.println();
		
		Iterator it = ss.iterator();
		
		while(it.hasNext()) {
			int a = (int)it.next();
			if(a==98)
				it.remove();
			System.out.print(a+",");
		}
		System.out.println("\n"+ss);
		ArrayList arr2 = new ArrayList(ss);
		arr2.add(67);
		for (int i = 0; i < arr2.size(); i++) {
			System.out.println(i+":"+arr2.get(i));
		}
		
		Set ss2 = new HashSet(arr2);
		System.out.println("\n"+ss2);
		
		Set lotto = new HashSet();
		
		while(true) {
			
			lotto.add((int)(Math.random()*45+1));
			if(lotto.size()==7)
				break;
		}
		
		System.out.println(lotto);
		
	}

}








