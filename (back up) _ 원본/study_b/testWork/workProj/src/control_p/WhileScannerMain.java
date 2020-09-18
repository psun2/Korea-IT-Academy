package control_p;

import java.util.Scanner;

public class WhileScannerMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int tot=0, cnt=0, max=-1;
		while(true) {
		
			System.out.print("입력:");
			
			int no = sc.nextInt();
			
			if(no<=0)
				break;
			
			if(max<no)
				max = no;
			
			tot+=no;
			cnt++;
		}
		
		System.out.println("종료:"+tot+","+tot/cnt+","+max);
		
	}

}
