package basic_p;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//param : ����, ����
		//ret :  ����, ����
		System.out.println("2.1 ���������");
		
		int a = 15, b = 7;
		String str2 = a+" + "+b+" = "+ (a+b) ;
		System.out.println(str2);
		System.out.println(a+" - "+b+" = "+ (a-b) );
		System.out.println(a+" * "+b+" = "+ a*b );
		System.out.println(a+" / "+b+" = "+ a/b );
		System.out.println(a+" % "+b+" = "+ a%b );
		
		
		String s = "���켺", t = "����";
		//System.out.println(s+t); //���ڿ��� ���ϱ� ���길 ����
		//System.out.println(s+a); //���ڿ��� ���ϱ� ���길 ����
		System.out.println(s+" + "+t+" = "+ (s+t) );
		System.out.println(s+" + "+b+" = "+ (s+b) );
		/*
		 * System.out.println(s-t); 
		 * System.out.println(s*t); 
		 * System.out.println(s/t);
		 * System.out.println(s%t);
		 */
		
		
		//param : ����, ����
		//ret :  boolean
		System.out.println("2.2 �񱳿�����");
		a = 10;
		b = 20;
//		System.out.println(a > b-15);
//		System.out.println(a >= b);
//		//System.out.println(a => b);
//		System.out.println(a <= b);
//		System.out.println(a < b);
//		System.out.println(a == b);
//		System.out.println(a != b);
		//System.out.println(a+" > "+b+" = "+ a>b ); ���� ,���� ũ�� �� X
		//System.out.println(10 > "����" );
		System.out.println(10 > 'a' );
		System.out.println(a+" > "+b+" = "+ (a>b) );
		System.out.println(a+" >= "+b+" = "+ (a>=b) );
		System.out.println(a+" <= "+b+" = "+ (a<=b) );
		System.out.println(a+" < "+b+" = "+ (a<b) );
		System.out.println(a+" == "+b+" = "+ (a==b) );
		System.out.println(a+" != "+b+" = "+ (a!=b) );
		
		s = "���켺";
		t = "���¼�";  //���ڿ��� ���� , �ٸ��ٸ� ����
//		System.out.println(s+" > "+t+" = "+ (s>t) );
//		System.out.println(s+" >= "+t+" = "+ (s>=t) );
//		System.out.println(s+" <= "+t+" = "+ (s<=t) );
//		System.out.println(s+" < "+t+" = "+ (s<t) );
		System.out.println(s+" == "+t+" = "+ (s==t) );
		System.out.println(s+" != "+t+" = "+ (s!=t) );
		
		
		//param : boolean
		//ret :  boolean
		System.out.println("2.3 ��������");
		
		boolean c= false, d =  false;
		System.out.println(c && d);	//������ ���� ���  true �� ��� true
		System.out.println(c || d); //�ϳ��� ���� ����  true �� ��� true
		System.out.println(c ^ d);  //������ ���� �ݴ��� ��� true
		
		int age = 26;
		String color = "����";
		
		//boolean ageChk = age < 25, ccChk =  color == "����";
		
//		System.out.println("And:"+ (ageChk && ccChk));
//		System.out.println("Or:"+ (ageChk || ccChk));
//		System.out.println("Xor:"+ (ageChk ^ ccChk));
		System.out.println("And:"+ (age < 25+10 && color == "����"));
		System.out.println("Or:"+ (age < 25 || color == "����"));
		System.out.println("Xor:"+ (age < 25 ^ color == "����"));
		
		/*
        ���� xx �� �޾� 3�� ����̰ų� 2�� ������� Ȯ���ϼ���
        3�� ����� 2�� ����� �Ѵ� �´����� Ȯ���ϼ���*/
		
		int xx = 36;
		//System.out.println("2 and 3:"+ (xx%2==0 && xx%3==0));
		System.out.println("2 and 3:"+ (xx%(3*2)==0));
		System.out.println("2 or 3:"+ (xx%2==0 || xx%3==0));
		
		
		//14, 15,    12, 8
		
		
		//param : ����
		//ret :  ����
		System.out.println("2.4 shift  ������");
		System.out.println("5<<2 : "+ (5<<2));  
		
		   /*0101 << 2  --> 0101 00  -->   0 0 0 1     	0 1 0 0
											   5 4		3 2 1 0
											  32 16     8 4 2 1
											   0+16 +   0+4+0+0  :20
		///   <<  ��� ,���� ���: 0													 */
		System.out.println(" -6<<3 : "+ (-6<<3));  //1111 1010 <<3 
		                                           // 1111 1101 0000
		
		///   >>  ��� : 0 , ����:1
		System.out.println(" 11>>2 : "+ (11>>2));  //0000 1011 >>2
		                                 // 00  0000 10   11  --> 0000 0010  
		System.out.println("-20>>3 : "+ (-20>>3)); 
		//      1111 1111   1111 1111   1111 1111   1110 1100 >>3
		//111   1111 1111   1111 1111   1111 1111   1110 1100 
		//111   1111 1111   1111 1111   1111 1111   1110 1
		//      1111 1111   1111 1111   1111 1111   1111 1101
		
		///   >>>  ��� ,���� ���: 0
		System.out.println(" 11>>>2 : "+ (11>>>2));  //0000 1011 >>2
        // 00  0000 10   11  --> 0000 0010  
		System.out.println("-20>>>3 : "+ (-20>>>3)); //1110 1100 >>3
		//    1111 1111 1111 1111 1111 1111 1110 1100 >>3
		//000 1111 1111 1111 1111 1111 1111 1110 1100 >>3
		//000 1111 1111 1111 1111 1111 1111 1110 1
		//0001 1111 1111 1111 1111 1111 1111 1101
		
		
		
		//param : ����
		//ret :  ����
		System.out.println("2.5 bit ������");
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
		//param : ����, ����
		//ret :  ����, ����
		System.out.println("2.6 ���� ������");
		a = 10;
		
		System.out.println("a:"+a);
		
		//a = a+5;
		//a+=5;
		//System.out.println("a+=5:"+a);
		//System.out.println("a+=5:"+ a+=5 );   �켱������ ���� ����
		System.out.println("a+=5:"+(a+=5));
		System.out.println("a-=3:"+(a-=3));
		System.out.println("a*=4:"+(a*=4));
		System.out.println("a/=5:"+(a/=5));
		System.out.println("a%=4:"+(a%=4));
		
		
		System.out.println("1. 1�׿�����");
		
		int e = 5;
		boolean f = false;
		System.out.println(-e);
		System.out.println(f);
		System.out.println(!f);
		System.out.println("1.2 ����������");
		//e = e + 1;
		e++;
		System.out.println(e);
		e--;
		System.out.println(e);
		//e**;
		//e//;
		//e%%;
		System.out.println(e);
		
		//int k = e++;  ��ġ����
		int k = ++e;	//��ġ����
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
		
		
		
		System.out.println("3. ���� ������");
		// ���� ?  ���϶� ��  : �����϶� ��

	    //param ����(1��):boolean
	     //��(2��),����(3��) : � �ڷ����� ������ 
		System.out.println(false ? "���̴ٿ�" : "�����η�");
		System.out.println(true ? "���̴ٿ�2" : 123);
		
		int jum = 88;
		String res1 = jum >= 80 ? "�հ�" : "���հ�";
		System.out.println(jum+" : "+ res1);
		
		String res2 = jum >= 80 ? "���" : 
			          jum >= 60 ? "����" : "�̴�" ;
		System.out.println(jum+" : "+ res2);
	}

}


