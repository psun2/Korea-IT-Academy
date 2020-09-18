package coll_p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AAA{
	
}

public class ArrayListMain {

	public static void main(String[] args) {
		ArrayList arr1 = new ArrayList();

		arr1.add(11);
		arr1.add(34);
		arr1.add(5);
		arr1.add(11);
		arr1.add(78);
		
		System.out.println(arr1);
		System.out.println(arr1.get(0));
		//System.out.println(arr1.get(5));
		System.out.println(arr1.size());
		for (int i = 0; i < arr1.size(); i++) {
			System.out.println("arr1.get("+i+"):"+arr1.get(i));
		}
		
		arr1.add(100);
		arr1.add(2,200);  //중간 삽입
		System.out.println(arr1);
		arr1.set(3, 5555);	//수정
		System.out.println(arr1);
		arr1.remove(5);		//삭제
		System.out.println(arr1);
		arr1.remove((Object)34);		//삭제
		System.out.println(arr1);
		//arr1.remove((Object)11);		//삭제
		//arr1.removeAll((Object)11);		//삭제
		System.out.println(arr1);
		
		System.out.println(arr1.indexOf(5555));
		System.out.println(arr1.indexOf(11));
		//System.out.println(arr1.indexOf(11,2));
		System.out.println(arr1.lastIndexOf(11));
		System.out.println(arr1.indexOf(1234));
		System.out.println(arr1.contains(11));
		System.out.println(arr1.contains(1234));
		
		ArrayList arr2 = arr1;
		ArrayList arr3 = new ArrayList(arr1);
		arr1.set(1, 2345);
		System.out.println("arr1:"+arr1);
		System.out.println("arr2:"+arr2);
		System.out.println("arr3:"+arr3);
		
		List arr4 = arr1.subList(1, 3);  //shallow copy
		List arr5 = new ArrayList(arr1.subList(1, 3));  //deep copy
		///containsAll(collection e)  collection 안의 모든 항목이 있는지
		System.out.println(arr1.containsAll(arr5));
		
		System.out.println("arr4:"+arr4);
		arr4.set(0, 8765);
		System.out.println("arr1:"+arr1);
		System.out.println("arr4:"+arr4);
		arr1.set(1, 8080);
		System.out.println("arr1:"+arr1);
		System.out.println("arr4:"+arr4);
		arr4.add(1357);
		System.out.println("arr1:"+arr1);
		System.out.println("arr4:"+arr4);
		arr1.add(2468);
		arr5.add(67458);
		//크기 변경시 원본 리스트의 주소가 변경되어 참조하고 있는subList 객체의 주소가 유효하지 않음
		System.out.println("arr1:"+arr1);
		//System.out.println("arr4:"+arr4);
		System.out.println("arr5:"+arr5);
	
		System.out.println(arr1.containsAll(arr5));
		
		
		ArrayList arr11 = new ArrayList(arr1);
		ArrayList arr55 = new ArrayList(arr5);
		System.out.println("arr1 :"+arr1);
		System.out.println("arr11:"+arr11);
		System.out.println("arr5 :"+arr5);
		System.out.println("arr55:"+arr55);
		arr11.removeAll(arr5);
		arr55.retainAll(arr1);
		System.out.println("arr1 :"+arr1);
		System.out.println("arr11:"+arr11);
		System.out.println("arr5 :"+arr5);
		System.out.println("arr55:"+arr55);
		
		arr1.addAll(arr5);
		System.out.println("arr1 :"+arr1);
		
		AAA a1 = new AAA();
		arr1.add(a1);
		System.out.println("arr1 :"+arr1);
		arr1.add(a1);
		System.out.println("arr1 :"+arr1);
		
		Object [] oo = arr1.toArray();
		
		System.out.println(Arrays.toString(oo));
		ArrayList arr6 = (ArrayList)arr1.clone();
		
		arr1.clear();
		System.out.println("arr1 :"+arr1);
		System.out.println("arr6 :"+arr6);
	}

}

