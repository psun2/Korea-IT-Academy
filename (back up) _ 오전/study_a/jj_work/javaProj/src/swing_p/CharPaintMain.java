package swing_p;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CharPaintMain extends JFrame 
implements MouseListener {

	int x, y;
	Font font;
	
	Color cc, leftCC;
	boolean firstChk = true;
	
	class MyPanel extends JPanel implements MouseMotionListener{
		
		public MyPanel() {
			setBounds(0, 0, 700, 500);
			setBackground(Color.white);
			addMouseMotionListener(this);
		}
		
		@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			if(firstChk) {
				//super.paint(g);
				init(g);
			}
			
			System.out.println("그린다");
			g.setFont(font);
			g.setColor(cc);
			g.drawString("●", x, y);
		}
		
		
		void init(Graphics g) {
			g.setColor(Color.white);
			g.fillRect(0, 0, 700, 500);
			firstChk = false;
		}
		
		
		@Override
		public void mouseDragged(MouseEvent e) {
			//System.out.println("드래그다");
			
			
			x = e.getX();
			y = e.getY();
			
			cc = leftCC;
			font = new Font("고딕", Font.PLAIN, 5);
			
			if(e.getModifiers() == MouseEvent.BUTTON3_MASK) {
				cc = Color.white;
				font = new Font("고딕", Font.PLAIN, 60);
			}
			
			
			
			repaint();  /// --> paint() 호출
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub

		}
	}
	
	public CharPaintMain() {
		
		
		add(new MyPanel());
		cc = Color.BLUE;
		font = new Font("고딕", Font.PLAIN, 5);
		//font.setSize();
		setBounds(-3200+100, 100, 700, 600);
		
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
			JLabel btn = new JLabel();
			btn.setBounds(50*i,500,50,50);
			btn.setBackground(arr[i]);
			btn.setOpaque(true);
			btn.addMouseListener(this);
			add(btn);
		}
		
		Container c = getContentPane();
		c.setBackground(Color.white);
		
		
		
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		System.out.println("생성자인가");
		
		
	}
	
	

	public static void main(String[] args) {
		new CharPaintMain();
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		leftCC = ((JLabel)e.getSource()).getBackground();
	}



	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
