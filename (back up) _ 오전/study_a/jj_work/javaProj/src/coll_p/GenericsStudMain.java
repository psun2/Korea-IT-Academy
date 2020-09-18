package coll_p;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

class MapJum implements Comparable<MapJum>{
    String kind, name, ban, mf;
    int tot, avg, rank;
    int [] jum;
    
    public MapJum(String ban, String kind, String mf, String name, int ...jum) {
        this.jum = jum;
        this.ban = ban;
        this.kind = kind;
        this.mf = mf;
        this.name = name;
        
        cal();
    }
    
    void cal() {
        for (int i : jum) {
            tot+=i;
            avg=tot/jum.length;
        }
    }
    
    public MapJum(String ban, String mf, String name ,int kor, int eng, int math) {
        this(ban,"일반",mf,name,kor,eng,math);
    }
    
    public MapJum(String ban, String mf, String name ,int kor, int eng, int math, int art) {
        this(ban,"예체능",mf,name,kor,eng,math,art);
    }
    
    @Override
    public String toString() {
        String ttt = "";
        ttt+="\t"+kind+"\t"+name+"\t"+mf+"\t";
        for (int i : jum) {
            ttt+=i+"\t";
        }
        if(kind.equals("일반"))
            ttt+="\t";
        ttt+=tot+"\t"+avg+"\t"+rank;
        return ttt;
    }

	@Override
	public int compareTo(MapJum o) {
		int res = o.avg-avg;
		
		if(res==0)
			res = name.compareTo(o.name);
		
		if(res==0)
			res=1;
		
		return res;
	}
	
	
	void rankCalc(TreeSet<MapJum> set) {
		rank=1;
		for (MapJum mj : set) {
			if(avg<mj.avg)
				rank++;
		}
	}
	
	
	void mapSetting(TreeMap<String, TreeMap<String, TreeMap<String, MySet>>> map) {
		 TreeMap<String, TreeMap<String, MySet>> banMap;
			if(map.containsKey(ban))
				banMap = map.get(ban);
			else
				banMap = new TreeMap<String, TreeMap<String,MySet>>();
			
			
			
			TreeMap<String, MySet> genMap;
			if(banMap.containsKey(mf))
				genMap = banMap.get(mf);
			else
				genMap = new TreeMap<String, MySet>();
			
			MySet kindSet;
			
			if(genMap.containsKey(kind))
				kindSet = genMap.get(kind);
			else
				kindSet = new MySet();
			
			kindSet.add(this);
			
			map.put(ban, banMap);
			banMap.put(mf, genMap);
			genMap.put(kind, kindSet);
	}
}


class MySet{
	TreeSet<MapJum> set;
	LinkedHashMap<String, MapJum> res;
	public MySet(     ) {
		set = new TreeSet<MapJum>();
		res = new LinkedHashMap<String, MapJum>();
		res.put("합계", new MapJum("","","","합계",0,0,0,0));
		res.put("평균", new MapJum("","","","평균",0,0,0,0));
	}
	
	void add(MapJum t) {
		set.add(t);
	}
	
	void rankCalc() {
		for (MapJum mj : set) {
			mj.rankCalc(set);
			
			for (int i = 0; i < mj.jum.length; i++) {
				res.get("합계").jum[i]+=mj.jum[i];
			}
			
		}
		
		for (int i = 0; i <res.get("합계").jum.length; i++) {
			res.get("평균").jum[i]=res.get("합계").jum[i]/set.size();
		}
	}
	
	
	void ppp() {
		rankCalc();
		for (MapJum mapJum :set) {
			System.out.println(mapJum);
		}
		
		for (MapJum mapJum :res.values()) {
			System.out.println(mapJum);
		}
	}
}

class GenTreeCom implements Comparator<String>{

	int no;
	
	
	public GenTreeCom(int no) {
		super();
		this.no = no;
	}


	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2)*no;
	}
	
}

public class GenericsStudMain {

	public static void main(String[] args) {
		 MapJum [] arr = {
	                new MapJum("양념반","남","이철구",88,87,66),
	                new MapJum("양념반","남","외질혜",88,77,66),
	                new MapJum("양념반","여","김짭구",71,88,97,76),
	                new MapJum("후라이드반","여","짭조새",91,89,100),
	                new MapJum("후라이드반","여","유인나",81,82,80),
	                new MapJum("양념반","남","마동석",93,95,77,52),
	                new MapJum("후라이드반","여","최순실",67,55,48,54),
	                new MapJum("후라이드반","여","이왕표",99,97,81),
	                new MapJum("양념반","여","최준희",99,97,81),
	                new MapJum("후라이드반","남","김피죤",83,75,97),
	                new MapJum("후라이드반","여","꼬끼오",73,85,97,57),
	                new MapJum("후라이드반","남","곽도원",77,77,22,33)
	        };
		 
		 //반, 성별, 구분,  학생
		 TreeMap<String, TreeMap<String, TreeMap<String, MySet>>> map = 
				 new TreeMap<String, TreeMap<String, TreeMap<String, MySet>>>(new GenTreeCom(-1));
		 
		 for (MapJum mj : arr) {
			
			 mj.mapSetting(map);
		}
		 
		 for (Entry<String, TreeMap<String, TreeMap<String, MySet>>> ban : map.entrySet()) {
			System.out.println(ban.getKey()+">>>>");
			for (Entry<String, TreeMap<String, MySet>> gen : ban.getValue().entrySet()) {
				System.out.println("  ["+gen.getKey()+"]");
				for (Entry<String, MySet> kind : gen.getValue().entrySet()) {
					System.out.println("\t["+kind.getKey()+"]");
					
					kind.getValue().ppp();
					
				}
			}
		}
		 
		 
		 

	}

}
