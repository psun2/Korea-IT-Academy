package coll_p;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

class ComStud{
	
	 
	
	Integer ban, tot, avg;
	
	String kind, name, gender;
	
	int [] jum;
	
	ArrayList cate;
	
	ArrayList title;

	public ComStud(int ban, String name, String kind, String gender, int ... jum) {
		
		this.ban = ban;
		this.name = name;
		this.gender = gender;
		this.jum = jum;
		this.kind = kind;
		
		calc();
		cateCalc();
	}
	
	void calc() {
		tot = 0;
		for (int i : jum) {
			tot+=i;
		}
		avg = tot/jum.length;
	}
	
	void cateCalc() {
		cate = new ArrayList();
		
		//π›, º∫∫∞, ±∏∫–, ∆Ú±’
		cate.add(ban);
		cate.add(gender);
		cate.add(kind);
		cate.add(avg);
		
		title = new ArrayList();
		title.add(ban+"π› >>>>");
		title.add(ban+" ["+gender+"]");
		title.add(ban+" ["+gender+"] ["+kind+"]");
	}
	
	public ComStud(int ban, String name, String gender, int kor, int eng, int mat) {
		
		this(ban, name,"¿œπ›", gender, kor,  eng,  mat);
	}
	
	public ComStud(int ban, String name, String gender, int kor, int eng, int mat, int art) {
		
		this(ban, name,"øπ√º¥…", gender, kor,  eng,  mat, art);
	}
	
	void ppp() {
		String ttt = ban+"\t"+gender+"\t"+kind+"\t"+name+"\t";
		for (int i : jum) {
			ttt+=i+"\t";
		}
		if(kind.equals("¿œπ›"))
			ttt+="\t";
		ttt+= tot+"\t"+avg;
		System.out.println(ttt);
	}
	
}

class ComStudCom implements Comparator{
	
	 int [] dir;
	 
	 
	

	public ComStudCom(int ... dir) {
		super();
		this.dir = dir;
	}




	@Override
	public int compare(Object o1, Object o2) {
		ComStud me = (ComStud)o1;
		ComStud you = (ComStud)o2;
		
		int res = 0;
		
		for (int i = 0; i < dir.length; i++) {
			Comparable meC = (Comparable)me.cate.get(i);
			Comparable youC = (Comparable)you.cate.get(i);
			res = dir[i]*meC.compareTo(youC);
			if(res!=0)
				break;
		}
		
		if(res==0)
			res=1;
		return res;
	}
	
}

public class ComStudMain {

	public static void main(String[] args) {
		TreeSet set = new TreeSet(new ComStudCom(1,1,-1,-1));

		set.add(new ComStud(1,"∫Û√˜","∞˙¿⁄", 77, 79, 71));
        set.add(new ComStud(1,"«ˆ∫Û","≥≤¿⁄", 77, 79, 71, 87));
        set.add(new ComStud(1,"ø¯∫Û","ø©¿⁄", 67, 96, 61));
        set.add(new ComStud(1,"π⁄«ˆ∫Û","ø©¿⁄", 97, 89, 91, 27));
        set.add(new ComStud(1,"±ËøÏ∫Û","≥≤¿⁄", 57, 15, 51, 67));
        set.add(new ComStud(4,"∫Ò","≥≤¿⁄", 87, 49, 81, 100));
        set.add(new ComStud(2,"ƒø««∫Û","≥≤¿⁄", 77, 39, 51, 23));
        set.add(new ComStud(1,"∞Ò∫Û","ø©¿⁄", 87, 96, 91));
        set.add(new ComStud(3,"ƒ≥∫Û","≥≤¿⁄", 97, 99, 91));
        set.add(new ComStud(2,"¡©∏Æ∫Û","ø©¿⁄", 47, 65, 51));
        set.add(new ComStud(1,"∫Û¿Õ∫Û","≥≤¿⁄", 77, 89, 51));
        
        
        ComStud title = new ComStud(0,"","","",0);
        
        for (Object obj : set) {
        	ComStud cs = (ComStud)obj;
        	for (int i = 0; i < title.title.size(); i++) {
        		if(!title.title.get(i).equals(cs.title.get(i))) {
            		System.out.println(cs.title.get(i));
            		title.title.set(i, cs.title.get(i));
            		
            	}
			}
        	
        	
        	cs.ppp();
		}

	}

}
