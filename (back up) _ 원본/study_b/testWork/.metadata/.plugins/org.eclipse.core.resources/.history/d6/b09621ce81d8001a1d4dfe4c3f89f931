package coll_p;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

class TrStud implements Comparable{
	String name, kind, gender;
	int ban, tot, avg, rank;
	int [] jum;
	public TrStud(int ban, String name,String gender, int... jum) {
		super();
		this.ban = ban;
		this.name = name;
		this.jum = jum;
		this.gender = gender;
		
		calc();
	}
	
	void calc() {
		kind = new String [] {"ÀÏ¹Ý","Æ¯±â»ý"}[jum.length-3];
		
		tot = 0;
		
		for (int i : jum) {
			tot+=i;
		}
		
		avg = tot/jum.length;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public String toString() {
		String ttt = ban + "\t" + name + "\t" + kind + "\t" + gender +"\t";
		
		int cut = 3;
		
		if(kind.equals("Æ¯±â»ý"))
			cut = 4;
		
		for (int i=0 ; i<cut;i++) {
			ttt+= jum[i] + "\t" ;
		}
		
		if(cut==3)
			ttt+=  "\t" ;
				
		ttt+= tot + "\t" + avg + "\t" + rank;
		
		return ttt;
	}
	
	
}

class MySet extends TreeSet{
	ArrayList<TrStud> res;
	TrStud tot,avg, max, min;
	
	public MySet() {
		res = new ArrayList();
		tot = new TrStud(-1,"ÃÑÁ¡","",0,0,0,0);
		avg = new TrStud(-1,"Æò±Õ","",0,0,0,0);
		max = new TrStud(-1,"ÃÖ´ë","",0,0,0,0);
		min = new TrStud(-1,"ÃÖ¼Ò","",101,101,101,101);
		res.add(tot );
		res.add(avg );
		res.add(max );
		res.add(min );
		
	}
	
	@Override
	public boolean add(Object e) {
		boolean res = super.add(e);
		calc(e);
		return res;
	}
	
	void calc(Object e) {
		TrStud ts = (TrStud)e;
		
		max.gender = min.gender = avg.gender = tot.gender = ts.gender;
		max.kind = min.kind = avg.kind = tot.kind = ts.kind;
		max.ban = min.ban = avg.ban = tot.ban = ts.ban;
		
		for (int i = 0; i < ts.jum.length; i++) {
			tot.jum[i] += ts.jum[i];
			avg.jum[i] = tot.jum[i]/size();
			if(max.jum[i] < ts.jum[i])
				max.jum[i] = ts.jum[i];
			if(min.jum[i] > ts.jum[i])
				min.jum[i] = ts.jum[i];
		}
	}
	
	void ppp() {
		for (TrStud ooo : res) {
			
			System.out.println(ooo);
		}
	}
	
}




public class TreeMapStudMain {
	
	static void mapAdd(TreeMap res,Object key, Object cc) {

		if(res.containsKey(key))
			cc = res.get(key);
		
		res.put(key, cc);
	}
	
	
	
	
	static void mapPrint(Object oo, String pre) {
		
		if(oo instanceof MySet) {
		
			MySet ms = (MySet)oo;
			
			for (Object oo4 : ms) {
				System.out.println(oo4);
			}
			System.out.println("-------------------------------------");
			ms.ppp();
			
		}else {
			
			 TreeMap en = (TreeMap)oo;
			
			 String myPre = pre;
			 pre+=" >>> ";
			for (Object oo3 : en.entrySet()) {
				Entry en3 = (Entry)oo3;

				System.out.println(myPre+en3.getKey());
				
				mapPrint(en3.getValue(), pre);
			}
		}
	}
	

	public static void main(String[] args) {
		TrStud [] arr = {
				new TrStud(1,"±è¿¬Áö","¿©",99,99,55),
                new TrStud(1,"È«¼ºÇõ","³²",90,90,90),
                new TrStud(2,"¾ÈÁ¤¹Î","³²",99,88,77),
                new TrStud(2,"±è¿¬¼·","³²",80,100,99,90),
                new TrStud(2,"±èÈÖÁø","³²",87,76,70,90),
                new TrStud(1,"±è¿¹¼Ö","¿©",100,90,80),
                new TrStud(1,"¿À¹Î¼®","¿©",70,70,80,70),
                new TrStud(1,"ÀåÁ¤È£","³²",70,100,80,70),
                new TrStud(1,"±è¿µÀç","³²",80,80,70,70),
                new TrStud(1,"±èÇöÁØ","¿©",90,80,70,70),
                new TrStud(2,"¹Ú¼º¾ð","¿©",7,99,99),
                new TrStud(3,"ÀÌÁÖÇõ","¿©",99,66,99),
                new TrStud(2,"ÀÌÈ£ÀÎ","³²",99,65,99),
                new TrStud(2,"±èÁö¹Î","¿©",99,65,99,12),
                new TrStud(2,"¹Ú½ÃÇö","¿©",19,88,88,77),
                new TrStud(2,"ÀÌ½ÅÇù","¿©",100,100,100,100)
		};
		
		TreeMap<Integer, TreeMap<String, TreeMap<String, TreeSet>>> res = new TreeMap();
		
		for (TrStud tr : arr) {
			mapAdd(res, tr.ban, new TreeMap());
			mapAdd(res.get(tr.ban), tr.kind, new TreeMap());
			mapAdd(res.get(tr.ban).get(tr.kind), tr.gender, new MySet());
			res.get(tr.ban).get(tr.kind).get(tr.gender).add(tr);
			
		}
		
		mapPrint(res,">> ");
		
		

	}

}
