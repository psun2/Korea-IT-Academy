package jdbc_p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BusDAO {

	Connection con;
	Statement stmt;
	ResultSet rs;
	String sql;

	public BusDAO() {
		// TODO Auto-generated constructor stub

		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			stmt = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	 ArrayList<BusDTO> list() {

		ArrayList<BusDTO> res = new ArrayList<BusDTO>();

		sql = "select * from bus";

		try {
			rs = stmt.executeQuery(sql);

			while (rs.next()) {

				BusDTO dto = new BusDTO(rs.getString("no"), rs.getString("type"), rs.getInt("price"),
						rs.getString("district"));

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
