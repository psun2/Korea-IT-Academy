package coll_p;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class NumCom implements Comparator{
	
	int no;

	public NumCom(int no) {
		super();
		this.no = no;
	}



	@Override
	public int compare(Object o1, Object o2) {
		
		int io1 = (int)o1, io2 = (int)o2;
		
		System.out.println(io1+":"+io2);
		
		int res = (io1-io2)*no;
		
		if(res==0)
			res=1;
		
		return res;
	}
}


public class TreeSetMain {

	public static void main(String[] args) {

		//Object [] arr = {45,7,89,2,4,2,45,"이정민",6,2,45,"유건우"};
		Object [] arr = {45,7,13,89,2,4,2,45,56,6,2,45};
		
		HashSet hash = new HashSet();
		LinkedHashSet link = new LinkedHashSet();
		TreeSet tree1 = new TreeSet();
		TreeSet tree2 = new TreeSet(new NumCom(1));
		TreeSet tree3 = new TreeSet(new NumCom(-1));
		
		for (Object obj : arr) {
			hash.add(obj);
			link.add(obj);
			tree1.add(obj);
			tree2.add(obj);
			tree3.add(obj);
			System.out.println("-------------");
		}
		
		System.out.println("arr:"+Arrays.toString(arr));
		System.out.println("hash:"+hash);
		System.out.println("link:"+link);
		System.out.println("tree1:"+tree1);
		System.out.println("tree2:"+tree2);
		System.out.println("tree3:"+tree3);
		
	}

}
