package thread_p;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import javax.swing.JOptionPane;

class Quiz{
	String qq, answer, inp;
	LinkedHashMap<String, Exam> map;
	Exam exam;

	
	
	public Quiz(String qq, String answer, LinkedHashMap<String, Exam> map, Exam exam) {
		super();
		this.qq = qq;
		this.answer = answer;
		this.map = map;
		this.exam = exam;
	}

	int gogo() {
		String buf = JOptionPane.showInputDialog(qq);
		
		if(exam.end)
			return 1;
		
		if(map.containsKey(buf)) {
			exam.go = false;
			map.get(buf).go = true;
		}
		
		if(buf.equals("p"))
			return 1;
		
		inp = buf;
		
		
		return jum();
	}
	
	int jum() {
		

		if(answer.equals(inp))
			return 1;
		
		return 0;
	}


	public String toString() {
		return qq + "=" + answer + ", " + inp;
	}
	
	
}

class Exam extends Thread{
	
	boolean go = false, end = false;
	
	String title;
	
	ArrayList<Quiz> qq;
	
	LinkedHashMap<String, Exam> map;
	
	Timer tt;
	
	int second = 20;

	public Exam(String title, LinkedHashMap<String, Exam> map) {
		super();
		this.title = title;
		this.map = map;
		qq = new ArrayList<Quiz>();
		
	}
	
	@Override
	public void run() {
		tt = new Timer();
		tt.start();
		
		AAA:for (Quiz quiz : qq) {
			
			while(true) {
				
				try {
					sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(end)
					break AAA;
				if(go && quiz.gogo()==1) { //���� Ǯ�� && ���� ���� -> ��������
					break;
				}
				
				if(end)
					break AAA;
				
			}
			
		}
		
		end = true;
		System.out.println(title +" ����");
		
		
		boolean totEnd = true;
		
		for (Exam ex : map.values()) {
			if(!ex.end) {
				totEnd = false;
				ex.go = true;
				break;
			}
		}
		
		if(totEnd) {
			for (Exam ex : map.values()) {
				ex.report();
			}
		}
	}
	
	void report() {
		System.out.println(title+" ===================");
		int cnt = 0;
		for (Quiz qu : qq) {
			System.out.println(qu);
			cnt+=qu.jum();
		}
		System.out.println(" ���䰹��:"+cnt);
	}
	

	void add(String qq, String answer) {
		this.qq.add(new Quiz(qq, answer, map, this));
	}
	
	class Timer extends Thread{
		
		@Override
		public void run() {
			
			
			
			while(true) {
				
				try {
					sleep(1000);
					
					if(go) {
						second--;
						System.out.println(title+":"+second);
					}
					
					
					if(end || second==0)
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

public class ExamMain {

	public static void main(String[] args) {
		LinkedHashMap<String, Exam> map = new LinkedHashMap<String, Exam>();
		
		map.put("����", new Exam("����", map));
		map.put("����", new Exam("����", map));
		map.put("����", new Exam("����", map));
		
		map.get("����").add("narrow","����");
        map.get("����").add("sharp","��ī�ο�");
        map.get("����").add("tight","���̴�");
        map.get("����").add("tiny","��������");
        map.get("����").add("gule","Ǯ");
		
		map.get("����").add("������ �ﶧ ���� �Ҹ���?","����");  
        map.get("����").add("������ ����� ǰ�� �ٴϴ� ����?","����");
        map.get("����").add("�л����� �Ⱦ��ϴ� ���ڴ�?","å����");
        map.get("����").add("���� �ٴϴ� ����� �̸���?", "����");
        map.get("����").add("����ϴ� ����� ���� �Ⱦ��ϴ� ����?", "�Ұ��");

        map.get("����").add("11 x 11","121");
        map.get("����").add("12 x 12","144");
        map.get("����").add("13 x 13","169");
        map.get("����").add("14 x 14","196");
        map.get("����").add("15 x 15","225");
        
        for (Exam ex : map.values()) {
			ex.start();
		}
        
        map.get("����").go = true;
	}

}
