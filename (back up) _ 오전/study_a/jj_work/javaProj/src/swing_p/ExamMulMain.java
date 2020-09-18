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
							 tLb.setText("시간:"+i);
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
		
		input("국어");
		input("영어");
		input("수학");
		
		resP = new JPanel();
		resP.setBounds(0, 50, 700, 550);
		add(resP);
		resP.setVisible(false);
		
		endBtn = new JButton("채점");
		titleBtns.add(endBtn);
		endBtn.addActionListener(new ResL());
		
		
		

		map.get("국어").qqInput("금강산도 ", 1, "식후땡", "식후경", "크라운산도");
        map.get("국어").qqInput("내가 너 좋아하면 안", 1, "돼냐", "되냐", "될 것 같아", "대를 벗어주세요");
        map.get("국어").qqInput("달려라", 2, "허니콤보", "우사인볼트", "하니");
        map.get("국어").qqInput("동방!", 0, "예의지국", "신기", "나 대대장이야! 탕!");
        map.get("국어").qqInput("ㅁㅁ이는 정말 착하구나", 3, "천의", "건우", "민규", "승환");
        map.get("국어").qqInput("3대 500이 가능한 사람은?", 0, "정진호", "김천의", "이승환");
		 
        map.get("영어").qqInput("Why are you doing this with me", 1, "다른 애들 다 훔쳐가는데", "왜 나만 갖고 그러는데",
                "너 경제위기도 모르지?");
        map.get("영어").qqInput("구름이 저기있다. 그렇다면 ", 3, "gurm", "rain KKang", "해도 there", "it will rain");
        map.get("영어").qqInput("who are you!", 0, "너 누구야", "후아유", "어 쳤어?", "안쳤어!");
        map.get("영어").qqInput("It's the world I made", 2, "이것들이", "다 저리가 여긴", "내가 만든 내 세상이야");
        map.get("영어").qqInput("순대국을 영어로", 1, "SDK", "sundeagguck", "gobchangJungoal");
        map.get("영어").qqInput("Then let's do this", 1, "댄과 레츠두가 서로 디스한다", "그렇다묜~ 이렇게 해보시디요");
		
        map.get("수학").qqInput("눈치게임(4) 1!", 1, "1", "4", "3", "2");
        map.get("수학").qqInput("1 the 下 기 오 ", 0, "6", "15", "4", "7");
        map.get("수학").qqInput("철수와 영희가 아이스크립을 먹고있었다.\n오늘 기온이 48도라면 철수와 영희가 \n아이스크림을 총 몇방울 떨어뜨렸을까?", 2,
                "0방울", "1방울", "16방울", "추억은 방울방울");
        
        
		map.get("국어").view(true);
		
		
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
			resP.add(new JLabel("<<< 결과 >>>"));
			
			
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
