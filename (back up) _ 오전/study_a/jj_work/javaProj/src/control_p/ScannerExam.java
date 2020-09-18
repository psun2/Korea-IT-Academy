package control_p;

import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name, chk;
		int kor, eng, mat, tot, pass = 0, fail = 0;
		double avg;
		
		while(true) {
			System.out.print("이름:");
			name = sc.nextLine();
			
			System.out.print("국어:");
			kor = sc.nextInt();
			
			System.out.print("영어:");
			eng = sc.nextInt();
			
			System.out.print("수학:");
			mat = sc.nextInt();
			
			tot = kor + eng + mat;
			avg = (double)tot / 3;
			
			
			if(avg>=70)
				pass++;
			else
				fail++;
			
			System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg);
			
			sc.nextLine();
			System.out.print("계속진행할까요?(y/n)");
			chk = sc.nextLine();
			
			if(chk.equals("n"))  //chk의 값이 "n" 인지 비교
				break;
			
		}
		
		System.out.println("합격:"+pass+", 불합격:"+fail);
		
	}

}
