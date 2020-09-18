package swing_p;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FontMain {

	public static void main(String[] args) {
		GraphicsEnvironment gs = GraphicsEnvironment.getLocalGraphicsEnvironment();

		Font [] fs = gs.getAllFonts();
		
		for (Font font : fs) {
			System.out.println(font.getName());
				
		}
		
		JFrame f = new JFrame();
		int ox = -3200;
		f.setBounds(ox+100, 50,800, 700);
		
		String str = "¼±»ý´ÔÀº ±Í¿©¿ö¿ä love LIKE 1234567890 !@#$%^&*()_+";
		
		Font [] ffArr = {
			new Font("ÈÞ¸Õ¸ÅÁ÷Ã¼", Font.ITALIC, 20),
			new Font("ÈÞ¸Õ¿¾Ã¼", Font.BOLD, 17),
			new Font("ÈÞ¸ÕÆíÁöÃ¼", Font.BOLD+Font.ITALIC, 26),
			new Font("ÈÞ¸ÕÆíÁöÃ¼", Font.PLAIN, 26),
		};
		
		
		
		
		
		f.setLayout(new GridLayout(ffArr.length, 1));
		
		for (Font font : ffArr) {
			JLabel lb = new  JLabel(str);
			lb.setFont(font);
			f.add(lb);
		}
		
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
