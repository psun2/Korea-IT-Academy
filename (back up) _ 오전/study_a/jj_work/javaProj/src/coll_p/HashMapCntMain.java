package coll_p;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapCntMain {

	public static void main(String[] args) {

		int [] arr = {6,9,8,12,4,67,4,6,67,8,12,9,5,12,4,3};
		
		HashMap map = new HashMap();
		
		for (int i : arr) {
			
			int vv = 1;
			
			if(map.containsKey(i))
				vv += ((int)map.get(i));
			
			map.put(i, vv);
		}
		
		for (Object obj : map.entrySet()) {
			Entry en = (Entry)obj;
			System.out.println(en.getKey()+":"+en.getValue());
		}
		
		// 홈팀, 어웨이 팀 별 타자순서대로 안타 횟수를 기록하세요

		//"h3","a5","a7","h9","h1","h3","a5","a6","h2","a3","a5","h9","h3","a7","h9"
		
		String [] hit = {"h31","a52","a16","h2","a32","h31","a52","a7","h29","h81","a5","h29","h31","a7","h29"};
		
		TreeMap<Character, TreeMap<Integer, Integer>> res = new TreeMap();
		res.put('h', new TreeMap());
		res.put('a', new TreeMap());
		
		for (String str : hit) {
			char team = str.charAt(0);
			int num = Integer.parseInt(str.substring(1));
			
			int cnt = 1;
			
			TreeMap<Integer, Integer> mm = res.get(team);
			if(mm.containsKey(num))
				cnt+= mm.get(num);
			
			mm.put(num, cnt);
		}
		
		
		for (Entry<Character, TreeMap<Integer, Integer>> team : res.entrySet()) {

			System.out.println(team.getKey()+" >>>>>");
			
			for (Entry<Integer, Integer> player: team.getValue().entrySet()) {
				
				System.out.println(player.getKey()+" :"+player.getValue());
			}
		}
		
		
		
		
		

	}

}
