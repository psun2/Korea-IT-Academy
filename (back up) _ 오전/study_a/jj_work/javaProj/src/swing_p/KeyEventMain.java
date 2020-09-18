package swing_p;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyEventMain extends JFrame {
	
	class KeyL implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			//System.out.println("키"+e.getKeyCode());
			
			switch(e.getKeyCode()) {
			
				case KeyEvent.VK_UP:
					System.out.println("위로");
					y-=5;
					break;
				case KeyEvent.VK_DOWN:
					System.out.println("아래로");
					y+=5;
					break;
				case KeyEvent.VK_LEFT:
					System.out.println("왼쪽");
					x-=5;
					break;
				case KeyEvent.VK_RIGHT:
					System.out.println("오른쪽");
					x+=5;
					break;
			}
			me.setLocation(x, y);
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			//System.out.println("키를 놓는다");
			
		}
		
	}
	
	JLabel me, deamon;
	
	int x =200, y=250, dx=100, dy = 100;
	
	class Timer extends Thread{
		
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(true) {
				
				
				try {
					sleep(30);
					dx++;
					dy++;
					deamon.setLocation(dx, dy);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	}

	public KeyEventMain() {
		setBounds(-3000, 50, 400, 500);
		setLayout(null);
		
		me = new JLabel();
		me.setOpaque(true);
		me.setBackground(Color.pink);
		me.setBounds(x, y, 50,50);
		
		deamon = new JLabel();
		deamon.setOpaque(true);
		deamon.setBackground(Color.blue);
		deamon.setBounds(dx, dy, 50,50);
		
		
		add(me);
		add(deamon);
		
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		addKeyListener(new KeyL());
		
		new Timer().start();
	}
	
	public static void main(String[] args) {

		new KeyEventMain();
	}

}
