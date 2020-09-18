package control_p;

public class For_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tot = 0;
		for (int i = 0; i <=10; i++) {
			
			tot += i;
			System.out.println(i+","+tot);
		}
		
		System.out.println(tot);
		
		//System.out.println((1+10)*10/2);
		
		
		// 1-> 100 짝수들의 합을 구하세요
		
		tot = 0;
		for (int i = 1; i <=100; i++) {
			if(i%2==0) {
				tot += i;
			}
			System.out.println(i+","+tot);
		}
		
		System.out.println("방법1:"+tot);
		
		
		
		tot = 0;
		for (int i = 0; i <=100; i+=2) {
			
			tot += i;
			
			System.out.println(i+","+tot);
		}
		
		System.out.println("방법2:"+tot);
		
		
		tot = 0;
		for (int i = 1; i <=100; i+=2) {
			
			i+=i%2;
			
			tot += i;
			
			System.out.println(i+","+tot);
		}
		
		System.out.println("방법3:"+tot);
		
		
		//n -> m   q의 배수들의 합
		
		int n = 4, m = 190, q =3;
		
		tot = 0;
		for (int i = n; i <= m; i+=q) {
			// 				i%q		q-i%q		(q-i%q)%q
			//				i%3		3-i%3		(3-i%3)%3
			// 4 --> 6  2   1		3-1 = 2			2	
			// 5 --> 6  1	2		3-2 = 1			1
			// 6 --> 6	0	0		3-0 = 3			0
			
			// 7 --> 9  2	1		3-1 = 2			2
			// 8 --> 9  1	2		3-2 = 1			1
			// 9 --> 9  0	0		3-0 = 3			0
			i+=(q-i%q)%q;
			
			tot += i;
			
			System.out.println(i+","+tot);
		}
		
		System.out.println(n+ " -> "+m+" "+q+"의 배수들의 합 : "+tot);
		
		//1-> 20  3.6.9 게임을 구현하세요  
		
		/*
		1,2,짝,4,5,짝,7,8,짝,10,11,12,짝,14,15,짝,17,18,짝,20 
		 * */
		for (int i = 1; i <=20; i++) {
			int one = i%10;
			
			if(one!=0 && one%3==0)
				System.out.println("짝");
			else
				System.out.println(i);
		}
	}

}
