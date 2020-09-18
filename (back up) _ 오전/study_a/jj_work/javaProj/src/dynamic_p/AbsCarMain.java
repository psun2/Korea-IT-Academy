package dynamic_p;
///////////////자동차 기능을 구현하세요


///차종 : 트럭 -> 짐,            
//버스 -> 인원수, 안정성,  
//스포츠카-> 속도          

///차종  
//트럭 ->        짐,     ,짐,              경유
//버스 ->      인원수,     안정성,  ,승차인원,   가스
//스포츠카->    드라이버        ,등수,      휘발유


/// 자동차 주요기능 : 운행(탈거), 결과=정차(), 주유(연료)


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
		System.out.println(name+ pac.ppp()+" 주행(현재:"+fuel+")");
	}
	
	
	void refuel(int fuel) {
		this.fuel+=fuel;
		System.out.println(name +"주유:"+fuel+"("+this.fuel+")");
		
	}
	
	void stop() {
		System.out.println(name+"정차:"+dist);
		
	}
}

class AbsBus extends AbsCar{
	int max;
	int cnt=0;
	AbsBus(int max, int fuel) {
		super("버스", fuel);
		this.max = max;
	}

	@Override
	void go(AbsCarPac pac) {
		if(pac.name!="승객")
		{
			System.out.println(name+ pac.name+" 탑승불가");
			return;
		}
		if(cnt+pac.cnt > max) {
			System.out.println(name+ pac.cnt+" 좌석없음(현재:"+cnt+")");
			return;
		}
		int needs = (cnt+pac.cnt)*pac.distance;
		if(needs> fuel) {
			 System.out.println(name+ needs+" 연료없음(현재:"+fuel+")");
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
		super("트럭", fuel);
		
	}

	@Override
	void go(AbsCarPac pac) {
		if(pac.name!="짐")
		{
			System.out.println(name+ pac.name+" 탑승불가");
			return;
		}
		
		int needs = pac.cnt*pac.distance/50;
		if(needs> fuel) {
			 System.out.println(name+ needs+" 연료없음(현재:"+fuel+")");
				return;
		 }
		 dist += pac.distance;
		 fuel -= needs;
		 ppp(pac);
	}

	

	
	
	
}

class AbsSports extends AbsCar{

	public AbsSports(int fuel) {
		super("스포츠카", fuel);
		// TODO Auto-generated constructor stub
	}

	@Override
	void go(AbsCarPac pac) {
		if(pac.name!="드라이버")
		{
			System.out.println(name+ pac.name+" 탑승불가");
			return;
		}
		
		int needs = 2*pac.distance;
		if(needs> fuel) {
			 System.out.println(name+ needs+" 연료없음(현재:"+fuel+")");
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
		
		bb.go(new AbsCarPac("승객",20,10));
		tt.go(new AbsCarPac("짐",50,20));
		sp.go(new AbsCarPac("드라이버",20));
		bb.go(new AbsCarPac("짐",20,10));
		tt.go(new AbsCarPac("승객",50,20));
		sp.go(new AbsCarPac("짐",20));
		bb.go(new AbsCarPac("승객",20,36));
		bb.go(new AbsCarPac("승객",120,26));
		bb.refuel(5000);
		bb.go(new AbsCarPac("승객",120,26));
		tt.go(new AbsCarPac("짐",50,20));
		sp.go(new AbsCarPac("드라이버",20));
		
		bb.stop();
		tt.stop();
		sp.stop();
		bb.go(new AbsCarPac("승객",20,30));

	}

}
