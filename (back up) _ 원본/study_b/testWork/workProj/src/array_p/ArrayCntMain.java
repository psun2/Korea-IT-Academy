package array_p;

public class ArrayCntMain {

	public static void main(String[] args) {
		int [] arr = {22,4,67,12,98,70,53,82,16,8,32};

		int [] res = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 2; j <arr[i]; j++) {
				if(arr[i]%j==0)
					res[i]++;
			}
		}
		int buf;
		for (int me = 0; me < res.length; me++) {
			
			for (int you = me+1; you <res.length; you++) {
				if(res[me]<res[you]) {
					buf = res[me];
					res[me] = res[you];
					res[you] = buf;
					
					buf = arr[me];
					arr[me] = arr[you];
					arr[you] = buf;
				}
					
			}
		}
		
		for (int i = 0; i < res.length; i++) {
			System.out.println(i+":"+arr[i]+"\t"+res[i]);
		}
	}

}
