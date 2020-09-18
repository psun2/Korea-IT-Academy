package jdbc_p;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FoodDTO {

	Integer no;
	String  pid;
	Date regDate;
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public FoodDTO() {
			
	}

	public FoodDTO(String pid) {
		super();
		this.pid = pid;
	}

	@Override
	public String toString() {
		return no + ", " + pid + ", " + sdf.format(regDate);
	}
	
	
	
}
