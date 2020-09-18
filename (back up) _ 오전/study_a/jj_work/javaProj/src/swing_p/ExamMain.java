package swing_p;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class ExamMain extends JFrame{
	
	ArrayList<JRadioButton>qq1;
	ArrayList<JCheckBox>qq2;
	
	JLabel label, timerLb;
	JButton btn;
	
	class ResAct implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			int cnt = 0;
			
			if(qq1.get(1).isSelected())
				cnt+= 20;
			
			
			for (JCheckBox box : qq2) {
				if(box.isSelected())
					cnt+=20;
			}
			
			label.setText("결과:"+cnt);
			
		}
	}
	
	class Timer extends Thread{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i = 10; i >=0; i--) {
				
				try {
					timerLb.setText("시간:"+i+" ");
					sleep(1000);
					System.out.println(i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			btn.doClick();
			btn.setEnabled(false);
			
		}
	}
	
	public ExamMain() {
		
		
		
		setBounds(-3000, 50, 400, 500);
		setLayout(new GridLayout(13,1));
		
		add(timerLb=new JLabel());
		timerLb.setHorizontalAlignment(JLabel.RIGHT);
		
		add(new JLabel("1. 선생님은?"));
		
		qq1 = new ArrayList<JRadioButton>();
		ButtonGroup bg = new ButtonGroup();
		for (String str : "깜찍해요,귀여워요,예뻐요,웃겨요".split(",")) {
			JRadioButton jRadioButton = new JRadioButton(str);
			
			bg.add(jRadioButton);
			add(jRadioButton);
			qq1.add(jRadioButton);
		}
		
		
		add(new JLabel("2. 학생과제는?"));
		
		qq2 = new ArrayList<JCheckBox>();
		
		for (String str : "열심히,부지런히,큰일꾼,큰사발".split(",")) {
			JCheckBox box = new JCheckBox(str);
			
			add(box);
			qq2.add(box);
		}
		
		
		btn = new JButton("채점");
		btn.addActionListener(new ResAct());
		
		add(btn);
		
		
		add(label=new JLabel());
		
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		new Timer().start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ExamMain();
	}

}
