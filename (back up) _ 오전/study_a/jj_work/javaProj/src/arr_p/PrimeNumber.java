package arr_p;

import java.util.Arrays;

//    {78,11,45,67,9,62,13,26,38,17,61,94,5}
//    ���� �� �ڼ��� �ڼ��� �ƴ� ���� �������� �迭�� ����ϼ���
//    �� ������ �հ�, ����� ���� ��½� �ϴܿ� ����ϼ���

/*
 * �ڼ� : 11,67,13,17,61,5
 * �հ�, ���
 * 
 * ���� :78,45,9,62,26,38
 * �հ�, ���
 *  
 */
public class PrimeNumber {

	public static void main(String[] args) {
		int [] num = {78,11,45,67,9,62,13,26,38,17,61,94,5};
		
		int [][] res = new int[2][0];  //0 �ڼ��ƴ�, 1 �ڼ�
		int [] ana = new int[2];
//		
//		for (int i = 0; i < num
//				.length; i++) {
//			System.out.print(num[i]+",");
//		}
//		
//		System.out.println();
//		
		
		for (int i : num) {
			
			
			int chk = 1;  //�ڼ�
			for (int j = 2; j <i; j++) {
				if((chk = i%j) ==0) //0 �ڼ��ƴ�
					break;
			}
			
			chk = 1-chk;
			
			/*
			 res[chk] = {78};
			 buf = new int [2]; 
			 
			 buf = {78,45};
			 
			 res[chk] = {78,45};
			 * */
			
			int [] buf = new int[res[chk].length+1];
			
			for (int j = 0; j < res[chk].length; j++) {
				buf[j] = res[chk][j];
			}
			buf[res[chk].length] = i; 
			res[chk] = buf;
			
			ana[chk] += i;
		}
		
		String [] title = {"�Ҽ�","����"};
		
		for (int i = 0; i < title.length; i++) {
		
			System.out.println(title[i]+":"+Arrays.toString(res[i]));
			System.out.println("�հ�:"+ana[i]+", ���:"+ana[i]/res[i].length);
		}
		
	}

}
