package dynamic_p;
class PCPar{
	PcChild cc = new PcChild();
	
	public PCPar() {
		System.out.println("�θ� ������");
	}
}

class PcChild extends PCPar{
	public PcChild() {
		System.out.println("�ڽ� ������");
	}
}
public class ParChildParChild {

	public static void main(String[] args) {
		PCPar pp = new PCPar();

	}

}
