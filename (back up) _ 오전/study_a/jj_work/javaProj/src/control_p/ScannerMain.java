package control_p;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("����:");
		int no = sc.nextInt();
		
		System.out.println("���:"+no*100);
		
		System.out.print("���ڿ�1:");
		String str1 = sc.next();  //���Ϳ� ����� ����
								  //���ڿ��� ���Ϳ� ���⸦ ���� ����
		
		System.out.println("str1:"+str1);
		
		sc.nextLine(); // ���Ͱ� ����־� ���� nextLine();�� ������ ��ħ
						// ���Ͱ� ���
		
		System.out.print("���ڿ�2:");
		String str2 = sc.nextLine();//��� ���� ���� ���ڿ��� �����Ͽ� ����
		
		System.out.println("str2:"+str2);
		
		System.out.print("������:");
		boolean bo = sc.nextBoolean();
		
		System.out.println("bo:"+bo);
		
		System.out.print("�Ǽ�:");
		double dd = sc.nextDouble();
		
		System.out.println("dd:"+dd);
		
		
		

	}

}
