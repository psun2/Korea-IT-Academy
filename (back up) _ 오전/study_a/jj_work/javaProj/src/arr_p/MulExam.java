package arr_p;

public class MulExam {

	public static void main(String[] args) {
		String [] name = {"�Ѱ���","�ΰ���","�ﰡ��","�۰���","������","������"};
		
		int [][] jum = {
				{76,77,71,76},
				{56,59,51,52,58},
				{96,99,91,90},
				{86,89,81,82,88},
				{78,83,90,99,43},
	            {86,74,89,75}
		};
		
		int [][]rrr = new int[name.length][4];  // {0,0,0,0}
		/*   
		 {�հ�,���,���,�з����
		   {0, 0, 0, 0},  rrr[0]
		   {0, 0, 0, 0},  rrr[1]
		   {0, 0, 0, 0},  rrr[2]
		   {0, 0, 0, 0}   rrr[3]
		 }
		  
		 */
		
		for (int i = 0; i < jum.length; i++) {
			
			for (int j = 0; j <jum[i].length; j++) {
				rrr[i][0]+=jum[i][j];
			}
			rrr[i][1]=rrr[i][0]/jum[i].length;
			
		}
		
		
		for (int me = 0; me < rrr.length; me++) {
			
			rrr[me][2] = 1; //��ü���
			rrr[me][3] = 1; //�з����
			for (int you = 0; you < rrr.length; you++) {
				
				if(rrr[me][1]<rrr[you][1]) {  //���� ��պ��� ���� ���� 
					                           //��� ����
					rrr[me][2]++;	//��ü���
					if(jum[me].length == jum[you].length)
						           //���� ������ �з��� ������
						rrr[me][3]++;
				}
			}
		}
		
		String [] kind = {"��ü��","�Ϲ�"};
		
		///�з� �� �������(��ü, �з�)���  ���
		for (int k = 0; k < kind.length; k++) {
			
			System.out.println(k+" . "+kind[k]+">>>>");
			
			//���
			for (int r = 1; r <= name.length; r++) {
				
			//System.out.println(r);
			
				//�л�
				for (int i = 0; i < jum.length; i++) {
					
					//�з� == �л��з�
					if(5-jum[i].length==k && rrr[i][2] == r ) {
						
						String res = kind[5-jum[i].length]+"\t";
						res += name[i]+"\t";
						
						for (int j = 0; j < jum[i].length; j++) {
							res += jum[i][j]+"\t";
						}
						
						if(jum[i].length==4)
							res += "\t";
						
						for (int j = 0; j < rrr[i].length; j++) {
							res += rrr[i][j]+"\t";
						}
						
						System.out.println(res);
					}
				}
			}
			
		}
		
		
		
		/*
		 ������ �ֹ� �޴��� �迭�̴�
		 �� ��¥�� �ֹ� �հ踦 ����ϼ���
		 
		 �ֹ���ȣ : 
		 0 - �Ƹ޸�ī�� (2000)
		 1 - ������ī�� (2300)
		 2 - �ƽþƳ�	 (2700)
		 
		 		�Ƹ޸�ī�� ,������ī��, �ƽþƳ�
		 4/10 -     1       2        0
		 4/11 -     2       0        1
		 4/12 -     0       3        0
		 4/13 -     1       1        1
		 
		 
		 4/10 -    6600
		 4/11 -    6700
		 4/12 -    6900
		 4/13 -    7000
		 
		 * */
		
		
		
		

	}

}
