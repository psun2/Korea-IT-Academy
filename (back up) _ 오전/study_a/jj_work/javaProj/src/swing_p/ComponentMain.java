package swing_p;

import java.awt.Color;
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
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class ComponentMain {

	public static void main(String[] args) {
		
		///  container
		JFrame f = new JFrame("ȸ�� ����â");
		int ox = -3200;
		//f.setSize(300, 400);
		//f.setLocation(ox+500, 300);
		f.setBounds(ox+100, 50,800, 700);
		f.setLayout(null);
		
		///component
		JButton b1 = new JButton("��ư1");
		b1.setBounds(20, 50,100, 30);
		b1.setBackground(Color.pink);
		f.add(b1);
		
		JButton b2 = new JButton("��ư2");
		b2.setBounds(130, 50,100, 30);
		b2.setEnabled(false);
		f.add(b2);
		
		JButton b3 = new JButton("��ư3");
		b3.setBounds(260, 50,100, 30);
		f.add(b3);
		
		ImageIcon imgIc = new ImageIcon("fff/son_01.jpg");
		
		JButton b4 = new JButton(imgIc);
		b4.setBounds(20, 100,100, 100);
		
		f.add(b4);
		
		JButton b5 = new JButton("��ư5",new ImageIcon("fff/son_02.jpg"));
		b5.setBounds(130, 100,100, 100);
		b5.setVerticalTextPosition(0);
		b5.setHorizontalTextPosition(0);
		b5.setForeground(Color.green);
		f.add(b5);
		
		ButtonGroup bg =new ButtonGroup();
		
		JToggleButton tb1 = new JToggleButton("���1");
		tb1.setBounds(20, 220,100, 30);
		bg.add(tb1);
		f.add(tb1);
		JToggleButton tb2 = new JToggleButton("���2", true);
		tb2.setBounds(120, 220,100, 30);
		bg.add(tb2);
		f.add(tb2);
		JToggleButton tb3 = new JToggleButton("���3");
		tb3.setBounds(220, 220,100, 30);
		bg.add(tb3);
		f.add(tb3);
		
		
		Vector<String> email = new Vector<String>();
		email.add("���̹�");
		email.add("����");
		email.add("����");
		email.add("����");
		
		JComboBox box = new JComboBox(email);
		box.setBounds(20, 270,100, 30);
		//box.setSelectedIndex(2);
		box.setSelectedItem("����");
		f.add(box);
		
		JLabel gen_lb = new JLabel("����");
		gen_lb.setBounds(20, 320,100, 30);
		f.add( gen_lb);
		
		JRadioButton rb1 = new JRadioButton("����");
		JRadioButton rb2 = new JRadioButton("����");
		JRadioButton rb3 = new JRadioButton("it��", true);
		JRadioButton rb4 = new JRadioButton("scv");
		rb1.setBounds(120, 320,80, 30);
		rb2.setBounds(200, 320,80, 30);
		rb3.setBounds(280, 320,80, 30);
		rb4.setBounds(360, 320,80, 30);
		
		ButtonGroup bg1 =new ButtonGroup();
		bg1 .add( rb1);
		bg1 .add( rb2);
		bg1 .add( rb3);
		bg1 .add( rb4);
		
		
		f.add( rb1);
		f.add( rb2);
		f.add( rb3);
		f.add( rb4);
		
		
		
		JCheckBox ch1 = new JCheckBox("����");
		JCheckBox ch2 = new JCheckBox("���");
		JCheckBox ch3 = new JCheckBox("��Ʈ", true);
		JCheckBox ch4 = new JCheckBox("���ڱ�");
		ch1.setBounds(20, 360,80, 30);
		ch2.setBounds(100, 360,80, 30);
		ch3.setBounds(180, 360,80, 30);
		ch4.setBounds(260, 360,80, 30);

		f.add( ch1);
		f.add( ch2);
		f.add( ch3);
		f.add( ch4);
		
		String [] pp = {"��Ա�","�ؾ�Ա�","�����ϱ�","�������ϱ�","���Ĵٺ���"};
		
		JList spec = new JList(pp);
		spec.setBounds(20, 400,150, 150);
		spec.setSelectedValue("�����ϱ�", false);
		f.add(spec);
		
		JTextArea area = new JTextArea("����Ŀ�");
		area.setLineWrap(true);
		
		JScrollPane areaSP = new JScrollPane(area);
		areaSP.setBounds(450, 50,200, 100);
		f.add( areaSP);
		
		
		JTextField id = new JTextField();
		id.setBounds(450, 160,200, 50);
		f.add(id);
		
		JPasswordField pw = new JPasswordField();
		pw.setBounds(450, 220,200, 50);
		f.add(pw);
		
		Object [][] data = {
				{"����",77,78,71},
				{"����",57,58,51},
				{"�����",97,98,91},
				{"���",67,68,61},
				{"�̽��ͺ�",87,88,81}
		};
		
		Object [] index = {"�̸�","����","����","����"};
		
		JTable tt = new JTable(data, index);
		JScrollPane ttSP = new JScrollPane(tt);
		ttSP.setBounds(450, 290,300, 300);
		f.add(ttSP);
		
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
