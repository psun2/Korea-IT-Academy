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
		System.out.println(phone.name+" �뷡 ���");
	}
}

class Camera implements PhoneGo{
	@Override
	public void exec(HandPhone phone) {
		System.out.println(phone.name+" ���� ���");
	}
}

class Call implements PhoneGo{
	@Override
	public void exec(HandPhone phone) {
		System.out.println(phone.name+" ��ȭ");
	}
}

class Game implements PhoneGo{
	@Override
	public void exec(HandPhone phone) {
		System.out.println(phone.name+" ���� ����");
	}
}

class DDD implements PhoneGo{
	@Override
	public void exec(HandPhone phone) {
		System.out.println("�⺻��");
	}
}


public class HandPhoneClassMain {

	public static void main(String[] args) throws Exception{
		HandPhone hp = new HandPhone("���ϼ�");
		
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
	
	
	
	////// �л����� �����ϴ� �������ε��� �����ϼ���
	
	/// �л����� : �̸�, �ּ�, ����, id, ����, �˹�
	
	/// ���� ���� - ������ ����
//	            - ��������
//	            - �˹ٸ� �ؿ�
//	            - ������ �ؿ�

}
