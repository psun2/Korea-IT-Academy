package util_p;

import java.util.regex.Pattern;

public class RegexMain {

	public static void main(String[] args) {

		String name = "정우성abcd123";
		
		System.out.println(name.startsWith("정"));
		System.out.println(name=="정");
		System.out.println(name.contains("우"));
		System.out.println(name.contains("우성"));
		System.out.println(name.endsWith("123"));

		boolean chk = true;
		for (char ch : name.toCharArray()) {
			chk = "1234567890".contains(ch+"");
			System.out.println(ch+":"+chk);
			if(!chk)
				break;
		}
		
		System.out.println("숫자:"+chk);
		
		
		System.out.println("-----------------------");
		
		
		System.out.println(Pattern.matches("정.*", name));
		
		
		String [] mmArr= {"장동건","건","장서건","장혁","장남건",
                "장","장군","최장군","박장군","장군님",
                "장장장","김앤장이다","현빈","원빈","미스터빈","커피빈","커피","원두커피","장희빈",
                "ㄱㄴㄷ","ㄱㄹㄴ","ㅐㅓㅣㅔㅐ","ㅐㅔㅓㅐㅑㅓ","ㄱㅓㅔㅔㅔㄹㄴ",
                "하하하","하호허","팉툍하","하학","하햐","가긱공국","짱쩡맨","쑥ㄴ밬","샹쏑쑗",
                "다","공석호","김희애",
                "나야비","나비야","농ㅂ왕창","장ㄴ비용솽",
                "너탈비털아붕니","너비아니","헤르너비아샹쵕",
                "123-456","1234-5678",
                "1234-5678-9012","123-5678-9012","12-5678-9012","12-568-9012",
                "123-678-9012","123-567833-9012","12-58-9012","1a",
                "abc","abc_def","1234","9846","ab_1234","ab1234",
                "aaa@aaa.aaa","aaaaaa.aaa@","aaa12aaa_aaa@",
                "ab56","AABB","aBCd","1","3","1234abc@aaa.aaa",
                "1234abc@aaa.a","1a2b","a12",
                "^","^^","12^34abc@aaa.aaa","1a2b^","^a12","123456.^",
                "\\^","^\\^",".^","\\^^",
                "1234abc@aaa.aa.va","1234abc@a.aa.a.a.va"};
		
		
		String [] ppArr = {
				"장","장.","장*","장.*",".*빈",".장.",".*장.*",
				".*빈건",".*(빈건)",".*(빈|건)",".*빈|건",".*[빈건]",
				".*(장군|커피)",".*[장군|커피]", "\\d","\\d*",
				"[0-9]","[0-9]*","[a-z]*","[a-zA-Z]*","[a-zA-Z0-9]*",
				"[a-zA-Z0-9_*@-]*","[a-zA-Z0-9]*@[a-zA-Z0-9.]*",
				"[a-zA-Z0-9._*@-]{4}","[a-zA-Z0-9._*@-]{2,7}","[a-zA-Z0-9._*@-]{2,}",
				//"[a-zA-Z0-9._*@-]{,7}",
				"[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}",
				"[^0-9]*","[0-9^]*","^*","\\^*","[^^]*",
				"[ㄱ-ㅎ]*","[ㅏ-ㅣ]*","[가-힣]*","[가-힣ㄱ-ㅎㅏ-ㅣ]*",
				"[가-깋]*",".*ㄴㅂㅇ.*",".*[나-닣ㄴ][바-빟ㅂ][아-잏ㅇ].*"
				
				// ㄴㅂㅇ
		};
		
		
		for (String pp : ppArr) {
			
			System.out.print(pp+":");
			
			for (String mm : mmArr) {
				if(Pattern.matches(pp, mm))
					System.out.print(mm+",");
			}
			System.out.println();
		}
		
		
		
		String sabun = "a20020122_la";
		
		if(!Pattern.matches("[a-d][0-9]{8}_[a-z]{2,4}", sabun)) {
			System.out.println("에러");
		}else {
			System.out.println("정상");
		}
		
		
	}

}
