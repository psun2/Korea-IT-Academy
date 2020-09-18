package coll_p;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class HMAAA{
	
}

public class HashMapMain {

	public static void main(String[] args) {
		Map mm = new HashMap();
		
		mm.put("red", "»¡°­");
		mm.put("blue", "ÆÄ¶û");
		mm.put("yellow", "³ë¶û");
		mm.put("blue", "ÆÛ·©ÀÌ");
		mm.put("red", "»¡°£¸À");
		mm.put("orange", "¿À¿ì·»Áö");
		mm.put("green", "³ì»ö");
		mm.put("rrr", "»¡°­");
		mm.put(123, "¿À¿ì·»Áö");
		mm.put(new HMAAA(), 123.456);
		
		System.out.println(mm);
		System.out.println(mm.get(0));
		System.out.println(mm.get("red"));
		mm.remove("rrr");
		System.out.println(mm);
		System.out.println(mm.size());
		System.out.println(mm.containsKey("red"));
		System.out.println(mm.containsKey("pink"));
		System.out.println(mm.containsValue("¿À¿ì·»Áö"));
		System.out.println(mm.containsValue("»ç°ú"));
		
		
//		for (Object oo : mm ) {
//			
//		}
		
		Set kSet = mm.keySet();
		Set enSet = mm.entrySet();
		Collection vv = mm.values();
		System.out.println(kSet);
		System.out.println(enSet);
		System.out.println(vv);
		
		System.out.println("kSet : ------------------");
		for (Object oo: kSet) {
			System.out.println(oo+":"+mm.get(oo));
		}
		
		System.out.println("vv : ------------------");
		for (Object oo: vv) {
			System.out.println(oo);
		}
		
		System.out.println("enSet : ------------------");
		for (Object oo: enSet) {
			Map.Entry en = (Map.Entry)oo; 
			//System.out.println(en);
			System.out.println(en.getKey()+":"+en.getValue());
		}
		
		
	}

}



