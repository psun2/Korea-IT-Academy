package array_p;

public class ArrayForMain {

	public static void main(String[] args) {

		int [] arr = {98,92,34,91,85,86,23,57};

		int tot = 0;
		
		System.out.println(arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println("arr["+i+"] : "+arr[i]);
			
			tot+= arr[i];
		}
		
//		tot+= arr[0];
//		tot+= arr[1];
//		tot+= arr[2];
//		tot+= arr[3];
//		tot+= arr[4];
//		tot+= arr[5];
		
		System.out.println(tot);
		System.out.println(tot/arr.length);
		
		
		//점수 : 87,65,82,46,98,65,72,34,91,79,45,67
		// 70점 이상인 사람들의 합계와 평균을 구하세요
		
		int [] arr2 = {87,65,82,46,98,65,72,34,91,79,45,67};
		tot = 0;
		int cnt = 0;
		for (int i = 0; i < arr2.length; i++) {
			
			if(arr2[i]>=70) {
				tot+=arr2[i];
				cnt++;
			}
			
		}
		
		System.out.println(tot+","+cnt+","+tot/cnt);
		
		int [] arr3 = {22,13,4,67,7,12,98,23,70,5,53,43,82,19,37,16,8,32};
		
		tot = 0;
		for (int j = 0; j < arr3.length; j++) {
			
			int chk = 1;
			for (int i = 2; i < arr3[j]; i++) {
				if( (chk =arr3[j]%i)==0  ) {
					
					break;
				}
			}
			tot+=chk;
				
			
		}
		System.out.println(tot);
		
	}

}
