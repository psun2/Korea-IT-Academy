package oops_p;
////컴퓨터를 조립하세요
// 태블릿 - 본체(이름,가격)
// 노트북 - 본체(이름,가격), 마우스(이름,가격)
// 데스크탑 - 본체(이름,가격), 마우스(이름,가격), 키보드(이름,가격)
///  컴퓨터 - 제품명, 가격 , 부품 등에 대한 정보가 보일 것


//------------------------------------------------------------------------------------------------------ 
/////// 종류를 구분하세요
/// 마우스 - 무선/유선, 게이밍/일반
/// 키보드 - 기계식/전자식, 무선/유선, led/페인팅
//// 클래스로 입력받고, 클래스를 출력할 것
///  컴퓨터 - 제품명, 가격 , 제원 등에 대한 정보가 보일 것

class OverBonchae{
	String name;
	int price;
	
	OverBonchae(){
		
	}
	
	OverBonchae(String name,int price){
		this.name = name;
		this.price = price;
	}
	
	String ppp() {
		return "본체: ["+name+","+price+"]";
	}
}
class OverKeyboard{
	String type, wire, str;
	//기계식/전자식, 무선/유선, led/페인팅
	int price;
	
	String ppp() {
		return "키보드: ["+type+","+wire+","+str+","+price+"]";
	}
	
}
class OverMouse{
	String wire, use;
	//무선/유선, 게이밍/일반
	int price;
	String ppp() {
		return "마우스: ["+wire+","+use+","+price+"]";
	}
}

class OverComputer{
	
	String name;
	OverBonchae bc;
	OverKeyboard kb;
	OverMouse ms;
	int price;
	
	void init(OverBonchae bc) {
		name = "태블릿";
		this.bc = bc;
		price = bc.price;
	}
	void init(OverBonchae bc, OverMouse ms) {
		name = "노트북";
		this.bc = bc;
		this.ms = ms;
		price = bc.price+ms.price;
	}
	void init(OverBonchae bc, OverKeyboard kb, OverMouse ms) {
		name = "데스크탑";
		this.bc = bc;
		this.kb = kb;
		this.ms = ms;
		price = bc.price+kb.price+ms.price;
	}
	
	void ppp() {
		String ttt = name+"\t"+bc.ppp();
		if(kb!=null)
			ttt+="\t"+kb.ppp();
		if(ms!=null)
			ttt+="\t"+ms.ppp();
		
		System.out.println(ttt+"\t"+price);
		
	}
	
	
}

class OverYongsan{
	OverBonchae makeBC(String name,int price) {
		OverBonchae res = new OverBonchae();
		res.name = name;
		res.price = price;
		return res;
	}
	OverKeyboard makeKB(String type,String wire,String str,int price) {
		OverKeyboard res = new OverKeyboard();
		res.type = type;
		res.wire = wire;
		res.str = str;
		res.price = price;
		return res;
	}
	OverMouse makeMS(String wire,String use,int price) {
		OverMouse res = new OverMouse();
		res.wire  = wire;
		res.use = use;
		res.price = price;
		return res;
	}
	OverBonchae makeBC() {
		OverBonchae res = new OverBonchae();
		
		return res;
	}
	
	OverComputer mkCom(OverBonchae bc) {
		OverComputer res = new OverComputer();
		res.init(bc);
		return res;
	}
	OverComputer mkCom(OverBonchae bc, OverMouse ms) {
		OverComputer res = new OverComputer();
		res.init(bc, ms);
		return res;
	}
	OverComputer mkCom(OverBonchae bc, OverKeyboard kb, OverMouse ms) {
		OverComputer res = new OverComputer();
		res.init(bc, kb, ms);
		return res;
	}
	
	
}

public class OverComputerMain {

	public static void main(String[] args) {
		OverYongsan oy = new OverYongsan();
		
		OverBonchae [] bc = {
				oy.makeBC("샘쏭", 500000),
				oy.makeBC("레노버", 300000),
				oy.makeBC("현주", 200000),
				new OverBonchae("아이패드", 1600000)
		};
		OverKeyboard [] kb = {
				oy.makeKB("기계식", "무선", "led", 120000),
				oy.makeKB("전자식", "유선", "페인팅",8000)
		};
		OverMouse [] ms = {
				oy.makeMS("무선", "일반",20000),
				oy.makeMS("유선", "게이밍",56000)
		};
		
		
		OverComputer [] com = {
			oy.mkCom(bc[0]),
			oy.mkCom(bc[0],ms[1]),
			oy.mkCom(bc[1],kb[1],ms[0]),
			oy.mkCom(bc[0],kb[0],ms[1]),
			oy.mkCom(bc[3]),
		};
		
		for (OverComputer overComputer : com) {
			overComputer.ppp();
		}
	}

}
