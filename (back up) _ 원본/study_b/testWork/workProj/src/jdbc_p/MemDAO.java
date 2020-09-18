package jdbc_p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MemDAO {

	Connection con;
	Statement stmt;
	ResultSet rs;
	String sql;
	
	public MemDAO() {
		
		try {
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"hr", 
					"hr");
			stmt = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<MemDTO> list(){
		
		ArrayList<MemDTO> res = new ArrayList<MemDTO>();
		sql = "select * from member";
		
		try {
			
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				
				MemDTO dto = new MemDTO();
				dto.id = rs.getString("id");
				dto.no = rs.getInt("no");
				dto.name = rs.getString("name");
				dto.height= rs.getDouble("height");
				dto.regdate = rs.getTimestamp("regdate");
				dto.birth = rs.getDate("birth");
				dto.hobby = rs.getString("hobby");
				
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
	
	
	
	public MemDTO detail(String id){
		
		MemDTO dto = null;
		sql = "select * from member where id = '"+id+"'";
		
		try {
			
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				
				dto = new MemDTO();
				dto.id = rs.getString("id");
				dto.no = rs.getInt("no");
				dto.name = rs.getString("name");
				dto.height= rs.getDouble("height");
				dto.regdate = rs.getTimestamp("regdate");
				dto.birth = rs.getDate("birth");
				dto.hobby = rs.getString("hobby");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		 
		return dto;
	}
	
	
	
	public int insert(MemDTO dto){
		
		int res = 0;
		sql = "insert into member " + 
				"(id, name, no, height, regdate, birth, hobby) " + 
				"values " + 
				"('"+dto.id+"','"+dto.name+"',"+dto.no+
				","+dto.height+",'"+dto.getRegdateStr()+"','"+dto.getBirthStr()+"','"+dto.hobby+"')";
		
		System.out.println(sql);
		try {
			
			res = stmt.executeUpdate(sql);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}

		return res;
	}
	
	
	public int modify(MemDTO dto){
		
		int res = 0;
		sql = "update member set name = '"+
				dto.name+"', no = "+
				dto.no+", height = "+
				dto.height+" , regdate = '"+
				dto.getRegdateStr()+"', birth = '"+
				dto.getBirthStr()+"', hobby = '"+
				dto.hobby+"' where id = '"+
				dto.id+"'";
		
		System.out.println(sql);
		try {
			
			res = stmt.executeUpdate(sql);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}

		return res;
	}
	
	
	public int delete(String id){
		
		int res = 0;
		sql = "delete from member where id = '"+id+"'";
		
		System.out.println(sql);
		try {
			
			res = stmt.executeUpdate(sql);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}

		return res;
	}
	
	
	public void close() {
		if(rs!=null) try { rs.close();} catch (SQLException e) { }
		if(stmt!=null) try { stmt.close();} catch (SQLException e) { }
		if(con!=null) try { con.close();} catch (SQLException e) { }
	}
}
