package oops_p;

class StringPri{
	String name;
	int pri;
	
	void init(String name, int pri) {
		this.name = name;
		this.pri = pri;
	}
}

class ReturnCoffee{
	
	String name, cafe;
	int price;
	
	StringPri spMake(String name, int pri) {
		StringPri ret = new StringPri();
		ret.init(name, pri);
		return ret;
	}
	
	int strToInt(String nn) {
		StringPri [] src = {
				spMake("아메리카노",2000),
				spMake("아시아노",2300),
				spMake("아프리카노",2700),
				spMake("아이스",300),
				spMake("핫",0),
				spMake("샷추가",200),
				spMake("사이즈업",1000)
				};
		
		for (StringPri ss : src) {
			if(ss.name == nn)
				return ss.pri;
		}
		
		return 0;
	}
	
	void init(String cafe,String name, String ih, String spec) {
		this.cafe = cafe;
		this.name = name;
		price = strToInt(name)+strToInt(ih)+strToInt(spec);
		//System.out.println(price);
		
	}
	
	void ppp() {
		System.out.println(cafe+"\t"+name+"\t"+price);
	}	
}

class ReturnCafe{
	String name;
	
	ReturnCoffee [] arr = new ReturnCoffee[0];
	
	void addCC(ReturnCoffee cc) {
		ReturnCoffee [] buf = new ReturnCoffee[arr.length+1];
		
		for (int i = 0; i < arr.length; i++) {
			buf[i] = arr[i];
		}
		
		buf[arr.length] = cc;
		arr = buf;
	}
	
	ReturnCoffee makeRC(String name, String ih, String spec) {
		ReturnCoffee ret = new ReturnCoffee();
		
		ret.init(this.name,name, ih, spec);
		addCC(ret);
		return ret;
	}
	
	void ppp() {
		System.out.println(name+">>>");
		for (ReturnCoffee r : arr) {
			r.ppp();
		}
	}
}


public class ReturnCafeMain {

	public static void main(String[] args) {
		
		ReturnCafe rcf = new ReturnCafe();
		rcf.name = "할리스";
		ReturnCafe rcf1 = new ReturnCafe();
		rcf1.name = "까페베네";
		
		rcf.makeRC("아프리카노", "핫", "샷추가");
		rcf1.makeRC("아프리카노", "아이스", "노멀");
		rcf.makeRC("아시아노", "핫", "사이즈업");
		rcf.makeRC("아프리카노", "아이스", "샷추가");
		rcf1.makeRC("아메리카노", "핫", "사이즈업");
		rcf.makeRC("아시아노", "핫", "노멀");
		rcf1.makeRC("아프리카노", "아이스", "사이즈업");
		rcf.makeRC("아메리카노", "핫", "샷추가");
		rcf1.makeRC("아메리카노", "아이스", "노멀");
		
		rcf.ppp();
		rcf1.ppp();
		
//		for (ReturnCoffee r : rcf.arr) {
//			r.ppp();
//		}
		
//		ReturnCoffee cf = new ReturnCoffee();
//		cf.init("아프리카노","핫","샷추가");
//		cf.ppp();
		
//		ReturnCoffee [] arr = {
//				rcf.makeRC("아프리카노", "핫", "샷추가"),
//				rcf.makeRC("아프리카노", "아이스", "노멀"),
//				rcf.makeRC("아시아노", "핫", "사이즈업"),
//				rcf.makeRC("아프리카노", "아이스", "샷추가"),
//				rcf.makeRC("아메리카노", "핫", "사이즈업"),
//				rcf.makeRC("아시아노", "핫", "노멀"),
//				rcf.makeRC("아프리카노", "아이스", "사이즈업"),
//				rcf.makeRC("아메리카노", "핫", "샷추가"),
//				rcf.makeRC("아메리카노", "아이스", "노멀")
//		};
//		
//		for (ReturnCoffee r : arr) {
//			r.ppp();
//		}
	}

}
