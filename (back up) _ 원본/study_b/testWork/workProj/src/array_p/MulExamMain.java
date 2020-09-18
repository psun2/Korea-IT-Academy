package array_p;

import java.util.Arrays;

public class MulExamMain {

	public static void main(String[] args) {
		
		String [] name = {
				"����","����","����","�����","�̽��ͺ�",
				"����","Ŀ�Ǻ�","���","������","���̺�","�ͺ�"
		};

		int [] ban = {1,2,3,2,1,2,3,1,2,3,1};
		
		int [][] jum = {
				{76,77,71},
				{56,57,51},
				{96,97,91},
				{66,67,61},
				{86,87,81},
				{79,77,71},
				{56,52,51},
				{96,91,91},
				{66,63,61},
				{80,87,81},
				{86,87,78}
		};
		
		int [][] res = new int[jum.length][4];
		//0 - ����, 1-���, 2-���, 3-�ڸ�
		/*
		 {			// i V
		 	{0,0},
		 	{0,0},
		 	{0,0},
		 	{0,0},
		 	{0,0}
	//
		 } 
		 */
		
		//2.1 �⺻����
		int banMax = 0;
		for (int i = 0; i < jum.length; i++) {
			if(banMax<ban[i])
				banMax=ban[i];
			
			for (int j = 0; j < jum[i].length; j++) {
				res[i][0]+=jum[i][j];
			}
			res[i][1] = res[i][0] / jum[i].length;
		}
		
		int [] banCnt = new int[banMax+1];
		
		//2.2 ������
		
		for (int me = 0; me < res.length; me++) {
			banCnt[ban[me]]++;
			res[me][2] = 1;
			for (int you = 0; you < res.length; you++) {
				if(res[me][1]<res[you][1] && ban[me]==ban[you])
					res[me][2]++;
			}
		}
		
		//2.3 �ڸ����
		for (int i = 0; i < res.length; i++) {
			res[i][3] = res[i][2];
			for (int j = 1; j < ban[i]; j++) {
				res[i][3]+=banCnt[j];
			}
		}
		System.out.println(Arrays.toString(banCnt));
		
		//3. ��º�
		
			int banIndex = 0;
			//System.out.println(b+"  �� >>>>>>>");
			for (int r = 1; r <= res.length; r++) {
				
			
				for (int i = 0; i < jum.length; i++) {
					if(r==res[i][3]) {
						if(banIndex != ban[i]) {
							banIndex = ban[i];
							System.out.println( banIndex+"  �� >>>>>>>");
						}
						
						String ttt = ban[i]+"\t"+name[i]+"\t";
						
						for (int j = 0; j < jum[i].length; j++) {
							ttt+=jum[i][j]+"\t";
						}
						for (int j = 0; j < res[i].length; j++) {
							ttt+=res[i][j]+"\t";
						}
						
						System.out.println(ttt);
					}
				}
			
		}
		
		
	///////  ���� �߰��Ͽ� ���������� ����ϼ���
	//// ��� ���
	//// �ݺ� ���
	/*	
		1�� 
				1
				2
				3
				4
		2��
				1
				2
				3
		3��
				1
				2
				3
*/


		
	}

}
