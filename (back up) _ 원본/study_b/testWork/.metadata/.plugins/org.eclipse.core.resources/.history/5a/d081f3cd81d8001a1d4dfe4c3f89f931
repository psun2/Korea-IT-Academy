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
		
		JToolBar bar = new JToolBar("툴바");
		bar.setBackground(Color.pink);
		add(bar,"South");
		
		JButton btn = new JButton("파일");
		btn.setToolTipText("파일 저장 버튼입니다.");
		bar.add(btn);
		bar.add(new JButton(new ImageIcon("img/camera.png")));
		bar.add(new JLabel("카메라모드:"));
		
		
		
		JComboBox box = new JComboBox();
		box.addItem("일반");
		box.addItem("광학");
		box.addItem("접근");
		box.addItem("전방");
		bar.add(box);
		
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		new ToolBarMain();

	}

}
