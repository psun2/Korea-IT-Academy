package dynamic_p;

class AbsTTT{
	int cnt=0;
	String kind;
	AbsStud redTot, redAvg; 
	
	AbsStud [] studs = new AbsStud[0];
	
	void addStuds(AbsStud st) {
		AbsStud [] buf = new AbsStud[studs.length+1];
		
		for (int i = 0; i < studs.length; i++) {
			buf[i] = studs[i];
		}
		buf[studs.length] = st;
		studs = buf;
	}
	
	
	public AbsTTT(String kind, int ...jum) {
		this.kind = kind;
		
//		int [] jj = new int [jum.length];
//		for (int i = 0; i < jj.length; i++) {
//			jj[i] = jum[i];
//		}
		
		redTot = new AbsStud("ÃÑÁ¡",kind,jum) {

			void cal() {}
		};
		
		redAvg = new AbsStud("Æò±Õ",kind,jum.clone()) {
			
			void cal() {}
		};
	}
	
	void cal(AbsStud st) {
		
		cnt++;
		for (int i = 0; i < st.jum.length; i++) {
			redTot.jum[i]+=st.jum[i];
			redAvg.jum[i]=redTot.jum[i]/cnt;
		}
		//redTot.ppp();
		//System.out.println("µé¾î¿À³Ä?");
		addStuds(st);
	}
	
	void rankCal(AbsStud [] totSt) {
		for (AbsStud st : studs) {
			st.rankCal(studs,1);
		}
		for (AbsStud st : totSt) {
			st.rankCal(totSt,0);
		}
	}
	
	void ppp(AbsStud [] totSt) {
		rankCal(totSt);
		System.out.println(kind+">>>>>>>>");
		for (int i = 1; i <= studs.length; i++) {
			for (AbsStud st : studs) {
				if(i==st.rank[1])
					st.ppp();
			}
		}
		
		
		redTot.ppp();
		redAvg.ppp();
	}
	
}


abstract class AbsStud{
	
	AbsTTT res;
	
	String name, kind;
	
	int [] jum;
	
	int tot, avg; 
	int [] rank = {0,0};
	
	AbsStud(String name,String kind, int... jum) {
		
		this.name = name;
		this.jum = jum;
		this.kind = kind;
		
	}
	
	abstract void cal() ;
	void rankCal(AbsStud [] studs, int cc) {
		rank[cc]=1;
		for (AbsStud st : studs) {
			if(avg<st.avg)
				rank[cc]++;
		}
	}
	
	void ppp() {
		
		String ttt = kind +"\t"+name+"\t";
		
		for (int i : jum) {
			ttt += i+"\t";
		}
		
		if(kind =="ÀÏ¹Ý")
			ttt += "\t";
		
		ttt += tot+"\t"+avg+"\t"+rank[0]+"\t"+rank[1];
		
		System.out.println(ttt);
	}
}

class AbsGenStud extends AbsStud{
	
	AbsGenStud(AbsTTT [] res,String name,  int kor, int eng, int mat) {
		super(name,"ÀÏ¹Ý", kor, eng, mat);
		
		for (AbsTTT absTTT : res) {
			if(absTTT.kind.equals("ÀÏ¹Ý"))
				super.res = absTTT;
		}
	}

	@Override
	void cal() {
		tot = 0;
		for (int i : jum) {
			tot+= i;
		}
		avg = tot/jum.length;
		res.cal(this);
	}

	
	
}


class AbsArtStud extends AbsStud{
	
	AbsArtStud(AbsTTT [] res,String name, int kor, int eng, int mat, int art) {
		super(name,"¿¹Ã¼´É", kor, eng, mat, art);
		
		for (AbsTTT absTTT : res) {
			if(absTTT.kind.equals("¿¹Ã¼´É"))
				super.res = absTTT;
		}
		
	}

	@Override
	void cal() {
		
		double [] rate = {0.35,0.1,0.15,0.4};
		tot = 0;
		avg = 0;
		for (int i = 0; i < rate.length; i++) {
			tot += jum[i];
			avg  += rate[i]*jum[i];
		}
		res.cal(this);
	}

	
}

class AbsExStud extends AbsStud{
	
	AbsExStud(AbsTTT [] res,String name, int kor, int eng, int mat, int ex) {
		super(name,"±³È¯", kor, eng, mat, ex);
		
		for (AbsTTT absTTT : res) {
			if(absTTT.kind.equals("±³È¯"))
				super.res = absTTT;
		}
		
	}

	@Override
	void cal() {
		
		double [] rate = {0.4,0.2,0.2,0.2};
		tot = 0;
		avg = 0;
		for (int i = 0; i < rate.length; i++) {
			tot += jum[i];
			avg  += rate[i]*jum[i];
		}
		
		res.cal(this);
	}

	
}






public class AbsStudMain {

	public static void main(String[] args) {
		
		AbsTTT [] ttt = {
				new AbsTTT("ÀÏ¹Ý", 0,0,0),
				new AbsTTT("¿¹Ã¼´É", 0,0,0,0),
				new AbsTTT("±³È¯", 0,0,0,0)};
		
		AbsStud [] studs = {
			new AbsGenStud(ttt, "¸ù³ªÀÌ", 61,63,68),
			new AbsArtStud(ttt, "»Ç¶Ñ·ç", 71,73,78,72),
			new AbsGenStud(ttt, "²Ê¶Ñ¸¨", 51,53,58),
			new AbsArtStud(ttt, "Çã¿µÁö", 81,83,88,82),
			new AbsExStud(ttt, "¹ÚÅÂÈ¯", 91,93,98,92),
			new AbsArtStud(ttt, "Æë¼ö", 41,43,48,42),
			new AbsArtStud(ttt, "¸ù³ª»ï", 61,36,86,26),
			new AbsExStud(ttt, "»Ç¶Ñ", 17,73,78,27),
			new AbsExStud(ttt, "²Ê¶Ñ", 21,33,48,52),
			new AbsArtStud(ttt, "ÇãÀÏÁö", 15,35,85,26),
			new AbsGenStud(ttt, "¹ÚÅÂ", 93,98,72),
			new AbsGenStud(ttt, "ÆëÁ·", 41,33,62)
		};
		
		for (AbsStud st : studs) {
			st.cal();
		}
		
		for (AbsTTT at:ttt) {
			at.ppp(studs);
			
		}
		
		
	}

}
