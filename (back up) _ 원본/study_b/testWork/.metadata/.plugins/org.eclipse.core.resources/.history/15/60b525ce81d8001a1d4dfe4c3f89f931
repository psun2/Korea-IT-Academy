package coll_p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorMain {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		
		arr.add("홍박이");
		arr.add("성시주");
		arr.add("혁현혁");
		arr.add("김김오");
		arr.add("연현민");
		arr.add("섭준석");
		
		Iterator it = arr.iterator();
		
		//System.out.println(it.next());
		//System.out.println(it.next());
		
		while(it.hasNext()) {
			Object obj = it.next();
			if(obj.equals("성시주"))
			{
					//arr.remove(obj);
				it.remove();
			}
			
			System.out.println(obj);
		}
		System.out.println(arr);
		
		System.out.println("---------------------");
//		while(it.hasPrevious()) {
//			System.out.println(it.previous());
//		}
		
//		for (Object obj : arr) {
//			if(obj.equals("성시주"))
//			{
//				arr.remove(obj);  
		//			 향상된 for문 내부에서 remove()하면 에러발생
//			}
//			//System.out.println(obj);
//		}
		
		ListIterator lit = arr.listIterator();
		
		
		System.out.println("---------------------");
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		System.out.println("---------------------");
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		
		
		
		int [] nums = {34,56,12,43,90,89,654,43,21234,675,45};
		
		//1. 모든 원소를 arrayList에 넣어 출력하세요
		//2, 3의 배수를 제외한 arrayList로 변환하세요
		
		ArrayList ar = new ArrayList();
		
		for (int i: nums) {
			ar.add(i);
		}
		
		//ar.add("곱창은 맛있냐?");
		
		//ar.sort(null);
		Collections.sort(ar);
		System.out.println(ar);
		Collections.shuffle(ar);
		System.out.println(ar);
		Collections.reverse(ar);
		System.out.println(ar);
		Collections.swap(ar, 2,6);
		System.out.println(ar);
		
		Iterator it2 = ar.iterator();
		
		while(it2.hasNext()) {
			int i = (int)it2.next();
			
			if(i%2==0 || i%3==0)
				it2.remove();
		}
		
		System.out.println(ar);
	}

}
