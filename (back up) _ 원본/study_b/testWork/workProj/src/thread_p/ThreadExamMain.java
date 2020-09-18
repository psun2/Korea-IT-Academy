package thread_p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeSet;

import javax.swing.JOptionPane;

class ThQuest{
	String qq, answer, in;
	int res =0;
	ThExam exam;
	public ThQuest(ThExam exam, String qq, String answer) {
		super();
		this.qq = qq;
		this.answer = answer;
		this.exam = exam;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return new ThQuest(exam, qq, answer);
	}
	
	
	void go() {
		while(true) {
			
			if(exam.now) {
				String buf = JOptionPane.showInputDialog(exam.stud.name+" "+qq);
				examChange(buf);
				if(exam.end)
					return;
				
				in = buf;
				
				if(in.equals("p"))
					return;
				
				if(in.equals(answer)) {
					res = 1;
					return;
				}
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	void examChange(String buf) {
		if(exam.stud.map.containsKey(buf)) {
			exam.now = false;
			exam.stud.map.get(buf).now = true;
		}
	}


	@Override
	public String toString() {
		return qq + ", " + answer + ":" + in;
	}
	
	
	
}

class ThExam extends Thread{

	boolean now = false, end = false;
	ArrayList<ThQuest> arr;
	int cnt, jum;
	ThStud stud;
	
	
	
	public ThExam(String name) {
		super(name);
		arr = new ArrayList<ThQuest>();
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		ThExam res = new ThExam(getName());

		for (ThQuest thQuest : arr) {
			ThQuest tq = (ThQuest)thQuest.clone();
			tq.exam = res;
			res.arr.add(tq);
		}
		
		return res;
	}
	
	void add(String qq, String answer) {
		arr.add(new ThQuest(this, qq, answer));
	}
	
	@Override
	public void run() {
		
		new Timer().start();
		
		for (ThQuest thQuest : arr) {
			
			thQuest.go();
			if(end)
				break;
		}
		end = true;
		System.out.println(getName()+" �������� -------");
		
		stud.turnExam();
	}
	
	
	
	void myPPP() {
		System.out.println(stud.name+" "+getName()+" >>>>>>");
		cnt = 0;
		for (ThQuest th : arr) {
			System.out.println(th);
			cnt+=th.res;
		}
		jum = 100*cnt/arr.size();
		System.out.println("���䰹��:"+cnt+","+jum);
	}
	
	
	
	class Timer extends Thread{
		int i = 5;
		
		@Override
		public void run() {
			while(i>0) {
				try {
					if(now) {
						i--;
						System.out.println(stud.name+" "+ThExam.this.getName()+":"+i);
					}
					sleep(1000);
					
					if(end)
						break;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			end = true;
		}
	}
}

class ThStud implements Comparable<ThStud>{
	String name;
	LinkedHashMap<String, ThExam> map;
	ArrayList<ThStud> studs;
	int num, tot, avg, rank;
	
	public ThStud(String name, LinkedHashMap<String, ThExam> map,
			ArrayList<ThStud> studs, int num) {
		super();
		this.name = name;
		this.map = new LinkedHashMap<String, ThExam>();
		this.studs = studs;
		this.num = num;
		
		for (Entry<String, ThExam> en : map.entrySet()) {
			try {
				ThExam te = (ThExam)en.getValue().clone();
				te.stud = this;
				
				this.map.put(en.getKey(), te);
				
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	void go() {
		for (ThExam exam : map.values()) {
			//System.out.println(exam.hashCode());
			exam.start();
		}
        
        map.get("����").now = true;
        System.out.println("------------------");
	}
	
	void ppp() {
		System.out.println(name+" ��� ���");
		tot = 0;
		for (ThExam exam : map.values()) {
			exam.myPPP();
			tot+= exam.jum;
		}
		avg = tot/map.size();
		
	}
	
	void turnExam() {
		for (ThExam exam : map.values()) {
			if(!exam.end) {
				exam.now = true;
				return;
			}
		}
		
		ppp();
		
		if(num+1<studs.size())
			studs.get(num+1).go();
		else
			result();
	}
	
	void rankCalc() {
		
		rank = 1;
		
		for (ThStud you : studs) {
			
			if(avg < you.avg)
				rank++;
			
		}
		
		
	}
	
	
	public String toString() {
		
		String ttt = name+"\t";
		
		for (ThExam exam : map.values()) {
			
			ttt+= exam.jum+"\t";
		}
		
		ttt+=tot+"\t"+avg+"\t"+rank;
		
		return ttt;
	}
	
	void result() {
		for (ThStud thStud : studs) {
			thStud.rankCalc();	
		}
		
		TreeSet<ThStud> set = new TreeSet<ThStud>(studs);
		
		for (ThStud thStud : set) {
			System.out.println(thStud);
		}
	}

	@Override
	public int compareTo(ThStud o) {
		int res = o.avg - avg;
		if(res==0)
			res = name.compareTo(o.name);
		return res;
	}
	
	
}


public class ThreadExamMain {

	public static void main(String[] args) {
		LinkedHashMap<String, ThExam> map = new LinkedHashMap<String, ThExam>();
		
		map.put("����", new ThExam( "����"));
		map.put("����", new ThExam( "����"));
		map.put("����", new ThExam("����"));
		
		map.get("����").add("�޸� ��Ű�� ���� ��´ٴ� ���� ���� ���ڼ���� ?", "��ź����");
        map.get("����").add("�յ��� �ܸ��� ���� ������ ���ϴ� ���� ���� ���ڼ���� ?", "�ŵ�����");
        map.get("����").add("����� ���ฦ�̸��� ���ڼ���� ?", "��������");
        map.get("����").add("�߸��� ��ġ�� ���� �濡 ���ٴ� ���� ���� ���ڼ���� ?", "����õ��");
        map.get("����").add("���� ������ ���� ���� ������ ���� �繫�� �������� �ʴ´ٴ� ���� ���� ���ڼ���� ?", "���񳭸�");
        
        map.get("����").add("1+1= ?", "2");
        map.get("����").add("2+2= ?", "4");
        map.get("����").add("3+3= ?", "6");
        map.get("����").add("4+4= ?", "8");
        map.get("����").add("5+5= ?", "10");
        
        map.get("����").add("����� �����?", "apple");
        map.get("����").add("�ٳ����� �����?", "banana");
        map.get("����").add("��� �����?", "pear");
        map.get("����").add("�����ƴ� �����?", "peach");
        map.get("����").add("�ڵδ� �����?", "plum");
        
        ArrayList<ThStud> studs = new ArrayList<ThStud>();
        
        studs.add(new ThStud("����ȣ", map,studs,0));
        studs.add(new ThStud("��ȣ��", map,studs,1));
        studs.add(new ThStud("�迵��", map,studs,2));
        studs.add(new ThStud("�ڼ���", map,studs,3));
        studs.add(new ThStud("�迹��", map,studs,4));
        
        studs.get(0).go();
        
        
	}

}
