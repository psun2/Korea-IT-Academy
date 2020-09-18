package inter_p;

interface PaPa{
	
	void play(String title);
	void look();
}
interface Teacher{
	void teaching(String title);
	void homework();
	void look();
}

interface Husband{
	void missionComplete(int money);
	void play(String title);
}


class Servant implements PaPa,Teacher,Husband{
	
	String name;
	
	

	public Servant(String name) {
		super();
		this.name = name;
	}

	@Override
	public void missionComplete(int money) {
		System.out.println(name+" "+money+" �� �����");
		
	}

	@Override
	public void teaching(String title) {
		System.out.println(name+" "+title+" �����Ŀ�");
	}

	@Override
	public void homework() {
		System.out.println(name+" ���� ����");
	}

	@Override
	public void play(String title) {
		System.out.println(name+" "+title+" ��ƿ�");
	}

	@Override
	public void look() {
		System.out.println(name+" ����ؿ�");
	}
	
}

public class ServantMain {

	public static void main(String[] args) {
		Servant s1 = new Servant("�̹α�");
		Servant s2 = new Servant("��õ��");
		
		PaPa pp;
		Teacher tt;
		Husband hh;
		
		pp = s1;
		pp.play("������");
		pp.look();
		pp = s2;
		pp.play("���̾Ƹ�� ����");
		
		tt = s1;
		tt.teaching("�������̽�");
		tt.homework();
		tt.look();
		
		hh = s2;
		hh.play("������");
		hh.missionComplete(300);
		
	}

}
