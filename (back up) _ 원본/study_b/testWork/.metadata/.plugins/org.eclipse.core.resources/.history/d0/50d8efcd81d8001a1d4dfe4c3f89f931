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

public class MenuMain extends JFrame{

	public MenuMain() {
		int ox = -3200;
		setBounds(ox+0, 50, 300, 200);
		
		JMenuBar mb = new JMenuBar();
		
		setJMenuBar(mb);
		
		JMenu main1 = new JMenu("파일");
		JMenu main2 = new JMenu("편집");
		JMenu main3 = new JMenu("보기");
		
		mb.add(main1);
		mb.add(main2);
		mb.add(main3);
		
		ImageIcon icon = new ImageIcon("img/camera.png");
		JMenuItem sub1_1 = new JMenuItem("새로 만들기", icon);
		JMenuItem sub1_2 = new JMenuItem("개로 만들기");
		sub1_2.setText("닭으로 만들기");
		JMenuItem sub1_3 = new JMenuItem("소로 만들기");
		sub1_3.setAccelerator(KeyStroke.getKeyStroke('a'));
		JMenuItem sub1_4 = new JMenuItem("가로 만들기");
		sub1_4.setAccelerator(
				KeyStroke.getKeyStroke(KeyEvent.VK_D, KeyEvent.CTRL_MASK)
				);
		main1.add(sub1_1);
		main1.add(sub1_2);
		main1.add(sub1_3);
		main1.addSeparator();
		main1.add(sub1_4);
		
		
		JMenu sub2_1 = new JMenu("용지");
		JMenu sub2_2 = new JMenu("속성");
		
		main2.add(sub2_1);
		main2.add(sub2_2);
		
		JMenuItem item2_1_1 = new JMenuItem("A4");
		JMenuItem item2_1_2 = new JMenuItem("B4");
		JMenuItem item2_1_3 = new JMenuItem("C4");
		
		sub2_1.add(item2_1_1);
		sub2_1.add(item2_1_2);
		sub2_1.add(item2_1_3);
		
		item2_1_2.setEnabled(false);
		item2_1_3.setSelected(false);
		
		
		
		JCheckBoxMenuItem sub3_1 = new JCheckBoxMenuItem("안내선");
		JCheckBoxMenuItem sub3_2 = new JCheckBoxMenuItem("격자");
		
		JRadioButtonMenuItem sub3_3 = new JRadioButtonMenuItem("데스크탑");
		JRadioButtonMenuItem sub3_4 = new JRadioButtonMenuItem("태블릿");
		JRadioButtonMenuItem sub3_5 = new JRadioButtonMenuItem("휴대폰");
		
		main3.add(sub3_1);
		main3.add(sub3_2);
		
		main3.add(sub3_3);
		main3.add(sub3_4);
		main3.add(sub3_5);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(sub3_3);
		bg.add(sub3_4);
		bg.add(sub3_5);
		
		
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MenuMain();
	}

}

