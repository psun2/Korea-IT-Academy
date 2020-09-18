package swing_p;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class Quiz{
	JLabel qq;
	ArrayList<JRadioButton> bogi;
	String  type, strDab;
	int intAns, intDab;
	JTextField strAns;
	Subject subject;
	
	void end() {
		if(type.equals("�ְ���"))
			strAns.setEditable(false);
		else {
			for (JRadioButton jr : bogi) {
				jr.setEnabled(false);
			}
		}
	}
	public Quiz(Subject subject,String qq, int intDab, String ... bogi) {
		super();
		this.subject = subject;
		this.qq = new JLabel(qq);
		this.intDab = intDab;
		this.bogi = new ArrayList<JRadioButton>();
		
		ButtonGroup bg = new ButtonGroup();
		for (String string : bogi) {
			JRadioButton btn = new JRadioButton(string);
			this.bogi.add(btn);
			bg.add(btn);
		}
		
		
		type = "������";
	}

	public Quiz(Subject subject,String qq, String strDab) {
		super();
		this.subject = subject;
		this.qq = new JLabel(qq);
		this.strDab = strDab;
		strAns = new JTextField();
		type = "�ְ���";
	}
	
	int result() {
		int res = 0;
		if(type.equals("�ְ���") && strAns.getText().equals(strDab))
			res = 1;
		else if(type.equals("������") && bogi.get(intDab).isSelected()){
			res = 1;
		}
		return res;
	}
	
	void ppp() {
		subject.add(qq);
		
		if(type.equals("�ְ���"))
			subject.add(strAns);
		else {
			for (JRadioButton jr : bogi) {
				subject.add(jr);
			}
			
		}
		
	}
	
}


class Subject extends JPanel{
	
	Stud st;
	ArrayList<Quiz> quizs;
	
	JLabel res, timerLb;
	boolean chk = false, go = false;
	JButton btn;
	int jumsu;
	
	class Timer extends Thread{
		@Override
		public void run() {
			int i = 10;
			while(i>0){
				try {
					sleep(1000);
					if(chk)
						break;
					
					if(go) {
						i--;
					}
					timerLb.setText("�����ð� : "+i+"   ");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			calc();
		}
	}
	
	void calc() {
		
		chk = true;
		btn.setEnabled(false);
		
		int cnt=0;
	
		for (Quiz quiz : quizs) {
			quiz.end();
			cnt+=quiz.result();
		}
		
		jumsu = 100*cnt/quizs.size();
		
		st.finalGo();
	}
	
	public Subject(Stud st,String name) {
		setName(name);
		this.st = st;
		quizs = new ArrayList<Quiz>();
		
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

	}
	void starttt() {
		timerLb = new JLabel("�����ð�");
		timerLb.setHorizontalAlignment(JLabel.RIGHT);
		add(timerLb);
		
		for (Quiz quiz : quizs) {
			quiz.ppp();
		}
		
		
		btn = new JButton("����");
		add(btn);
		add(res=new JLabel("���"));
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				calc();
			}
		});
		
		new Timer().start();
	}

}

class Stud extends JFrame{
	ExamMain exam;
	ArrayList<Subject> subjects ;
	int num, rank, tot, avg;
	
