
package array_p;

public class ArrayExamRankMain {

	public static void main(String[] args) {
		
		//1. �Էº�
		String [] name = {"�嵿��","�弭��","�峲��","���߰�","�ϵνŰ�"};
		
		int [] kor = {71,51,81,61,91};
		int [] eng = {73,53,83,63,93};
		int [] mat = {79,58,82,64,92};
		
		int [] sum = new int[name.length];
		int [] avg = new int[name.length];
		int [] rank = new int[name.length];
		
		
		//2. �����
		//  2.1 �⺻ ����
		for (int i = 0; i < name.length; i++) {
			sum[i] = kor[i]+eng[i]+mat[i];
			avg[i] = sum[i]/3;
		}
		
		//  2.2 ��� ����
		for (int me = 0; me < avg.length; me++) {
			rank[me] = 1;
			for (int you = 0; you < avg.length; you++) {
				if(avg[me]<avg[you])
					rank[me]++;
			}
		}
		
		//3. ��º�
		String [] index = {"��","��","��","��","��","��","��","��","��","��","��"};
		for (int r = 1; r <= name.length; r++) {
			//System.out.println(r);
			for (int i = 0; i < name.length; i++) {
				if(rank[i]==r) {
					String ttt = 
							name[i]+"\t"+
							kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+
							sum[i]+"\t"+avg[i]+"\t"+index[avg[i]/10]+"\t"+rank[i];
					System.out.println(ttt);
				}
			}
		}
		

	}

}
