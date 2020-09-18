package util_p;

import java.util.regex.Pattern;

public class RegexMain {

	public static void main(String[] args) {
		
		System.out.println("��"=="�̽���");
		System.out.println("��".equals("�̽���"));
		System.out.println("�̽���".startsWith("��"));
		System.out.println("��.*".equals("�̽���"));
		
		System.out.println();
		System.out.println(Pattern.matches( "��.*","�̽���"));
		System.out.println(Pattern.matches( "��.*","�����"));
		System.out.println(Pattern.matches( ".*��.*","�̽���"));
		System.out.println(Pattern.matches( ".*��.*","�����"));
		System.out.println(Pattern.matches( ".*��.*","����Ƽ"));
		System.out.println(Pattern.matches( ".*��.*","������"));
		
		
		String [] mmArr= {"�嵿��","��","�弭��","����","�峲��",
                "��","�屺","���屺","���屺","�屺��",
                "������","������̴�","����","����","�̽��ͺ�","Ŀ�Ǻ�","Ŀ��","����Ŀ��","�����",
                "������","������","���äӤĤ�","���Ĥä�����","���äĤĤĤ���",
                "������","��ȣ��","�K����","����","����","�������","¯�ĸ�","�����U","������",
                "��","����ȣ","�����",
                "���ߺ�","�����","�󤲿�â","�夤����",
                "��Ż���оƺش�","�ʺ�ƴ�","�츣�ʺ�Ƽ���",
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
		
		String [] ppArr= {
				"��","��.","��.*",".��.",".*��.*" ,".*��",
				".*���", ".*��|��", ".*(��|��)",".*[���]","��*",
				"[0-9]","[0-9]*","[a-z]*","[a-zA-Z]*","[a-zA-Z0-9]*",
				"[a-zA-Z0-9_@.]*","[a-zA-Z0-9_.]*@[a-zA-Z0-9_.]*",
				"{4}","{4,}","[a-zA-Z0-9_@.]{4}","[a-zA-Z0-9_@.]{4,}",
				"[a-zA-Z0-9_@.]{2,7}","[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}",
				"\\d{2,3}-\\d{3,4}-\\d{4}",
				"[^0-9]*","[��-��]*","[��-��]*","[��-�R]*","[��-����].*"
				,".*[��-����][��-����][��-�礷].*"
		};
		
		for (String pp : ppArr) {
			System.out.print(pp+" : ");
			
			for (String mm : mmArr) {
				
				if(Pattern.matches(pp, mm)) {
					System.out.print(mm+" , ");
				}
			}
			System.out.println();
		}
		

	}

}
