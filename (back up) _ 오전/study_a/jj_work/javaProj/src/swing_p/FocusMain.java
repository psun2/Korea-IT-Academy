package swing_p;

import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FocusMain extends JFrame {

	public FocusMain() {
		setBounds(-3200+100, 100, 300, 200);
		setLayout(new GridLayout(3,2));
		
		JTextField jf = new JTextField("���̵�");
		
		add(new JLabel("id"));
		add(jf);
		
		JPasswordField pf = new JPasswordField();
		
		add(new JLabel("pw"));
		add(pf);
		
		jf.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				System.out.println("��Ŀ�� ������");
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				System.out.println("��Ŀ�� �Ա���");
				
			}
		});
		
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args) {
		new FocusMain();
	}

}
