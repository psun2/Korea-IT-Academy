package swing_p;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FontMain extends JFrame {

	public FontMain() {
		int ox = -3200;
		setBounds(ox+100, 50, 700, 600);
		
		
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		
		Font [] fonts = ge.getAllFonts();
		
		for (Font font : fonts) {
			System.out.println(font.getFontName());
		}
		
		
		Font [] ffArr = {
				new Font("휴먼매직체", Font.ITALIC, 40),
				new Font("휴먼둥근헤드라인", Font.ITALIC, 40),
				new Font("휴먼매직체", Font.ITALIC+Font.BOLD, 40),
				new Font("Arial", Font.PLAIN, 40),
				new Font("Arial", Font.ITALIC, 20),
				new Font("Arial", Font.BOLD, 15)
				
		};
		
		String str = "코리아 IT 아카 1234 @ Academy";
		
		for (Font font : ffArr) {
			JLabel lb = new JLabel(str);
			lb.setFont(font);
			
			add(lb);
		}
		
		
		setLayout(new GridLayout(ffArr.length, 1));
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new FontMain();
	}

}
