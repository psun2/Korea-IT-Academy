package arr_p;

public class ArrayMain {

	public static void main(String[] args) {

		int a = 10; //변수
		
		//배열변수 선언 = 배열변수 생성 :: 초기화(동적할당 생략) ;
		int [] arr1 = {10,20,30};

		
		int [] arr2 = new int[5]; //생성 :: 동적할당;
		
						//  생성 :: 초기화(동적할당 명시) ;
		int [] arr3 = new int[] {111,222,333,444};
		
						//동적할당 명시 및 초기화 동시에 할 경우 
						// 동적 할당 크기를 정하면 에러 발생
		//int [] arr4 = new int[4] {111,222,333,444};
		
		int [] arr5;
		
		//arr5 = {100,200,300};  선언된 배열 변수에 초기화를 직접대입 불가
		arr5 = new int[]{100,200,300}; //대입시 동적할당하여 공간확보후 초기화 가능 
		
		
		int [] arr6;
		arr6 = new int[3];
		
		int [] arr7;
		arr7= new int[]{100,200,300}; 
		
		System.out.println("arr1:"+arr1);
		System.out.println("arr2:"+arr2);
		System.out.println("arr3:"+arr3);
		System.out.println("arr5:"+arr5);
		System.out.println("arr7:"+arr7);
		System.out.println("------------------------------");
		arr5[1] = 2222;  //원소의 값 대입
		
		System.out.println("arr5[0]:"+arr5[0]);  //원소호출
		System.out.println("arr5[1]:"+arr5[1]);  //원소호출
		System.out.println("arr5[2]:"+arr5[2]);  //원소호출
		//System.out.println("arr5[3]:"+arr5[3]);  //원소호출
		
		System.out.println("arr7[0]:"+arr7[0]);  
		System.out.println("arr7[1]:"+arr7[1]);  
		System.out.println("arr7[2]:"+arr7[2]);
		System.out.println("변경전------------------------------");
		arr5 = new int[] {12,34,56,78,90};
		System.out.println("arr5[0]:"+arr5[0]);  //원소호출
		System.out.println("arr5[1]:"+arr5[1]);  //원소호출
		System.out.println("arr5[2]:"+arr5[2]);  //원소호출
		System.out.println("arr5[3]:"+arr5[3]);  //원소호출
		System.out.println("arr5[4]:"+arr5[4]);  //원소호출
		
		
		int [] arr8 = arr5;
		
		System.out.println("arr8[0]:"+arr8[0]);  //원소호출
		System.out.println("arr8[1]:"+arr8[1]);  //원소호출
		System.out.println("arr8[2]:"+arr8[2]);  //원소호출
		System.out.println("arr8[3]:"+arr8[3]);  //원소호출
		System.out.println("arr8[4]:"+arr8[4]);  //원소호출
		
		
		System.out.println("변경후------------------------------");

		arr5[2] = 567890;
		System.out.println("arr5[0]:"+arr5[0]);  //원소호출
		System.out.println("arr5[1]:"+arr5[1]);  //원소호출
		System.out.println("arr5[2]:"+arr5[2]);  //원소호출
		System.out.println("arr5[3]:"+arr5[3]);  //원소호출
		System.out.println("arr5[4]:"+arr5[4]);  //원소호출
		

		
		System.out.println("arr8[0]:"+arr8[0]);  //원소호출
		System.out.println("arr8[1]:"+arr8[1]);  //원소호출
		System.out.println("arr8[2]:"+arr8[2]);  //원소호출
		System.out.println("arr8[3]:"+arr8[3]);  //원소호출
		System.out.println("arr8[4]:"+arr8[4]);  //원소호출
	}

}
