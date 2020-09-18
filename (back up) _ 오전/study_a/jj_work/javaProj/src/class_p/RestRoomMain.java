package class_p;

class KoreaRestRoom{
	String name;
	
	static private KoreaRestRoom me;
	
	private KoreaRestRoom() {
		System.out.println("화장실 생성");
	}
	
	static KoreaRestRoom getInstance() {
		
		if(me==null)
			me = new KoreaRestRoom();
		
		return me;
	}
	
}

class KoreaStud{
	String name, pos=null;
	KoreaRestRoom rr = KoreaRestRoom.getInstance();
	

	public KoreaStud(String name) {
		super();
		this.name = name;
	}

	void goRestRoom() {
		String ttt = name+" 화장실 가고 싶어요";
		if(rr.name==null) {
			rr.name = name;
			ttt+= "-> 화장실 입장";
			pos = "화장실";
		}else {
			ttt+= "-> 화장실  불가("+rr.name+")";
		}
		
		System.out.println(ttt);
		
	}
	
	void outRestRoom() {
		if(pos!=null && pos.equals("화장실")) {
			System.out.println(name+" 화장실 나왔어요");
			rr.name=null;
			pos=null;
		}
	}
}

public class RestRoomMain {

	public static void main(String[] args) {
		KoreaStud ks1= new KoreaStud("허하영");
		KoreaStud ks2= new KoreaStud("이성웅");
		KoreaStud ks3= new KoreaStud("박현");
		
		ks1.goRestRoom();
		ks2.goRestRoom();
		ks1.outRestRoom();
		ks2.outRestRoom();
		ks3.goRestRoom();
		ks3.outRestRoom();

	}
	
	
	////음식점 자리를 구현하세요
	
	
	/// 음식점 자리 4인석 - 2개 ,6인석 - 1개, 2인석 -3개
	
	/// 일행은  자리가 남을 경우 같이 앉을 수 있다
	/// 일행의 인원수 보다 작은 자리는 일행이 앉을 수 없다
	
	/// 빈자리에만 앉을 수 있다.
	
	
	

}
