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
				"이미지파일",  "jpg","gif","png","bmp","jpeg" );
		     //창에 출력된 문자열      //파일필터 확장자 들
		fc.setFileFilter(filter);
		
		//리턴 선택유무    1: 선택없이 창닫기, 0: 파일 선택
		int ret = fc.showOpenDialog(null);
		
		if(ret==JFileChooser.APPROVE_OPTION) { //파일 선택 :0
			
			System.out.println(fc.getSelectedFile().getPath());
			
		}else {
			System.out.println("파일 선택 안함");
		}
		
		
		//System.out.println(ret);
		
		
		JColorChooser cc = new JColorChooser();
		
		///리턴 값 : Color
		Color ccRet = cc.showDialog(null, "색깔고르라", Color.yellow);
		
		JLabel lb = new JLabel("선택한 색");
		lb.setOpaque(true);
		
		if(ccRet!=null)  //선택하지 않을 경우 null
			lb.setBackground(ccRet); //선택한 색으로 배경색 선정
		
		add(lb);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		
		new ChooserMain();

	}

}
