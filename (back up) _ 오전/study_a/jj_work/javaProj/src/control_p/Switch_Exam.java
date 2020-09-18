package control_p;

public class Switch_Exam {

	public static void main(String[] args) {

		String buseo = "생산부";

		String mt;
		
		switch(buseo) {
		
			case "인사부":
				mt = "바다";
				break;
			case "영업부":
				mt = "산";
				break;
			case "부부":
				mt = "안방";
				break;
			case "두부":
				mt = "콩밭";
				break;
			default:
				mt = "잔업";
				break;
		}
		
		System.out.println(buseo+":"+mt);
		
		//직급별 월급을 계산 하세요
	    //부장 : 50%, 과장 : 30%, 대리 : 20%, 사원:10%
	    //월급 :  기본급 + 기본급*보너스
	    //직급과 기본급은 입력받아 처리

		int basic=300;
		
		String pos = "과장";
		
		double bonus;

	   
		
		switch(pos) {
		
			case "부장":
				bonus = 0.5;
				break;
			case "과장":
				bonus = 0.3;
				break;
			case "대리":
				bonus = 0.2;
				break;
			case "사원":
				bonus = 0.1;
				break;
			default:
				bonus = 0;
				break;
		}
		
		int money = (int)((bonus+1)*basic);
	
		System.out.println(pos+":"+basic+"("+money+")");
		
	}

}
