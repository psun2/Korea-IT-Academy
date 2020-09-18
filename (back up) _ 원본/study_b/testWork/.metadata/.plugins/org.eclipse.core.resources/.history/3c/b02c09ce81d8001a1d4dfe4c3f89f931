package lang_p;


class HandPhone{
	
	String name;

	public HandPhone(String name) {
		super();
		this.name = name;
	}
	
}

interface PhoneGo{
	
	void exec(HandPhone phone);
}

class Music implements PhoneGo{
	@Override
	public void exec(HandPhone phone) {
		System.out.println(phone.name+" 노래 재생");
	}
}

class Camera implements PhoneGo{
	@Override
	public void exec(HandPhone phone) {
		System.out.println(phone.name+" 사진 찍기");
	}
}

class Call implements PhoneGo{
	@Override
	public void exec(HandPhone phone) {
		System.out.println(phone.name+" 통화");
	}
}

class Game implements PhoneGo{
	@Override
	public void exec(HandPhone phone) {
		System.out.println(phone.name+" 게임 시작");
	}
}

class DDD implements PhoneGo{
	@Override
	public void exec(HandPhone phone) {
		System.out.println("기본값");
	}
}


public class HandPhoneClassMain {

	public static void main(String[] args) throws Exception{
		HandPhone hp = new HandPhone("은하수");
		
		String cmd = "Camera";
		
		PhoneGo go;
		switch(cmd) {
			case "Game":
				go = new Game();
				break;
			case "Camera":
				go = new Camera();
				break;
			case "Call":
				go = new Call();
				break;
			case "Music":
				go = new Music();
				break;
			default :
				go = new DDD();
				break;
		}
		
		go.exec(hp);
		
		String cmd2 = "Music";
		
		((PhoneGo)Class.forName("lang_p."+cmd2).newInstance()).exec(hp);
		
	}
	
	
	
	////// 학생정보 제어하는 동적바인딩을 구현하세요
	
	/// 학생정보 : 이름, 주소, 나이, id, 수업, 알바
	
	/// 구현 내용 - 수업을 들어요
//	            - 집에가요
//	            - 알바를 해요
//	            - 게임을 해요

}
