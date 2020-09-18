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
		
		map.put("red", "����");
		map.put("blue", "�Ķ�");
		map.put("green", "���");
		map.put("red", 1234);
		map.put(100, "100�̿�");
		map.put(a, 123.456);
		map.put("red", new int[] {11,22});  //Ű�� �ߺ��� ��� ������ ���� value �� ��
		map.put(new ArrayList(), "��̸���Ʈ");
		map.put(new ComShape(5), "�����̿�");
		
		map.remove(a);
		System.out.println(map);
		System.out.println(map.get("blue"));
		
		//���� for �� ��� �Ұ�
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
		System.out.println(map.containsValue("�Ķ�"));
		System.out.println(map.containsValue("��ȫ"));
		System.out.println(map.size());
		map.clear();
		System.out.println(map.size());
		
		
		
	}

}

