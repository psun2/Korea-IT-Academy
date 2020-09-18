package jdbc_p;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MemDTO {
	String id, name, hobby;
	
	Integer no;
	Double height;
	
	Date regdate, birth;
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Date getRegdate() {
		return regdate;
	}
	public String getRegdateStr() {
		return sdf.format(regdate);
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	public void setRegdateStr(String regdate) {
		try {
			this.regdate = sdf.parse(regdate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Date getBirth() {
		return birth;
	}
	public String getBirthStr() {
		return sdf.format(birth);
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public void setBirthStr(String birth) {
		try {
			this.birth = sdf.parse(birth);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return no + "," + id + "," + name + "," + height + "," + birth
				+ ", " + regdate + ", " + hobby;
	}
	
	
	
}
