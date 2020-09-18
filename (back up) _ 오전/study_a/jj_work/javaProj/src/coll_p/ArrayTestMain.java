package coll_p;

import java.util.ArrayList;

class TestCoffee{
	
	String name;
	int cnt;
	public TestCoffee(String name, int cnt) {
		super();
		this.name = name;
		this.cnt = cnt;
	}
	@Override
	public String toString() {
		return "TestCoffee [name=" + name + ", cnt=" + cnt + "]";
	}
	
	
}

public class ArrayTestMain {

	public static void main(String[] args) {
		ArrayList tot = new ArrayList();
		tot.add(new TestCoffee("이승원", 2));
		tot.add(new TestCoffee("서샛별", 5));
		tot.add(new TestCoffee("이지연", 1));
		tot.add(new TestCoffee("신영화", 7));
		tot.add(new TestCoffee("이민규", 8));
		tot.add(new TestCoffee("유의상", 2));
		
		//System.out.println(tot);
		
		ArrayList res = new ArrayList();
		res.add(new ArrayList());
		res.add(new ArrayList());
		
		for (Object obj : tot) {
			TestCoffee tc = (TestCoffee)obj;
			//System.out.println(tc);
			
			((ArrayList)res.get(tc.cnt/5)).add(tc);
		}
		
		String [] title = {"5잔 미만","5잔 이상"};
		
		for (int i = 0; i < title.length; i++) {
			System.out.println(title[i]+">>>>");
			
			for (Object obj : (ArrayList)res.get(i)) {
				System.out.println(obj);
			}
		}
	}

}
