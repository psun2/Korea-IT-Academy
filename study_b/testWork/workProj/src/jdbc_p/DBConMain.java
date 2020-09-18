package jdbc_p;

public class DBConMain {

	public static void main(String[] args) {

		try {

			// BusDAO dao = new BusDAO();
			// ArrayList<BusDTO> arr = new BusDAO().list(); // 단발입니다.

			for (BusDTO busDTO : new BusDAO().list()) {
				System.out.println(busDTO);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
 
}
