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
		System.out.println(my.name+ " ������ "+dish+" �ؿ�");
		my.dish+=dish;
		tot.dish+=dish;
	}
	@Override
	public void cash(String menu) {
		System.out.println(my.name+ menu+" ����ؿ�");
		
		my.menuCalc(menu);
		tot.menuCalc(menu);
		
	}
	@Override
	public void hello() {
		System.out.println(my.name+" �λ��ؿ�");
		
	}
	@Override
	public void serving(String menu) {
		System.out.println(my.name+ menu+" �����ؿ�");
	}
	
	
	
	
	
}
//�Ĵ��� �������ּ���
//ī���� - ���, �λ�
//Ȧ - ���ĳ�����, �λ�
//�ֹ� - ������
////-> ������ü : �˹ٻ�

public class CoffeeShopMain {

	public static void main(String[] args) {
		AlbaData hollys = new AlbaData("�Ҹ���");
		hollys.menu = new AlbaMenu[] {
				new AlbaMenu("�Ƹ޸�ī��", 2000),
				new AlbaMenu("�ƽþƳ�", 2300),
				new AlbaMenu("������ī��", 2700)
		};
		AlbaGo go1 = new AlbaGo("���켺", hollys);
		AlbaGo go2 = new AlbaGo("���¼�", hollys);
		AlbaGo go3 = new AlbaGo("���ϼ�", hollys);

		Kitchen kk;
		Counter cc;
		Hall hh;
		kk = go1;
		cc = go2;
		hh = go3;
		
		cc.hello();
		hh.hello();
		cc.cash("�ƽþƳ�");
		hh.serving("�ƽþƳ�");
		kk.wash(2);
		
		cc = go1;
		cc.cash("�Ƹ޸�ī��");
		
		go1.my.ppp();
		go2.my.ppp();
		go3.my.ppp();
		hollys.ppp();
	}

}
