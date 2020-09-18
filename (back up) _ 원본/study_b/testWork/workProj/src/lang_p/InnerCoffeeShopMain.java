package lang_p;

import java.util.Random;

class InnerCoffee{
	
	String name;
	
	int price;
	
	int cnt;

	public InnerCoffee(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return name + "(" + price + ")";
	}
	
	
	
	
}


class OuterHO{
	String name;
	
	InnerCoffee [] menu;

	public OuterHO(String name, InnerCoffee[] menu) {
		super();
		this.name = name;
		this.menu = menu;
	}
	
	int coffeeIndex(String coffee) {

		for (int i = 0; i < menu.length; i++) {
			if(menu[i].name.equals(coffee))
				return i;
		}
		
		return -1;
	}
	
	void ppp() {
		System.out.println(name+">>>>>>>>>>");
		for (InnerCoffee ic : menu) {
			System.out.println(ic+"\t"+ic.cnt+"\t"+	ic.cnt*ic.price);
		}
		
	}
	
	
	class InnerBO{
		String name;
		
		int [] cnt = new int[menu.length];

		public InnerBO(String name) {
			super();
			this.name = name;
			
		}
		
		void order(String coffee, int cnt) {
			
			int index = coffeeIndex(coffee);
			
			if(index<0) {
				System.out.println(coffee+" �޴��� �����");
				return;
			}
			menu[index].cnt+=cnt;
			this.cnt[index]+=cnt;
			String ttt = 
					OuterHO.this.name+" "+name+"�� "+
					coffee+":"+cnt+"�ֹ�("+menu[index].price*cnt+")";
			
			System.out.println(ttt);
		}
		
		void ppp() {
			System.out.println("[[["+OuterHO.this.name+" "+name+" ��]]]");
			
			for (int i = 0; i < menu.length; i++) {
			
				System.out.println(menu[i]+"\t"+cnt[i]+"\t"+cnt[i]*menu[i].price);
			}
			
		}
		
		
		
	}
}


public class InnerCoffeeShopMain {

	public static void main(String[] args) {
		
		OuterHO star = new OuterHO("���ٹ�", 
				new InnerCoffee[] {
					new InnerCoffee("�Ƹ޸�ī��",2000),	
					new InnerCoffee("�ƽþƳ�",2300),	
					new InnerCoffee("������ī��",2700)
				});
		
		OuterHO bean = new OuterHO("Ŀ����", 
				new InnerCoffee[] {
						new InnerCoffee("�Ƹ޸�ī��",2100),	
						new InnerCoffee("�ƽþƳ�",2500),	
						new InnerCoffee("������",2200)
				});
				
		OuterHO.InnerBO [] bos = {
				star.new InnerBO("����"),
				star.new InnerBO("����"),
				star.new InnerBO("����"),
				bean.new InnerBO("����"),
				bean.new InnerBO("����"),
				bean.new InnerBO("û����")
		};
		
		String [] title = "������,�Ƹ޸�ī��,�ƽþƳ�,������ī��".split(",");
		
		Random rd = new Random();
		for (int i = 0; i < 20; i++) {
			bos[rd.nextInt(bos.length)].order(
					title[rd.nextInt(title.length)], rd.nextInt(7)+1);
		}
		for (OuterHO.InnerBO bo: bos) {
			bo.ppp();
		}
		
		star.ppp();
		bean.ppp();

	}

}

