package coll_p;

import java.util.TreeSet;

class ComShape implements Comparable{
	String name;
	
	double area, border;
	
	public ComShape(int ...is ) {
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

	@Override
	public int compareTo(Object o) {
		
		ComShape you = (ComShape)o;
		
		int res = name.compareTo(you.name);
		
		if(res==0)
			res = (int)(area-you.area);
		
		if(res==0)
			res = (int)(border-you.border);
		
		if(res==0)
			res = 1;
		return res;
	}
}



public class ComShapeMain {

	public static void main(String[] args) {
		ComShape [] arr = {
				new ComShape(3),
				new ComShape(6,8),
				new ComShape(15),
				new ComShape(3),
				new ComShape(6,9,9),
				new ComShape(5,6),
				new ComShape(3,18,10),
				new ComShape(2),
				new ComShape(5,6),
				new ComShape(10,2),
				new ComShape(10,3)
		};
		TreeSet set = new TreeSet();
		System.out.println("arr >>>>>>>>>>>>");
		for (ComShape ts : arr) {
			ts.ppp();
			set.add(ts);
		}
		
		System.out.println("set >>>>>>>>>>>>");
		for (Object obj : set) {
			((ComShape)obj).ppp();
			
		}

	}

}
