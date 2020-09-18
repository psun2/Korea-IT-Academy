package jdbc_p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudDAO {

	Connection con;
	Statement stmt;
	ResultSet rs;
	String sql;
	
	public StudDAO() {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "hr", pw="hr";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, id, pw);
			stmt = con.createStatement();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public ArrayList<Stud> list(){
		ArrayList<Stud> res = new ArrayList<Stud>();
		
		sql = "select * from stud";
		
		try {
			rs = stmt.executeQuery(sql);
			while(rs.next()) {

				Stud st = new Stud(
						rs.getString("id"),
						rs.getString("name"),
						rs.getDate("birth"),
						rs.getInt("kor"),
						rs.getInt("eng"),
						rs.getInt("mat")
						);
				
				st.reg = rs.getTimestamp("reg");

				res.add(st);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
		
		return res;
	}
	
	
	
	
	public Stud detail(String id){
		Stud res = null;
		
		sql = "select * from stud where id = '"+id+"'";
		
		try {
			rs = stmt.executeQuery(sql);
			if(rs.next()) {

				res = new Stud(
						rs.getString("id"),
						rs.getString("name"),
						rs.getInt("kor"),
						rs.getInt("eng"),
						rs.getInt("mat")
						);	
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
		
		return res;
	}
	
	
	public int insert(Stud dto){
		int res = 0;
		
		sql = "insert into stud " + 
				"(id, name, kor, eng, mat, birth, reg) values " + 
				"('"+
				dto.id+"','"+
				dto.name+"',"+
				dto.kor+","+
				dto.eng+","+
				dto.mat+",'"+
				dto.birthStr()+"',sysdate)";
		System.out.println(sql);
		
		try {	
			res = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
		
		return res;
	}
	
	
	
	public void close() {
		if(rs!=null) try {rs.close();} catch (SQLException e) {}
		if(stmt!=null) try {stmt.close();} catch (SQLException e) {}
		if(con!=null) try {con.close();} catch (SQLException e) {}
	}
	
	
	
	
}
