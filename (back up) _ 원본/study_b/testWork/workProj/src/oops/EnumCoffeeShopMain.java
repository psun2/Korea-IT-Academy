package oops;



//
/*        Ŀ�Ǹ� �ֹ��ϼ���
    �Ƹ޸�ī��:2000
    �ƽþƳ�:2300
    ������ī��:2700
 
    �ֹ���1 : AMERICANO_2,ASIANO_3,AFRICANO_1
    �ֹ���2 : AFRICANO_2,ASIANO_1
    �ֹ���3 : AFRICANO_2,AMERICANO_1,ASIANO_2
 
    ���
    �ֹ���1 : AMERICANO_2(4000), ASIANO_3(6900), AFRICANO_1(2700) : ?
    �ֹ���2 : AMERICANO_0(0),    ASIANO_1(2300), AFRICANO_2(5400) : ?
    �ֹ���3 : AMERICANO_1(2000), ASIANO_2(4600), AFRICANO_2(5400) : ?
    -------------------------------------------------------------
    �հ� : AMERICANO_3(6000)
         ASIANO_6(13800)
         AFRICANO_5(13500)
         ----------------------
              ?
 */ 


enum Coffee{
	AMERICANO(2000), ASIANO(2300), AFRICANO(2700);
	
	int price;
	int tot;
	private Coffee(int price) {
		this.price = price;
	}
	
	int order(String str) {
		int cnt = Integer.parseInt(str);
		
		tot+=cnt;
		int res = cnt*price;
		System.out.print( this+"_"+cnt+"("+res+") , ");
		return res;
	}
	int ppp() {
		int res = tot*price;
		System.out.println(this+"_"+tot+"("+res+")");
		return res;
	}
}

public class EnumCoffeeShopMain {

	static void order(String title,String str) {
		System.out.print(title+" : ");
		int res = 0;
		for (String ss : str.split(",")) {
			String [] arr = ss.split("_");
			res += Coffee.valueOf(arr[0]).order(arr[1]);
		}
		System.out.println(":"+res);
	} 
	
	public static void main(String[] args) {
		order("�ֹ���1","AMERICANO_2,ASIANO_3,AFRICANO_1");
		order("�ֹ���2","AFRICANO_2,ASIANO_1");
		order("�ֹ���3","AFRICANO_2,AMERICANO_1,ASIANO_2");
		
		System.out.println("total----------------------");
		int res = 0;
		for (Coffee co : Coffee.values()) {
			res+=co.ppp();
		}
		System.out.println("----------------------\n"+res);

	}

}
