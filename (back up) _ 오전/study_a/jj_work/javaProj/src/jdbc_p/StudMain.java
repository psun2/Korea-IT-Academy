package jdbc_p;

public class StudMain {

	public static void main(String[] args) {
		
		
//		System.out.println(new StudDAO().insert(new Stud(
//				 "ooo", "������","2001-01-02", 14,25,36)));
		
		for (Stud st: new StudDAO().list()) {
			System.out.println(st);
		}
		
		System.out.println("��");
		System.out.println(new StudDAO().detail("aaa"));

	}

}
