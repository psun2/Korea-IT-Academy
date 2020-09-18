package swing_p;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

public class PaintMain extends JFrame {

	public PaintMain() {
		setBounds(-3200+100, 100, 700, 600);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		System.out.println("생성자인가");
	}
	
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		System.out.println("그림그리기인가");
		
		g.setFont(new Font("엽서체", Font.ITALIC, 20));
		g.setColor(Color.red);
		g.drawString("그림을 그려요", 10, 50);
		
		g.setColor(Color.green);
		g.fillRect(100, 130, 100, 70);
		g.setColor(Color.blue);
		g.drawRect(50, 100, 100, 70);
		
		g.setColor(Color.pink);
		g.drawOval(50, 190, 100, 70);
		
		g.setColor(Color.pink);
		g.drawOval(50, 190, 100, 70);
		
		g.setColor(Color.red);
		g.drawLine(50, 80, 170, 300);
		
		g.drawRoundRect(50, 320, 200, 100, 80,30);
		
		
		g.drawArc(350, 100,100,100, 45,90);
		g.fillArc(450, 100,100,100, 45,90);
		
		g.drawPolygon(
				new int [] {420,550,650,380},
				new int [] {340,260,500,400},
				4
				);
		
		
		
	}
	
	public static void main(String[] args) {
		new PaintMain();
	}

}
