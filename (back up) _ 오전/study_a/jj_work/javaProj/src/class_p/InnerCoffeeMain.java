package class_p;

enum CoffeeM{
	AMERICANO("아메리카노"),ASIANO("아시아노"),AFRICANO("아프리카노");
	
	String name;

	private CoffeeM(String name) {
		this.name = name;
	}
	
	
	
}

class OutCoffee{
	
	
	private String name;
	
	private int [] price;
	private int [] cnt;

	public OutCoffee(String name, int p1, int p2, int p3) {
		super();
		this.name = name;
		this.price = new int[] {p1,  p2,  p3};
		cnt = new int[price.length];
	}
	
	void ppp() {
		System.out.println("  ["+name+"]");
		for (int i = 0; i < cnt.length; i++) {
			String ttt = CoffeeM.values()[i].name+"("+price[i]+")";
			ttt+=cnt[i]+"_"+price[i]*cnt[i];
			System.out.println(ttt);
		}
	}
	
	class InCoffee{
		private String name;
		private int [] cnt;
		public InCoffee(String name) {
			
			this.name = name;
			cnt = new int[price.length];
		}
		
		void order(String menu) {
			int no = CoffeeM.valueOf(menu).ordinal();
			cnt[no]++;
			OutCoffee.this.cnt[no]++;
			System.out.println(
							OutCoffee.this.name+" "+
							name+" "+menu+" "+
							price[no]+" 주문");
		}
		
		void ppp() {
			System.out.println(OutCoffee.this.name+" "+
					name+" >>>");
			for (int i = 0; i < cnt.length; i++) {
				String ttt = CoffeeM.values()[i].name+"("+price[i]+")";
				ttt+=cnt[i]+"_"+price[i]*cnt[i];
				System.out.println(ttt);
			}
		}
	}
	
	
	
}

public class InnerCoffeeMain {

	public static void main(String[] args) {
		
		OutCoffee star = new OutCoffee("별다방", 2000,2300,2700);
		OutCoffee cong = new OutCoffee("커피콩", 2100,2500,2200);
		
		OutCoffee.InCoffee [] arr = {
				star.new InCoffee("역삼"),
				star.new InCoffee("종로"),
				star.new InCoffee("신촌"),
				cong.new InCoffee("역삼"),
				cong.new InCoffee("구로"),
				cong.new InCoffee("청량리")
		};
		
		arr[0].order("AMERICANO");
		arr[1].order("ASIANO");
		arr[3].order("AMERICANO");
		arr[4].order("ASIANO");
		arr[2].order("ASIANO");
		arr[2].order("AFRICANO");
		arr[1].order("AMERICANO");
		arr[4].order("AFRICANO");
		arr[2].order("ASIANO");
		arr[0].order("AMERICANO");
		arr[1].order("AFRICANO");

		System.out.println("[[[ 판매 내역  ]]]");
		
		for (OutCoffee.InCoffee inCoffee : arr) {
			inCoffee.ppp();
		}
		System.out.println("----------------------------");
		star.ppp();
		cong.ppp();
	}

}
