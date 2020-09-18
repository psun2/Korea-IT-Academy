package thread_p;

import java.util.ArrayList;

import javax.swing.JOptionPane;

class QuizQQ{
	String qq, answer, inp;

	public QuizQQ(String qq, String answer) {
		super();
		this.qq = qq;
		this.answer = answer;
	}
	
	int gogo() {
		inp = JOptionPane.showInputDialog(qq);
		
		if(inp.equals("p"))
			return 1;
		
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

class QuizTh extends Thread{
	
	Timer data;
	
	ArrayList<QuizQQ>qq;
	
	public QuizTh(Timer data) {
		super();
		this.data = data;
		qq = new ArrayList<QuizQQ>();
		qq.add(new QuizQQ("1+1","2"));
		qq.add(new QuizQQ("2+2","4"));
		qq.add(new QuizQQ("�����?","java"));
		qq.add(new QuizQQ("��������?","�Ϳ�����"));
		qq.add(new QuizQQ("�������ּ���","�÷���"));
		qq.add(new QuizQQ("�����մϴ�","�����"));
	}

	
	
	
	public void run() {
		AAA:for (QuizQQ qu : qq) {
			
			while(qu.gogo()!=1) {

				if(!data.chk)
					break AAA;
			}
			
		}

		int cnt = 0;
		for (QuizQQ qu : qq) {
			System.out.println(qu);
			cnt+=qu.jum();
		}
		System.out.println("���䰹��:"+cnt);
		data.chk = false;
		
		
	}
	
}

class Timer extends Thread{
	
	boolean chk = true;

	public void run() {

		for (int i = 10; i >= 0; i--) {
			try {
				
				sleep(1000);
				if(!chk)
					break;
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		chk = false;
		
		System.out.println("Ÿ�̸� ����");
	}
}


public class ThreadSpeedQuizMain {

	public static void main(String[] args) {
		
		Timer timer = new Timer();
		QuizTh quiz = new QuizTh(timer);
		timer.start();
		quiz.start();

	}

}
