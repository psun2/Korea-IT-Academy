package swing_p;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class ComponentMain {

	public static void main(String[] args) {


		JFrame f = new JFrame("컨퍼넌트다");
		int ox = -3200;
		
		Dimension d = new Dimension(800, 600);
		//f.setSize(d);
		//f.setSize(800, 700);
		//f.setLocation(ox+100,300);
		Point p = new Point(ox+100,100);
		//f.setLocation(p);
		
		//f.setBounds(ox+100,100, 800, 600);
		
		//Rectangle r = new Rectangle(ox+100,100, 800, 600);
		Rectangle r = new Rectangle(p,d);
		f.setBounds(r);
		f.setLayout(null);
		
		JButton b1 = new JButton("버튼1");
		b1.setBounds(20, 50, 70, 30);
		f.add(b1);
		
		JButton b2 = new JButton("버튼2");
		b2.setBounds(100, 50, 70, 30);
		b2.setEnabled(false);
		f.add(b2);
		
		JButton b3 = new JButton("버튼3");
		b3.setBounds(180, 50, 70, 30);
		b3.setBackground(Color.pink);
		b3.setForeground(Color.green);
		f.add(b3);
		
		ImageIcon icon4 = new ImageIcon("img/call.png");
		JButton b4 = new JButton(icon4);
		b4.setBounds(20, 100, 100, 100);
		f.add(b4);
		
		
		JButton b5 = new JButton("버튼5",new ImageIcon("img/no.png"));
		b5.setBounds(140, 100, 100, 100);
		b5.setVerticalTextPosition(0);
		b5.setHorizontalTextPosition(0);
		f.add(b5);
		
		ButtonGroup bg1 = new ButtonGroup();
		JToggleButton tb1 = new JToggleButton("토글1");
		tb1.setBounds(20, 210, 70, 30);
		f.add(tb1);
		JToggleButton tb2 = new JToggleButton("토글2", true);
		tb2.setBounds(90, 210, 70, 30);
		f.add(tb2);
		JToggleButton tb3 = new JToggleButton("토글3");
		tb3.setBounds(160, 210, 70, 30);
		f.add(tb3);
		bg1.add(tb1);
		bg1.add(tb2);
		bg1.add(tb3);
		
		Vector<String>email = new Vector<String>();
		email.add("네이버");
		email.add("다음");
		email.add("구글");
		email.add("야후");
		
		
		JComboBox box = new JComboBox(email);
		box.setBounds(20, 250, 120, 30);
		box.setSelectedItem("구글");
		f.add(box);
		
		ButtonGroup bg2 = new ButtonGroup();
		JRadioButton rb1 = new JRadioButton("남자");
		rb1.setBounds(20, 290, 100, 30);
		f.add(rb1);
		
		JRadioButton rb2 = new JRadioButton("여자", true);
		rb2.setBounds(120, 290, 100, 30);
		f.add(rb2);
		
		JRadioButton rb3 = new JRadioButton("it인");
		rb3.setBounds(220, 290, 100, 30);
		f.add(rb3);
		bg2.add(rb1);
		bg2.add(rb2);
		bg2.add(rb3);
		
		JCheckBox cb1 = new JCheckBox("독서");
		cb1.setBounds(20, 330, 70, 30);
		f.add(cb1);
		
		JCheckBox cb2 = new JCheckBox("게임");
		cb2.setBounds(100, 330, 70, 30);
		f.add(cb2);
		
		JCheckBox cb3 = new JCheckBox("잠자기");
		cb3.setBounds(180, 330, 70, 30);
		f.add(cb3);
		
		String [] pp = {"의사","판사","안사","못사"};
		
		JList list = new JList(pp);
		list.setBounds(20, 370, 100, 100);
		list.setSelectedValue("안사", true);
		f.add(list);
		
		JLabel lb1 = new JLabel("id");
		lb1.setBounds(350, 20, 70, 30);
		f.add(lb1);
		
		JTextField tf = new JTextField("aaa");
		tf.setBounds(430, 20, 100, 30);
		f.add(tf);
		
		JPasswordField pf = new JPasswordField("pw");
		pf.setBounds(540, 20, 100, 30);
		f.add(pf);
		
		Object [] index = {"이름","국어","영어","수학"};
		
		Object [][] data = {
				{"박성언",77,78,79},
				{"박시현",67,68,69},
				{"안정민",97,89,99},
				{"이주혁",57,58,59},
				{"이호인",87,88,89}
			};
		
		
		
		JTable table = new JTable(data, index);
		
		JScrollPane sp1 = new JScrollPane(table);
		sp1.setBounds(350, 70, 200, 120);
		f.add(sp1);
		
		JTextArea area = new JTextArea();
		JScrollPane sp2 = new JScrollPane(area);
		sp2.setBounds(560, 70, 200, 100);
		f.add(sp2);
		
		
		JProgressBar bar = new JProgressBar(0,100);
		bar.setBounds(350, 200, 300, 30);
		bar.setValue(50);
		f.add(bar);
		
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0,100,50);
		slider.setBounds(350, 240, 300,100);
		//숫자표시
		slider.setPaintLabels(true);
		// 선 표시
		slider.setPaintTicks(true);
		//바 표시
		slider.setPaintTrack(true);
		
		//큰 눈금
		slider.setMajorTickSpacing(50);
		//작은 눈금
		slider.setMinorTickSpacing(10);
		f.add(slider);
		
		f.setVisible(true);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}



