package oops;

class ParamShape{
	String name;
	
	double border, area;
	
	void init(int ... line) {
		String [] title = {"원","직사각형","직각삼각형"};
		int p = line.length;
		double pi = 3.141592;
		name= title[p-1];
		
		switch(p) {
			case 1:
				border=line[0]*pi*2;
				area = line[0]*line[0]*pi;
				break;
			case 2:
				border= (line[0]+line[1])*2;
				area =line[0]*line[1];
				break;
			case 3:
				border=line[0]+line[1]+line[2];
				area = line[0]*line[1]/2;
				break;
		
		
		}
		
		
		
	}
	
	void ppp() {
		String ttt = name+"\t"+border+"\t"+area;
		System.out.println(ttt);
	}
	
}

class ParamStud{
	
	String name, kind;
	
	int [] jum;
	
	int tot, avg;
	
	void init(String name, int ...jum) {
		this.name = name;
		this.jum = jum;
		
		kind = new String[] {"일반","특기생"}[jum.length-3];
		
		for (int i : jum) {
			tot += i;
		}
		avg = tot/jum.length;
	}
	
	void ppp() {
		String ttt = kind+"\t"+name+"\t";
		
		for (int i : jum) {
			ttt+=i+"\t";
		}
		//if(kind=="일반")
		if(kind.equals("일반"))
			ttt+="\t";
		
		ttt+=tot+"\t"+avg;
		
		System.out.println(ttt);
	}
}



public class ParamShapeMain {

	public static void main(String[] args) {
		ParamShape ps = new ParamShape();
		ps.init(5);
		ps.ppp();
		
		ps.init(5,6);
		ps.ppp();
		
		ps.init(5,6,8);
		ps.ppp();

		///국어, 영어, 수학 -일반
		///국어, 영어, 수학, 예체능 -특기
		
		//총점, 평균까지 출력하세요
		
		ParamStud [] studs = new ParamStud[5];
		
		for (int i = 0; i < studs.length; i++) {
			studs[i] = new ParamStud();
		}
		
		studs[0].init("한가인", 76,77,71);
		studs[1].init("두가인", 66,67,61,62);
		studs[2].init("삼가인", 96,97,91);
		studs[3].init("사가인", 56,57,51);
		studs[4].init("오가인", 86,87,81,83);
		
		for (ParamStud st : studs) {
			st.ppp();
		}
	}
	

}

