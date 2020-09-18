package swing_p;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//������ ���� ��ü ---> �̺�Ʈ������ �������̽� �� �����ؾ� ��
class MyActionL implements ActionListener{
	
	int i = 0;
	//// ��ȭ�� �ַ��� Component
	JLabel label;
	JTextField tf;
	

	public MyActionL(JLabel label, JTextField tf) {
		super();
		this.label = label;
		this.tf = tf;
	}







	///// �׼��� �����ɶ� ������ �޼ҵ�  :::> �̺�Ʈ �ҽ�(btn1)�� ���� �ڵ�����
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("�������״�");
		
		label.setText(tf.getText()+" , "+i++);
	}
}

public class EventMain {

	public static void main(String[] args) {
		JFrame f = new JFrame("�̺�Ʈ");
		
		f.setBounds(-3200, 50, 400, 200);
		f.setLayout(null);
		
		JTextField tf = new JTextField();
		tf.setBounds(50, 0, 100,30);
		
		
		JButton btn1 = new JButton("������");
		btn1.setBounds(50, 50, 100, 30);
		
		JLabel lb1 = new JLabel("�Ʊ���");
		lb1.setBounds(200, 50, 100, 30);
		
		///������ ��ü ����
		MyActionL myAct = new MyActionL(lb1, tf);
		
		//btn1 : �̺�Ʈ �ҽ�
		//ActionListener : �̺�Ʈ������ (Thread ���·� ���)
		btn1.addActionListener(myAct);
		
		f.add(tf);
		f.add(lb1);
		f.add(btn1);
		
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
