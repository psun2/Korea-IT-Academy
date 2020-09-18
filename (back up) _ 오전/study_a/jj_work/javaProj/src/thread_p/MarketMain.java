package thread_p;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.TreeMap;

class Item{
	String kind, name;
	int price;
	boolean saleChk = false;
	public Item(String kind, String name, int price) {
		super();
		this.kind = kind;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return  kind + ", " + name + ", " + price;
	}
	
	
}



class Market{

	
	
	Item product = null; //��ǰ
	
	//��ǰ �԰� ��Ű��
	synchronized void input(Item product) {
		
		while(this.product!=null) {
			try {
				System.out.println("\t���� - ���� ��� :" + product);
				wait();
				System.out.println("\t���� - ���� ��� ���� :" + product);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("\t���� - �԰�:"+product);
		this.product = product;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notifyAll();
	}
	
	//��ǰ ��� ��Ű��
	synchronized Item output(String buyer) {
		Item res = null;
		while(product==null) {
			try {
				System.out.println("\t���� - ���� ��� :" + buyer);
				wait();
				System.out.println("\t���� - ���� ��� ���� :" + buyer);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("\t���� - ���:"+product);
		res = product;
		product = null;
		notifyAll();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}
	
}


class SalerMoon extends Thread{
	Market market;
	
	int price;
	
	ArrayList<Item> list;

	public SalerMoon(String name, int price,Market market) {
		super(name);
		this.market = market;
		this.price = price;
		list = new ArrayList<Item>();
	}
	
	@Override
	public void run() {
		int i = 1;
		
		while(true) {
			
			
			try {
				sleep((int)(1500*Math.random()));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int pp = price+(int)(100*Math.random());
			Item item = new Item(getName(), getName()+i, pp);
			System.out.println("�Ǹ��� - "+item.name+" �԰� �غ�");
			list.add(item);
			
			market.input(item);
			
			i++;
		}
	}
	
	void ppp() {
		System.out.println("["+getName()+"]");
		int tot = 0, cnt=0;
		for (Item item : list) {
			
			if(item.saleChk) {
				tot+=item.price;
				cnt++;
				System.out.println(item);
			}
			
			
		}
		System.out.println("�ǸŰ���:"+cnt+", �հ�:"+tot);
		
		
	}
	
}

class Buyer extends Thread{
	
	Market market;
	
	TreeMap<String, ArrayList<Item>>map;

	public Buyer(String name, Market market) {
		super(name);
		this.market = market;
		map = new TreeMap<String, ArrayList<Item>>();
	}
	
	@Override
	public void run() {

		int i = 1;
		while(true) {
			System.out.println(getName()+" - ���� �õ� :" +i);
			Item item = market.output(getName());
			ArrayList<Item> arr;
			
			if(map.containsKey(item.kind))
				arr = map.get(item.kind);
			else
				arr = new ArrayList<Item>();
			
			item.saleChk = true;
			arr.add(item);
			map.put(item.kind, arr);
			
			System.out.println(getName()+" - ����  " +i+":"+item);
			i++;
		}
	}
	
	
	void ppp() {
		System.out.println("["+getName()+"]");
		
		int tot = 0, cnt=0;
		
		for (Entry<String, ArrayList<Item>> en : map.entrySet()) {
			int subTot=0;
			System.out.println("  "+en.getKey()+" >>");
			for (Item item : en.getValue()) {

				subTot+=item.price;
				System.out.println(item);
							
			}
			System.out.println(en.getKey()+" ����:"+en.getValue().size()+", �հ�:"+subTot);
			tot += subTot;
			cnt += en.getValue().size();
		}
		
		System.out.println("��ü ���� ����:"+cnt+", �հ�:"+tot);
		
		
	}
	
}



public class MarketMain {

	public static void main(String[] args) {
		Market emart = new Market();
		
		SalerMoon sm1 = new SalerMoon("TV", 50,emart);
		SalerMoon sm2 = new SalerMoon("�����", 100,emart);
		SalerMoon sm3 = new SalerMoon("�ڵ���", 30,emart);
		
		Buyer by1 = new Buyer("�̱�", emart);
		Buyer by2 = new Buyer("�±�", emart);
		//Buyer by3 = new Buyer("����", emart);
		
		sm1.start();
		sm2.start();
		sm3.start();
		
		by1.start();
		by2.start();
		//by3.start();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sm1.stop();
		sm2.stop();
		sm3.stop();
		
		by1.stop();
		by2.stop();
		//by3.stop();
		
		System.out.println("�Ǹ��� ����-------------------");
		sm1.ppp();
		sm2.ppp();
		sm3.ppp();
		System.out.println("������ ����-------------------");
		by1.ppp();
		by2.ppp();
		//by3.ppp();
	}

}
