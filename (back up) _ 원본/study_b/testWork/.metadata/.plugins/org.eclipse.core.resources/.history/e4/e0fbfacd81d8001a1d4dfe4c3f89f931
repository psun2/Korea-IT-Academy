package oops;

enum ZZiGae{
	/// ¹è¿­ -> singleton °³³ä
	KimChi("±èÄ¡Âî°³", 6000), Doenjang("µÈÀåÂî°³",5500), Military("ºÎ´ëÂî°³",7000);
	
	
	////°¢ Ç×¸ñÀ» Å¬·¡½º·Î º½
	//// Å¬·¡½ºÀÇ Á¤ÀÇ
	String name;
	int price;
	
	private ZZiGae(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void ppp() {
		System.out.println(this +":"+name+","+price);
	}
	
}



public class EnumMain {

	public static void main(String[] args) {
		
		
		System.out.println(ZZiGae.KimChi+":"+ZZiGae.KimChi.ordinal());
		System.out.println(ZZiGae.Doenjang+":"+ZZiGae.Doenjang.ordinal());
		System.out.println(ZZiGae.Military+":"+ZZiGae.Military.ordinal());
		
		ZZiGae zg;
		zg = ZZiGae.Doenjang;
		System.out.println("ordinal()--------------------");
		System.out.println(zg);
		System.out.println(zg.ordinal());
		System.out.println("valueOf()--------------------");
		zg = ZZiGae.valueOf("Military");
		System.out.println(zg);
		System.out.println(zg.ordinal());
		
		
		System.out.println("compareTo()--------------------");
		//Doenjang > KimChi : 1
		System.out.println(ZZiGae.Doenjang.compareTo(ZZiGae.KimChi));
		//Doenjang == Doenjang : 0
		System.out.println(ZZiGae.Doenjang.compareTo(ZZiGae.Doenjang));
		//Doenjang < Military : -1
		System.out.println(ZZiGae.Doenjang.compareTo(ZZiGae.Military));
		
		System.out.println("values()--------------------");
		
		for (ZZiGae zz : ZZiGae.values()) {
			System.out.println(zz+":"+zz.name+","+zz.price);
		}
		
		
		ZZiGae.Doenjang.name= "Ã»±¹ÀåÂî°³";
		ZZiGae.Doenjang.price= 8000;
		
		System.out.println("¸â¹ö º¯°æ--------------------");
		
		for (ZZiGae zz : ZZiGae.values()) {
			//System.out.println(zz+":"+zz.name+","+zz.price);
			zz.ppp();
		}
		
		
		
		String orderList = "KimChi,Doenjang,Doenjang,Military,KimChi,Doenjang,KimChi,Military,KimChi";
		
		int tot = 0;
		
		for (String or : orderList.split(",")) {
			tot+= ZZiGae.valueOf(or).price;
		}
		
		System.out.println(tot);
		
	}

}
