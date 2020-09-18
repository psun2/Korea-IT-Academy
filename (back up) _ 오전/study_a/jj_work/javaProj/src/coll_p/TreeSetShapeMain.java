package coll_p;

import java.util.Comparator;
import java.util.TreeSet;

class TreeSetShape{
	String name;
	
	double area, border;
	
	public TreeSetShape(int ...is ) {
		name = new String [] {"","원","직사각형","직각삼각형"}[is.length];
		
		switch(is.length) {
			case 1:
				area = is[0]*is[0]*Math.PI;
				border = is[0]*2*Math.PI;
				break;
			case 2:
				area = is[0]*is[1];
				border = (is[0]+is[1])*2;
				break;
			case 3:
				area = is[0]*is[1]/2;
				border = is[0]+is[1]+is[2];
				break;
		}
		
	}
	
	void ppp() {
		System.out.println(name+"\t"+area+"\t"+border);
	}
}

class ShapeCom implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		TreeSetShape me = (TreeSetShape)o1;
		TreeSetShape you = (TreeSetShape)o2;
		
		int res = me.name.compareTo(you.name);
		
		if(res==0)
			res = (int)(me.area-you.area);
		
		if(res==0)
			res = (int)(me.border-you.border);
		
		if(res==0)
			res = 1;
		return res;
	}
	
}

public class TreeSetShapeMain {

	public static void main(String[] args) {
		TreeSetShape [] arr = {
				new TreeSetShape(3),
				new TreeSetShape(6,8),
				new TreeSetShape(15),
				new TreeSetShape(3),
				new TreeSetShape(6,9,9),
				new TreeSetShape(5,6),
				new TreeSetShape(3,18,10),
				new TreeSetShape(2),
				new TreeSetShape(5,6),
				new TreeSetShape(10,2),
				new TreeSetShape(10,3)
		};
		TreeSet set = new TreeSet(new ShapeCom());
		System.out.println("arr >>>>>>>>>>>>");
		for (TreeSetShape ts : arr) {
			ts.ppp();
			set.add(ts);
		}
		
		System.out.println("set >>>>>>>>>>>>");
		for (Object obj : set) {
			((TreeSetShape)obj).ppp();
			
		}

	}

}
