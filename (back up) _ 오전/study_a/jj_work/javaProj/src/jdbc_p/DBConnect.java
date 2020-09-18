package jdbc_p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

class Stud{
	String name, id;
	int [] jum;
	Date birth, reg;
	int kor, eng,mat;
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	public Stud(String name, String id, int... jum) {
		super();
		this.name = name;
		this.id = id;
		this.jum = jum;
		
		kor = jum[0];
		eng = jum[1];
		mat = jum[2];
	}
	
	
	
	
	public Stud(String id,String name,  String birth, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.id = id;
		try {
			this.birth = sdf.parse(birth);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	
	


	public Stud(String id, String name, Date birth, int kor, int eng, int mat) {
		super();
		this.id = id;
		this.name = name;
		this.birth = birth;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}




	String birthStr() {
		
		return sdf.format(birth);
	}




	@Override
	public String toString() {
		return "Stud [id=" + id + ", name=" + name + ", birth=" + birth + ", reg=" + reg + ", kor=" + kor + ", eng="
				+ eng + ", mat=" + mat + "]";
	}




	

}


public class DBConnect {

	public static void main(String[] args) {

		
		ArrayList<Stud>list = new ArrayList<Stud>();
		
		try {

			//1. JDBC 드라이버 로딩  -- 생략 가능
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. 데이터베이스 커넥션 시도   
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"hr", 
					"hr");
			
			//3. 쿼리문을 실행하기위한 객체생성
			Statement stmt = con.createStatement();
			
			//4. 쿼리 실행
			ResultSet rs = stmt.executeQuery("select * from stud");
			
			//5. 쿼리 실행 결과 사용
			while(rs.next()) {
//				System.out.print(rs.getString("id"));
//				System.out.print(rs.getString("name"));
//				System.out.print(rs.getInt("kor"));
//				System.out.print(rs.getInt("eng"));
//				System.out.print(rs.getInt("mat"));
//				System.out.println();
				
				Stud st = new Stud(
						rs.getString("id"),
						rs.getString("name"),
						rs.getInt("kor"),
						rs.getInt("eng"),
						rs.getInt("mat")
						);

				list.add(st);
				
			}
			
			//6. 쿼리문 실행객체 종료
			rs.close();
			stmt.close();
			
			//7. 데이터베이스 커넥션 종료
			con.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		for (Stud stud : list) {
			System.out.println(stud);
		}

	}

}

