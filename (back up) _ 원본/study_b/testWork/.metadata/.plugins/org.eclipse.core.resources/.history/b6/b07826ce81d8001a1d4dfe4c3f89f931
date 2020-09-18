package coll_p;

import java.util.Comparator;
import java.util.TreeSet;

class TreeStud{
	
	String name;
	int ban, avg;
	public TreeStud(int ban, String name, int avg) {
		super();
		this.ban = ban;
		this.name = name;
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "TreeStud [ban=" + ban + ", name=" + name + ", avg=" + avg + "]";
	}	
}

class StudCom implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		TreeStud me = (TreeStud)o1;
		TreeStud you = (TreeStud)o2;
		int res = me.ban - you.ban;
		
		if(res==0)
			res = you.avg - me.avg;
		
		return res;
	}
	
}

public class TreeSetExamMain {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new StudCom());
		ts.add(new TreeStud(1,"ÀÌÈ£ÀÎ",67));
		ts.add(new TreeStud(2,"±è¿µÀç",77));
		ts.add(new TreeStud(1,"¹Ú¼º¾ð",97));
		ts.add(new TreeStud(2,"±è¿¹¼Ö",57));
		ts.add(new TreeStud(2,"±èÈÖÁø",47));
		ts.add(new TreeStud(1,"¾ÈÁ¤¹Î",87));
		
		for (Object obj : ts) {
			System.out.println(obj);
		}
		

	}

}
