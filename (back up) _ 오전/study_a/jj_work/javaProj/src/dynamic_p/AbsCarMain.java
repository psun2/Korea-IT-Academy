package dynamic_p;
///////////////�ڵ��� ����� �����ϼ���


///���� : Ʈ�� -> ��,            
//���� -> �ο���, ������,  
//������ī-> �ӵ�          

///����  
//Ʈ�� ->        ��,     ,��,              ����
//���� ->      �ο���,     ������,  ,�����ο�,   ����
//������ī->    ����̹�        ,���,      �ֹ���


/// �ڵ��� �ֿ��� : ����(Ż��), ���=����(), ����(����)


class AbsCarPac{
	String name;
	int distance;
	int cnt;
	public AbsCarPac(String name, int distance, int cnt) {
		super();
		this.name = name;
		this.distance = distance;
		this.cnt = cnt;
	}
	public AbsCarPac(String name, int distance) {
		super();
		this.name = name;
		this.distance = distance;
	}
	
	String ppp() {
		return name + ","+ distance + ","+  cnt;
	}
	
	
}

abstract class AbsCar{
	
	String name;
	int fuel;
	int dist=0;
	
	

	public AbsCar(String name, int fuel) {
		
		this.name = name;
		this.fuel = fuel;
	}

	abstract void go(AbsCarPac pac);
	
	void ppp(AbsCarPac pac) {
		System.out.println(name+ pac.ppp()+" ����(����:"+fuel+")");
	}
	
	
	void refuel(int fuel) {
		this.fuel+=fuel;
		System.out.println(name +"����:"+fuel+"("+this.fuel+")");
		
	}
	
	void stop() {
		System.out.println(name+"����:"+dist);
		
	}
}

class AbsBus extends AbsCar{
	int max;
	int cnt=0;
	AbsBus(int max, int fuel) {
		super("����", fuel);
		this.max = max;
	}

	@Override
	void go(AbsCarPac pac) {
		if(pac.name!="�°�")
		{
			System.out.println(name+ pac.name+" ž�ºҰ�");
			return;
		}
		if(cnt+pac.cnt > max) {
			System.out.println(name+ pac.cnt+" �¼�����(����:"+cnt+")");
			return;
		}
		int needs = (cnt+pac.cnt)*pac.distance;
		if(needs> fuel) {
			 System.out.println(name+ needs+" �������(����:"+fuel+")");
				return;
		 }
		 cnt += pac.cnt;
		 dist += pac.distance;
		 fuel -= needs;
		 
		 ppp(pac);
	}

	

	@Override
	void stop() {
		cnt=0;
		super.stop();
		
	}
	
}

class AbsTruck extends AbsCar{

	public AbsTruck(int fuel) {
		super("Ʈ��", fuel);
		
	}

	@Override
	void go(AbsCarPac pac) {
		if(pac.name!="��")
		{
			System.out.println(name+ pac.name+" ž�ºҰ�");
			return;
		}
		
		int needs = pac.cnt*pac.distance/50;
		if(needs> fuel) {
			 System.out.println(name+ needs+" �������(����:"+fuel+")");
				return;
		 }
		 dist += pac.distance;
		 fuel -= needs;
		 ppp(pac);
	}

	

	
	
	
}

class AbsSports extends AbsCar{

	public AbsSports(int fuel) {
		super("������ī", fuel);
		// TODO Auto-generated constructor stub
	}

	@Override
	void go(AbsCarPac pac) {
		if(pac.name!="����̹�")
		{
			System.out.println(name+ pac.name+" ž�ºҰ�");
			return;
		}
		
		int needs = 2*pac.distance;
		if(needs> fuel) {
			 System.out.println(name+ needs+" �������(����:"+fuel+")");
				return;
		 }
		 dist += pac.distance;
		 fuel -= needs;
		 ppp(pac);
	}

	

	
	
}


public class AbsCarMain {

	public static void main(String[] args) {
		AbsCar bb = new AbsBus(45, 1000);
		AbsCar tt = new AbsTruck(100);
		AbsCar sp = new AbsSports(100);
		
		bb.go(new AbsCarPac("�°�",20,10));
		tt.go(new AbsCarPac("��",50,20));
		sp.go(new AbsCarPac("����̹�",20));
		bb.go(new AbsCarPac("��",20,10));
		tt.go(new AbsCarPac("�°�",50,20));
		sp.go(new AbsCarPac("��",20));
		bb.go(new AbsCarPac("�°�",20,36));
		bb.go(new AbsCarPac("�°�",120,26));
		bb.refuel(5000);
		bb.go(new AbsCarPac("�°�",120,26));
		tt.go(new AbsCarPac("��",50,20));
		sp.go(new AbsCarPac("����̹�",20));
		
		bb.stop();
		tt.stop();
		sp.stop();
		bb.go(new AbsCarPac("�°�",20,30));

	}

}
