package control_p;

import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name, chk;
		int kor, eng, mat, tot, pass = 0, fail = 0;
		double avg;
		
		while(true) {
			System.out.print("�̸�:");
			name = sc.nextLine();
			
			System.out.print("����:");
			kor = sc.nextInt();
			
			System.out.print("����:");
			eng = sc.nextInt();
			
			System.out.print("����:");
			mat = sc.nextInt();
			
			tot = kor + eng + mat;
			avg = (double)tot / 3;
			
			
			if(avg>=70)
				pass++;
			else
				fail++;
			
			System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg);
			
			sc.nextLine();
			System.out.print("��������ұ��?(y/n)");
			chk = sc.nextLine();
			
			if(chk.equals("n"))  //chk�� ���� "n" ���� ��
				break;
			
		}
		
		System.out.println("�հ�:"+pass+", ���հ�:"+fail);
		
	}

}
