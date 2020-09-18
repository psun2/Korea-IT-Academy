package control_p;

import java.io.IOException;

public class PrimeNumberMain {

	public static void main(String[] args) throws IOException {


		int su1=0, su2=0, buf;
		
		System.out.print("¼ö1:");
		
		while(true) {
			buf = System.in.read();
			if(buf==13)
				break;
			
			su1 *= 10;
			su1 += buf-'0';
		}
		
		System.in.read();
		System.out.print("¼ö2:");
		
		while(true) {
			buf = System.in.read();
			if(buf==13)
				break;
			
			su2 *= 10;
			su2 += buf-'0';
		}
		
		
		
		int start = su1;
		int end = su2;
		
		if(end<start) {
			start = su2;
			end = su1;
		}
		
		int cnt = 0;
		
		for (int i = start; i <=end; i++) {
			
			boolean chk = false;
			for (int j = 2; j < i; j++) {
				if(chk= i%j==0 )
					break;
			}
			if(!chk)
				cnt++;
		}
		
		System.out.print(su1+ "<->"+su2+":"+cnt);

	}

}
