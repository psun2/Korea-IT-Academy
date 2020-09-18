package dynamic_p;
class PCPar{
	PcChild cc = new PcChild();
	
	public PCPar() {
		System.out.println("何葛 积己磊");
	}
}

class PcChild extends PCPar{
	public PcChild() {
		System.out.println("磊侥 积己磊");
	}
}
public class ParChildParChild {

	public static void main(String[] args) {
		PCPar pp = new PCPar();

	}

}
