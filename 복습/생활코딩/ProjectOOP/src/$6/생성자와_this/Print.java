package $6.생성자와_this;

class Print {

	public String delmiter = "";

	public Print(String delmiter) {
		this.delmiter = delmiter;
		// this 는 그 클래스가 인스턴스 화 되었을때 그 인스턴스를 가르키는 특수한 키워드 입니다.
	}

	public void A() {
		System.out.println(this.delmiter);
		System.out.println("A");
		System.out.println("A");
	}

	public void B() {
		System.out.println(this.delmiter);
		System.out.println("B");
		System.out.println("B");
	}

}
