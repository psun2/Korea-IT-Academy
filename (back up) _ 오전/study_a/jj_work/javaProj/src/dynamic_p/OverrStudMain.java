package dynamic_p;

class OverrStud{
	
	String name, kind="ÀÏ¹Ý";
	int [] jum;
	int tot, avg;
	
	void init(String name, int...jum) {
		this.name = name;
		this.jum = jum;
	}
	
	void calc() {
		tot = 0;
		for (int i : jum) {
			tot+=i;
		}
		avg = tot/jum.length;
	}
	
	void ppp() {
		calc();
		String ttt = kind +"\t"+name +"\t";
		
		for (int i : jum) {
			ttt+=i+"\t";
		}
		if(kind.equals("ÀÏ¹Ý"))
			ttt+="\t";
			
		ttt+=tot+"\t"+avg;
		System.out.println(ttt);
	}	
}

class OverrArt extends OverrStud{
	OverrArt(String name, int...jum) {
		this.name = name;
		this.jum = jum;
	}
	
	void calc() {
		kind = "¿¹Ã¼´É";
		super.calc();
	}	
}

class OverrEx extends OverrStud{
	OverrEx(String name, int...jum) {
		this.name = name;
		this.jum = jum;
	}
	
	void calc() {
		kind = "±³È¯ÇÐ»ý";
		super.calc();
	}	
}



public class OverrStudMain {

	public static void main(String[] args) {
		OverrStud [] os = new OverrStud[3];
		
		for (int i = 0; i < os.length; i++) {
			os[i] = new OverrStud();
		}
		os[0].init("²Ê¶Ñ¸¨1", 77,78,71);
		os[1].init("²Ê¶Ñ¸¨2", 87,88,81);
		os[2].init("²Ê¶Ñ¸¨3", 67,68,61);
		
		
		OverrArt [] oa = {
				new OverrArt("²Ê¹è±â1",68,66,64,62 ),
				new OverrArt("²Ê¹è±â2",78,76,74,72 ),
				new OverrArt("²Ê¹è±â3",98,69,94,92 ),
				new OverrArt("²Ê¹è±â4",88,86,84,82 ),
		};
		
		OverrEx [] oe = {
				new OverrEx("²ÊµÎ¸¨1",66,64,62,63 ),
				new OverrEx("²ÊµÎ¸¨2",76,74,79,72 ),
				new OverrEx("²ÊµÎ¸¨3",69,94,90,92 ),
				new OverrEx("²ÊµÎ¸¨4",86,84,84,82 ),
		};
		
		System.out.println("ÀÏ¹Ý>>>>>");
		for (OverrStud oo : os) {
			oo.ppp();
		}
		
		System.out.println("¿¹Ã¼´É>>>>>");
		for (OverrArt oo : oa) {
			oo.ppp();
		}
		
		System.out.println("±³È¯>>>>>");
		for (OverrEx oo : oe) {
			oo.ppp();
		}

	}

}
