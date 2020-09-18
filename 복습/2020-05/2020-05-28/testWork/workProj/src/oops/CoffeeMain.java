package oops;

import java.util.Arrays;

class Coffee {
	MakeCoffee cof;
	String kind, output;
	int price, milk, syrub;
	int[] sum;
	boolean wp;

	void init(MakeCoffee cof, String kind) {
		this.cof = cof;
		this.kind = kind;
		this.price = 3000;
		this.output = this.kind + " - " + price;
//		this.cof.kindResult[0][];
//		this.show();
	}

	void init(MakeCoffee cof, String kind, int milk) {
		this.cof = cof;
		this.kind = kind;
		this.price = 3300;
		this.milk = milk;
		this.output = this.kind + " - " + price;
//		this.show();
	}

	void init(MakeCoffee cof, String kind, int milk, int syrub) {
		this.cof = cof;
		this.kind = kind;
		this.price = 3500;
		this.milk = milk;
		this.syrub = syrub;
		this.output = this.kind + " - " + price;
//		this.show();
	}

	void init(MakeCoffee cof, String kind, int milk, boolean wp) {
		this.cof = cof;
		this.kind = kind;
		this.price = 3500;
		this.milk = milk;
		this.wp = wp;
		this.output = this.kind + " - " + price;
//		this.show();
	}

	void Calculation(Coffee[] cof) {
		this.sum = new int[4];
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < cof.length; j++) {
				if (this.cof.kind[i] == cof[j].kind)
					sum[i] += cof[j].price;
			}
		}
	}

	void show() {
		System.out.println(this.output);
		for (int i = 0; i < this.sum.length; i++) {
			String result = this.cof.kindCnt[i] + "잔\t";
		}
	}
}

class MakeCoffee {
	String[] kind = { "아메리카노", "카페라떼", "카라멜마끼아또", "카페모카" };
	int[] kindCnt = new int[kind.length];
//	Coffee[][] kindResult = new Coffee[kind.length][];

	Coffee create(String kind) {
		Coffee result = new Coffee();
		result.init(this, kind);
		for (int i = 0; i < this.kind.length; i++) {
			if (kind == this.kind[i])
				this.kindCnt[i]++;
		}
		return result;
	}

	Coffee create(String kind, int milk) {
		Coffee result = new Coffee();
		result.init(this, kind, milk);
		for (int i = 0; i < this.kind.length; i++) {
			if (kind == this.kind[i])
				this.kindCnt[i]++;
		}
		return result;

	}

	Coffee create(String kind, int milk, int syrub) {
		Coffee result = new Coffee();
		result.init(this, kind, milk, syrub);
		for (int i = 0; i < this.kind.length; i++) {
			if (kind == this.kind[i])
				this.kindCnt[i]++;
		}
		return result;
	}

	Coffee create(String kind, int milk, boolean wp) {
		Coffee result = new Coffee();
		result.init(this, kind, milk, wp);
		for (int i = 0; i < this.kind.length; i++) {
			if (kind == this.kind[i])
				this.kindCnt[i]++;
		}
		return result;
	}

//	void kindResultSet() {
//		for (int i = 0; i < kindCnt.length; i++) {
//			this.kindResult = new Coffee[i][kindCnt[i]];
//		}
//	}
}

public class CoffeeMain {

	public static void main(String[] args) {

//		커피를 주문하세요

//		아메리카노(커피종류) - 3000
//		카페라떼(커피종류, 우유량) - 3300
//		카라멜마끼아또(커피종류, 우유량, 카레멜 시럽) - 3500
//		카페모카(커피종류, 우유량, 휘핑있음 없음) - 3500

		MakeCoffee make = new MakeCoffee();

		Coffee[] coffee = { make.create("아메리카노"), make.create("카페라떼", 300), make.create("카라멜마끼아또", 300, 100),
				make.create("카라멜마끼아또", 300, true), make.create("아메리카노"), make.create("카페라떼", 300),
				make.create("카라멜마끼아또", 300, 100), make.create("카라멜마끼아또", 300, true), };

		for (Coffee cof : coffee) {
			cof.Calculation(coffee);
		}

		for (Coffee cof : coffee) {
			System.out.println(Arrays.toString(cof.sum));
		}

		for (int i = 0; i < make.kindCnt.length; i++) {
			String temp = "";
			for (int j = 0; j < coffee.length; j++) {
				if (temp != coffee[j].kind) {
					System.out.println(make.kindCnt[i] * coffee[j].price);
					temp = make.kind[i];
				}
			}
		}
	}

}
