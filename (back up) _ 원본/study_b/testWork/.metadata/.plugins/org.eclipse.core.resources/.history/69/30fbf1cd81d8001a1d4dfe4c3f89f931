package swing_p;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LayoutMain {

	public static void main(String[] args) {
		int ox = -3200;
		
		JFrame f1 = new JFrame("Border");
		f1.setBounds(ox+0, 50, 300, 200);
		f1.setLayout(new BorderLayout());
		//f1.setLayout(new FlowLayout());
		
		//f1.add(new JButton("btn1"),"North");
		f1.add("South",new JButton("btn2"));
		f1.add("East",new JButton("btn3"));
		//f1.add(new JButton("btn4"),"West");
		//f1.add(new JButton("btn5"),"Center");
		f1.setVisible(true);
		
		
		JFrame f2 = new JFrame("Flow");
		f2.setBounds(ox+300, 50, 500, 200);
		f2.setLayout(new FlowLayout(FlowLayout.LEFT, 100,10));
		
		for (int i = 0; i < 10; i++) {
			f2.add(new JButton("btn"+i));
		}
		
		f2.setVisible(true);
		
		JFrame f3 = new JFrame("Grid");
		f3.setBounds(ox+0, 250, 300, 200);
		f3.setLayout(new GridLayout(4,3, 30,5));
		
		for (int i = 0; i < 17; i++) {
			f3.add(new JButton("btn"+i));
		}
		
		f3.setVisible(true);
		
		JFrame f4 = new JFrame("Box");
		f4.setBounds(ox+300, 250, 300, 200);
		//f4.setLayout(new BoxLayout(f4.getContentPane(), BoxLayout.Y_AXIS));
		f4.setLayout(new BoxLayout(f4.getContentPane(), BoxLayout.X_AXIS) {
		});
		
		for (int i = 0; i <5; i++) {
			f4.add(new JButton("btn"+i));
		}
		
		JPanel pan = new JPanel();
		pan.setSize(300, 100);
		pan.setLayout(new GridLayout(2,5));
		for (int i = 0; i <10; i++) {
			pan.add(new JButton("pan"+i));
		}
		
		pan.setBackground(Color.pink);
		f4.add(pan);
		f4.setVisible(true);
		
		
		JFrame f5 = new JFrame("Card");
		f5.setBounds(ox+600, 250, 300, 200);
		
		CardLayout card = new CardLayout();
		f5.setLayout(card);
		
		Color [] ccArr = {
				
				new Color(255, 0,   0),
				new Color(255, 150, 0),
				new Color(255, 255, 0),
				new Color( 0, 255,  0),
				new Color( 0,  0, 255),
				new Color( 50, 0, 150),
				new Color(255, 0, 255),
				
		};
		
		String index = "빨주노초파남보";
		
		for (int i = 0; i < ccArr.length; i++) {
			JPanel pp = new JPanel();
			pp.setBackground(ccArr[i]);
			f5.add(pp, index.substring(i,i+1));
		}
		
		
		
		f5.setVisible(true);
		
		int i =0;
		
		while(true) {
			try {
				
				Thread.sleep(100);
				card.show(f5.getContentPane(), index.substring(i,i+1));
				
				i++;
				i%=index.length();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
