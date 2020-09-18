package swing_p;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageLIneMain extends JFrame{

	class MyPanel extends JPanel implements MouseMotionListener {
		

		Image img = null;
		Graphics gImg = null;
		
		int x =0, y=0;
		public MyPanel() {
			setBounds(100, 100, 600, 400);
			addMouseMotionListener(this);
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {
			gImg.setColor(Color.red);
			//gImg.drawString("*", e.getX(), e.getY());
			
			gImg.drawLine(x,y, e.getX(), e.getY());
			
			repaint();
			
			x = e.getX();
			y = e.getY();
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			x = e.getX();
			y = e.getY();

		}
		
		
		@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			super.paint(g);
			if(img==null) {
				img = createImage(600, 400);
				gImg = img.getGraphics();
				gImg.setColor(Color.white);
				gImg.fillRect(0, 0, 600, 400);
			}
			
			
			g.drawImage(img, 0,0, this);
			
			
		}
	}
	

	public ImageLIneMain() {
		int ox = -1200;
		setBounds(ox+100, 50, 800, 600);
		setLayout(null);
		setTitle("ImagePaint");
		add(new MyPanel());
		
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
	}
	

	public static void main(String[] args) {
		new ImageLIneMain();

	}

}
