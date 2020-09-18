package coll_p;

import java.util.ArrayList;

class ArrayStud{
	
	String name;
	
	int [] jum;
	
	int ban,tot, avg, rank;

	public ArrayStud(int ban,String name, int ...jum) {
		super();
		this.ban = ban;
		this.name = name;
		this.jum = jum;
		calc();
	}
	
	void calc() {
		tot=0;
		for (int i : jum) {
			tot+=i;
		}
		avg = tot/jum.length;
	}
	
	void rankCalc(Object ee) {
		rank=1;
		for (Object obj : (ArrayList)ee) {
			if(avg<((ArrayStud)obj).avg) 
				rank++;
		}
	}

	@Override
	public String toString() {
		String ttt= ban +"\t"+name + "\t";
		for(int i:jum) {
			ttt+= i + "\t";
		}
		ttt+= tot + "\t"+ avg + "\t"+ rank;
		return ttt;
	}
	
	
	
}

class MyList extends ArrayList{
	int max = -1;
	@Override
	public boolean add(Object e) {
		//System.out.println("add 하지롱:"+e);
		ArrayStud st = (ArrayStud)e;
		if(max<st.ban)
			max=st.ban;
		
		return super.add(e); 
	}
}


public class ArrayStudMain {

	public static void main(String[] args) {
		MyList tot = new MyList();
		tot.add(new ArrayStud(2, "이익준", 84,87,81));
		tot.add(new ArrayStud(1, "안정원", 44,47,41));
		tot.add(new ArrayStud(3, "김준완", 74,77,71));
		tot.add(new ArrayStud(1, "양석형", 64,67,61));
		tot.add(new ArrayStud(3, "채송화", 54,57,51));
		tot.add(new ArrayStud(2, "정로사", 94,97,91));
		tot.add(new ArrayStud(2, "주종수", 24,37,41));
		tot.add(new ArrayStud(1, "도재학", 14,17,11));
		tot.add(new ArrayStud(2, "용석민", 45,76,17));
		tot.add(new ArrayStud(2, "장겨울", 40,79,81));
		tot.add(new ArrayStud(1, "안치홍", 43,72,11));
		tot.add(new ArrayStud(3, "추민하", 74,78,91));
		
		ArrayList res = new ArrayList();
		res.add(null);
		for (int i = 0; i < tot.max; i++) {
			res.add(new ArrayList());
		}
		
		for (Object obj : tot) {
			ArrayStud st = (ArrayStud)obj;
			((ArrayList)res.get(st.ban)).add(st);
		}
		
		for (int i = 1; i <res.size(); i++) {
			
			for (Object obj : (ArrayList)res.get(i)) {
				((ArrayStud)obj).rankCalc(res.get(i));
			}
			
		}
		
		
		for (int i = 1; i <res.size(); i++) {
			System.out.println(i+" 반>>>>");
			for (Object obj : (ArrayList)res.get(i)) {
				System.out.println(obj);
			}
			
		}

	}

}
