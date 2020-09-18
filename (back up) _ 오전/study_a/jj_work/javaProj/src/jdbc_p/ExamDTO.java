package jdbc_p;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ExamDTO {

	Integer no;
	String title, pid;
	Integer [] jum;
	Date regDate;
	
	SimpleDateFormat sdf;
	
	public ExamDTO() {
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		jum = new Integer[3];
	}
	
	
	
	
	public ExamDTO(Integer no, String title, String pid,String regDate, Integer... jum) {
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		this.no = no;
		this.title = title;
		this.pid = pid;
		this.jum = jum;
		try {
			this.regDate = sdf.parse(regDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public ExamDTO( String title, String pid, Integer... jum) {

		this.title = title;
		this.pid = pid;
		this.jum = jum;
			
	}



	void setJum(int no, int jum) {
		this.jum[no] = jum;
	}
	
	

	public void setRegDateStr(String regDate) {
		try {
			this.regDate = sdf.parse(regDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getRegDateStr() {
		return sdf.format(regDate);
	}

	@Override
	public String toString() {
		return no + "\t" + title + "\t" + pid + "\t" + Arrays.toString(jum)
				+ "\t"+ regDate;
	}
	
	
	
}
