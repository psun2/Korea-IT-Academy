package control_p;

import java.util.Scanner;

//��ȭ����
//1. �׼�  2. ��׼�   3. �Ⱦ׼�   4. �ٽÿ���    0. ����

//�����ο�
//1. ����   2. �л�   3. ���    4. ���ܸ�  5. �ٽ��ϱ�   0. ����

//���� �ο���
//1~ 8��     0. ����

/////���󿹸Ž�  ��ȭ���� ���� ȭ�� ����� ��


public class While_Movie {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String res="", kind, person;
		int cnt, buf;
		
		TOT:while(true) {
			kind ="";
			person = "";
			cnt = 0;
			
			AAA:while(true) {
				System.out.println("��ȭ����");
				System.out.print("1. �׼�  2. ��׼�   3. �Ⱦ׼�   4. �ٽÿ���    0. ����:");
				
				buf = sc.nextInt();
				if(buf==0) {
					res = "���� ����";
					break TOT;
				}
				if(buf==4)
					continue TOT;
				
				switch(buf) {
					case 1:
						kind = "�׼�";
						break AAA;
					case 2:
						kind = "��׼�";
						break AAA;
					case 3:
						kind = "�Ⱦ׼�";
						break AAA;
				}
				
			}
			
			BBB:while(true) {
				System.out.println("�����ο�");
				System.out.print("1. ����   2. �л�   3. ���    4. ���ܸ�  5. �ٽ��ϱ�   0. ����:");
				
				buf = sc.nextInt();
				if(buf==0) {
					res = "���� ����";
					break TOT;
				}
				if(buf==5)
					continue TOT;
				
				switch(buf) {
					case 1:
						person = "����";
						break BBB;
					case 2:
						person = "�л�";
						break BBB;
					case 3:
						person = "���";
						break BBB;
					case 4:
						person = "���ܸ�";
						break BBB;
				}
			}
			
			
			while(true) {
				System.out.println("��ȭ����");
				System.out.print("1~ 8��     0. ����:");
				
				buf = sc.nextInt();
				if(buf==0) {
					res = "���� ����";
					break TOT;
				}
				if(buf<=8) {
					cnt = buf;
					break TOT;
				}
				
			}
		}
		
		if(res.equals(""))
			res = kind+","+person+","+cnt;
		
		System.out.println(res);

	}

}
