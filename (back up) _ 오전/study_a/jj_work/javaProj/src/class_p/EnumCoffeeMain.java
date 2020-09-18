package class_p;
enum CoffeeMenu{
	AMERICANO,ASIANO,AFRICANO
	
}
public class EnumCoffeeMain {

	public static void main(String[] args) {
		
		CoffeeMenu [] menu = CoffeeMenu.values();
		int [][] coffee = {
			{2000,2300,2700},
			new int[3]	
		};
		
		String [] orderArr = {
			"AMERICANO_2,ASIANO_3,AFRICANO_1", 
			"AFRICANO_2,ASIANO_1", 
			"AFRICANO_2,AMERICANO_1,ASIANO_2"	
		};
		
		for (String order : orderArr) {
			String [] ooArr = order.split(",");
			String ttt="";
			String ttt2="";
			int [] buf = new int[3]; 
			for (String oo : ooArr) {
				
				String [] co = oo.split("_");
				int cnt = Integer.parseInt(co[1]);
				int num = CoffeeMenu.valueOf(co[0]).ordinal();
				//System.out.println(co[0]+","+cnt+":"+coffee[0][num]*cnt);
				coffee[1][num]+=cnt;
				buf[num]=cnt;
				ttt+=oo+"("+coffee[0][num]*cnt+"),";
				
			}
			//System.out.println(ttt);
			
			for (int i = 0; i < menu.length; i++) {
				ttt2+=menu[i]+"_"+buf[i]+"("+
						+coffee[0][i]*buf[i]+"),";
				
			}
			System.out.println(ttt2);
			
		}
		System.out.println("-----------------------");
		for (int i = 0; i < menu.length; i++) {
			String ttt=menu[i]+"_"+coffee[1][i]+"("+coffee[1][i]*coffee[0][i]+")";
			System.out.println(ttt);
		}
		

	}

}
