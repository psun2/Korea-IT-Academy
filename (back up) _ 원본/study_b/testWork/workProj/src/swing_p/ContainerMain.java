package swing_p;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ContainerMain {

	public static void main(String[] args) {
		int ox = -3200;
		
		JFrame f1 = new JFrame("JPanel");
		f1.setBounds(ox+0, 50, 300, 200);
		f1.setLayout(null);
		
		JPanel p1 = new JPanel();
		p1.setBounds(10, 10, 100, 100);
		p1.setBackground(Color.yellow);
		f1.add(p1);
		
		JPanel p2 = new JPanel();
		p2.setBounds(120, 10, 100, 100);
		p2.setBackground(Color.pink);
		f1.add(p2);
		
		for (int i = 0; i < 5; i++) {
			p1.add(new JButton("버튼"+i));
			p2.add(new JButton("버튼"+i));
		}
		
		f1.setVisible(true);
		
		
		
		JFrame f2 = new JFrame("JScrollPane");
		f2.setBounds(ox+310, 50, 300, 200);
		f2.setLayout(null);
		
		//가로 방향
		JPanel p21 = new JPanel();
		JScrollPane jp1 = new JScrollPane(p21);
		jp1.setBounds(10, 10, 100, 100);
		p21.setBackground(Color.yellow);
		f2.add(jp1);
		
		
		///세로 방향
		JPanel p22 = new JPanel();
		
		//JPanel 이 inner 일때 크기 설정
		p22.setPreferredSize(new Dimension(100, 210));
		
		JScrollPane jp2 = new JScrollPane(p22);
		jp2.setBounds(120, 10, 130, 100);
		p22.setBackground(Color.pink);
		p22.setLayout(null);
		f2.add(jp2);
		
		
		for (int i = 0; i < 5; i++) {
			p21.add(new JButton("버튼"+i));

			JButton btn = new JButton("버튼"+i);
			btn.setBounds(15, i*40+10, 70, 30);
			p22.add(btn);
		}
		
		f2.setVisible(true);
		
		
		JFrame f3 = new JFrame("JDialog");
		f3.setBounds(ox+0, 250, 300, 200);
		
		
		//true : doModal, false : Modaless
		JDialog dd = new JDialog(f3,"메세지창", false); 
		dd.setBounds(ox+400, 250, 300, 200);
		dd.setLayout(new FlowLayout());
		dd.add(new JLabel("경고 메세지를 발령"));
		dd.add(new JButton("버튼이다"));
		
		dd.setVisible(true);
		f3.setVisible(true);
		
		
		JFrame f4 = new JFrame("FileDialog");
		f4.setBounds(ox+0, 500, 300, 200);
		
		FileDialog fd = new FileDialog(f4, "파일열기", FileDialog.LOAD);
		fd.setLocation(ox+300, 300);
		fd.setDirectory("D:\\lee\\public");
		
		fd.setVisible(true);
		f4.setVisible(true);
		
		System.out.println(fd.getDirectory());
		System.out.println(fd.getFile());
	}

}
