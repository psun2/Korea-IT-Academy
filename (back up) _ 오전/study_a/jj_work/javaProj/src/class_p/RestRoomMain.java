package class_p;

class KoreaRestRoom{
	String name;
	
	static private KoreaRestRoom me;
	
	private KoreaRestRoom() {
		System.out.println("ȭ��� ����");
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
		String ttt = name+" ȭ��� ���� �;��";
		if(rr.name==null) {
			rr.name = name;
			ttt+= "-> ȭ��� ����";
			pos = "ȭ���";
		}else {
			ttt+= "-> ȭ���  �Ұ�("+rr.name+")";
		}
		
		System.out.println(ttt);
		
	}
	
	void outRestRoom() {
		if(pos!=null && pos.equals("ȭ���")) {
			System.out.println(name+" ȭ��� ���Ծ��");
			rr.name=null;
			pos=null;
		}
	}
}

public class RestRoomMain {

	public static void main(String[] args) {
		KoreaStud ks1= new KoreaStud("���Ͽ�");
		KoreaStud ks2= new KoreaStud("�̼���");
		KoreaStud ks3= new KoreaStud("����");
		
		ks1.goRestRoom();
		ks2.goRestRoom();
		ks1.outRestRoom();
		ks2.outRestRoom();
		ks3.goRestRoom();
		ks3.outRestRoom();

	}
	
	
	////������ �ڸ��� �����ϼ���
	
	
	/// ������ �ڸ� 4�μ� - 2�� ,6�μ� - 1��, 2�μ� -3��
	
	/// ������  �ڸ��� ���� ��� ���� ���� �� �ִ�
	/// ������ �ο��� ���� ���� �ڸ��� ������ ���� �� ����
	
	/// ���ڸ����� ���� �� �ִ�.
	
	
	

}
