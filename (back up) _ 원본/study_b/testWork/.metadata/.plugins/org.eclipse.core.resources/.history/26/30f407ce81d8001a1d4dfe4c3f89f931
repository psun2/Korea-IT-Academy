package lang_p;

public class StringMethodMain {

	public static void main(String[] args) {
		String a = "¼±»ý´Ô ±Í¿©¿ö¿ä AbcD eF Java ¸¸¼¼ 12a3a4";
				//  0 1234 56 789012345678901234567890
		System.out.println(a.length());
		
		System.out.println(a.charAt(0));
		char ch = a.charAt(30);
		System.out.println(ch);
		String str1 = a.substring(2,7);
		System.out.println(str1);
		System.out.println(a.substring(2));
		
		System.out.println(a.indexOf("a"));
		System.out.println(a.indexOf("k"));
		System.out.println(a.indexOf("2a"));
		System.out.println(a.indexOf("a",19));
		System.out.println(a.indexOf("a",21));
		
		
		System.out.println(a.lastIndexOf("a"));
		System.out.println(a.lastIndexOf("a",25));
		System.out.println(a.lastIndexOf("a",17));
		
		String file = "adsfe.efet.vdet.vdgetgfg.txt";
		
		System.out.println(file.substring(file.lastIndexOf(".")+1));
		
		System.out.println(a.contains("a"));
		System.out.println(a.contains("korea"));
		
		System.out.println(a.startsWith("¼±»ý´Ô"));
		System.out.println(a.startsWith("°­»ç´Ô"));
		System.out.println(a.endsWith("a4"));
		System.out.println(a.endsWith("b4"));
		
		String name = "¹Ú½ÃÇö,ÀÌÁÖÇõ.±è¿¬¼·-¿À¹Î¼®,ÀåÁ¤È£,ÀÌÈ£ÀÎ,±è¿µÀç";
		String [] arr = name.split("[,.-]");
		
		for (String string : arr) {
			System.out.println(string);
		}
		
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		
		//¼±»ý´Ô ±Í¿©¿ö¿ä Abcd Ef Java ¸¸¼¼ 12a3a4
		String aaa = "";
		for (String s : a.toLowerCase().split(" ")) {
			
			aaa+=s.toUpperCase().substring(0,1)
					+s.substring(1)
					+" ";
		}
		aaa=aaa.substring(0,aaa.length()-1);
		System.out.println(aaa);
		System.out.println(aaa.length());
		
		System.out.println(a.replace("a", "¿¡ÀÌ"));
		
		char [] chArr = a.toCharArray();
		
		for (int i = 0; i < chArr.length; i++) {
			System.out.println(i+":"+chArr[i]);
		}
		
		String b = "     korea aca     ";
		
		System.out.println(b+":"+b.length());
		System.out.println(b.trim()+":"+b.trim().length());
		
		System.out.println(b.concat("¹è°íÆÎ"));
	}

}

