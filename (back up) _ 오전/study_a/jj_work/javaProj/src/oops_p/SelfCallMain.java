package oops_p;

class SelfCall{
	
	String pre="";
	
	int meth(int no) {
		
		int res = no;
	
		String myPre=pre;
		pre+="\t";
		System.out.println(myPre+"시작:"+no+","+res);
		if(no>0)		//조건
			res += meth(no-1); //증감
		
		System.out.println(myPre+"끝:"+no+","+res);
		
		return res;
	}
	
}
public class SelfCallMain {

	public static void main(String[] args) {
		SelfCall sc = new SelfCall();
		System.out.println("main:"+sc.meth(5)); //초기값

	}
	
	/*
	 커피를 주문하세요

아메리카노(커피종류)  - 3000
카페라떼(커피종류, 우유량) - 3300
카라멜마끼아또(커피종류, 우유량, 카레멜 시럽) - 3500
카페모카(커피종류, 우유량, 휘핑있음없음) - 3500



각 커피별 주문 수량과 총금액을 출력하세요

//////////////////////
 * 
 * //// 컴퓨터를 조립하세요
 // 태블릿 - 본체(이름,가격)
 // 노트북 - 본체(이름,가격), 마우스(이름,가격)
 // 데스크탑 - 본체(이름,가격), 마우스(이름,가격), 키보드(이름,가격)
 ///  컴퓨터 - 제품명, 가격 , 부품 등에 대한 정보가 보일 것
 
 
 ------------------------------------------------------------------------------------------------------ 
 /////// 종류를 구분하세요
 /// 마우스 - 무선/유선, 게이밍/일반
 /// 키보드 - 기계식/전자식, 무선/유선, led/페인팅
 //// 클래스로 입력받고, 클래스를 출력할 것
 ///  컴퓨터 - 제품명, 가격 , 제원 등에 대한 정보가 보일 것

 
 
 //////////////////////
  * 
  * 재귀함수 이용하여 1-> 1000 369 출력
  * 
  * 



	 
	 
	 
	 * */

}
