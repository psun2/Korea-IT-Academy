package inter_p;
/*/��Ÿũ����Ʈ�� �����ϼ���
				
				scv-4 �⸦ �̿��Ͽ� �۾�
				
				Ŀ�ǵ弾��:�̳׶� 400
				
				���丮:�̳׶� 200,���� 100
				
				��Ÿ��Ʈ:�̳׶� 150,���� 100
				
				scv 1 ȸ ȹ�淮 �̳׶�:8,����:8
				
				Ŀ�ǵ� ���� --2 ����
				
				��Ÿ��Ʈ-1 ���� 1  ����
				
				���丮-2 ����
				
				�̳׶�-500
				
				��ũ-2�� ����
				
				��ũ Ÿ�� -3
				
				���� ���� : 5����
				
				�����ּ���
				
				
				�� �۾��� log ����� �����
				
				�� scv �� �۾������ ��ü ��Ȳ log�� ����ϼ���*/

interface Resource{
	boolean get(String name, int limit);
}

interface Build{
	void make(String name);
	void repair(String name);
}

interface Unit{
	void repair(String name);
	void ride(String name);
}

interface Enermy{
	void attack(String name);
}

interface Work extends Resource,Build,Unit,Enermy{}

class DataIndex{
	String name;
	int cnt, repair;
	int [] rr;
	public DataIndex(String name) {
		super();
		this.name = name;
	}
	public DataIndex(String name, int ... rr) {
		super();
		this.name = name;
		this.rr = rr;
	}

	public String ppp() {
		return "[" + name + " : " + cnt +","+ repair + "]";
	}
	
	
}

class StarData{
	String name;

	public StarData(String name) {
		super();
		this.name = name;
	}

	DataIndex [] resource = {new DataIndex("����"),new DataIndex("ź��")};
	DataIndex [] build = {
			new DataIndex("��ɺ�",400,0),
			new DataIndex("����",200,100),
			new DataIndex("����",150,100)
		};
	
	DataIndex [] unit = {
			new DataIndex("��ũ"),
			new DataIndex("�����")
		};
	int attack = 0;
	
	DataIndex [][] arr = {resource, build, unit};
	
	void addCnt(int kind,String name,    int type,     int cnt) {
				//����,                (build,cnt)/repair, ����
		
		DataIndex [] buf = arr[kind];
		
		for (DataIndex data : buf) {
			if(data.name.equals(name)) {
				if(type==0)
					data.cnt+= cnt;
				else
					data.repair+= cnt;
				
				return;
			}
		}
	}
	
	boolean resourceChk(String name) {
		boolean res = true;
		for (DataIndex data : build) {
			if(data.name.equals(name)) {
				
				for (int i = 0; i < resource.length; i++) {
					
					if(resource[i].cnt<data.rr[i]) {
						res = false;
						break;
					}	
				}
				if(res) { //�ڿ��� �ִٸ�
					for (int i = 0; i < resource.length; i++) {
						
						//���� �ʿ� �ڿ� ��ŭ ���
						resource[i].cnt-=data.rr[i];
					}
				}
				break;
			}
		}
		
		
		
		return res;
	}
	
	void ppp() {
		System.out.println(name+">>>");
		String [] index = {"����","�ǹ�","����"};
		for (int i = 0; i < index.length; i++) {
			System.out.println("["+index[i]+"]");
			for (DataIndex dd : arr[i]) {
				System.out.println(dd.ppp());
			}
			
		}
		System.out.println("����:"+attack);	
		
	}
}

class SCV implements Work{
	StarData tot;
	StarData my;

	public SCV(StarData tot, String name) {
		super();
		this.tot = tot;
		my = new StarData(name);
	}

	@Override
	public boolean get(String name, int limit) {
		int cnt = 8;
		tot.addCnt(0,name, 0, cnt);
		my.addCnt(0,name, 0, cnt);
		
		System.out.println(tot.name+" "+my.name+" "+name + " "+cnt+" �����Ϳ�");
		for (DataIndex data : tot.resource) {
			System.out.print(data.ppp()+",");
		}
		System.out.println();
		return indexCnt(tot.resource, name) > limit;
		
	}
	
	int indexCnt(DataIndex [] arr, String name) {
		for (DataIndex data :arr) {
			if(data.name.equals(name)) {
				return data.cnt;
			}
		}
		return 0;
	}

	@Override
	public void make(String name) {
		
		if(tot.resourceChk(name)) {
		
			tot.addCnt(1,name, 0, 1);
			my.addCnt(1,name, 0, 1);
			System.out.println(tot.name+" "+my.name+" "+name + " �����");
		}else {
			System.out.println(tot.name+" "+my.name+" "+name + " �ڿ�����");
		}
	}

	@Override
	public void repair(String name) {
		
		int i = 2;
		for (DataIndex bb : tot.build) {
			if(bb.name.equals(name))
				i=1;
		}
		
		
		tot.addCnt(i,name, 1, 1);
		my.addCnt(i,name, 1, 1);
		System.out.println(tot.name+" "+my.name+" "+name + " �����ؿ�");
		
	}

	@Override
	public void ride(String name) {
		System.out.println(tot.name+" "+my.name+" "+name + " Ÿ��");
	}

	@Override
	public void attack(String name) {
		tot.attack++;
		my.attack++;
		System.out.println(tot.name+" "+my.name+" "+name + " �����ؿ�");
		
	}
	
}


public class StarMain {
	StarData usa = new StarData("�̱�");
	//usa.resource[0].cnt = 600;
	//usa.resource[1].cnt = 200;
	SCV [] scvs = {
			new SCV(usa, "����1"),
			new SCV(usa, "����2"),
			new SCV(usa, "����3"),
			new SCV(usa, "����4")
	};
	
	Resource rr;
	Build bb;
	Unit uu;
	Enermy ee;
	
	void scvsGet(String name, int limit,SCV ... arr) {
		AAA:while(true) {
			for (SCV scv : arr) {
				rr = scv;
				if(rr.get(name, limit))
					break AAA;
			}
		}
	}
	
	public StarMain() {
		
		
		bb = scvs[2];
		bb.make("��ɺ�");
		
		scvsGet("����", 400, scvs[0],scvs[1],scvs[3]);
		bb.make("��ɺ�");
		scvsGet("����", 300, scvs[0],scvs[1],scvs[2]);
		scvsGet("ź��", 200, scvs[0],scvs[1],scvs[2]);
		bb = scvs[3];
		bb.make("����");
		scvsGet("����", 500, scvs[0],scvs[1],scvs[2]);
		
		uu = scvs[1];
		uu.repair("��ũ");
		uu = scvs[2];
		uu.repair("��ũ");
		uu.ride("�����");
		bb.repair("����");
		scvsGet("����", 400, scvs[0],scvs[1],scvs[3]);
		bb.make("��ɺ�");
		
		scvsGet("����", 300, scvs[0],scvs[1],scvs[2]);
		scvsGet("ź��", 200, scvs[0],scvs[1],scvs[2]);
		bb=scvs[0];
		bb.make("����");
		
		ee = scvs[0];
		ee.attack("�Ϻ�");
		
		
		for (SCV scv : scvs) {
			scv.my.ppp();
		}
		usa.ppp();
	}

	public static void main(String[] args) {
		
		new StarMain();

	}

}
