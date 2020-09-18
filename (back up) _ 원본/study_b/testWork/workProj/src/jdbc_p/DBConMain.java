package jdbc_p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;



public class DBConMain {

	public static void main(String[] args) {

		try {
			
			
			//BusDAO dao = new BusDAO();
			//ArrayList<BusDTO> arr = new BusDAO().list();
			
			for (BusDTO busDTO : new BusDAO().list()) {
				System.out.println(busDTO);
			}
			
			//arr = dao.list();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
