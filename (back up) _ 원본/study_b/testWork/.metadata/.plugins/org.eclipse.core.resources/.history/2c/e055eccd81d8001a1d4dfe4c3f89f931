package thread_p;

import java.util.ArrayList;

class SamMart extends Thread{
	
	String product = null;
	boolean chk = false;
	
	synchronized void input(String prod) {
		
		while(product!=null) {
			
			try {
				if(chk)
					return;
				
				System.out.println(prod+"-입고 대기");
				wait();
				System.out.println(prod+"-입고 대기 해제");
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		product = prod;
		System.out.println(prod+ "<------------입고 성공");
		
		notifyAll();	//입고/출고 대기 모두 깨움
	}
	
	
	
	
	synchronized String sale(String buyer) {
		
		while(product==null) {
			try {
				if(chk)
					return null;
				
				System.out.println(buyer+"-구매 대기");
				wait();
				System.out.println(buyer+"-구매 대기 해제");
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String res = product;
		System.out.println(product+ "<------------구매 성공");
		product = null;
		notifyAll();	//입고/출고 대기 모두 깨움
		
		return res;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <=20; i++) {
			try {
				sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		chk = true;
		System.out.println("시장 패장");
		
	}
}


class SalerMoon extends Thread{
	
	SamMart mart;
	ArrayList<String>data;

	public SalerMoon(SamMart mart, String name) {
		super(name);
		this.mart = mart;
		data = new ArrayList<String>();
	}
	
	@Override
	public void run() {
		int no=0;
		
		while(!mart.chk) {
			mart.input(getName()+no);
			no++;
			data.add(getName()+no);
			try {
				sleep(1000*(int)(Math.random()*5+1));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(getName()+" 팔기 종료:"+data);
	}	
}


class Hogu extends Thread{
	
	SamMart mart;
	ArrayList<String>data;
	public Hogu(SamMart mart, String name) {
		super(name);
		this.mart = mart;
		data = new ArrayList<String>();
	}
	
	@Override
	public void run() {
		int no=0;
		
		while(!mart.chk) {
			data.add(mart.sale(getName()+no));
			no++;
			try {
				sleep(1000*(int)(Math.random()*5+1));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(getName()+" 사기 종료:"+data);
	}	
}



public class SamMartMain {

	public static void main(String[] args) {
		SamMart mart = new SamMart();
		
		SalerMoon TV = new SalerMoon(mart, "TV");
		SalerMoon tong = new SalerMoon(mart, "세탁기");
		SalerMoon aircon = new SalerMoon(mart, "에어콘");
		
		Hogu hg1 = new Hogu(mart, "개성상인");
		Hogu hg2 = new Hogu(mart, "말성상인");
		Hogu hg3 = new Hogu(mart, "미국상인");
		Hogu hg4 = new Hogu(mart, "중국상인");
		
		mart.start();
		TV.start();
		tong.start();
		aircon.start();
		
		hg1.start();
		hg2.start();
		hg3.start();
		hg4.start();
	}

}
