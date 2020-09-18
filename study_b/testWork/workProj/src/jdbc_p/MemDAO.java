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
		// TODO Auto-generated constructor stub

		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			stmt = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<MemDTO> list() { // 다른 패키지에서 부를 것이기 때문에 public

		ArrayList<MemDTO> res = new ArrayList<MemDTO>();

		sql = "select * from member";

		try {
			rs = stmt.executeQuery(sql);

			while (rs.next()) {

				MemDTO dto = new MemDTO();
				dto.id = rs.getString("id");
				dto.no = rs.getInt("no");
				dto.name = rs.getString("name");
				dto.height = rs.getDouble("height");
				dto.regdate = rs.getTimestamp("regdate");
				dto.birth = rs.getDate("birth");
				dto.hobby = rs.getString("hobby");

				res.add(dto);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return res;
	}

	public MemDTO detail(String id) {

		MemDTO dto = null;
		sql = "select * from member where id = '" + id + "'";

		try {

			rs = stmt.executeQuery(sql);
			if (rs.next()) {

				dto = new MemDTO();
				dto.id = rs.getString("id");
				dto.no = rs.getInt("no");
				dto.name = rs.getString("name");
				dto.height = rs.getDouble("height");
				dto.regdate = rs.getTimestamp("regdate");
				dto.birth = rs.getDate("birth");
				dto.hobby = rs.getString("hobby");

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return dto;
	}

	public int insert(MemDTO dto) { // 다른 패키지에서 부를 것이기 때문에 public

		int res = 0;

		sql = "insert into member" + "(id, name, no, height, regdate, birth, hobby)" + "values" + "('" + dto.id + "','"
				+ dto.name + "'," + dto.no + "," + dto.height + ",'" + dto.getRegdateStr() + "','" + dto.getBirthStr()
				+ "','" + dto.hobby + "')";

		System.out.println();
		System.out.println(sql); // 우리가 원하는 문법이 아님니다 쓰지 못합니다. => 날짜 부분
		// insert into member(id, name, no, height, regdate, birth,
		// hobby)values('ggg','장정호',30,180.17,'Thu May 04 00:00:00 KST 2017','Fri Dec 18
		// 00:00:00 KST 1998','여자여자여자')
		System.out.println();

		try {
			res = stmt.executeUpdate(sql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return res;
	}

	public int modify(MemDTO dto) { // 다른 패키지에서 부를 것이기 때문에 public

		int res = 0;

		sql = "update member set name = '" + dto.name + "', no = " + dto.no + ", height = " + dto.height
				+ ", regdate = '" + dto.getRegdateStr() + "', birth = '" + dto.getBirthStr() + "', hobby = '"
				+ dto.hobby + "'" + "where id = '" + dto.id + "'";

		System.out.println();
		System.out.println(sql); // 우리가 원하는 문법이 아님니다 쓰지 못합니다. => 날짜 부분
		// insert into member(id, name, no, height, regdate, birth,
		// hobby)values('ggg','장정호',30,180.17,'Thu May 04 00:00:00 KST 2017','Fri Dec 18
		// 00:00:00 KST 1998','여자여자여자')
		System.out.println();

		try {
			res = stmt.executeUpdate(sql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return res;
	}

	public int delete(String id) { // 다른 패키지에서 부를 것이기 때문에 public

		int res = 0;

		sql = "delete from member where id = '" + id + "'";

		System.out.println();
		System.out.println(sql); // 우리가 원하는 문법이 아님니다 쓰지 못합니다. => 날짜 부분
		// insert into member(id, name, no, height, regdate, birth,
		// hobby)values('ggg','장정호',30,180.17,'Thu May 04 00:00:00 KST 2017','Fri Dec 18
		// 00:00:00 KST 1998','여자여자여자')
		System.out.println();

		try {
			res = stmt.executeUpdate(sql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return res;
	}

	public void close() {

		if (rs != null)
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		if (stmt != null)
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		if (con != null)
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

	}

}