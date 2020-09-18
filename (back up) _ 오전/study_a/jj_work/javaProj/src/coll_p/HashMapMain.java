package coll_p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapMain {

	public static void main(String[] args) {
		Map map = new HashMap();
		
		int [] a = new int[] {11,22};
		
		map.put("red", "빨강");
		map.put("blue", "파랑");
		map.put("green", "녹색");
		map.put("red", 1234);
		map.put(100, "100이여");
		map.put(a, 123.456);
		map.put("red", new int[] {11,22});  //키가 중복될 경우 마지막 값이 value 가 됨
		map.put(new ArrayList(), "어레이리스트");
		map.put(new ComShape(5), "도형이여");
		
		map.remove(a);
		System.out.println(map);
		System.out.println(map.get("blue"));
		
		//향상된 for 문 사용 불가
		//for (Object obj : map) { }
		
		Set keySet = map.keySet();
		System.out.println("keySet() ----");
		for (Object obj : keySet) {
			System.out.println(obj);
		}
		
		Collection vv = map.values();
		
		System.out.println("map.values() ----");
		for (Object obj : vv) {
			System.out.println(obj);
		}
		
		
		Set entrySet = map.entrySet();
		
		System.out.println("entrySet() ----");
		for (Object obj : entrySet) {
			Entry en = (Entry)obj; 
			System.out.println(en.getKey()+":"+en.getValue());
		}
		
		
		System.out.println(map.containsKey("red"));
		System.out.println(map.containsKey("pink"));
		System.out.println(map.containsValue("파랑"));
		System.out.println(map.containsValue("분홍"));
		System.out.println(map.size());
		map.clear();
		System.out.println(map.size());
		
		
		
	}

}

