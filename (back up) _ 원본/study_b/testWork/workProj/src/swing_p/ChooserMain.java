package swing_p;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ChooserMain extends JFrame {
	
	public ChooserMain() {
		int ox = -3200;
		setBounds(ox+0, 50, 200, 400);
		setTitle("choose");
		
		
		JFileChooser fc = new JFileChooser();
		fc.setLocation(ox+0, 50);
		
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
				"�̹�������",  "jpg","gif","png","bmp","jpeg" );
		     //â�� ��µ� ���ڿ�      //�������� Ȯ���� ��
		fc.setFileFilter(filter);
		
		//���� ��������    1: ���þ��� â�ݱ�, 0: ���� ����
		int ret = fc.showOpenDialog(null);
		
		if(ret==JFileChooser.APPROVE_OPTION) { //���� ���� :0
			
			System.out.println(fc.getSelectedFile().getPath());
			
		}else {
			System.out.println("���� ���� ����");
		}
		
		
		//System.out.println(ret);
		
		
		JColorChooser cc = new JColorChooser();
		
		///���� �� : Color
		Color ccRet = cc.showDialog(null, "�������", Color.yellow);
		
		JLabel lb = new JLabel("������ ��");
		lb.setOpaque(true);
		
		if(ccRet!=null)  //�������� ���� ��� null
			lb.setBackground(ccRet); //������ ������ ���� ����
		
		add(lb);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		
		new ChooserMain();

	}

}
