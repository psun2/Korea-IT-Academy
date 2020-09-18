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
			
			label.setText("���:"+cnt);
			
		}
	}
	
	class Timer extends Thread{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i = 10; i >=0; i--) {
				
				try {
					timerLb.setText("�ð�:"+i+" ");
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
		
		add(new JLabel("1. ��������?"));
		
		qq1 = new ArrayList<JRadioButton>();
		ButtonGroup bg = new ButtonGroup();
		for (String str : "�����ؿ�,�Ϳ�����,������,���ܿ�".split(",")) {
			JRadioButton jRadioButton = new JRadioButton(str);
			
			bg.add(jRadioButton);
			add(jRadioButton);
			qq1.add(jRadioButton);
		}
		
		
		add(new JLabel("2. �л�������?"));
		
		qq2 = new ArrayList<JCheckBox>();
		
		for (String str : "������,��������,ū�ϲ�,ū���".split(",")) {
			JCheckBox box = new JCheckBox(str);
			
			add(box);
			qq2.add(box);
		}
		
		
		btn = new JButton("ä��");
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
