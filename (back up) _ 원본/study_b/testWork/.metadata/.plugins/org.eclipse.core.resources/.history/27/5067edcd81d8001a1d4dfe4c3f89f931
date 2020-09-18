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
		System.out.println(getName()+" 시험종료 -------");
		
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
		System.out.println("정답갯수:"+cnt+","+jum);
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
        
        map.get("국어").now = true;
        System.out.println("------------------");
	}
	
	void ppp() {
		System.out.println(name+" 결과 출력");
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
		
		map.put("국어", new ThExam( "국어"));
		map.put("영어", new ThExam( "영어"));
		map.put("수학", new ThExam("수학"));
		
		map.get("국어").add("달면 삼키고 쓰면 뱉는다는 뜻을 가진 사자성어는 ?", "감탄고토");
        map.get("국어").add("앞뒤의 잔말을 빼고 요점만 말하는 뜻을 가진 사자성어는 ?", "거두절미");
        map.get("국어").add("평범한 남녀를이르는 사자성어는 ?", "갑남을녀");
        map.get("국어").add("잘못을 고치고 옳은 길에 들어선다는 뜻을 가진 사자성어는 ?", "개과천선");
        map.get("국어").add("입은 은혜에 대한 고마운 마음이 뼈에 사무쳐 잊혀지지 않는다는 뜻을 가진 사자성어는 ?", "각골난망");
        
        map.get("수학").add("1+1= ?", "2");
        map.get("수학").add("2+2= ?", "4");
        map.get("수학").add("3+3= ?", "6");
        map.get("수학").add("4+4= ?", "8");
        map.get("수학").add("5+5= ?", "10");
        
        map.get("영어").add("사과는 영어로?", "apple");
        map.get("영어").add("바나나는 영어로?", "banana");
        map.get("영어").add("배는 영어로?", "pear");
        map.get("영어").add("복숭아는 영어로?", "peach");
        map.get("영어").add("자두는 영어로?", "plum");
        
        ArrayList<ThStud> studs = new ArrayList<ThStud>();
        
        studs.add(new ThStud("장정호", map,studs,0));
        studs.add(new ThStud("이호인", map,studs,1));
        studs.add(new ThStud("김영재", map,studs,2));
        studs.add(new ThStud("박성언", map,studs,3));
        studs.add(new ThStud("김예솔", map,studs,4));
        
        studs.get(0).go();
        
        
	}

}
