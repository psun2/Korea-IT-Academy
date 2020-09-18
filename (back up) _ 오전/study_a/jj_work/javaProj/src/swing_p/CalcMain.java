package swing_p;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcMain extends JFrame{

	JTextField su1, su2;
	JLabel label;
	
	class BtsAct implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			JButton me = (JButton)e.getSource();
			//ActionEvent e 이벤트객체를 가져오고
			//e.getSource() 이벤트소스를 리턴
			
			System.out.println(me);
			
			int no1 = Integer.parseInt(su1.getText());
			int no2 = Integer.parseInt(su2.getText());
			
			int res = 0;
			switch(me.getText()) {
			
				case "+":
					res = no1 +no2;
					break;
				case "-":
					res = no1- no2;
					break;
				case "*":
					res = no1* no2;
					break;
				case "/":
					res = no1/ no2;
					break;
				case "%":
					res = no1% no2;
					break;
			}
			
			
			label.setText(no1+me.getText()+no2+"="+res);
			
		}
		
	}
	
	
	public CalcMain() {

		setBounds(-3000, 50, 400, 500);
		setLayout(new GridLayout(4,1));

		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(1,5));
		for (char ch : "+-*/%".toCharArray()) {
			JButton btn = new JButton(ch+"");
			btn.addActionListener(new BtsAct());
			
			jp.add(btn);
		}
		
		add(su1=new JTextField());
		add(su2=new JTextField());
		add(jp);
		add(label = new JLabel());
		
		label.setOpaque(true);
		label.setBackground(Color.pink);
		
		setVisible(true);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public static void main(String[] args) {

		new CalcMain();
	}

}
