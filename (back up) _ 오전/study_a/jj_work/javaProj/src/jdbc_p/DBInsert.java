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

			//1. JDBC ����̹� �ε�  -- ���� ����
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. �����ͺ��̽� Ŀ�ؼ� �õ�   
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"hr", 
					"hr");
			
			//3. �������� �����ϱ����� ��ü����
			Statement stmt = con.createStatement();
			
			String sql = "insert into stud " + 
					"(id, name, kor, eng, mat, birth, reg) values " + 
					"('kkk','������',76,65,54,'1997-01-04',sysdate)";
			
			
			int cnt = stmt.executeUpdate(sql);
			
			System.out.println("���� ����:"+cnt);
			
			//6. ������ ���ఴü ����
			//rs.close();
			stmt.close();
			
			//7. �����ͺ��̽� Ŀ�ؼ� ����
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

