package oops_p_05_21;

class ConstructorCar {
	String kind, name, cargo; // kind and name
	int fuel;
	double sum;
	double[] category;

	ConstructorCar(String name, double... category) { // 스포츠카, 승합차
		this.kind = new String[] { "스포츠카", "승합차" }[category.length - 2];
		this.name = name;
		this.category = category;
		calc();
		show();
	}

	ConstructorCar(String name, String cargo, double... category) { // 트럭
		this.kind = "트럭";
		this.name = name;
		this.category = category;
		this.cargo = cargo;
		calc();
		show();
	}

	void calc() {
		if (this.category.length == 2) {
			if (this.kind.equals("스포츠카")) {
				for (int i = 0; i < category.length; i++) {
					sum += (category[i] * new double[] { 0.4, 0.5 }[i]);
				}
			} else {
				for (int i = 0; i < category.length; i++) {
					sum += (category[i] * new double[] { 0.5, 0.5 }[i]);
				}
			}
		} else {
			for (int i = 0; i < category.length; i++) {
				sum += (category[i] * new double[] { 0.3, 0.3, 0.4 }[i]);
			}
		}
	}

	void show() {
		String result = this.kind + "\t" + this.name + "\t";

		for (double i : category) {
			result += i + "\t";
		}

		if (this.kind.equals("스포츠카"))
			result += "\t";

		if (this.kind.equals("트럭"))
			result += cargo + "\t";

		result += sum;

		System.out.println(result);
	}

}

public class ConstructorCarMain {

	public static void main(String[] args) {

		// 자동차 성능 테스트 클래스를 구현하세요
		// 출력내용 : 차종, 차이름, 항목들, 점수

		// 차종 : 스포츠카 -- 속도 60, 연비 40 // 나와있는 점수가 %입니다.
		// 승합차 -- 연비 30, 탑승인원 30, 안정성 40
		// 트럭 -- 연비 50, 적재량 50, 화물종류
		// 98 * 0.6 + 89*0.4 = 점수

		// 생성자를 이용하여 익명 클래스로 구현하세요

		new ConstructorCar("양카", 60, 40);
		new ConstructorCar("멕라렌", 30, 30, 40);
		new ConstructorCar("박스터", "박스", 50, 50);

//		스포츠카	양카		60.0	40.0			44.0
//		승합차	멕라렌	30.0	30.0	40.0	34.0
//		트럭		박스터	50.0	50.0	박스		50.0

	}

}