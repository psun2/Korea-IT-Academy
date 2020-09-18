
package array_p;

public class ArrayExamRankMain {

	public static void main(String[] args) {
		
		//1. 입력부
		String [] name = {"장동건","장서건","장남건","장중건","북두신건"};
		
		int [] kor = {71,51,81,61,91};
		int [] eng = {73,53,83,63,93};
		int [] mat = {79,58,82,64,92};
		
		int [] sum = new int[name.length];
		int [] avg = new int[name.length];
		int [] rank = new int[name.length];
		
		
		//2. 연산부
		//  2.1 기본 연산
		for (int i = 0; i < name.length; i++) {
			sum[i] = kor[i]+eng[i]+mat[i];
			avg[i] = sum[i]/3;
		}
		
		//  2.2 등수 연산
		for (int me = 0; me < avg.length; me++) {
			rank[me] = 1;
			for (int you = 0; you < avg.length; you++) {
				if(avg[me]<avg[you])
					rank[me]++;
			}
		}
		
		//3. 출력부
		String [] index = {"가","가","가","가","가","가","양","미","우","수","수"};
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
