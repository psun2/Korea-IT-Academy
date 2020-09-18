package swing_p;



import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class LayoutMain {

	public static void main(String[] args) {
		JFrame f1 = new JFrame("BOrder");
		int ox = -3200;
		f1.setBounds(ox, 0,300, 200);
		//f1.setLayout(null);
		f1.setLayout(new BorderLayout());
		//f1.add(new JButton("btn1"),"north");
		f1.add(new JButton("btn1"),"North");
		//f1.add("South",new JButton("btn2"));
		f1.add(new JButton("btn3"),"West");
		//f1.add(new JButton("btn4"),"East");
		//f1.add(new JButton("btn5"), "Center");
		
		
		f1.setVisible(true);
		
		
		JFrame f2 = new JFrame("Flow");
		f2.setBounds(ox+300, 0,300, 200);

		//f2.setLayout(new FlowLayout(FlowLayout.RIGHT));
		f2.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 10));
		f2.setResizable(false);
		for (int i = 0; i < 20; i++) {
			f2.add(new JButton("btn"+i));
		}

		f2.setVisible(true);
		
		JFrame f3= new JFrame("Grid");
		f3.setBounds(ox+600, 0,400, 300);

		//f3.setLayout(new GridLayout(4,5,0,0));
		//f3.setLayout(new GridLayout(4,5,10,5));
		//f3.setLayout(new GridLayout(6,5));
		f3.setLayout(new GridLayout(3,5));
		
		for (int i = 0; i < 20; i++) {
			f3.add(new JButton("btn"+i));
		}

		f3.setVisible(true);
		
		
		JFrame f4= new JFrame("Box");
		f4.setBounds(ox+0, 300,400, 300);
		//f4.setLayout(new BoxLayout(f4.getContentPane(), BoxLayout.Y_AXIS));
		//f4.setLayout(new BoxLayout(f4.getContentPane(), BoxLayout.X_AXIS));
		//f4.setLayout(new BoxLayout(f4.getContentPane(), BoxLayout.LINE_AXIS));//X_AXIS µ¿ÀÏ
		f4.setLayout(new BoxLayout(f4.getContentPane(), BoxLayout.PAGE_AXIS));//Y_AXIS µ¿ÀÏ
		
		for (int i = 0; i < 5; i++) {
			f4.add(new JButton("btn"+i));
		}

		f4.setVisible(true);
		
		JFrame f5= new JFrame("Box");
		f5.setBounds(ox+400, 300,400, 300);
	
		CardLayout card = new CardLayout();
		
		f5.setLayout(card);
		
		Color [] cc = {
				Color.pink,
				Color.green,
				Color.yellow,
				Color.blue,
				Color.red
		};
		
		String [] pp = {
				"ÇÎÅ©","³ì»ö","³ë¶û","ÆÄ¶û","»¡°­"
		};
		
		for (int i = 0; i < pp.length; i++) {
			JPanel panel = new JPanel();
			panel.setBackground(cc[i]);
			f5.add(panel, pp[i]);
			
		}

		f5.setVisible(true);
		//card.show(f5.getContentPane(), "ÇÎÅ©");
		//card.show(f5.getContentPane(), "³ì»ö");
		
		
		
		JFrame f6= new JFrame("total");
		f6.setBounds(ox+600, 300,600, 400);

		f6.setLayout(new GridLayout(2,1));
		
		JPanel sub1 = new JPanel();
		JPanel sub2 = new JPanel();
		
		sub1.setBackground(Color.yellow);
		
		sub1.setLayout(new GridLayout(1,2));
		JPanel sub1_1 = new JPanel();
		sub1_1.setLayout(new BoxLayout(sub1_1, BoxLayout.Y_AXIS));
		for (int i = 0; i <20; i++) {
			sub1_1.add(new JButton("sub1_1 :"+i));
		}
		
		
		
		JScrollPane sp = new JScrollPane(sub1_1);
		
		sub1.add(sp);
		
		
		CardLayout cardSub = new CardLayout();
		
		JPanel sub1_2 = new JPanel(cardSub);
		sub1_2.add(new JLabel(new ImageIcon("img/son_01.jpg")),"¾Æµé1");
		sub1_2.add(new JLabel(new ImageIcon("img/son_02.jpg")),"¾Æµé2");
		
		
		
		sub1.add(sub1_2);
		
		sub2.setBackground(Color.green);
		
		f6.add(sub1);
		f6.add(sub2);
		
		sub2.setLayout(new GridLayout(5,4));
		
		for (char ch : "1234567890!@#$%^&*()".toCharArray()) {
			sub2.add(new JButton(ch+""));
		}
		

		f6.setVisible(true);
		
		
		
		
		
		
		int i =0;
		int j =0;
		while(true) {
			
			try {
				j++;
				cardSub.show(sub1_2, "¾Æµé"+j);
				j%=2;
				card.show(f5.getContentPane(), pp[i]);
				i++;
				i%=pp.length;
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
	}

}
