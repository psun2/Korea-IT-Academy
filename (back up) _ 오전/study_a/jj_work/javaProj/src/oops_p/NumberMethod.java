package oops_p;
class NumMethod{
	
	//n->m 까지의 합
	void hap(int n,int m) {
		
		int tot = 0;
		for (int i = n; i <=m; i++) {
			tot+=i;
		}
		System.out.println(n+"->"+m+":"+tot);
	}
	
	//n->m 까지의 p의 배수 합
	void hap2(int n,int m, int p) {
		
		int tot = 0;
		for (int i = n; i <=m; i++) {
			if(i%p==0)
				tot+=i;
		}
		System.out.println(n+"->"+m+"("+p+")"+":"+tot);
	}
	
	
	void prPPP(int n,int m) {
		
		
		System.out.print(n+"->"+m+" 소수:");
		for (int i = n; i <=m; i++) {
			
			boolean chk =false;
			for (int j = 2; j <i; j++) {
				if(chk=i%j==0)
					break;
			}
			if(!chk)
				System.out.print(i+",");
		}
		System.out.println();
		
	}
	
}
public class NumberMethod {

	public static void main(String[] args) {
		NumMethod nm = new NumMethod();
		
		nm.hap(1, 10);
		nm.hap(2, 10);
		nm.hap2(100, 200,10);
		nm.hap2(15, 30,10);
		
		nm.prPPP(1,10);
		nm.prPPP(20,50);
		///1. n->m 까지 p의 배수들의 합 출력
		///2. n->m 까지 소수 출력
		

	}

}
