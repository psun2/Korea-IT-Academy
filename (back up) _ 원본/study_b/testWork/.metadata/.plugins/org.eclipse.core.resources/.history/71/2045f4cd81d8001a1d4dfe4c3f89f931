package swing_p;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedPaneMain extends JFrame {

	public TabbedPaneMain() {
		int ox = -3200;
		setBounds(ox+0, 50, 700, 600);
		setTitle("JTabbedPane");
		
		JTabbedPane tab = new JTabbedPane();
		
		Color [] cc = {
			Color.pink, Color.cyan, Color.green	
		};
		
		for (int i = 0; i < cc.length; i++) {
			JPanel pp = new JPanel();
			pp.setBackground(cc[i]);
			tab.addTab("È­¸é"+i, pp);
		}
		
		
		add(tab);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new TabbedPaneMain();
	}

}
