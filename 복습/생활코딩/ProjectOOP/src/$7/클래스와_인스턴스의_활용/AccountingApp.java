package $7.클래스와_인스턴스의_활용;

class Accounting {
	// 공급가액
	public static double valueOfSupply;
	// 부가가치세율
	public static double vatRate = 0.1;

	public static double getVAT() { // 부가가치세 계산
		return valueOfSupply * vatRate;
	}

	public static double getTotal() { // 공급가액 + 부가세
		return valueOfSupply + getVAT();
	}
}

public class AccountingApp {

	public static void main(String[] args) {

		// 인스턴스가 필요 없을시 static 키워드를 통해 클래스 소속의 메소드, 변수로 만들어 줍니다.
		// 마치 Math.PI 또는 Math.pow 와 같이 씁니다.

		// 또한 인스턴스 를 생성하고 각자의 고유한 value를 줄 경우 static 키워드를 사용하여 공유되지 않도록 합니다.

		Accounting.valueOfSupply = 10000.0;
		System.out.println("Value of supply : " + Accounting.valueOfSupply);
		System.out.println("VAT : " + Accounting.getVAT());
		System.out.println("Total : " + Accounting.getTotal());
	}

}
