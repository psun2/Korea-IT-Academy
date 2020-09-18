package coll_p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {
		ArrayList arr1 = new ArrayList();
		
		System.out.println("arr1:"+arr1);
		arr1.add(100);
		System.out.println("arr1.add(100):"+arr1);
		arr1.add("ÀÌ¹Î±Ô");
		System.out.println("arr1.add(\"ÀÌ¹Î±Ô\"):"+arr1);
		arr1.add(300);
		System.out.println("arr1.add(300):"+arr1);
		arr1.add(400);
		System.out.println("arr1.add(400):"+arr1);
		arr1.add(2,11);
		System.out.println("arr1.add(2,11):"+arr1);
		
		System.out.println("arr1.get(2):"+arr1.get(2));
		
		
		ArrayList arr2 = new ArrayList();
		arr2.add("¿ÀÀÚÀ±");
		arr2.add("Á¤¿øÅÂ");
		arr2.add("±èµµ±Õ");
		arr2.add("À¯ÂùÈñ");
		
		arr1.addAll(arr2);
		System.out.println("arr1.addAll(arr2):"+arr1);
		ArrayList arr3 = new ArrayList(arr2);
		ArrayList arr4 = arr2;
		ArrayList arr5= new ArrayList();
		arr5.addAll(arr2);
		System.out.println("arr2:"+arr2);
		System.out.println("arr3:"+arr3);
		System.out.println("arr4:"+arr4);
		System.out.println("arr5:"+arr5);
		
		arr2.set(2, "ÀÌ½ÂÈ¯");
		System.out.println("arr2.set(2, \"ÀÌ½ÂÈ¯\")");
		System.out.println("arr2:"+arr2);
		System.out.println("arr3:"+arr3);
		System.out.println("arr4:"+arr4);
		System.out.println("arr5:"+arr5);
		
		System.out.println("arr2.size():"+arr2.size());
		arr1.add(300);
		arr1.add(400);
		System.out.println("arr1:"+arr1);
		arr1.remove("Á¤¿øÅÂ");
		System.out.println("arr1.remove(\"Á¤¿øÅÂ\"):"+arr1);
		//arr1.remove(300);
		arr1.remove((Object)300);  //¾Õ ÀÎµ¦½º 1°³ »èÁ¦
		System.out.println("arr1.remove((Object)300):"+arr1);
		arr1.remove(4);
		System.out.println("arr1.remove(4):"+arr1);
		//arr1.removeAll((Object)400); 400À» ´ÙÁö¿î´Ù ¶ó´Â ÀÇ¹Ì°¡ ¾Æ´Ô
		arr1.removeAll(arr2);
		System.out.println("arr1.removeAll(arr2):"+arr1);
		
		System.out.println("arr1.indexOf(\"ÀÌ¹Î±Ô\"):"+arr1.indexOf("ÀÌ¹Î±Ô"));
		System.out.println("arr1.indexOf(400):"+arr1.indexOf(400));
		System.out.println("arr1.lastIndexOf(400):"+arr1.lastIndexOf(400));
		System.out.println("arr1.indexOf(\"»ï¹Î±Ô\"):"+arr1.indexOf("»ï¹Î±Ô"));
		System.out.println("arr1.contains(\"»ï¹Î±Ô\"):"+arr1.contains("»ï¹Î±Ô"));
		System.out.println("arr1.contains(\"ÀÌ¹Î±Ô\"):"+arr1.contains("ÀÌ¹Î±Ô"));
		
		System.out.println("arr1:"+arr1);
		List arr12 = arr1.subList(1,4);
		System.out.println("arr1.subList(1,4):"+arr12);
		List arr13 = arr1.subList(2,5);
		System.out.println("arr1.subList(2,5):"+arr13);
		List arr14 = new ArrayList(arr1.subList(1,4));
		System.out.println("new ArrayList(arr1.subList(1,4)):"+arr14);
		//List arr15 = arr1.subList(1,4).clone();
		List arr15 = ((List)arr1.clone()).subList(1,4);
		System.out.println("((List)arr1.clone()).subList(1,4):"+arr15);
		//List arr16 = (List)((ArrayList)arr1.subList(1,4)).clone();
		//System.out.println("(List)((ArrayList)arr1.subList(1,4)).clone():"+arr16);
		
		System.out.println("arr12.set(1, 1234)");
		arr12.set(1, 1234);
		System.out.println("arr1:"+arr1);
		System.out.println("arr12:"+arr12);
		System.out.println("arr13:"+arr13);
		System.out.println("arr14:"+arr14);
		
		System.out.println("arr12.add(5678)");
		//arr12.add(5678);
		//arr12.remove(1);
		arr1.add(5678);
		System.out.println("arr1:"+arr1);
		//System.out.println("arr12:"+arr12);
		//System.out.println("arr13:"+arr13);
		System.out.println("arr14:"+arr14);
		System.out.println("arr15:"+arr15);
		
		arr14.retainAll(arr1);
		System.out.println("arr14.retainAll(arr1):"+arr14);
		System.out.println("arr14.isEmpty():"+arr14.isEmpty());
		arr14.clear();
		System.out.println("arr14.clear():"+arr14);
		System.out.println("arr14.isEmpty():"+arr14.isEmpty());
		
		System.out.println("arr1:"+arr1);
		//arr1.sort(null);
		
		ArrayList arrNum = new ArrayList();
		
		arrNum.add(5);
		arrNum.add(23);
		arrNum.add(9);
		arrNum.add(17);
		arrNum.add(88);
		arrNum.add(16);
		arrNum.add(52);
		
		
		ArrayList arrStr = new ArrayList();
		
		arrStr.add("ºÎÀå");
		arrStr.add("°úÀå");
		arrStr.add("´ë¸®");
		arrStr.add("»ç¿ø");
		arrStr.add("ÀÓ¿ø");
		arrStr.add("»çÀå");
		
		System.out.println("arrNum:"+arrNum);
		Collections.reverse(arrNum);
		System.out.println("Collections.reverse(arrNum):"+arrNum);
		arrNum.sort(null);
		System.out.println("arrNum.sort(null):"+arrNum);
		Collections.reverse(arrNum);
		System.out.println("Collections.reverse(arrNum):"+arrNum);
		
		System.out.println("arrStr:"+arrStr);
		arrStr.sort(null);  //¹®ÀÚ¿­µµ Á¤·Ä
		System.out.println("arrStr.sort(null):"+arrStr);
	}

}
