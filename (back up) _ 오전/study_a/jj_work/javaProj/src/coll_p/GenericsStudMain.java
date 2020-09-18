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
        this(ban,"�Ϲ�",mf,name,kor,eng,math);
    }
    
    public MapJum(String ban, String mf, String name ,int kor, int eng, int math, int art) {
        this(ban,"��ü��",mf,name,kor,eng,math,art);
    }
    
    @Override
    public String toString() {
        String ttt = "";
        ttt+="\t"+kind+"\t"+name+"\t"+mf+"\t";
        for (int i : jum) {
            ttt+=i+"\t";
        }
        if(kind.equals("�Ϲ�"))
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
		res.put("�հ�", new MapJum("","","","�հ�",0,0,0,0));
		res.put("���", new MapJum("","","","���",0,0,0,0));
	}
	
	void add(MapJum t) {
		set.add(t);
	}
	
	void rankCalc() {
		for (MapJum mj : set) {
			mj.rankCalc(set);
			
			for (int i = 0; i < mj.jum.length; i++) {
				res.get("�հ�").jum[i]+=mj.jum[i];
			}
			
		}
		
		for (int i = 0; i <res.get("�հ�").jum.length; i++) {
			res.get("���").jum[i]=res.get("�հ�").jum[i]/set.size();
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
	                new MapJum("����","��","��ö��",88,87,66),
	                new MapJum("����","��","������",88,77,66),
	                new MapJum("����","��","��¬��",71,88,97,76),
	                new MapJum("�Ķ��̵��","��","¬����",91,89,100),
	                new MapJum("�Ķ��̵��","��","���γ�",81,82,80),
	                new MapJum("����","��","������",93,95,77,52),
	                new MapJum("�Ķ��̵��","��","�ּ���",67,55,48,54),
	                new MapJum("�Ķ��̵��","��","�̿�ǥ",99,97,81),
	                new MapJum("����","��","������",99,97,81),
	                new MapJum("�Ķ��̵��","��","������",83,75,97),
	                new MapJum("�Ķ��̵��","��","������",73,85,97,57),
	                new MapJum("�Ķ��̵��","��","������",77,77,22,33)
	        };
		 
		 //��, ����, ����,  �л�
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
