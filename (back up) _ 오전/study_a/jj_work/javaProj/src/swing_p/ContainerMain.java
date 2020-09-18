package swing_p;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.ScrollPane;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ContainerMain {

	public static void main(String[] args) {
		JFrame f1 = new JFrame("JPanel");
		int ox = -1200;
		f1.setBounds(ox+10, 10, 300, 200);
		f1.setLayout(null);
		
		JPanel p1 = new JPanel();
		
		p1.setBounds(20, 20, 100, 120);
		p1.setBackground(Color.pink);
		f1.add(p1);
		
		for (int i = 0; i <10; i++) {
			p1.add(new JButton("버튼"+i));
			
		}
		
		JPanel p11 = new JPanel();
		
		p11.setBounds(140, 20, 100, 120);
		p11.setBackground(Color.yellow);
		f1.add(p11);
		
		for (int i = 0; i <10; i++) {
			p11.add(new JButton("버튼"+i));
			
		}
		
		f1.setVisible(true);
		
		
		
		////////////////////////// scroll
		
		JFrame f2 = new JFrame("ScrollPane");
		
		f2.setBounds(ox+310, 10, 300, 200);
		f2.setLayout(null);
		
		ScrollPane p2 = new ScrollPane();
		JPanel sub1 = new JPanel();
		
		p2.add(sub1);   ///scrollpane 에 panel 추가시 add
		p2.setBounds(20, 20, 100, 120);
		p2.setBackground(Color.pink);
		f2.add(p2);
		
		for (int i = 0; i <10; i++) {
			sub1.add(new JButton("버튼"+i));
			
		}
		
		
		
		JPanel sub2 = new JPanel();
		JScrollPane p22 = new JScrollPane(sub2);
		
		//p22.add(sub2);   
		p22.setBounds(140, 20, 100, 120);
		p22.setBackground(Color.pink);
		f2.add(p22);
		
		for (int i = 0; i <10; i++) {
			sub2.add(new JButton("버튼"+i));
			
		}
		
		
		f2.setVisible(true);
		
		
		//////////////////////////jdialog
				
		JFrame f3 = new JFrame("JDialog");
		
		f3.setBounds(ox+10, 210, 300, 200);
		f3.setLayout(null);
		
		JDialog dd = new JDialog(f3, "메세지창", true);  //doModal <-> Modaless
		dd.setBounds(ox+20, 20, 100, 120);
		
		dd.setLayout(new FlowLayout());
		
		dd.add(new JLabel("경고 경고"));
		dd.add(new JButton("몸이 나른해지고 있다"));
		dd.setVisible(true);
		
		
		
		f3.setVisible(true);
		
		
//////////////////////////filedialog
		
		JFrame f4 = new JFrame("ScrollPane");
		
		f4.setBounds(ox+310, 210, 300, 200);
		f4.setLayout(null);
		
		FileDialog fd = new FileDialog(f4,"파일열기", FileDialog.LOAD);
		fd.setLocation(ox+510, 210);
		fd.setDirectory("D:\\lee");
		fd.setVisible(true);
		
		f4.setVisible(true);
		
		
		System.out.println(fd.getDirectory());
		System.out.println(fd.getFile());

	}

}
