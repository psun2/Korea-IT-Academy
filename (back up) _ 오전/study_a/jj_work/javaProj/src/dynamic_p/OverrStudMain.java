package dynamic_p;

class OverrStud{
	
	String name, kind="�Ϲ�";
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
		if(kind.equals("�Ϲ�"))
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
		kind = "��ü��";
		super.calc();
	}	
}

class OverrEx extends OverrStud{
	OverrEx(String name, int...jum) {
		this.name = name;
		this.jum = jum;
	}
	
	void calc() {
		kind = "��ȯ�л�";
		super.calc();
	}	
}



public class OverrStudMain {

	public static void main(String[] args) {
		OverrStud [] os = new OverrStud[3];
		
		for (int i = 0; i < os.length; i++) {
			os[i] = new OverrStud();
		}
		os[0].init("�ʶѸ�1", 77,78,71);
		os[1].init("�ʶѸ�2", 87,88,81);
		os[2].init("�ʶѸ�3", 67,68,61);
		
		
		OverrArt [] oa = {
				new OverrArt("�ʹ��1",68,66,64,62 ),
				new OverrArt("�ʹ��2",78,76,74,72 ),
				new OverrArt("�ʹ��3",98,69,94,92 ),
				new OverrArt("�ʹ��4",88,86,84,82 ),
		};
		
		OverrEx [] oe = {
				new OverrEx("�ʵθ�1",66,64,62,63 ),
				new OverrEx("�ʵθ�2",76,74,79,72 ),
				new OverrEx("�ʵθ�3",69,94,90,92 ),
				new OverrEx("�ʵθ�4",86,84,84,82 ),
		};
		
		System.out.println("�Ϲ�>>>>>");
		for (OverrStud oo : os) {
			oo.ppp();
		}
		
		System.out.println("��ü��>>>>>");
		for (OverrArt oo : oa) {
			oo.ppp();
		}
		
		System.out.println("��ȯ>>>>>");
		for (OverrEx oo : oe) {
			oo.ppp();
		}

	}

}
