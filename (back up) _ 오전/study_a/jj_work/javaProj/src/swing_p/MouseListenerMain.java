package swing_p;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerMain extends JFrame 
implements MouseListener, MouseMotionListener{

	JLabel jb = new JLabel(), me = new JLabel();
	int lastX, lastY;
	public MouseListenerMain() {
		
		System.out.println("getModifiersEx() >>>");
		System.out.println("BUTTON1_DOWN_MASK:"+MouseEvent.BUTTON1_DOWN_MASK);
		System.out.println("BUTTON2_DOWN_MASK:"+MouseEvent.BUTTON2_DOWN_MASK);
		System.out.println("BUTTON3_DOWN_MASK:"+MouseEvent.BUTTON3_DOWN_MASK);
		System.out.println("getModifiers() >>>");
		System.out.println("BUTTON1_MASK:"+MouseEvent.BUTTON1_MASK);
		System.out.println("BUTTON2_MASK:"+MouseEvent.BUTTON2_MASK);
		System.out.println("BUTTON3_MASK:"+MouseEvent.BUTTON3_MASK);
		setBounds(-3200+100, 100, 700, 600);
		setLayout(null);
		
		add(jb);
		jb.setBounds(0, 0, 100, 30);
		
		add(me);
		me.setBounds(300, 300, 100, 100);
		me.setOpaque(true);
		me.setBackground(Color.green);
		
		
		addMouseListener(this);
		addMouseMotionListener(this);
		
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args) {
		
		new MouseListenerMain();

	}
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("클릭이냐? "+e.getX()+","+e.getY());
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("눌렀냐? "+e.getX()+","+e.getY()+","
							+e.getModifiers()+","+e.getModifiersEx());
		
		lastX = e.getX();
		lastY = e.getY();
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("땟냐? "+e.getX()+","+e.getY());
		
		String dir="▶";
		
		if(e.getX()>lastX) {
			dir="◀";
		}
		
		jb.setText("방향:"+dir);
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("들어왔냐? "+e.getX()+","+e.getY());
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("나갔냐? "+e.getX()+","+e.getY());
		
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		me.setLocation(e.getX()-me.getWidth()/2, 
				e.getY()-me.getY()/2);
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		//me.setLocation(e.getX()-me.getWidth()/2, 300);
		
	}

}
