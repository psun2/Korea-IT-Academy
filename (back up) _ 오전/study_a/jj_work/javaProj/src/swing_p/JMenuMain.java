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
		//System.out.println("생성자다");
		
		int ox = -3200;
		setBounds(ox+10, 10, 300, 200);
		
		JMenuBar mb = new JMenuBar();
		
		setJMenuBar(mb);
		
		JMenu main1 = new JMenu("파일");
		JMenu main2 = new JMenu("편집");
		JMenu main3 = new JMenu("보기");
		
		JMenuItem item1_1 = new JMenuItem("새로 만들기");
		item1_1.setText("가로 만들기");
		
		ImageIcon icon = new ImageIcon("img/greenFace.png");
		
		JMenuItem item1_2 = new JMenuItem("개로 만들기", icon);
		JMenuItem item1_3 = new JMenuItem("소로 만들기");
		item1_3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, KeyEvent.CTRL_MASK));
		
		main1.add(item1_1);
		main1.add(item1_2);
		main1.add(item1_3);
		main1.addSeparator();
		main1.add(new JMenuItem("종료"));
		
		
		JMenu item2_1  = new JMenu("속성");
		JMenu item2_2  = new JMenu("환경");
		
		JMenuItem sub2_1_1 = new JMenuItem("글꼴");
		JMenuItem sub2_1_2 = new JMenuItem("색상");
		
		sub2_1_1.setSelected(true);
		sub2_1_2.setEnabled(false);
		
		item2_1.add(sub2_1_1);
		item2_1.add(sub2_1_2);
		
		main2.add(item2_1);
		main2.add(item2_2);
		
		
		JCheckBoxMenuItem item3_1 = new JCheckBoxMenuItem("안내선");
		JCheckBoxMenuItem item3_2 = new JCheckBoxMenuItem("격자", true);
		
		main3.add(item3_1);
		main3.add(item3_2);
		
		JRadioButtonMenuItem item3_3 = new JRadioButtonMenuItem("인쇄모드");
		JRadioButtonMenuItem item3_4 = new JRadioButtonMenuItem("웹모드", true);
		JRadioButtonMenuItem item3_5 = new JRadioButtonMenuItem("편집모드");
		
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
