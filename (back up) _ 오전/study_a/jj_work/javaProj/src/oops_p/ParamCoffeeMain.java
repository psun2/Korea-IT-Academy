package oops_p;

import java.util.Arrays;

/*
까페를 구현하세요

(커피이름, 옵션...) 을 넣어 커피를 리턴해주세요

커피이름 : 
아메리카노 2000  아시아노 2300  아프리카노 2700

아이스 +300  , 휘핑크림 + 400

샷추가 +200 , 사이즈업+1000, 

1. 커피 : 커피이름, 가격

2. 리턴을  커피종류별로 할것

3. 커피종류별 가격합계, 건수 출력할 것
* 
*/



class ParamMenu{
	String name;
	int price , cnt, totPrice;
	
	void init(String name,int price) {
		this.name = name;
		this.price = price;
	}
	
	int use(String name) {
		if(this.name == name) {
			cnt++;
			totPrice+=price;
			return price;
		}
		return 0;
	}
}

class ParamCoffeeShop{
	
	ParamCoffee [] coffee = new ParamCoffee[0];
	
	ParamCoffee [] cateTitle;
	
	ParamCoffee [][] cate;
	
	ParamMenu [] menu;
	
	void init() {
		cateTitle = new ParamCoffee[3]; 
		for (int i = 0; i < cateTitle.length; i++) {
			cateTitle[i] = new ParamCoffee();
		}
		cateTitle[0].name="아메리카노";
		cateTitle[1].name="아시아노";
		cateTitle[2].name="아프리카노";
		cate = new ParamCoffee[cateTitle.length][0];
		
		menu = new ParamMenu[7];
		
		for (int i = 0; i < menu.length; i++) {
			menu[i] = new ParamMenu();
		}
		
		menu[0].init("아메리카노",2000);
		menu[1].init("아시아노", 2300);
		menu[2].init("아프리카노",2700);
		menu[3].init("아이스",300);
		menu[4].init("휘핑크림",400);
		menu[5].init("샷추가",200);
		menu[6].init("사이즈업",1000);
	}
	
	void order(String name, String ...option) {
		ParamCoffee nC = new ParamCoffee();
		nC.init(name, menu, option);
		
		coffee = addCoffee(nC, coffee); 
		
		int no= noSet(name);

		cate[no] = addCoffee(nC, cate[no]);
		cateTitle[no].price += nC.price;
		cateTitle[no].cnt++; 
		
	}
	
	int noSet(String name) {
		
		int res = 0;
		for (int i = 0; i < cateTitle.length; i++) {
			
			if(name.equals(cateTitle[i].name))
			{
				res = i;
				break;
			}
		}
		
		return res;
	}
	
	
	ParamCoffee [] addCoffee(ParamCoffee nC, ParamCoffee [] arr) {
		ParamCoffee [] buf = new ParamCoffee[arr.length+1];
		
		for (int i = 0; i < arr.length; i++) {
			buf[i] = arr[i];
		}
		
		buf[arr.length] = nC;
		return buf;
	}
	
	void ppp(String kind) {
		
		System.out.println("["+kind+"]");
		
		if(kind.equals("전체")) {
			for (ParamCoffee co : coffee) {
				co.ppp();
			}
			return;
		}
		
		for (int i = 0; i < cate.length; i++) {
			
			System.out.println(cateTitle[i].name+">>>>");
			for (ParamCoffee co : cate[i]) {
				co.ppp();
			}
			cateTitle[i].tong();	
		}
		
	}
}

class ParamCoffee{
	String name;
	int price, cnt, totPrice;
	String ttt;
	void init(String name,ParamMenu [] menu, String ...option) {
		this.name = name;
		ttt = Arrays.toString(option);
		
		price+=menuChk(menu, name);
		for (String op : option) {
			
			price+=menuChk(menu, op);
		}

	}
	
	int menuChk(ParamMenu [] menu, String nn) {
		int ret = 0;
		
		for (ParamMenu mm : menu) {
			
			ret+=mm.use(nn);
		}
		
		return ret;
	}
	
	
	void ppp() {
		System.out.println(name+"\t"+ttt+"\t"+price);
	}
	
	void tong() {
		System.out.println(name+"\t"+cnt+"\t"+price);
	}
}



public class ParamCoffeeMain {

	public static void main(String[] args) {
		ParamCoffeeShop shop = new ParamCoffeeShop();
		shop.init();

		shop.order("아프리카노", "사이즈업", "샷추가");
		shop.order("아프리카노", "아이스");
		shop.order("아시아노",  "사이즈업");
		shop.order("아프리카노", "아이스", "샷추가");
		shop.order("아메리카노", "아이스", "사이즈업");
		shop.order("아시아노");
		shop.order("아프리카노", "아이스", "사이즈업", "샷추가");
		shop.order("아메리카노", "사이즈업", "샷추가");
		shop.order("아메리카노", "아이스", "사이즈업", "샷추가","휘핑크림");
		
		shop.ppp("전체");

	}

}
