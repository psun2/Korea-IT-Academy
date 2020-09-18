package dynamic_p;

import java.util.Arrays;

abstract class DyCar{
	String name;
	int res;
	int [] jum ;
	
	
	
	public DyCar(String name, int ... jum) {
	
		this.name = name;
		this.jum = jum;
	}
	//void calc() {}
	
	abstract void calc();
	
	void ppp() {
		
		calc();
		String ttt = name+"\t"+Arrays.toString(jum)+"\t"+res;
		
		System.out.println(ttt);
	}
}

class DySports extends DyCar{
	
	DySports(int speed , int fuel, int design) {
		super("스포츠카",speed , fuel, design);
		
	}
	void calc() {
		double [] rate = {0.5,0.3,0.2};
		
		res = 0;
		
		for (int i = 0; i < rate.length; i++) {
			res += rate[i]*jum[i];
		}
	}
}

class DyTruck extends DyCar{
	
	DyTruck(int fuel, int loadage) {
		super("트럭" , fuel, loadage);
		
	}
	void calc() {
		double [] rate = {0.6,0.4};
		
		res = 0;
		
		for (int i = 0; i < rate.length; i++) {
			res += rate[i]*jum[i];
		}
	}
}

class DyVan extends DyCar{
	
	DyVan(int speed , int fuel, int cnt) {
		super("승합차",speed , fuel, cnt);
		
	}
	void calc() {
		double [] rate = {0.15,0.35,0.5};
		
		res = 0;
		
		for (int i = 0; i < rate.length; i++) {
			res += rate[i]*jum[i];
		}
	}
}



public class DyCarMain {

	public static void main(String[] args) {
		DyCar [] cars = {
				new DySports(60, 90, 91),
				new DyTruck(40, 90),
				new DyVan(60, 90, 91),
				new DySports(90, 60, 51),
				new DyVan(90, 60, 51),
				new DyTruck(70, 50)
				
		};
		
		for (DyCar car : cars) {
			car.ppp();
		}
		
		DyCar ddd = new DyCar("내가만든 자동차",55,66,77) {
			///생성시 현재 인스턴스에서만 사용되는 메소드 재정의
			void calc() {
				res = 1234;
			}
		} ;
		ddd.ppp();

	}

}
