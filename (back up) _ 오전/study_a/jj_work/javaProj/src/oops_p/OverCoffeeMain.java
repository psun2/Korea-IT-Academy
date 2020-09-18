package oops_p;

import java.util.Arrays;

/*
커피를 주문하세요

아메리카노(커피종류)  - 3000
카페라떼(커피종류, 우유량) - 3300
카라멜마끼아또(커피종류, 우유량, 카레멜 시럽) - 3500
카페모카(커피종류, 우유량, 휘핑있음없음) - 3500
*/

class CoffeePr{
	String name;
	int price;
	
	void init(String name,int price) {
		this.name = name;
		this.price = price;
	}
	
	int pp(String name) {
		int res = 0;
		
		if(name.equals(this.name))
			res = price;
		
		return res;
	}
}

class OverShop{
	
	
	void order(String name) {
		
		newCoffee("아메리카노",name);
	}
	
	void order(String name, int milk) {
			
			newCoffee("카페라떼",name, milk+"");
		}
	
	void order(String name, int milk, int syrup) {
		
		newCoffee("카라멜마끼아또",name, milk+"", syrup+"");
	}
	
	void order(String name, int milk, boolean cream) {
		
		newCoffee("카페모카",name, milk+"", cream+"");
	}
	
	void newCoffee(String name, String ... arr) {
		OverCoffee oc =new OverCoffee();
		oc.init(name, arr);
		oc.ppp();
	}
}


class OverCoffee{
	String name;
	String [] ttt;
	int price;
	
	void init(String name,String ...ttt) {
		
		CoffeePr [] cp = new CoffeePr[4];
		
		for (int i = 0; i < cp.length; i++) {
			cp[i] = new CoffeePr();
		}
		cp[0].init("아메리카노",3000);
		cp[1].init("카페라떼",3300);
		cp[2].init("카라멜마끼아또",3500);
		cp[3].init("카페모카",3500);
		
		this.name = name;
		this.ttt = ttt;
		
		for (CoffeePr coffeePr : cp) {
			price += coffeePr.pp(name);
		}	
	}
	
	void ppp() {
		System.out.println(name+"\t"+Arrays.toString(ttt)+"\t"+price);
	}
	
}

public class OverCoffeeMain {

	public static void main(String[] args) {
		
		OverShop os = new OverShop();
		
		os.order("블루마운틴", 100);
		os.order("레드마운틴");
		os.order("블루마운틴",200);
		os.order("블루씨",100,50);
		os.order("블루마운틴",100,false);
		

	}

}
