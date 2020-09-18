package jdbc_p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;




public class DBInsert {

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
			
			String sql = "insert into stud " + 
					"(id, name, kor, eng, mat, birth, reg) values " + 
					"('kkk','이정민',76,65,54,'1997-01-04',sysdate)";
			
			
			int cnt = stmt.executeUpdate(sql);
			
			System.out.println("실행 갯수:"+cnt);
			
			//6. 쿼리문 실행객체 종료
			//rs.close();
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

