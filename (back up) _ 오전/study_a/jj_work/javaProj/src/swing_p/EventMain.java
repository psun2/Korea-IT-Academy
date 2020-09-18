package swing_p;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//리스너 구현 객체 ---> 이벤트리스너 인터페이스 를 구현해야 함
class MyActionL implements ActionListener{
	
	int i = 0;
	//// 변화를 주려는 Component
	JLabel label;
	JTextField tf;
	

	public MyActionL(JLabel label, JTextField tf) {
		super();
		this.label = label;
		this.tf = tf;
	}







	///// 액션이 가동될때 실행할 메소드  :::> 이벤트 소스(btn1)에 의해 자동실행
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("눌렀습네다");
		
		label.setText(tf.getText()+" , "+i++);
	}
}

public class EventMain {

	public static void main(String[] args) {
		JFrame f = new JFrame("이벤트");
		
		f.setBounds(-3200, 50, 400, 200);
		f.setLayout(null);
		
		JTextField tf = new JTextField();
		tf.setBounds(50, 0, 100,30);
		
		
		JButton btn1 = new JButton("눌러바");
		btn1.setBounds(50, 50, 100, 30);
		
		JLabel lb1 = new JLabel("아기상어");
		lb1.setBounds(200, 50, 100, 30);
		
		///리스너 객체 생성
		MyActionL myAct = new MyActionL(lb1, tf);
		
		//btn1 : 이벤트 소스
		//ActionListener : 이벤트리스너 (Thread 형태로 대기)
		btn1.addActionListener(myAct);
		
		f.add(tf);
		f.add(lb1);
		f.add(btn1);
		
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
