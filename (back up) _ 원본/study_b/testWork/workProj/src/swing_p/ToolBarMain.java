package swing_p;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToolBar;

public class ToolBarMain extends JFrame{

	public ToolBarMain() {
		int ox = -3200;
		setBounds(ox+0, 50, 700, 600);
		setTitle("ToolBar");
		
		JToolBar bar = new JToolBar("����");
		bar.setBackground(Color.pink);
		add(bar,"South");
		
		JButton btn = new JButton("����");
		btn.setToolTipText("���� ���� ��ư�Դϴ�.");
		bar.add(btn);
		bar.add(new JButton(new ImageIcon("img/camera.png")));
		bar.add(new JLabel("ī�޶���:"));
		
		
		
		JComboBox box = new JComboBox();
		box.addItem("�Ϲ�");
		box.addItem("����");
		box.addItem("����");
		box.addItem("����");
		bar.add(box);
		
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		new ToolBarMain();

	}

}
