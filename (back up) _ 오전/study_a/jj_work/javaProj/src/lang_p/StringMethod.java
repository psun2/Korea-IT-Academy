package lang_p;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		String a = "�������� �Ϳ����� aBcD eF Java ���� 1234";
				//  01 2 3456 789012345678901234 56789
		System.out.println(a.length());
		
		System.out.println(a.charAt(1));
		System.out.println(a.charAt(6));
		System.out.println(a.substring(6, 12));  //6 -> 11
		System.out.println(a.substring(6));  //6 -> 
		
		System.out.println(a.indexOf("a"));
		System.out.println(a.indexOf("av"));
		System.out.println(a.indexOf("a",3)); //������ġ(��)
		System.out.println(a.indexOf("a",11));
		System.out.println(a.indexOf("a",20));
		System.out.println(a.indexOf("korea"));
		System.out.println(a.indexOf("a",23));
		
		System.out.println(a.lastIndexOf("a"));
		System.out.println(a.lastIndexOf("a",3));//������ġ(��)
		System.out.println(a.lastIndexOf("a",20));
		
		String file = "aaa.bbb.ccc.dcdd.eee.ff.gggggggg...ce.txt";
		
		System.out.println(file.substring(file.lastIndexOf(".")+1));
		System.out.println(a.contains("a"));
		System.out.println(a.contains("korea"));
		
		System.out.println(a.startsWith("������"));
		System.out.println(a.startsWith("�����"));
		System.out.println(a.endsWith("34"));
		System.out.println(a.endsWith("56"));
		
		String col2 = "���¿�,������,������B.�ſ�ȭ,���αԤѷ�����,��ȣ��@�Ƚ���,������";
		
		String [] arr = col2.split("[.,@]");
		
		for (String str : arr) {
			System.out.println(str);
		}
		
		a = "�������� �Ϳ����� aBcD eF Java ���� 1234";
		
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		
		System.out.println(a.replace('a', '��'));
		System.out.println(a.replaceAll("a","����"));
		
		String b = "     �ڸ��� it ��ī����     ";
		
		System.out.println(b+":"+b.length());
		System.out.println(b.trim()+":"+b.trim().length());
		
		char [] chArr = a.toCharArray();
		
		System.out.println(Arrays.toString(chArr));
		
		System.out.println("�������� �Ϳ����� aBcD eF Java ���� 1234".toUpperCase());
		
		System.out.println("�Ʊ�".concat("���"));
		System.out.println("����"+"���");
		
	}

}

