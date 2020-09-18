package swing_p;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ImagePaintMain extends JFrame
implements ActionListener, MouseMotionListener{

	Image img = null;
	Graphics gImg = null;
	
	Font font;
	Color cc, leftCC = Color.blue;
	
	public ImagePaintMain() {
		
		//img = createImage(700,500);
		//gImg = img.getGraphics();  setVisible(true) 이전에 하여 에러발생
		Color [] arr = {
				new Color(255,0,0),
				new Color(255,200,0),
				new Color(255,255,0),
				new Color(0,255,0),
				new Color(0,0,255),
				new Color(0,50,150),
				new Color(200,0,255)
		};
		
		for (int i = 0; i < arr.length; i++) {
			JButton btn = new JButton();
			btn.setBounds(50*i,500,50,50);
			btn.setBackground(arr[i]);
			btn.addActionListener(this);
			add(btn);
		}
		
		
		setBounds(-3200+100, 100, 700, 600);
		setLayout(null);
		setVisible(true);
		img = createImage(700,500);
		gImg = img.getGraphics();
		
		gImg.setColor(Color.white);
		gImg.fillRect(0, 0, 700,500);
		gImg.drawString("이미지로 그려요", 50, 50);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		addMouseMotionListener(this);
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawImage(img, 0, 0, this);
	}
	
	public static void main(String[] args) {
		new ImagePaintMain();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		leftCC = ((JButton)e.getSource()).getBackground();
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		
		cc = leftCC;
		font = new Font("고딕", Font.PLAIN, 5);
		
		if(e.getModifiers() == MouseEvent.BUTTON3_MASK) {
			cc = Color.white;
			font = new Font("고딕", Font.PLAIN, 60);
		}
		
		gImg.setFont(font);
		gImg.setColor(cc);
		
		gImg.drawString("●", e.getX(), e.getY());
		
		repaint();  
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		

	}

}
