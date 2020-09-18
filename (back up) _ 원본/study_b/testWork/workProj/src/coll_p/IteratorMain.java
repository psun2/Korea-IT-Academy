package coll_p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorMain {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		
		arr.add("ȫ����");
		arr.add("������");
		arr.add("������");
		arr.add("����");
		arr.add("������");
		arr.add("���ؼ�");
		
		Iterator it = arr.iterator();
		
		//System.out.println(it.next());
		//System.out.println(it.next());
		
		while(it.hasNext()) {
			Object obj = it.next();
			if(obj.equals("������"))
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
//			if(obj.equals("������"))
//			{
//				arr.remove(obj);  
		//			 ���� for�� ���ο��� remove()�ϸ� �����߻�
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
		
		//1. ��� ���Ҹ� arrayList�� �־� ����ϼ���
		//2, 3�� ����� ������ arrayList�� ��ȯ�ϼ���
		
		ArrayList ar = new ArrayList();
		
		for (int i: nums) {
			ar.add(i);
		}
		
		//ar.add("��â�� ���ֳ�?");
		
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
