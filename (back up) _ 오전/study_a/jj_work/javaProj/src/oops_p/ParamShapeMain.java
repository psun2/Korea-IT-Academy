package oops_p;

class ParamShape{
	
	String name;
	double area, border;
	
	void init(int ... line) {
		name = new String[] {"","원","직사각형","직각삼각형"}[line.length];
		
		switch(line.length) {
			case 1:
				area = 3.14*line[0]*line[0];
				border = 3.14*2*line[0];
				break;
			case 2:
				area = line[0]*line[1];
				border = 2*(line[0]+line[1]);
				break;
			case 3:
				area = line[0]*line[1]/2;
				border = line[0]+line[1]+line[2];
				break;
		}
		
		
	}
	
	void ppp() {
		System.out.println(name+" , "+area+" , "+border);
	}
	
}
public class ParamShapeMain {

	public static void main(String[] args) {
		ParamShape ps = new ParamShape();
		ps.init(5);
		ps.ppp();
		
		ps.init(5,6);
		ps.ppp();
		
		ps.init(5,6,8);
		ps.ppp();
		
		

	////학생클래스를 정의, 선언, 생성, 호출 하여 학생정보를 출력하세요

	 ///  이름,  , 총점, 평균 , 전체등수
		
	// 일반 - 점수 [국어, 영어, 수학]
	// 예체능 - 점수 [국어, 영어, 수학, 예체능]
		
	//1. 구분없이 출력
	//2. 구분하여 출력
		

	}

}
