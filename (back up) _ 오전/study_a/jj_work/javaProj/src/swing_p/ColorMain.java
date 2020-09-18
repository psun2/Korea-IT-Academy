package swing_p;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ColorMain {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		int ox = -3200;
		f.setBounds(ox+100, 50,400, 500);
		f.setBackground(new Color(0,255,0));
		String str = "¼±»ý´ÔÀº ±Í¿©¿ö¿ä love LIKE 1234567890 !@#$%^&*()_+";
		
		
		
		Color [] ffArr = {
				
			Color.red,
			Color.blue,
			Color.green,
			Color.white,
			Color.black,
			Color.pink,
			new Color(255,0,0),
			new Color(255,255,0),
			new Color(0.5f,0,1f), //0.0 ~1
			new Color(255), //0000 0000, 0000 0000, 1111 1111
			new Color(16711680), //1111 1111, 0000 0000, 0000 0000
			new Color(255,0,0,10),
			new Color(255,0,0,255),
		};
		
		
		
		f.setLayout(new GridLayout(ffArr.length, 1));
		
		for (Color cc : ffArr) {
			JLabel lb = new  JLabel(str);
			//JButton lb = new JButton(str);
			lb.setOpaque(true);
			lb.setBackground(cc);
			lb.setForeground(Color.white);
			lb.setForeground(Color.orange);
			f.add(lb);
		}
		
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		JFrame f2 = new JFrame();
		
		f2.setBounds(ox+450, 50,400, 500);
		
		
		
		Color [] ccArr = {
				
			
			new Color(255,0,0),
			new Color(255,100,0),
			new Color(255,255,0),
			new Color(0,255,0),
			new Color(0,0,255),
			new Color(20,0,150),
			new Color(255,0,255)
		};
		
		
		
		f2.setLayout(new GridLayout(ccArr.length, 1));
		
		for (Color cc : ccArr) {
			JLabel lb = new  JLabel();
			
			lb.setOpaque(true);
			lb.setBackground(cc);
			lb.setForeground(Color.white);
			
			f2.add(lb);
		}
		
		
		f2.setVisible(true);
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		

	}

}
