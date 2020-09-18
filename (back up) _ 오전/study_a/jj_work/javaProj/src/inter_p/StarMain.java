package inter_p;
/*/스타크래프트를 구현하세요
				
				scv-4 기를 이용하여 작업
				
				커맨드센터:미네랄 400
				
				팩토리:미네랄 200,가스 100
				
				스타포트:미네랄 150,가스 100
				
				scv 1 회 획득량 미네랄:8,가스:8
				
				커맨드 센터 --2 짓기
				
				스타포트-1 짓기 1  수리
				
				팩토리-2 짓기
				
				미네랄-500
				
				탱크-2대 수리
				
				탱크 타기 -3
				
				저그 공격 : 5마리
				
				고쳐주세요
				
				
				각 작업간 log 기록을 남기고
				
				각 scv 의 작업결과와 전체 상황 log를 기록하세요*/

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

	DataIndex [] resource = {new DataIndex("목재"),new DataIndex("탄약")};
	DataIndex [] build = {
			new DataIndex("사령부",400,0),
			new DataIndex("공장",200,100),
			new DataIndex("공항",150,100)
		};
	
	DataIndex [] unit = {
			new DataIndex("탱크"),
			new DataIndex("비행기")
		};
	int attack = 0;
	
	DataIndex [][] arr = {resource, build, unit};
	
	void addCnt(int kind,String name,    int type,     int cnt) {
				//종류,                (build,cnt)/repair, 갯수
		
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
				if(res) { //자원이 있다면
					for (int i = 0; i < resource.length; i++) {
						
						//짓는 필요 자원 만큼 까기
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
		String [] index = {"물자","건물","유닛"};
		for (int i = 0; i < index.length; i++) {
			System.out.println("["+index[i]+"]");
			for (DataIndex dd : arr[i]) {
				System.out.println(dd.ppp());
			}
			
		}
		System.out.println("공격:"+attack);	
		
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
		
		System.out.println(tot.name+" "+my.name+" "+name + " "+cnt+" 가져와요");
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
			System.out.println(tot.name+" "+my.name+" "+name + " 지어요");
		}else {
			System.out.println(tot.name+" "+my.name+" "+name + " 자원부족");
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
		System.out.println(tot.name+" "+my.name+" "+name + " 수리해요");
		
	}

	@Override
	public void ride(String name) {
		System.out.println(tot.name+" "+my.name+" "+name + " 타요");
	}

	@Override
	public void attack(String name) {
		tot.attack++;
		my.attack++;
		System.out.println(tot.name+" "+my.name+" "+name + " 공격해요");
		
	}
	
}


public class StarMain {
	StarData usa = new StarData("미군");
	//usa.resource[0].cnt = 600;
	//usa.resource[1].cnt = 200;
	SCV [] scvs = {
			new SCV(usa, "공병1"),
			new SCV(usa, "공병2"),
			new SCV(usa, "공병3"),
			new SCV(usa, "공병4")
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
		bb.make("사령부");
		
		scvsGet("목재", 400, scvs[0],scvs[1],scvs[3]);
		bb.make("사령부");
		scvsGet("목재", 300, scvs[0],scvs[1],scvs[2]);
		scvsGet("탄약", 200, scvs[0],scvs[1],scvs[2]);
		bb = scvs[3];
		bb.make("공장");
		scvsGet("목재", 500, scvs[0],scvs[1],scvs[2]);
		
		uu = scvs[1];
		uu.repair("탱크");
		uu = scvs[2];
		uu.repair("탱크");
		uu.ride("비행기");
		bb.repair("공장");
		scvsGet("목재", 400, scvs[0],scvs[1],scvs[3]);
		bb.make("사령부");
		
		scvsGet("목재", 300, scvs[0],scvs[1],scvs[2]);
		scvsGet("탄약", 200, scvs[0],scvs[1],scvs[2]);
		bb=scvs[0];
		bb.make("공장");
		
		ee = scvs[0];
		ee.attack("일본");
		
		
		for (SCV scv : scvs) {
			scv.my.ppp();
		}
		usa.ppp();
	}

	public static void main(String[] args) {
		
		new StarMain();

	}

}
