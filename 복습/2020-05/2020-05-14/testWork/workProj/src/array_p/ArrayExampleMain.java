package array_p;

public class ArrayExampleMain {

	public static void main(String[] args) {
		
		String[] name = { "장동건", "장서건", "장남건", "장중건", "북두신건" };
		int[] kor = { 71, 51, 81, 61, 91 };
		int[] eng = { 73, 53, 83, 63, 93 };
		int[] mat = { 79, 58, 82, 64, 92 };
		
		int[] sum = new int[name.length];
		int[] avg = new int[name.length];
		
		for (int i = 0; i < name.length; i++) {
			sum[i] = kor[i] + eng[i] + mat[i];
			avg[i] = sum[i] / 3;
		}
		
		for (int i = 0; i < name.length; i++) {
			if(i == 0) {
				System.out.print("이름\t국어\t영어\t수학\t총점\t평균\n");
			}
			String ttt = name[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + mat[i] + "\t" + sum[i] + "\t" + avg[i];
			System.out.println(ttt);
		}
	
	}

}
