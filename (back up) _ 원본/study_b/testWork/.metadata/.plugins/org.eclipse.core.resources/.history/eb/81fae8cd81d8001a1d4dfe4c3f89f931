package util_p;

import java.util.regex.Pattern;

public class RegexMain {

	public static void main(String[] args) {

		String name = "Á¤¿ì¼ºabcd123";
		
		System.out.println(name.startsWith("Á¤"));
		System.out.println(name=="Á¤");
		System.out.println(name.contains("¿ì"));
		System.out.println(name.contains("¿ì¼º"));
		System.out.println(name.endsWith("123"));

		boolean chk = true;
		for (char ch : name.toCharArray()) {
			chk = "1234567890".contains(ch+"");
			System.out.println(ch+":"+chk);
			if(!chk)
				break;
		}
		
		System.out.println("¼ýÀÚ:"+chk);
		
		
		System.out.println("-----------------------");
		
		
		System.out.println(Pattern.matches("Á¤.*", name));
		
		
		String [] mmArr= {"Àåµ¿°Ç","°Ç","Àå¼­°Ç","ÀåÇõ","Àå³²°Ç",
                "Àå","Àå±º","ÃÖÀå±º","¹ÚÀå±º","Àå±º´Ô",
                "ÀåÀåÀå","±è¾ØÀåÀÌ´Ù","Çöºó","¿øºó","¹Ì½ºÅÍºó","Ä¿ÇÇºó","Ä¿ÇÇ","¿øµÎÄ¿ÇÇ","ÀåÈñºó",
                "¤¡¤¤¤§","¤¡¤©¤¤","¤À¤Ã¤Ó¤Ä¤À","¤À¤Ä¤Ã¤À¤Á¤Ã","¤¡¤Ã¤Ä¤Ä¤Ä¤©¤¤",
                "ÇÏÇÏÇÏ","ÇÏÈ£Çã","»K¸…ÇÏ","ÇÏÇÐ","ÇÏÇá","°¡±ã°ø±¹","Â¯ÂÄ¸Ç","¾¦¤¤“U","¼§›÷œ¶",
                "´Ù","°ø¼®È£","±èÈñ¾Ö",
                "³ª¾ßºñ","³ªºñ¾ß","³ó¤²¿ÕÃ¢","Àå¤¤ºñ¿ë¼á",
                "³ÊÅ»ºñÅÐ¾ÆºØ´Ï","³Êºñ¾Æ´Ï","Çì¸£³Êºñ¾Æ¼§¬—",
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
				"Àå","Àå.","Àå*","Àå.*",".*ºó",".Àå.",".*Àå.*",
				".*ºó°Ç",".*(ºó°Ç)",".*(ºó|°Ç)",".*ºó|°Ç",".*[ºó°Ç]",
				".*(Àå±º|Ä¿ÇÇ)",".*[Àå±º|Ä¿ÇÇ]", "\\d","\\d*",
				"[0-9]","[0-9]*","[a-z]*","[a-zA-Z]*","[a-zA-Z0-9]*",
				"[a-zA-Z0-9_*@-]*","[a-zA-Z0-9]*@[a-zA-Z0-9.]*",
				"[a-zA-Z0-9._*@-]{4}","[a-zA-Z0-9._*@-]{2,7}","[a-zA-Z0-9._*@-]{2,}",
				//"[a-zA-Z0-9._*@-]{,7}",
				"[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}",
				"[^0-9]*","[0-9^]*","^*","\\^*","[^^]*",
				"[¤¡-¤¾]*","[¤¿-¤Ó]*","[°¡-ÆR]*","[°¡-ÆR¤¡-¤¾¤¿-¤Ó]*",
				"[°¡-ƒ‰]*",".*¤¤¤²¤·.*",".*[³ª-ˆ¢¤¤][¹Ù-•½¤²][¾Æ-Ÿç¤·].*"
				
				// ¤¤¤²¤·
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
			System.out.println("¿¡·¯");
		}else {
			System.out.println("Á¤»ó");
		}
		
		
	}

}
