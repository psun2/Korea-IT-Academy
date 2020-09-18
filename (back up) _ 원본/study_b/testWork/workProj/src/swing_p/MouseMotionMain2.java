package swing_p;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseMotionMain2 extends JFrame implements MouseMotionListener {
	
	
	JLabel me;
	
	public MouseMotionMain2() {
		int ox = -1200;
		setBounds(ox+100, 50, 500, 600);
		setTitle("MouseMotionMain2");
		setLayout(null);
		
		me = new JLabel("me");
		me.setBounds(200, 400, 100,100);
		me.setBackground(Color.pink);
		me.setOpaque(true);
		add(me);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseMotionListener(this);
	}
	

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("dragged:"+e.getX()+","+e.getY());
		me.setLocation(e.getX()-50,400);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("moved:"+e.getX()+","+e.getY());
		//me.setLocation(e.getX()-50,400);
	}

	public static void main(String[] args) {
		new MouseMotionMain2();
	}

}
