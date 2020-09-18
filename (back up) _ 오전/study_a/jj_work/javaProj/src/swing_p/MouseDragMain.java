package swing_p;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseDragMain extends JFrame implements MouseMotionListener, MouseListener {

	ArrayList<MyLabel>arr;
	
	MyLabel nowLb = null;
	
	class MyLabel extends JLabel{
		Color myCC;

		public MyLabel(Color myCC) {
			super();
			this.myCC = myCC;
			setBackground(myCC);
			setBounds(0, 0, 100, 100);
			setOpaque(true);
		}
		
		void draggGo(JFrame jf,MouseEvent e) {
			setLocation(e.getX()-getWidth()/2, e.getY()-getHeight()/2);
			setBackground(Color.white);
			nowLb = this;
			jf.add(this, 0);
			arr.add(0,this);
		}
		
		
		void releaseGo() {
			setBackground(myCC);
			nowLb = null;
		}
	}
	
	public MouseDragMain() {
		setBounds(-3200+100, 100, 700, 600);
		setLayout(null);
		
		Color [] cc = {
				Color.pink,Color.yellow, Color.red
		};
		
		arr = new ArrayList<MyLabel>();
		
		for (Color color : cc) {
			MyLabel jb = new MyLabel(color);
			
			add(jb);
			arr.add(jb);
		}
		
		
		addMouseMotionListener(this);
		addMouseListener(this);
		
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		
		
		for (MyLabel jL : arr) {
			if(e.getX()<jL.getX()+100 && e.getX()>jL.getX() &&
					e.getY()<jL.getY()+100 && e.getY()>jL.getY()) {
				
				System.out.println("드레그여");
				jL.draggGo(this, e);
				break;
				
			}
		}
		
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new MouseDragMain();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("놨어");
		nowLb.releaseGo();
		
		
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
