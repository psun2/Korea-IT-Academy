package swing_p;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;




public class ExamMulMain extends JFrame {
	
	LinkedHashMap<String, Subject> map;
	LinkedHashMap<String, JButton> btns;
	JButton endBtn;
	
	class Subject extends JPanel{
		String title;
		boolean chk = false;
		boolean end = false;
		
		ArrayList<QQ> arr;
		
		
		JLabel tLb;
		
		void view(boolean chk) {
			this.chk = chk;
			setVisible(chk);
		}
		String res() {
			String ttt = title+":";
			
			int cnt = 0;
			for (QQ qq : arr) {
				cnt += qq.res();
			}
			
			ttt+= cnt*100/arr.size();
			
			return ttt;
		}
		public Subject(String title) {
			super();
			this.title = title;
			arr = new ArrayList<ExamMulMain.Subject.QQ>();
			tLb = new JLabel();
			
			add(new JLabel(title));
			add(tLb);
			new Timer().start();
			
	
		}
		
		@Override
		public void setVisible(boolean aFlag) {
			
			setLayout(new GridLayout(2, arr.size()/2+2));
			super.setVisible(aFlag);
			
		}
		
		void qqInput(String qq, int an, String ...bogi) {
			
			QQ q = new QQ(qq, an, bogi);
			arr.add(q);
			add(q);
		}

		class Timer extends Thread{
			
			@Override
			public void run() {

				int i = 5;
				while( i > 0) {
					try {
						if(end)
							break;
						
						if(chk) {
							 i--;
							 tLb.setText("�ð�:"+i);
						}
						
						sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				end = true;
				btns.get(title).setEnabled(false);
				
				for (JButton bb : btns.values()) {
					if(bb.isEnabled()) {
						bb.doClick();
						return;
					}
				}
				endBtn.doClick();
				
			}
			
		}
		
		class QQ extends JPanel{
			JLabel qq;
			Integer an;
			ArrayList<JRadioButton> bogi;
			
			int res() {
				
				if(bogi.get(an).isSelected())
					return 1;
				
				return 0;
			}
			
			
			public QQ(String qq, int an, String ...bogi) {
				
				add(this.qq = new JLabel(qq));
				
				this.bogi = new ArrayList<JRadioButton>();
				ButtonGroup bg = new ButtonGroup();
				for (String bb: bogi) {
					JRadioButton jb = new JRadioButton(bb);
					bg.add(jb);
					this.bogi.add(jb);
					add(jb);
				}
				this.an = an;
				
				setLayout(new GridLayout( this.bogi.size()+1, 1));
		
			}
		}
		
		
	}
	
	JPanel titleBtns, resP;
	
	public ExamMulMain() {
		
		setBounds(-3200+100, 100, 700, 600);
		setLayout(null);
		map = new LinkedHashMap<String, ExamMulMain.Subject>();
		btns = new LinkedHashMap<String, JButton>();
		
		titleBtns = new JPanel();
		titleBtns.setLayout(new FlowLayout());
		titleBtns.setBounds(0, 0, 700, 50);
		add(titleBtns);
		
		input("����");
		input("����");
		input("����");
		
		resP = new JPanel();
		resP.setBounds(0, 50, 700, 550);
		add(resP);
		resP.setVisible(false);
		
		endBtn = new JButton("ä��");
		titleBtns.add(endBtn);
		endBtn.addActionListener(new ResL());
		
		
		

		map.get("����").qqInput("�ݰ��굵 ", 1, "���Ķ�", "���İ�", "ũ���굵");
        map.get("����").qqInput("���� �� �����ϸ� ��", 1, "�ų�", "�ǳ�", "�� �� ����", "�븦 �����ּ���");
        map.get("����").qqInput("�޷���", 2, "����޺�", "����κ�Ʈ", "�ϴ�");
        map.get("����").qqInput("����!", 0, "��������", "�ű�", "�� ������̾�! ��!");
        map.get("����").qqInput("�����̴� ���� ���ϱ���", 3, "õ��", "�ǿ�", "�α�", "��ȯ");
        map.get("����").qqInput("3�� 500�� ������ �����?", 0, "����ȣ", "��õ��", "�̽�ȯ");
		 
        map.get("����").qqInput("Why are you doing this with me", 1, "�ٸ� �ֵ� �� ���İ��µ�", "�� ���� ���� �׷��µ�",
                "�� �������⵵ ����?");
        map.get("����").qqInput("������ �����ִ�. �׷��ٸ� ", 3, "gurm", "rain KKang", "�ص� there", "it will rain");
        map.get("����").qqInput("who are you!", 0, "�� ������", "�ľ���", "�� �ƾ�?", "���ƾ�!");
        map.get("����").qqInput("It's the world I made", 2, "�̰͵���", "�� ������ ����", "���� ���� �� �����̾�");
        map.get("����").qqInput("���뱹�� �����", 1, "SDK", "sundeagguck", "gobchangJungoal");
        map.get("����").qqInput("Then let's do this", 1, "��� �����ΰ� ���� ���Ѵ�", "�׷��ٹ�~ �̷��� �غ��õ��");
		
        map.get("����").qqInput("��ġ����(4) 1!", 1, "1", "4", "3", "2");
        map.get("����").qqInput("1 the �� �� �� ", 0, "6", "15", "4", "7");
        map.get("����").qqInput("ö���� ���� ���̽�ũ���� �԰��־���.\n���� ����� 48����� ö���� ���� \n���̽�ũ���� �� ���� ����߷�����?", 2,
                "0���", "1���", "16���", "�߾��� �����");
        
        
		map.get("����").view(true);
		
		
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	class TitleL implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btns = (JButton)e.getSource();
			
			for (String key : map.keySet()) {
				map.get(key).view(false);
			}
			map.get(btns.getText()).view(true);
		}
		
	}
	
	class ResL implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			for (String key : map.keySet()) {
				map.get(key).view(false);
				map.get(key).end = true;
			}
			
			for (JButton bb : btns.values()) {
				bb.setEnabled(false);
			}
			
			
			
			resP.removeAll();
			
			resP.setLayout(new GridLayout(4,1));
			resP.add(new JLabel("<<< ��� >>>"));
			
			
			for (Subject en: map.values()) {

				resP.add(new JLabel(en.res()));
			}
			
			
			resP.setVisible(true);
		}
		
		
		
	}
	
	void input(String title) {
		JButton btn = new JButton(title);
		titleBtns.add(btn);
		btns.put(title, btn);

		btn.addActionListener(new TitleL());
		Subject sj = new Subject(title);
		sj.setBounds(0, 50, 700, 550);
		map.put(title, sj);
		add(map.get(title));
		sj.setVisible(false);
		
		
		
		
		
		
		
	}
	
	
	
	

	public static void main(String[] args) {

		new ExamMulMain();

	}

}
