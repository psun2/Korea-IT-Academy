package basic_p;

public class Casting {

	public static void main(String[] args) {

		System.out.println("1. ���� <-> �Ǽ�");
		int ii =123;
		
		System.out.println(ii);
		
		double dd = ii;    //������ ����ȯ
		System.out.println(dd);
		dd = 123.456;
		System.out.println(dd);
		
		ii =(int)dd;   //����� ����ȯ	
		
		System.out.println(ii);
		
		System.out.println("2. ���� <-> ���� (���)");
		
		byte bb = 50;
		
		short sh= bb;
		
		System.out.println(sh);
		
		/*
		 
		 byte						short
		  0   000 0000    	 		0  000 0000   0000 0000 
		 ��ȣ     �� ----->             ��ȣ  ��   ------------->
		 0 :���
		 1 :����
		  0000 0000 0			0		0000 0000   0000 0000
		  0000 0001 1			1		0000 0000   0000 0001
		  0000 0010 2			2		0000 0000   0000 0010
		  ... 
		  0111 1110 126			126		0000 0000   0111 1110
		  0111 1111 127			127		0000 0000   0111 1111
		  1000 0000 -128		128		0000 0000	1000 0000   
		  1000 0001 -127		129		0000 0000	1000 0001 
		  1000 0010 -126		130		0000 0000	1000 0010 
		  ...
		  1111 1110 -2			254		0000 0000	1111 1110
		  1111 1111 -1			255		0000 0000	1111 1111	
	1     0000 0000  0			256		0000 0001	0000 0000	
		 */
		
		sh =127;
		sh =128;
		sh =129;
		sh =254;
		sh =255;
		sh =256;
		sh =257;
		sh =1;
		System.out.println(sh);
		
		bb = (byte)sh;
		
		System.out.println(bb);
		sh = 32767;
		System.out.println(sh);
		ii = sh;
		System.out.println(ii);
		ii = 32768;
		ii = 32769;
		ii = 65535;
		System.out.println(ii);
		sh = (short)ii;
		System.out.println(sh);
		
		
		System.out.println("2. ���� <-> ���� (����)");
		bb = -10;
		sh = bb;
		System.out.println(bb);
		System.out.println(sh);
		sh = -128; //-128
		sh = -130; // 126
		sh = -254; // 2
		sh = -255;//  1
		sh = -256;//  0
		sh = -257;// -1
		bb = (byte)sh;
		System.out.println(sh);
		System.out.println(bb);
		
		/*
		 
		 byte						short
		  0   000 0000    	 		0  000 0000   0000 0000 
		 ��ȣ     �� ----->             ��ȣ  ��   ------------->
		 0 :���
		 1 :����
		  0000 0000 0			0		0000 0000   0000 0000
		  0000 0001 1			1		0000 0000   0000 0001
		  0000 0010 2			2		0000 0000   0000 0010
		  ... 
		  0111 1110 126			126		0000 0000   0111 1110
		  0111 1111 127			127		0000 0000   0111 1111
		  1000 0000 -128		128		0000 0000	1000 0000   
		  1000 0001 -127		129		0000 0000	1000 0001 
		  1000 0010 -126		130		0000 0000	1000 0010 
		  ...
		  1111 1110 -2			254		0000 0000	1111 1110
		  1111 1111 -1			255		0000 0000	1111 1111	
	1     0000 0000  0			256		0000 0001	0000 0000
	
		  0111 1111 127 		-129	1111 1111	0111 1111
		  0111 1110 126 		-130	1111 1111	0111 1110
		  0000 0010 2	 		-254	1111 1111	0000 0010
		  0000 0001 1	 		-255	1111 1111	0000 0001
		  0000 0000 0	 		-256	1111 1111	0000 0000
		 */
		
		
		System.out.println("3. ���� <-> boolean ����ȯ �Ұ�");
		
		ii = 1;
		//boolean bo = (boolean)ii;  ����
		boolean bo = true;
		//ii = (int)bo;   			  ����
		//bo = (boolean)dd;			//����
		//dd = (double)bo;			����
		
		
		System.out.println("4. ���� <-> ����");
		
		char ch = 'a';
		System.out.println(ch);
		ii = ch;
		System.out.println(ii);
		ii = 100;			//������ ����ȯ
		ch = (char)ii;		//����� ����ȯ
		System.out.println(ii);
		System.out.println(ch);
		ch = '3';
		ii = ch;
		System.out.println(ch);
		System.out.println(ii);
		System.out.println(ii+5);
		System.out.println(3+5);
		System.out.println('3'-'0'+5);
		ch = 'F';
		System.out.println((char)(ch+'a'-'A'));
		
		ch = 'q';
		System.out.println((char)(ch-'a'+'A'));
	}

}
