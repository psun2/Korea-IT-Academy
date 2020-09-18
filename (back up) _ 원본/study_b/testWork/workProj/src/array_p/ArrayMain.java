package array_p;

public class ArrayMain {

	public static void main(String[] args) {
		int a = 10;
		
		//int [] arr1 = 20;
		
		int [] arr1 = new int[3];  
		//배열변수명  = 배열 공간 할당 {0,0,0}
		
		System.out.println("a:"+a);
		System.out.println("arr1:"+arr1);  //배열 호출 : 배열주소호출
		System.out.println("arr1[0]:"+arr1[0]); //배열원소호출
		System.out.println("arr1[1]:"+arr1[1]);
		System.out.println("arr1[2]:"+arr1[2]);
	//	System.out.println("arr1[3]:"+arr1[3]);  위치가 맞지 않아 에러
		
		System.out.println();
		int [] arr2 = {111,222,333,444};
		System.out.println("arr2[0]:"+arr2[0]); //배열원소호출
		System.out.println("arr2[1]:"+arr2[1]);
		System.out.println("arr2[2]:"+arr2[2]);
		System.out.println("arr2[3]:"+arr2[3]);
		
		System.out.println();
		int [] arr3 = new int[]{123,456,789};
		System.out.println("arr3[0]:"+arr3[0]); //배열원소호출
		System.out.println("arr3[1]:"+arr3[1]);
		System.out.println("arr3[2]:"+arr3[2]);
		
		arr3[0] = 135; //배열 원소 대입
		arr3[1] = 246;
		arr3[2] = 369; 
		//arr3[3] = 470; 접근불가 
		
		System.out.println();
		System.out.println("arr3[0]:"+arr3[0]); //배열원소호출
		System.out.println("arr3[1]:"+arr3[1]);
		System.out.println("arr3[2]:"+arr3[2]);
		
		int b;
		b = 100;
		int [] arr4;
		//arr4 = {10,20,30,40}; 배열변수 초기화는 선언시에만 가능
		arr4 = new int[5];  //배열변수대입은 배열의 주소를 받아야함
		arr4 = new int[] {10,20,30,40}; //배열 생성 및 초기화 후 주소 넘김
		
		
		
		
		
		
	}

}
