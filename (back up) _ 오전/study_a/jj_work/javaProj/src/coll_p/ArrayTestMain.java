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
		tot.add(new TestCoffee("�̽¿�", 2));
		tot.add(new TestCoffee("������", 5));
		tot.add(new TestCoffee("������", 1));
		tot.add(new TestCoffee("�ſ�ȭ", 7));
		tot.add(new TestCoffee("�̹α�", 8));
		tot.add(new TestCoffee("���ǻ�", 2));
		
		//System.out.println(tot);
		
		ArrayList res = new ArrayList();
		res.add(new ArrayList());
		res.add(new ArrayList());
		
		for (Object obj : tot) {
			TestCoffee tc = (TestCoffee)obj;
			//System.out.println(tc);
			
			((ArrayList)res.get(tc.cnt/5)).add(tc);
		}
		
		String [] title = {"5�� �̸�","5�� �̻�"};
		
		for (int i = 0; i < title.length; i++) {
			System.out.println(title[i]+">>>>");
			
			for (Object obj : (ArrayList)res.get(i)) {
				System.out.println(obj);
			}
		}
	}

}
