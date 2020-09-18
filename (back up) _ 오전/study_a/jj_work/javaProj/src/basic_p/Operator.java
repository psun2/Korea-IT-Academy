package basic_p;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//param : 숫자, 문자
		//ret :  숫자, 문자
		System.out.println("2.1 산술연산자");
		
		int a = 15, b = 7;
		String str2 = a+" + "+b+" = "+ (a+b) ;
		System.out.println(str2);
		System.out.println(a+" - "+b+" = "+ (a-b) );
		System.out.println(a+" * "+b+" = "+ a*b );
		System.out.println(a+" / "+b+" = "+ a/b );
		System.out.println(a+" % "+b+" = "+ a%b );
		
		
		String s = "정우성", t = "현빈";
		//System.out.println(s+t); //문자열은 더하기 연산만 가능
		//System.out.println(s+a); //문자열은 더하기 연산만 가능
		System.out.println(s+" + "+t+" = "+ (s+t) );
		System.out.println(s+" + "+b+" = "+ (s+b) );
		/*
		 * System.out.println(s-t); 
		 * System.out.println(s*t); 
		 * System.out.println(s/t);
		 * System.out.println(s%t);
		 */
		
		
		//param : 숫자, 문자
		//ret :  boolean
		System.out.println("2.2 비교연산자");
		a = 10;
		b = 20;
//		System.out.println(a > b-15);
//		System.out.println(a >= b);
//		//System.out.println(a => b);
//		System.out.println(a <= b);
//		System.out.println(a < b);
//		System.out.println(a == b);
//		System.out.println(a != b);
		//System.out.println(a+" > "+b+" = "+ a>b ); 문자 ,숫자 크기 비교 X
		//System.out.println(10 > "현빈" );
		System.out.println(10 > 'a' );
		System.out.println(a+" > "+b+" = "+ (a>b) );
		System.out.println(a+" >= "+b+" = "+ (a>=b) );
		System.out.println(a+" <= "+b+" = "+ (a<=b) );
		System.out.println(a+" < "+b+" = "+ (a<b) );
		System.out.println(a+" == "+b+" = "+ (a==b) );
		System.out.println(a+" != "+b+" = "+ (a!=b) );
		
		s = "정우성";
		t = "정좌성";  //문자열은 같다 , 다르다만 가능
//		System.out.println(s+" > "+t+" = "+ (s>t) );
//		System.out.println(s+" >= "+t+" = "+ (s>=t) );
//		System.out.println(s+" <= "+t+" = "+ (s<=t) );
//		System.out.println(s+" < "+t+" = "+ (s<t) );
		System.out.println(s+" == "+t+" = "+ (s==t) );
		System.out.println(s+" != "+t+" = "+ (s!=t) );
		
		
		//param : boolean
		//ret :  boolean
		System.out.println("2.3 논리연산자");
		
		boolean c= false, d =  false;
		System.out.println(c && d);	//두항의 값이 모두  true 일 경우 true
		System.out.println(c || d); //하나의 항의 값이  true 일 경우 true
		System.out.println(c ^ d);  //두항의 값이 반대일 경우 true
		
		int age = 26;
		String color = "빨강";
		
		//boolean ageChk = age < 25, ccChk =  color == "빨강";
		
