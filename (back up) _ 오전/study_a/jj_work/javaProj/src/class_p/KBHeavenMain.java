package class_p;

class KBSeat{
	
	int tot;
	int now;
	

	public KBSeat(int tot) {
		super();
		this.tot = tot;
		
		now = 0;
	}



	boolean sitDown(KBGuest guest) {
		boolean res = false;
		
		if(res=tot-now>=guest.cnt) {
			now+=guest.cnt;
		}
		
		return res;
	}
	
	void standUp(KBGuest guest) {

		now-=guest.cnt;
	}



	@Override
	public String toString() {
		return now + "/" + tot;
	}
	
	
}


class KBHeaven{
	
	private static KBHeaven me;
	
	KBSeat [] seats;
	
	private KBHeaven() {
		seats = new KBSeat[] {
				new KBSeat(2),
				new KBSeat(2),
				new KBSeat(2),
				new KBSeat(4),
				new KBSeat(4),
				new KBSeat(6)
				
		};
	}
	
	static KBHeaven getInstance() {
		if(me ==null)
			me = new KBHeaven();
		
		return me;
	}
	void getTable(KBGuest guest) {
		System.out.println(guest.name+" �ڸ� ��û:"+ guest.cnt);
		if(guest.pos>=0) {
			System.out.println(guest.name+" �ڸ� �ñ� ������:"+guest.pos);
		}
		for (int i = 0; i < seats.length; i++) {
			if(seats[i].sitDown(guest)) {
				guest.pos = i;
				System.out.println(guest.name+" "+i+" ���� :"+ guest.cnt);
				System.out.println("\t �ڸ� :"+ seats[i]);
				break;
			}
		}
		if(guest.pos<0) {
			System.out.println(guest.name+"�ڸ������");
		}
	}
	
	void getOut(KBGuest guest) {
		System.out.println(guest.name+"�Ļ糡:"+ guest.cnt);
		seats[guest.pos].standUp(guest);
		
		System.out.println("\t "+guest.pos+" �ڸ� :"+ seats[guest.pos]);
		guest.pos = -1;
	}
	
}

class KBGuest{
	String name;
	int cnt;
	int pos; //-1 �ڸ�����
	public KBGuest(String name, int cnt) {
		super();
		this.name = name;
		this.cnt = cnt;
		pos=-1;
	}
	
	void finish() {
		if(pos<0) {
			System.out.println(name+" �׳� ����?");
			return;
		}
		KBHeaven.getInstance().getOut(this);
		
	}
	
	
}

public class KBHeavenMain {

	public static void main(String[] args) {
		KBHeaven kh = KBHeaven.getInstance();
		
		KBGuest gu1 = new KBGuest("������", 3);
		KBGuest gu2 = new KBGuest("��ȣ��", 7);
		KBGuest gu3 = new KBGuest("�Ƚ���", 1);
		KBGuest gu4 = new KBGuest("�̽���", 4);
		KBGuest gu5 = new KBGuest("�ڼ���", 5);
		KBGuest gu6 = new KBGuest("����ȣ", 2);
		KBGuest gu7 = new KBGuest("�����", 1);
		KBGuest gu8 = new KBGuest("�۵���", 3);
		
		kh.getTable(gu1);
		kh.getTable(gu2);
		kh.getTable(gu3);
		kh.getTable(gu4);
		kh.getTable(gu5);
		gu2.finish();
		gu1.finish();
		kh.getTable(gu6);
		kh.getTable(gu8);
		kh.getTable(gu4);
		gu8.finish();
		kh.getTable(gu1);
		
	}

}

