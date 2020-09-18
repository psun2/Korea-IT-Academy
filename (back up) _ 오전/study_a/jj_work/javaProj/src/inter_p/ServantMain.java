package inter_p;

interface PaPa{
	
	void play(String title);
	void look();
}
interface Teacher{
	void teaching(String title);
	void homework();
	void look();
}

interface Husband{
	void missionComplete(int money);
	void play(String title);
}


class Servant implements PaPa,Teacher,Husband{
	
	String name;
	
	

	public Servant(String name) {
		super();
		this.name = name;
	}

	@Override
	public void missionComplete(int money) {
		System.out.println(name+" "+money+" µ∑ π˙æÓø‰");
		
	}

	@Override
	public void teaching(String title) {
		System.out.println(name+" "+title+" ∞°∏£√ƒø‰");
	}

	@Override
	public void homework() {
		System.out.println(name+" º˜¡¶ ≥ªø‰");
	}

	@Override
	public void play(String title) {
		System.out.println(name+" "+title+" ≥Óæ∆ø‰");
	}

	@Override
	public void look() {
		System.out.println(name+" ªÛ¥„«ÿø‰");
	}
	
}

public class ServantMain {

	public static void main(String[] args) {
		Servant s1 = new Servant("¿ÃπŒ±‘");
		Servant s2 = new Servant("±Ë√µ¿«");
		
		PaPa pp;
		Teacher tt;
		Husband hh;
		
		pp = s1;
		pp.play("¿∑≥Ó¿Ã");
		pp.look();
		pp = s2;
		pp.play("¥Ÿ¿Ãæ∆∏ÛµÂ ∞‘¿”");
		
		tt = s1;
		tt.teaching("¿Œ≈Õ∆‰¿ÃΩ∫");
		tt.homework();
		tt.look();
		
		hh = s2;
		hh.play("π˜Ω∫∫ø");
		hh.missionComplete(300);
		
	}

}
