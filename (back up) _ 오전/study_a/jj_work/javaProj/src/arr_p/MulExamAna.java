package arr_p;

import java.util.Arrays;

public class MulExamAna {

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
		
		///���� ��� ���
		for (int i = 0; i < jum.length; i++) {
			
			for (int j :jum[i]) {
				rrr[i][0]+=j;
			}
			rrr[i][1]=rrr[i][0]/jum[i].length;
			
		}
		
		
		
		///������
		for (int [] me :rrr) {
			
			me[2] = 1; //��ü���
			
			for (int [] you :rrr) {
				
				if(me[1]<you[1]) {  //���� ��պ��� ���� ���� 
					                           //��� ����
					me[2]++;	//��ü���
					
				}
			}
		}
		
		
		
		String [] cateTitle = {"��ü��","�Ϲ�"};
		int [][] cate = new int[cateTitle.length][0];
		
		for (int j = 0; j < jum.length; j++) {

			int num = 5 - jum[j].length;
			
			int [] buf = new int[cate[num].length+1];
			
			for (int i = 0; i < cate[num].length; i++) {
				buf[i] = cate[num][i];
						
			}
			buf[cate[num].length] = j;
			cate[num] = buf;	
		}
		
		
		
		
		
		
		
		
		String [] anaTitle = {"����","���","�ִ�","�ּ�"};
		int [][][] ana = new int[cateTitle.length][anaTitle.length][];
		
		for (int i = 0; i < ana.length; i++) {
			for (int j = 0; j < ana[i].length; j++) { //��ü�ɰ� �Ϲ��� ���� ���� �ڵ����� ó��
				ana[i][j] = new int[5-i];
			}
			
			for (int j = 0; j < 5-i; j++) {
				ana[i][3][j] = 999;	//�ּҰ�  �ʱ�ȭ (������)
			}
			
			
			for (int k : cate[i]) {  
				
				rrr[k][3] = 1; //�з����
				for (int you : cate[i]) {
					
					if(rrr[k][1]<rrr[you][1]) {  //���� ��պ��� ���� ���� 
						                           //��� ����
						rrr[k][3]++;	//���е��
						
					}
				}
				
				

				for (int j = 0; j < jum[k].length; j++) {
					
					ana[i][0][j] += jum[k][j] ;  //����
					
					if(ana[i][2][j]<jum[k][j])   //�ִ�
						ana[i][2][j]=jum[k][j];
					
					if(ana[i][3][j]>jum[k][j])   //�ּ�
						ana[i][3][j]=jum[k][j];
				}
	
			}
			for (int j = 0; j < 5-i; j++) {  //���
				ana[i][1][j] = ana[i][0][j]/cate[i].length ;
			}
			
		}
		
		
		//��� ���ϰ� ���� ����� �������� ����
		for (int[] is : cate) {
			
			for (int me = 0; me < is.length; me++) {
				
				for (int you = me+1; you < is.length; you++) {
					
					//�� ����� ������ ������� �� ū�����
					if(rrr[is[me]][3]>rrr[is[you]][3]) {
						//���� �ٲٱ�
						int buf = is[me];
						is[me] = is[you];
						is[you] = buf;
					}
					
				}
			}
			
		}
		
		
		
		
		for (int i = 0; i < cate.length; i++) {
			System.out.println(cateTitle[i]+">>>");
			
			for (int n : cate[i]) {
				String ttt = name[n]+"\t";
				
				for (int j : jum[n]) {
					ttt += j+"\t";
				}
				
				if(i==1) {
					ttt += "\t";
				}
				
				for (int j : rrr[n]) {
					ttt += j+"\t";
				}
				
				System.out.println(ttt);
			}
			System.out.println("---------------------------------------------------------------------------");
			for (int a = 0; a < ana[i].length; a++) {
				
				String ttt = anaTitle[a]+"\t";
				
				for (int js : ana[i][a]) {
					ttt += js +"\t";
				}
				
				System.out.println(ttt);
				
			}
			
			
		}
		

	}

}
