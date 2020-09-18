package oops_p;

import java.util.Arrays;

class RetCla{
	
	int a = 123;
	
	int meth_1() {
		System.out.println("meth_1() 실행");
		
		return 100;
	}
	
	int getA() {
		System.out.println("getA() 실행");
		
		return a;
	}
	
	int [] meth_2() {
		System.out.println("meth_2() 실행");
		
		return new int[] {10,20};  //계속 새로 생성
	}	
	
	RetMember makeRM() {
		
		RetMember ret = new RetMember();
		
		return ret;
	}
	
	RetMember rmInit(String name, String tel,int age) {
		
		RetMember ret = new RetMember();
		ret.init(name, tel, age);
		return ret;
	}
	
}

class RetMember{
	
	String name, tel;
	int age;
	
	void init(String name, String tel,int age) {
		this.name = name;
		this.tel = tel;
		this.age = age;
	}
	
	void ppp() {
		String ttt = name +"\t"+tel+"\t"+age;
		System.out.println(ttt);
	}
	
}




public class ReturnMain {

	public static void main(String[] args) {
		RetCla rc = new RetCla();
		int r1 = rc.meth_1();
		System.out.println("r1:"+r1);
		System.out.println("getA():"+rc.getA());
		rc.a = 456;
		System.out.println("getA():"+rc.getA());
		
		int [] r2 = rc.meth_2();  //1
		r2[1] = 2222;
		System.out.println("r2:"+Arrays.toString(r2));
		System.out.println("rc.meth_2():"+Arrays.toString(rc.meth_2())); //2
		
		rc.meth_2()[1]=3333; //3
		System.out.println("rc.meth_2():"+Arrays.toString(rc.meth_2())); //4
		
		RetMember rm = new RetMember();
		rm.init("김태희", "1111-1111",34);
		
		rm.ppp();
		
		RetMember rm2 = rc.makeRM();
		rm2.init("김소희", "222-2222",36);
		rm2.ppp();
		
		RetMember rm3 = rc.rmInit("김중희", "3333-3333",39);
		
		rm3.ppp();
		
		
		RetMember [] arr = {
				rc.rmInit("장혁", "123",41),
				rc.rmInit("단혁", "456",42),
				rc.rmInit("중혁", "789",38),
				rc.rmInit("이혁", "901",37)
		};
		
		for (RetMember rr : arr) {
			rr.ppp();
		}
		
		/*
		까페를 구현하세요

		(커피이름, 아이스/핫, 스페셜(샷추가/사이즈업/노멀)) 등을 넣어 커피를 리턴해주세요
  				
  		커피이름 : 
  		아메리카노 2000  아시아노 2300  아프리카노 2700
  		
  		아이스 +300  , 핫 +0
  		
  		샷추가 +200 , 사이즈업+1000, 노멀 +0
  		
		커피 : 커피이름, 가격

		리턴을 클래스로 할것
		 */
	}

}
