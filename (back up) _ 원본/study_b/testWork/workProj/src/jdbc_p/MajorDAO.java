package jdbc_p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MajorDAO {
	Connection con;
	Statement stmt;
	ResultSet rs;
	String sql;
	
	public MajorDAO() {
		
		try {
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"user_b", 
					"123456");
			stmt = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<MajorDTO> list(){
		
		ArrayList<MajorDTO> res = new ArrayList<MajorDTO>();
		sql = "select * from major";
		
		try {
			
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				
				MajorDTO dto = new MajorDTO();
				dto.id = rs.getString("id");
				
				dto.name = rs.getString("name");
				
				
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
	
	
	
	public MajorDTO detail(String id){
		
		MajorDTO dto = null;
		sql = "select * from major where id = '"+id+"'";
		
		try {
			
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				
				dto = new MajorDTO();
				dto.id = rs.getString("id");
				
				dto.name = rs.getString("name");
			
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		 
		return dto;
	}
	
	
	
	public int insert(MajorDTO dto){
		
		int res = 0;
		sql = "insert into major " + 
				"(id, name) " + 
				"values " + 
				"('"+dto.id+"','"+dto.name+"')";
		
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
	
	
	public void insertList_1(ArrayList<MajorDTO> list){
		
		try {
			con.setAutoCommit(false);
			
			for (MajorDTO dto : list) {
				sql = "insert into major " + 
						"(id, name) " + 
						"values " + 
						"('"+dto.id+"','"+dto.name+"')";
				stmt.executeUpdate(sql);
			}
			
			con.commit();
		} catch (Exception e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			close();
		}

		
	}
	
	
	public void insertList_2(ArrayList<MajorDTO> list){
		
		try {
			
			sql = "insert all ";
			for (MajorDTO dto : list) {
				sql += " into major " + 
						"(id, name) " + 
						"values " + 
						"('"+dto.id+"','"+dto.name+"') ";
				
			}
			sql += " select * from dual";
			
			//System.out.println(sql);
			stmt.executeUpdate(sql);
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			close();
		}

		
	}
	
	
	
	
	
	public void close() {
		if(rs!=null) try { rs.close();} catch (SQLException e) { }
		if(stmt!=null) try { stmt.close();} catch (SQLException e) { }
		if(con!=null) try { con.close();} catch (SQLException e) { }
	}
}
