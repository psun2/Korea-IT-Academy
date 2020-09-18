package swing_p;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseEventMain extends JFrame 
implements  MouseListener{
	
	JPanel imgs;
	public MouseEventMain() {
		int ox = -1200;
		setBounds(ox+100, 50, 500, 600);
		setTitle("MouseEvent");
		setLayout(null);
		
		
		JPanel outer = new JPanel();
		outer.setBounds(50, 100, 400, 200);
		outer.setBackground(Color.pink);
		outer.setLayout(null);
		add(outer);
		
		
		imgs = new JPanel();
		imgX = 0; 
		imgY = 30;
		imgs.setBounds(imgX, imgY, 4000, 150);
		imgs.setBackground(Color.yellow);
		imgs.setLayout(new BoxLayout(imgs, BoxLayout.X_AXIS));
		
		for (int i = 0; i < 7; i++) {
			JButton btn = new JButton(new ImageIcon("img/son_"+i+".jpg"));
			imgs.add(btn);
		}
		
		
		
		
		
		
		
		outer.add(imgs);
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseListener(this);
		new Timer().start();
	}

	public static void main(String[] args) {
		new MouseEventMain();
	}
	
	
	int lastX, lastY, imgX, imgY, xx = 0, dd = 5;
	

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("click:"+e.getX()+","+e.getY());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("press:"+e.getX()+","+e.getY());
		lastX = e.getX();
		lastY = e.getY();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("release:"+e.getX()+","+e.getY());
		System.out.println("xx:"+xx);
		
		String dir = "";
		int size = 500;
		

		if(lastX > e.getX()) {
			dir = "<-";
			xx -= size;
			dd =-5;
		}else {
			dir = "->";
			xx += size;
			dd = 5;
		}
		
		System.out.println("dir:"+dir+"("+imgX+","+xx+")");
		
		//imgX-=xx;
		//imgsMoving(dd, imgs.getX()-xx);
	}
	
	
	
	
	class Timer extends Thread{
		@Override
		public void run() {
			
			
			while(true) {
	
				try {
					Thread.sleep(5);
					if( imgX != xx) {
						imgX += dd;
						imgs.setLocation(imgX, imgY);
						
					
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			
		}
	}
	
	

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("enter:"+e.getX()+","+e.getY());
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("exit:"+e.getX()+","+e.getY());
	}

}
