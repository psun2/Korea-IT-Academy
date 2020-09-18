package pac.pac_1;

import pac.pac_2.America;

class Korea{
	
	private String name;
	private America pp1, pp2;
	private int price;
	
	Korea(String name, America pp1, America pp2) {
		
		this.name = name;
		this.pp1 = pp1;
		this.pp2 = pp2;
		
		price = pp1.pr() + pp2.pr();
		
	}

	void ppp() {
		String ttt = "Korea " + name + ", " + 
					pp1.ppp() + ", " + 
					pp2.ppp() + ", " + price;
		
		System.out.println(ttt);
	}
	
	
	
}

public class KoreaMain {

	public static void main(String[] args) {
		America engine = new America("ø£¡¯", "4±‚≈Î", 200);
		America tm = new America("πÆ¬¶", "∆Æ∑∑≈©πÆ",60);
		Korea kk = new Korea("»¿¥Ÿ¿Ã",engine, tm);

		kk.ppp();
	}

}
