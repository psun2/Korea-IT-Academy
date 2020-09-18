package array_p;

public class ArrayExamMain {

	public static void main(String[] args) {
		
		//1. 입력부
		String [] name = {"장동건","장서건","장남건","장중건","북두신건"};
		
		int [] kor = {71,51,81,61,91};
		int [] eng = {73,53,83,63,93};
		int [] mat = {79,58,82,64,92};
		
		int [] sum = new int[name.length];
		int [] avg = new int[name.length];
		
		
		//2. 연산부
		//  2.1 기본 연산
		for (int i = 0; i < name.length; i++) {
			sum[i] = kor[i]+eng[i]+mat[i];
			avg[i] = sum[i]/3;
		}
		//  2.2 통계
		int buf;
		String bufN;
		for (int me = 0; me < avg.length; me++) {
			for (int you = me+1 ; you < avg.length; you++) {
				if(avg[me]<avg[you]) {
					bufN = name[me];
					name[me] = name[you];
					name[you] = bufN;
					
					buf = kor[me];
					kor[me] = kor[you];
					kor[you] = buf;
					
					buf = eng[me];
					eng[me] = eng[you];
					eng[you] = buf;
					
					
					buf = mat[me];
					mat[me] = mat[you];
					mat[you] = buf;
					
					
					buf = sum[me];
					sum[me] = sum[you];
					sum[you] = buf;
					
					
					buf = avg[me];
					avg[me] = avg[you];
					avg[you] = buf;
				}
			}
		}
		
		String [] index = {"가","가","가","가","가","가","양","미","우","수","수"};
		//3. 출력부
		for (int i = 0; i < name.length; i++) {
			String ttt = 
					name[i]+"\t"+
					kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+
					sum[i]+"\t"+avg[i]+"\t"+    index[  avg[i]/10  ];
			System.out.println(ttt);
		}

	}

}
