package dynamic_p;


class OverrCar{
	
	String name = "자동차";
	
	String wheel = "고무바퀴";
	
	void go() {
		System.out.println(name+" "+wheel+" 달려요");
	}
}

class OVerrTank extends OverrCar{
	public OVerrTank() {
		name = "탱크";
	}
	String wheel = "무한궤도";
	void go() {
		System.out.println(name+" "+wheel+" 달려요");
	}
}

class OVerrAir extends OverrCar{
	public OVerrAir() {
		name = "비행기";
	}
	
	void go() {
		System.out.println(name+" "+wheel+" 날아요");
	}
}


class OVerrShape{
	String name ="우헤헤헿헤헤헿";
	double area, border;
	
	void calc() {
		name = "틀린도형";
		area = -1234;
		border = -5678;
	}
	
	void ppp() {
		calc();  //재정의 한 자식 calc()를 호출
		System.out.println(name+":"+area+","+border);
	}
}

class OverRec extends OVerrShape{
	int w, h;
	String name;  //hiding


	OverRec(int w, int h) { //overriding
		
		this.w = w;
		this.h = h;
	}

	void calc() {
		name = "직사각형";
		area = w*h;
		border = (w+h)*2;
	}
}

////원, 직각삼각형도 구현 하세요





public class OverridingCarMain {

	public static void main(String[] args) {
		OverrCar car = new OverrCar();
		OVerrTank tank = new OVerrTank();
		OVerrAir air = new OVerrAir();
		car.go();
		tank.go();
		air.go();
		
		OVerrShape sh = new OVerrShape();
		sh.ppp();
		
		OverRec rec = new OverRec(5, 6);
		rec.ppp();

	}
	
	/*
	 * 부모 클래스 - 일반학생(국영수)
	 * 
	 * 자식 클래스 - 예체능 (국영수예), 교환학생(국영수 외국어)

	 * 총점/ 평균 출력
	 * 
	 * 
	 * */
	
	
	

}
