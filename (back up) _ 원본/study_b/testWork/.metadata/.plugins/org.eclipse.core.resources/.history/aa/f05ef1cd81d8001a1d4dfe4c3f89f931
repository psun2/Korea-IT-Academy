package swing_p;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseMotionMain extends JFrame implements MouseMotionListener {
	
	
	JLabel me;
	
	public MouseMotionMain() {
		int ox = -1200;
		setBounds(ox+100, 50, 500, 600);
		setTitle("MouseMotion");
		setLayout(null);
		
		me = new JLabel("me");
		me.setBounds(200, 200, 100,100);
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
		me.setLocation(e.getX()-50,e.getY()-50);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("moved:"+e.getX()+","+e.getY());

	}

	public static void main(String[] args) {
		new MouseMotionMain();
	}

}
