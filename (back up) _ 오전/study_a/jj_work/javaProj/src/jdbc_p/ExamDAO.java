package jdbc_p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ExamDAO {

	Connection con;
	Statement stmt;
	ResultSet rs;
	String sql;
	
	public ExamDAO() {
		
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
	
	
	public ArrayList<ExamDTO> list(){
		ArrayList<ExamDTO> res = new ArrayList<ExamDTO>();
		
		sql = "select * from exam order by no";
		
		try {
			rs = stmt.executeQuery(sql);
			while(rs.next()) {

				ExamDTO dto = new ExamDTO();
				dto.no = rs.getInt("no");
				dto.title = rs.getString("title");
				dto.pid = rs.getString("pid");
				dto.setJum(0, rs.getInt("kor"));
				dto.setJum(1, rs.getInt("eng"));
				dto.setJum(2, rs.getInt("mat"));
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
	
	
	
	
	
	public int insert_1(ArrayList<ExamDTO> arr){
		int res = 0;

		try {
			con.setAutoCommit(false);
			
			for (ExamDTO dto : arr) {
				sql = "insert into exam (no, pid, title, regdate, kor,eng,mat) values ("
						+ dto.no+",'"+dto.pid+"','"+dto.title+
						"','"+dto.getRegDateStr()+"',"+
						dto.jum[0]+","+dto.jum[1]+","+dto.jum[2]+")";
				
				System.out.println(sql);
						
				res = stmt.executeUpdate(sql);
			}
			
			
			con.commit();
		} catch (Exception e) {
			try {
				con.rollback();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			close();
		}
		
		
		return res;
	}
	
	
	
	public int insert_2(ArrayList<ExamDTO> arr){
		int res = 0;

		try {
			//con.setAutoCommit(false);
			sql = "insert all ";
			for (ExamDTO dto : arr) {
				sql += " into exam (no, pid, title, regdate, kor,eng,mat) values ("
						+ dto.no+",'"+dto.pid+"','"+dto.title+
						"','"+dto.getRegDateStr()+"',"+
						dto.jum[0]+","+dto.jum[1]+","+dto.jum[2]+") ";
				
				
			}
			sql += " select * from dual";
			System.out.println(sql);
			
			res = stmt.executeUpdate(sql);
			//con.commit();
		} catch (Exception e) {
			try {
			//	con.rollback();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			close();
		}
		
		
		return res;
	}
	
	
	
	public void insertOne(ExamDTO dto){
		//int res = 0;

		try {
				sql = "insert into exam (no, pid, title, regdate, kor,eng,mat) "
						+ "values (NO_SEQ.nextval ,'"+
					dto.pid+"','"+dto.title+"',sysdate,"+
					dto.jum[0]+","+dto.jum[1]+","+dto.jum[2]+")";
				
				System.out.println(sql);
						
				stmt.executeUpdate(sql);
				
				sql = "select * from exam where no = " + 
						"(select max(no) from exam)";
				
				rs = stmt.executeQuery(sql);
				rs.next();
				dto.no = rs.getInt("no");
				dto.regDate = rs.getTimestamp("regdate");
				//res = rs.getInt(1);

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
