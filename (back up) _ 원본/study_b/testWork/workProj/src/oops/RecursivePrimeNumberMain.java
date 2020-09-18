package oops;

public class RecursivePrimeNumberMain {
	
	static int primeCnt(int no) {
		int res = primeChk(no-1, no);
		
		if(no>2)
			res+=primeCnt(no-1);
		else if(no==2)
			res=1;
		
		//System.out.println(no+":"+res);
		return res;
	}
	
	
	static int primeChk(int i, int no) {
			
		int res = no%i;
		if(i>2 && res!=0)
			res = primeChk(i-1, no);
		
		//System.out.println(i+":"+res);
		return res;
	}

	public static void main(String[] args) {
		
		int no = 23;
		System.out.println(no+":"+primeCnt(no));
	}

}
