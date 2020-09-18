package swing_p;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

public class PaintMain extends JFrame {

	public PaintMain() {
		int ox = -1200;
		setBounds(ox+100, 50, 500, 600);
		setTitle("Paint");
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		System.out.println("paint() 호출");
		g.setColor(Color.GREEN);
		g.setFont(new Font("엽서체", Font.ITALIC, 30));
		g.drawString("그림을 그려요", 10,100);
		
		g.setColor(Color.BLUE);
		g.fillRect(10, 110, 100, 40);
		
		g.setColor(Color.red);
		g.drawRect(30, 90, 100, 40);
		
		g.setColor(Color.red);
		g.drawRect(10, 160,50,100);
		
		g.setColor(Color.pink);
		g.fillOval(10, 160,50,100);
		
		g.setColor(Color.cyan);
		g.drawLine(10, 50, 100, 270);
		
		g.setColor(Color.yellow);
		g.fillRoundRect(50, 280, 200, 200, 100,100);
		
		g.setColor(Color.magenta);
		g.drawArc(50,500,100,100,0,90);
		
		g.fillArc(150,500,100,100,45,90);
		
		
		g.drawPolygon(
				new int[] {250,300,400,270}, 
				new int[] {430,370,520,480},
				4);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PaintMain();
	}

}
