package arr_p;

import java.util.Arrays;

public class ReduceExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] name = {
				"���켺","���¼�","���߼�","������","�ϵνż�"
		}; 
		
		
		int [][] jum = {
			{78,83,90,99},
			{86,89,81,82},
			{56,59,51,52},
			{96,99,91,90},
			{76,77,71,76},
		};
		
		int [][] res = new int[name.length][2];
		
		for (int i = 0; i < jum.length; i++) {
			for (int j = 0; j < jum[i].length; j++) {
				
				res[i][0] += jum[i][j];
			}
			res[i][1] = res[i][0]/ jum[i].length;
		}
		
		
		//int [] pass = new int[0], fail = new int[0];
		
		int [][] pf = new int[2][0]; //�հ���:0, ���հ���:1
		
		for (int i = 0; i < res.length; i++) {
//			int no = 1;
//			if(res[i][1]>=80) {	
//				no = 0;
//			}
			int no = 1 - res[i][1] / 80;	
			int [] buf = new int[pf[no].length+1];
			
			for (int j = 0; j < pf[no].length; j++) {
				buf[j] = pf[no][j];
			}
			buf[pf[no].length] = i;
			pf[no] = buf;
				
		}
		
		System.out.println(Arrays.toString(pf[0]));
		
		int c;
		for (int i = 0; i < pf[0].length; i++) {
			
			for (int j = i+1; j < pf[0].length; j++) {
				
				if(res[ pf[0][i] ][1]<res[ pf[0][j] ][1]) {
					c = pf[0][i];
					pf[0][i] = pf[0][j];
					pf[0][j] = c;
				}
			}
		}
		
		
		
		
		
		
		String [] index = {"�հ���","���հ���"}; 
		for (int k = 0; k < index.length; k++) {
			System.out.println(index[k]);
			
			for (int i = 0; i < pf[k].length; i++) {
				int no = pf[k][i];
				
				String ttt = no+"\t"+name[no]+"\t";
				
				for (int j = 0; j < jum[no].length; j++) {
					ttt += jum[no][j]+"\t";
				}
				
				for (int j = 0; j < res[no].length; j++) {
					ttt += res[no][j]+"\t";
				}
				
				System.out.println(ttt);
			}
		}

	}
	
	/*
	 ���� ������ �̿��Ͽ� �з��ϼ���  �Ϲ�, ��ü�� 
	 - ����, ���, ���, ��ü���, �з������ �� ���ϼ���
	 - �з��� ���� ��  ����� �̿��Ͽ� �������� ����ϼ���
	 - �з� �� ����������
	      ���� ����, ���, �ִ�, �ּ� �� ����ϼ���
	      
0 . ��ü��>>>>   ����  ����  ����  ����  Ư��
��ü��	�۰���	86	89	81	82	88	426	85	2	1	
��ü��	������	78	83	90	99	43	393	78	4	2	
��ü��	�ΰ���	56	59	51	52	58	276	55	6	3
		����		
		���		
		�ִ�          86	83
		�ּ�	
1 . �Ϲ�>>>>����  ����  ����  ����
�Ϲ�	�ﰡ��	96	99	91	90		376	94	1	1	
�Ϲ�	������	86	74	89	75		324	81	3	2	
�Ϲ�	�Ѱ���	76	77	71	76		300	75	5	3     
	����		
	���		
	�ִ�          96	83
	�ּ�		        
	        
	 * */
	

}
