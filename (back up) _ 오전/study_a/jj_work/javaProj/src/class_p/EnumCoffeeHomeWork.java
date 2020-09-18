package class_p;
enum CoffeeHome{
	AMERICANO(2000),ASIANO(2300),AFRICANO(2700);
	
	private int price, cnt, now;
	private CoffeeHome(int price) {
		this.price = price;
	}
	
	void add(String now) {
		this.now = Integer.parseInt(now);
		cnt+=this.now;
		pppNow();
	}
	
	private void pppNow() {
		System.out.print(this+"_"+now+"("+now*price+"),");
	}
	
	void pppTot() {
		System.out.println(this+"_"+cnt+"("+cnt*price+")");
	}	
}
public class EnumCoffeeHomeWork {

	public static void main(String[] args) {
		
		//CoffeeHome.AFRICANO.pppTot();
		
		String [] orderArr = {
			"AMERICANO_2,ASIANO_3,AFRICANO_1", 
			"AFRICANO_2,ASIANO_1", 
			"AFRICANO_2,AMERICANO_1,ASIANO_2"	
		};
		
		for (String order : orderArr) {
			for (String menuArr : order.split(",")) {
				String [] menu = menuArr.split("_");
				CoffeeHome.valueOf(menu[0]).add(menu[1]);
			}
			System.out.println();
		}
		System.out.println("---------------------");
		for (CoffeeHome coffee : CoffeeHome.values()) {
			coffee.pppTot();
		}

	}

}
