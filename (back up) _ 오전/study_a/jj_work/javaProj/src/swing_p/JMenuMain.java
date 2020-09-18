package swing_p;

import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

public class JMenuMain extends JFrame{

	public JMenuMain() {
		//System.out.println("�����ڴ�");
		
		int ox = -3200;
		setBounds(ox+10, 10, 300, 200);
		
		JMenuBar mb = new JMenuBar();
		
		setJMenuBar(mb);
		
		JMenu main1 = new JMenu("����");
		JMenu main2 = new JMenu("����");
		JMenu main3 = new JMenu("����");
		
		JMenuItem item1_1 = new JMenuItem("���� �����");
		item1_1.setText("���� �����");
		
		ImageIcon icon = new ImageIcon("img/greenFace.png");
		
		JMenuItem item1_2 = new JMenuItem("���� �����", icon);
		JMenuItem item1_3 = new JMenuItem("�ҷ� �����");
		item1_3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, KeyEvent.CTRL_MASK));
		
		main1.add(item1_1);
		main1.add(item1_2);
		main1.add(item1_3);
		main1.addSeparator();
		main1.add(new JMenuItem("����"));
		
		
		JMenu item2_1  = new JMenu("�Ӽ�");
		JMenu item2_2  = new JMenu("ȯ��");
		
		JMenuItem sub2_1_1 = new JMenuItem("�۲�");
		JMenuItem sub2_1_2 = new JMenuItem("����");
		
		sub2_1_1.setSelected(true);
		sub2_1_2.setEnabled(false);
		
		item2_1.add(sub2_1_1);
		item2_1.add(sub2_1_2);
		
		main2.add(item2_1);
		main2.add(item2_2);
		
		
		JCheckBoxMenuItem item3_1 = new JCheckBoxMenuItem("�ȳ���");
		JCheckBoxMenuItem item3_2 = new JCheckBoxMenuItem("����", true);
		
		main3.add(item3_1);
		main3.add(item3_2);
		
		JRadioButtonMenuItem item3_3 = new JRadioButtonMenuItem("�μ���");
		JRadioButtonMenuItem item3_4 = new JRadioButtonMenuItem("�����", true);
		JRadioButtonMenuItem item3_5 = new JRadioButtonMenuItem("�������");
		
		ButtonGroup bg = new ButtonGroup();
		
		bg.add(item3_3);
		bg.add(item3_4);
		bg.add(item3_5);
		
		main3.add(item3_3);
		main3.add(item3_4);
		main3.add(item3_5);
		
		
		mb.add(main1);
		mb.add(main2);
		mb.add(main3);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
	
		new JMenuMain();

	}

}
