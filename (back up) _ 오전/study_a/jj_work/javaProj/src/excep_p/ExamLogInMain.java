package excep_p;

import java.util.Scanner;

public class ExamLogInMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String id, pw;
//		while(true) {
//			System.out.print("ID:");
//			id = sc.next();
//			if(!id.equals("aaa")) {
//				System.out.println("id ����");
//				continue;
//			}
//			
//			
//			System.out.print("PW:");
//			pw = sc.next();
//			if(!pw.equals("1234")) {
//				System.out.println("pw ����");
//				continue;
//			}
//			
//			break;
//		}
		
		
		while(true) {
			try {
				System.out.print("ID:");
				id = sc.next();
				if(!id.equals("aaa")) 
					throw new Exception("id ����");
				
				
				System.out.print("PW:");
				pw = sc.next();
				if(!pw.equals("1234"))
					throw new Exception("pw ����");
				
				
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		

		System.out.println(id+","+pw);
	}

}
