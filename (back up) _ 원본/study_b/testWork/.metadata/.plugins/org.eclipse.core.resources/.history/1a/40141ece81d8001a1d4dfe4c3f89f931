package control_p;

public class SwitchMain {

	public static void main(String[] args) {

		//switch(10) {
		//switch(true) {  		에러
		//switch(123.456) {		에러
		//switch("아기상어") {
		switch(100) {
		
			case 5:
				System.out.println("5 입니다.");
				break;
			case 20:
				System.out.println("20 입니다.");
				break;
			default:
				System.out.println("기본값 입니다.");
				break;
			case 7:
				System.out.println("7 입니다.");
				break;	//제어문 탈출 예약어  - if 문 제외
			case 12:
				System.out.println("12 입니다.");
				break;
			case 8:
				System.out.println("8 입니다.");
				break;
		}
		
		
		String buseo = "영업";
		String mt;
		switch(buseo) {
			case "인사":
				mt="바다";
				break;
			case "영업":
				mt="산";
				break;
			case "두부":
				mt="콩밭";
				break;
			case "부부":
				mt="안방";
				break;
			default:
				mt="야근";
				break;
		}
		
		System.out.println(buseo+":"+mt);
		
		
		double rr = 1.94;  //D+
		
		//int buf = (int)(rr*10)/5;
		//int buf = (int)(rr*2);
		
		//System.out.println(buf);
		String res;
		switch((int)(rr*2)) {
			case 9:
				res = "A+";
				break;
			case 8:
				res = "A";
				break;
			case 7:
				res = "B+";
				break;
			case 6:
				res = "B";
				break;
			case 5:
				res = "C+";
				break;
			case 4:
				res = "C";
				break;
			case 3:
				res = "D+";
				break;
			case 2:
				res = "D";
				break;
			default :
				res = "F";
				break;
		}
		
		System.out.println(rr+":"+res);
		
		String res2="F";
		switch((int)rr) {
			
			case 4:
				res2 = "A";
				break;
			
			case 3:
				res2 = "B";
				break;
			
			case 2:
				res2 = "C";
				break;
			
			case 1:
				res2 = "D";
				break;	
		}
		
		if((int)(rr-(int)rr+0.5)==1 && rr>1)
			res2+="+";
		
		System.out.println(rr+":"+res2);
		
		String res3="";
		
		if(rr<1)
			res3="F";
		else {
			res3+=(char)('E'-(int)rr);
			if((int)(rr-(int)rr+0.5)==1)
				res3+="+";
		}
		System.out.println(rr+":"+res3);

	}

}