//		System.out.println("And:"+ (ageChk && ccChk));
//		System.out.println("Or:"+ (ageChk || ccChk));
//		System.out.println("Xor:"+ (ageChk ^ ccChk));
		System.out.println("And:"+ (age < 25+10 && color == "빨강"));
		System.out.println("Or:"+ (age < 25 || color == "빨강"));
		System.out.println("Xor:"+ (age < 25 ^ color == "빨강"));
		
		/*
        숫자 xx 를 받아 3의 배수이거나 2의 배수인지 확인하세요
        3의 배수와 2의 배수가 둘다 맞는지도 확인하세요*/
		
		int xx = 36;
		//System.out.println("2 and 3:"+ (xx%2==0 && xx%3==0));
		System.out.println("2 and 3:"+ (xx%(3*2)==0));
		System.out.println("2 or 3:"+ (xx%2==0 || xx%3==0));
		
		
		//14, 15,    12, 8
		
		
		//param : 숫자
		//ret :  숫자
		System.out.println("2.4 shift  연산자");
		System.out.println("5<<2 : "+ (5<<2));  
		
		   /*0101 << 2  --> 0101 00  -->   0 0 0 1     	0 1 0 0
											   5 4		3 2 1 0
											  32 16     8 4 2 1
											   0+16 +   0+4+0+0  :20
		///   <<  양수 ,음수 모두: 0													 */
		System.out.println(" -6<<3 : "+ (-6<<3));  //1111 1010 <<3 
		                                           // 1111 1101 0000
		
		///   >>  양수 : 0 , 음수:1
		System.out.println(" 11>>2 : "+ (11>>2));  //0000 1011 >>2
		                                 // 00  0000 10   11  --> 0000 0010  
		System.out.println("-20>>3 : "+ (-20>>3)); 
		//      1111 1111   1111 1111   1111 1111   1110 1100 >>3
		//111   1111 1111   1111 1111   1111 1111   1110 1100 
		//111   1111 1111   1111 1111   1111 1111   1110 1
		//      1111 1111   1111 1111   1111 1111   1111 1101
		
		///   >>>  양수 ,음수 모두: 0
		System.out.println(" 11>>>2 : "+ (11>>>2));  //0000 1011 >>2
        // 00  0000 10   11  --> 0000 0010  
		System.out.println("-20>>>3 : "+ (-20>>>3)); //1110 1100 >>3
		//    1111 1111 1111 1111 1111 1111 1110 1100 >>3
		//000 1111 1111 1111 1111 1111 1111 1110 1100 >>3
		//000 1111 1111 1111 1111 1111 1111 1110 1
		//0001 1111 1111 1111 1111 1111 1111 1101
		
		
		
		//param : 숫자
		//ret :  숫자
		System.out.println("2.5 bit 연산자");
		System.out.println("12 & 7 : "+ (12 & 7));  //and 
		System.out.println("12 | 7 : "+ (12 | 7));  // or
		System.out.println("12 ^ 7 : "+ (12 ^ 7));  //xor
		
		/*
		 *   1 -> true
		 *   0 -> false
		 * 
			12	1100
			 7  0111
	-------------------------
     and        0100  	 4
      or        1111	15
     xor        1011	11

		 */
		//param : 숫자, 문자
		//ret :  숫자, 문자
		System.out.println("2.6 대입 연산자");
		a = 10;
		
		System.out.println("a:"+a);
		
		//a = a+5;
		//a+=5;
		//System.out.println("a+=5:"+a);
		//System.out.println("a+=5:"+ a+=5 );   우선순위가 낮아 에러
		System.out.println("a+=5:"+(a+=5));
		System.out.println("a-=3:"+(a-=3));
		System.out.println("a*=4:"+(a*=4));
		System.out.println("a/=5:"+(a/=5));
		System.out.println("a%=4:"+(a%=4));
		
		
		System.out.println("1. 1항연산자");
		
		int e = 5;
		boolean f = false;
		System.out.println(-e);
		System.out.println(f);
		System.out.println(!f);
		System.out.println("1.2 증감연산자");
		//e = e + 1;
		e++;
		System.out.println(e);
		e--;
		System.out.println(e);
		//e**;
		//e//;
		//e%%;
		System.out.println(e);
		
		//int k = e++;  후치연산
		int k = ++e;	//전치연산
		System.out.println("k:"+k+", e:"+e);
		
		int aa=5, bb = 6, cc = 10, dd;
		  
		dd = aa++ + ++cc - bb-- * --aa + aa++;
		/*
	    
	    dd = 5  +   11  -   6    *  5  +  5
	    	5   +   11   -     30   +   5	
	    
	         
	        aa:6                    5     6
	        		cc:11
	        		       bb: 5
		 * */
		
		System.out.println(aa+","+bb+","+cc+","+dd);
		
		
		
		System.out.println("3. 조건 연산자");
		// 조건 ?  참일때 값  : 거짓일때 값

	    //param 조건(1항):boolean
	     //참(2항),거짓(3항) : 어떤 자료형도 가능함 
		System.out.println(false ? "참이다옹" : "거짓부렁");
		System.out.println(true ? "참이다옹2" : 123);
		
		int jum = 88;
		String res1 = jum >= 80 ? "합격" : "불합격";
		System.out.println(jum+" : "+ res1);
		
		String res2 = jum >= 80 ? "우수" : 
			          jum >= 60 ? "정상" : "미달" ;
		System.out.println(jum+" : "+ res2);
	}

}


