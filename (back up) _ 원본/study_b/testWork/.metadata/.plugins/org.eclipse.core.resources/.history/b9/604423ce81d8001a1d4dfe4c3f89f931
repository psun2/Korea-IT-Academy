package coll_p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SetMain {

	public static void main(String[] args) {
		Object [] arr = {11,44,33,77,88,22,44,11,99,123,456,123,66,33};

		ArrayList list1 = new ArrayList();
		HashSet set1 = new HashSet();
		
		for (Object oo : arr) {
			list1.add(oo);
			set1.add(oo);
		}
		
		System.out.println(list1);
		System.out.println(set1);
		
		ArrayList lotto1 = new ArrayList();
		HashSet lotto2 = new HashSet();
		
		while(true) {
			
			int no = (int)(Math.random()*45)+1;
			
			lotto1.add(no);
			lotto2.add(no);
			
			if(lotto2.size()==7)
				break;
		}
		
		System.out.println(lotto1);
		System.out.println(lotto2);
		
		//Collections.sort(lotto2);
		ArrayList lotto3 = new ArrayList(lotto2);
		Collections.sort(lotto3);
		
		System.out.println(lotto3);
		
		HashSet ss = new HashSet();
		
		while(true) {
			
			int no = (int)(Math.random()*100)+1;
			
			ss.add(no);
			
			
			if(ss.size()==25)
				break;
		}
		
		ArrayList bingo = new ArrayList(ss);
		Collections.shuffle(bingo);

		for (int i = 0; i < bingo.size(); i++) {
			
			System.out.print(bingo.get(i)+"\t");
			
			if(i%5==4)
				System.out.println();
		}
	}

}
