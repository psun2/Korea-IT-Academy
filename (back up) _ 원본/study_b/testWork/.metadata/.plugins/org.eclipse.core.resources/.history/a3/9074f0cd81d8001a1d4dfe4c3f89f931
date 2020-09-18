package swing_p;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ColorMain extends JFrame  {

	public ColorMain() {
		int ox = -3200;
		setBounds(ox+100, 50, 700, 600);
		
		Color [] ccArr = {
				Color.red,
				new Color(255, 0, 0),
				new Color(255, 0, 0, 100),
				new Color(1.0f,0.0f,0.0f),
				new Color(1.0f,0.0f,0.0f,0.1f),
				new Color(65280)
		};
		
		
		ccArr = new Color[]{
				
				new Color(255, 0,   0),
				new Color(255, 150, 0),
				new Color(255, 255, 0),
				new Color( 0, 255,  0),
				new Color( 0,  0, 255),
				new Color( 50, 0, 150),
				new Color(255, 0, 255),
				
		};
		
		setLayout(new GridLayout(ccArr.length, 1));
		
		for (Color color : ccArr) {
			JLabel btn = new JLabel();
			btn.setOpaque(true);
			btn.setBackground(color);
			add(btn);
		}
		
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new ColorMain();
	}

}
