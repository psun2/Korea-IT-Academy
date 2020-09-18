package array_p;

import java.util.Arrays;

public class ArrayCopyMain {

	public static void main(String[] args) {
		int [] arr1 = {10,20,30};
		
		int [] arr2 = arr1;		//shallow copy
		
		int [] arr3 = new int[arr1.length]; //deep copy
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = arr1[i];
		}
		
		int [] arr4 = arr1.clone();	//deep copy
		

		arr1[1] = 2222;
		System.out.println("arr1:"+Arrays.toString(arr1)+arr1);
		System.out.println("arr2:"+Arrays.toString(arr2)+arr2);
		System.out.println("arr3:"+Arrays.toString(arr3)+arr3);
		System.out.println("arr4:"+Arrays.toString(arr4)+arr4);

		
		
		
		
		
		
		int [] no = {11,22};
		System.out.println(no.length);
		System.out.println("no:"+Arrays.toString(no)+no);
		//no[2] = 1234;
		int [] temp = new int[no.length+1];
		
		for (int i = 0; i < no.length; i++) {
			temp[i] = no[i];
		}
		//temp[0] = no[0];
		//temp[1] = no[1];
		//temp[2] = 1234;
		temp[no.length] = 1234;
		System.out.println("temp:"+Arrays.toString(temp)+temp);
		
		no = temp;
		System.out.println("no:"+Arrays.toString(no)+no);
		
		
		int [] data = {22,4,67,12,98,70,53,81,16,8,35};
		//짝수만 들어있는 배열을 구현하세요
		
		int [] even = {};
		
		
//		for (int i = 0; i < data.length; i++) {
//			
//			if(data[i]%2==0) {
//				//System.out.println(data[i]);
//				int [] buf = new int[even.length+1];
//				
//				for (int j = 0; j < even.length; j++) {
//					buf[j] = even[j];
//				}
//				buf[even.length] = data[i];
//				even = buf;
//			}
//		}
		
		for (int i : data) {
			if(i%2==0) {
				int [] buf = new int[even.length+1];
				
				for (int j = 0; j < even.length; j++) {
					buf[j] = even[j];
				}
				buf[even.length] = i;
				even = buf;
			}
		}
		
		
		System.out.println(Arrays.toString(even));
		
		System.out.println("-----------------");
		
		for(int a: data) {   //foreach
			System.out.println(a);
		}
	}
	
	
	
	
}
