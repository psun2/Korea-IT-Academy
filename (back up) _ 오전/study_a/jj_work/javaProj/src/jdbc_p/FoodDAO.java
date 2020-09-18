package jdbc_p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class FoodDAO {

	Connection con;
	Statement stmt;
	ResultSet rs;
	String sql;
	
	public FoodDAO() {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "user_a", pw="123456";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, id, pw);
			
			stmt = con.createStatement();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public ArrayList<FoodDTO> list(){
		ArrayList<FoodDTO> res = new ArrayList<FoodDTO>();
		
		sql = "select * from food_ticket order by no";
		
		try {
			rs = stmt.executeQuery(sql);
			while(rs.next()) {

				FoodDTO dto = new FoodDTO();
				dto.no = rs.getInt("no");
				
				dto.pid = rs.getString("pid");
				dto.regDate = rs.getDate("regdate");
				
				res.add(dto);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
		
		return res;
	}
	
	
	
	
	
	
	
	
	
	public void insertOne(FoodDTO dto){
		//int res = 0;

		try {
				sql = "insert into food_ticket (no, pid, regdate) "
						+ "values (food_seq.nextval ,'"+
					dto.pid+"',sysdate)";
				
				System.out.println(sql);
						
				stmt.executeUpdate(sql);
				
				sql = "select * from food_ticket where no = " + 
						"(select max(no) from food_ticket)";
				
				rs = stmt.executeQuery(sql);
				rs.next();
				dto.no = rs.getInt("no");
				dto.regDate = rs.getTimestamp("regdate");
				

		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			close();
		}
	
		//return res;
	}
	
	
	
	
	public void close() {
		if(rs!=null) try {rs.close();} catch (SQLException e) {}
		if(stmt!=null) try {stmt.close();} catch (SQLException e) {}
		if(con!=null) try {con.close();} catch (SQLException e) {}
	}
	
	
	
	
}
