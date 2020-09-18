package swing_p;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class SpinnerMain extends JFrame {
	
	
	public SpinnerMain() {
		int ox = -3200;
		setBounds(ox+0, 50, 200, 400);
		setTitle("Spinner");
		setLayout(new GridLayout(3,2));
		
		JSpinner sp1 = new JSpinner();
		JSpinner sp2 = new JSpinner();
		JSpinner sp3 = new JSpinner();
		
		Dimension d = new Dimension(100, 50);
		sp1.setPreferredSize(d);
		sp2.setPreferredSize(d);
		sp3.setPreferredSize(d);
		
		add(new JLabel("list"));
		add(sp1);
		
		add(new JLabel("숫자"));
		add(sp2);
		
		add(new JLabel("날짜"));
		add(sp3);
		
		
		String [] dinner = {"짜장면","쭈꾸미","바스버거","치킨","곱창"};
		SpinnerListModel mo1 = new SpinnerListModel(dinner);
		sp1.setModel(mo1);
		sp1.setValue("쭈꾸미");  //초기값
		
		SpinnerNumberModel mo2 = new SpinnerNumberModel(20,10,30,5);
													//초기값, 최소, 최대, 단계
		sp2.setModel(mo2);
		sp2.setValue(15);  //초기값
		
		
		Date vv = new Date(2002-1900, 1-1, 10);
		
		Date start = new Date(1990-1900, 1-1, 10);
		
		Date end =new Date(2020-1900, 12-1, 10);
		
		SpinnerDateModel mo3 = new SpinnerDateModel(vv, start, end, Calendar.DATE);
				                          //초기날짜, 최소날짜, 최대날짜, Calendar 단위 필드
		sp3.setModel(mo3);
		sp3.setEditor(new JSpinner.DateEditor(sp3, "yyyy/MM/dd"));
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new SpinnerMain();
	}

}