	public Stud(int num,ExamMain exam, String name) {
		this.exam = exam;
		this.num = num;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(exam.ox+100, 50, 500, 600);
		setName(name);
		setTitle(name);
		
		subjects = new ArrayList<Subject>();
		JTabbedPane tab = new JTabbedPane();
		
		subjects.add(new Subject(this,"����"));
		subjects.add(new Subject(this,"����"));
		subjects.add(new Subject(this,"����"));
		
		
		subjects.get(0).quizs.add(new Quiz(subjects.get(0),"1.�� ������?","��"));
		subjects.get(0).quizs.add(new Quiz(subjects.get(0),"2.�� ������?","��"));
		subjects.get(0).quizs.add(new Quiz(subjects.get(0),
				"1.�޸� ��Ű�� ���� ��´ٴ� ���� ���� ���ڼ���� ?",0,
				"��ź����","�ŵ�����","��������","���񳭸�"));
		subjects.get(0).quizs.add(new Quiz(subjects.get(0),
				"4.������ ���� ���� ���� ����� ������ �̸��� ���ڼ���� ?",
				2,
				"��Ÿ���","�ǰ���ô","�߹�����","�߰���ȸ"));
		
		
		subjects.get(1).quizs.add(new Quiz(subjects.get(1),"1.a ������?", "b"));
		subjects.get(1).quizs.add(new Quiz(subjects.get(1),
				"2.��� ����� ?",
				0,
				"pear","peak","pean","peal"));
		subjects.get(1).quizs.add(new Quiz(subjects.get(1),"3.b ������?", "c"));
		subjects.get(1).quizs.add(new Quiz(subjects.get(1),
				"4.����� ����� ?",
				3,
				"watermelon","melong,","mello","melon"));
		subjects.get(1).quizs.add(new Quiz(subjects.get(1),"5.c ������?", "d"));

		
		subjects.get(2).quizs.add(new Quiz(subjects.get(2),
				"1. 3+3= ?",
				1,
				"4","6","8","10"));
		subjects.get(2).quizs.add(new Quiz(subjects.get(2),"2. 1+1=?", "2"));
		subjects.get(2).quizs.add(new Quiz(subjects.get(2),"3. 2+1=?", "3"));
		subjects.get(2).quizs.add(new Quiz(subjects.get(2),
				"4. 5+5= ?",
				0,
				"10","20","30","40"));
		
		
		for (Subject sub : subjects) {
			tab.addTab(sub.getName(), sub);
			sub.starttt();
		}

		add(tab);

		tab.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				
				for (Subject subject : subjects) {
					subject.go = false;
				}
				
				
				System.out.println(tab.getSelectedIndex());
				subjects.get(tab.getSelectedIndex()).go=true;
			}
		});
	
	}
	
	void rankCalc() {
		rank=1;
		
		for (Stud you : exam.studs) {
			if(avg<you.avg) {
				rank++;
			}
		}
	}
	
	void starttt() {
		setVisible(true);
		subjects.get(0).go=true;
	}
	
	
	void finalGo() {
		
		String str = "����Ϸ�:";
		
		tot = 0;
		
		for (Subject sub : subjects) {
			if(!sub.chk)
				return;
			str += sub.getName()+"("+sub.jumsu+")";
			tot += sub.jumsu;
		}
		avg = tot/subjects.size();
		
		System.out.println(str);
		//setVisible(false);
		dispose();  //window ����
		
		if(exam.studs.size()>num+1)
			exam.studs.get(num+1).starttt();
		else {
			exam.end();
		}
	}
	
	Vector result() {
		Vector res = new Vector();
		
		res.add(getName());
		
		for (Subject sub: subjects ) {
			res.add(sub.jumsu);
			
		}
		res.add(tot);
		res.add(avg);
		res.add("��������������̿����".charAt(avg/10));
		res.add(rank);
		return res;
	}
}


public class ExamMain extends JFrame {
	int ox = -1200;
	ArrayList<Stud> studs;

	public ExamMain() {
		studs = new ArrayList<Stud>();
		studs.add(new Stud(0,this,"�����̳�"));
		studs.add(new Stud(1,this,"ȫ������"));
		studs.add(new Stud(2,this,"���ؾ�"));
		
		studs.get(0).starttt();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void end() {
		
		setBounds(ox+100, 50, 500, 600);
		setName("���");
		
		Vector<Vector>rowData = new Vector<Vector>();
		
		for (Stud st : studs) {
			st.rankCalc();
			rowData.add(st.result());
		}
		
		
		Vector<String> columnNames = new Vector<String>();
		columnNames.add("�̸�");
		columnNames.add("����");
		columnNames.add("����");
		columnNames.add("����");
		columnNames.add("����");
		columnNames.add("���");
		columnNames.add("���");
		columnNames.add("���");
		
		JTable table = new JTable(rowData, columnNames) ;
		
		JScrollPane js = new JScrollPane(table);
		
		add(new JLabel("���"),"North");
		add(js,"Center");
		
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new ExamMain();
	}

}
