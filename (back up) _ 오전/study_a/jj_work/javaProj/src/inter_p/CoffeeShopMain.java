package inter_p;

interface Kitchen{
	void wash(int dish);
}

interface Counter{
	void cash(String menu);
	void hello();
}

interface Hall{
	void hello();
	void serving(String menu);
}

interface Alba extends Kitchen,Counter,Hall{
	
}

class AlbaMenu{
	String menu;
	int price;
	public AlbaMenu(String menu, int price) {
		super();
		this.menu = menu;
		this.price = price;
	}
	
	
}

class AlbaData{
	String name;
	int money;
	int dish;
	AlbaMenu [] menu;
	public AlbaData(String name) {
		super();
		this.name = name;
	}
	
	void menuCalc(String menu) {
		for (AlbaMenu am : this.menu) {
			if(menu.equals(am.menu)) {
				money+=am.price;
				return;
			}
		}
	}
	
	void ppp() {
		System.out.println( name+":"+money+","+dish);
	}
}

class AlbaGo implements Alba{
	AlbaData tot;
	AlbaData my;
	public AlbaGo(String name,AlbaData tot) {
		this.tot = tot;
		my = new AlbaData(name);
		my.menu = tot.menu;
	}
	@Override
	public void wash(int dish) {
		System.out.println(my.name+ " 설겆이 "+dish+" 해요");
		my.dish+=dish;
		tot.dish+=dish;
	}
	@Override
	public void cash(String menu) {
		System.out.println(my.name+ menu+" 계산해요");
		
		my.menuCalc(menu);
		tot.menuCalc(menu);
		
	}
	@Override
	public void hello() {
		System.out.println(my.name+" 인사해요");
		
	}
	@Override
	public void serving(String menu) {
		System.out.println(my.name+ menu+" 서빙해요");
	}
	
	
	
	
	
}
//식당을 구현해주세요
//카운터 - 계산, 인사
//홀 - 음식나르기, 인사
//주방 - 설겆이
////-> 구현객체 : 알바생

public class CoffeeShopMain {

	public static void main(String[] args) {
		AlbaData hollys = new AlbaData("할리스");
		hollys.menu = new AlbaMenu[] {
				new AlbaMenu("아메리카노", 2000),
				new AlbaMenu("아시아노", 2300),
				new AlbaMenu("아프리카노", 2700)
		};
		AlbaGo go1 = new AlbaGo("정우성", hollys);
		AlbaGo go2 = new AlbaGo("정좌성", hollys);
		AlbaGo go3 = new AlbaGo("정북성", hollys);

		Kitchen kk;
		Counter cc;
		Hall hh;
		kk = go1;
		cc = go2;
		hh = go3;
		
		cc.hello();
		hh.hello();
		cc.cash("아시아노");
		hh.serving("아시아노");
		kk.wash(2);
		
		cc = go1;
		cc.cash("아메리카노");
		
		go1.my.ppp();
		go2.my.ppp();
		go3.my.ppp();
		hollys.ppp();
	}

}
