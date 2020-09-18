package arr_p;

public class MulArr {

	public static void main(String[] args) {
		
		int [][] arr = {
				//10,20,30								// 1차원
				{101,		102,		103,		104},	// arr[0]
				{201,		202,		203,		204},	// arr[1]
				{301,		302,		303,		304}	// arr[2]
//2차원                 arr[?][0],arr[?][1],arr[?][2],arr[?][3]				
				
		}; 
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println("arr[1][2]:"+arr[1][2]);
		System.out.println("arr[2][1]:"+arr[2][1]);
		
		System.out.println(arr.length);
		
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr["+i+"]>");
			
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+",");
			}
			
			
			System.out.println();
		}

	}

}
