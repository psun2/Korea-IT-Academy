package lang_p;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		String a = "선생님은 귀여워요 aBcD eF Java 만세 1234";
				//  01 2 3456 789012345678901234 56789
		System.out.println(a.length());
		
		System.out.println(a.charAt(1));
		System.out.println(a.charAt(6));
		System.out.println(a.substring(6, 12));  //6 -> 11
		System.out.println(a.substring(6));  //6 -> 
		
		System.out.println(a.indexOf("a"));
		System.out.println(a.indexOf("av"));
		System.out.println(a.indexOf("a",3)); //시작위치(앞)
		System.out.println(a.indexOf("a",11));
		System.out.println(a.indexOf("a",20));
		System.out.println(a.indexOf("korea"));
		System.out.println(a.indexOf("a",23));
		
		System.out.println(a.lastIndexOf("a"));
		System.out.println(a.lastIndexOf("a",3));//시작위치(뒤)
		System.out.println(a.lastIndexOf("a",20));
		
		String file = "aaa.bbb.ccc.dcdd.eee.ff.gggggggg...ce.txt";
		
		System.out.println(file.substring(file.lastIndexOf(".")+1));
		System.out.println(a.contains("a"));
		System.out.println(a.contains("korea"));
		
		System.out.println(a.startsWith("선생님"));
		System.out.println(a.startsWith("강사님"));
		System.out.println(a.endsWith("34"));
		System.out.println(a.endsWith("56"));
		
		String col2 = "리승원,서샛별,리지연B.신영화,리민규ㅡ륜종운,리호석@안식혁,리슬아";
		
		String [] arr = col2.split("[.,@]");
		
		for (String str : arr) {
			System.out.println(str);
		}
		
		a = "선생님은 귀여워요 aBcD eF Java 만세 1234";
		
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		
		System.out.println(a.replace('a', '에'));
		System.out.println(a.replaceAll("a","에이"));
		
		String b = "     코리아 it 아카데미     ";
		
		System.out.println(b+":"+b.length());
		System.out.println(b.trim()+":"+b.trim().length());
		
		char [] chArr = a.toCharArray();
		
		System.out.println(Arrays.toString(chArr));
		
		System.out.println("선생님은 귀여워요 aBcD eF Java 만세 1234".toUpperCase());
		
		System.out.println("아기".concat("상어"));
		System.out.println("엄마"+"상어");
		
	}

}

