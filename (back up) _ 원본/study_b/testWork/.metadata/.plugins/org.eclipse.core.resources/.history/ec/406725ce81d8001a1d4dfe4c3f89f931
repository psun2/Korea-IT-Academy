package coll_p;

import java.util.TreeSet;

class StudCCC implements Comparable{
	String name;
	int jum, ban;
	public StudCCC(int ban, String name, int jum) {
		super();
		this.ban = ban;
		this.name = name;
		this.jum = jum;
	}
	@Override
	public String toString() {
		return ban + ", " + name + ", " + jum;
	}
	
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		StudCCC you = (StudCCC)o;
		
		int res = ban-you.ban;
		
		if (res==0)
			res = you.jum-jum;
		
		return res;
	}
	
	
	
}


public class ComparableMain {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		set.add(new StudCCC(1, "È«¼ºÇõ", 72));
		set.add(new StudCCC(2, "¹Ú½ÃÇö", 82));
		set.add(new StudCCC(1, "ÀÌÁÖÇõ", 92));
		set.add(new StudCCC(1, "±è¿¬¼·", 22));
		set.add(new StudCCC(2, "±èÇöÁØ", 52));
		set.add(new StudCCC(1, "¿À¹Î¼®", 62));
		set.add(new StudCCC(2, "ÀåÁ¤È£", 72));
		set.add(new StudCCC(1, "±è¿µÀç", 82));
		set.add(new StudCCC(2, "ÀÌÈ£ÀÎ", 92));
		
		for (Object object : set) {
			System.out.println(object);
		}

	}

}
