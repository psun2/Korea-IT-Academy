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
//				System.out.println("id 에러");
//				continue;
//			}
//			
//			
//			System.out.print("PW:");
//			pw = sc.next();
//			if(!pw.equals("1234")) {
//				System.out.println("pw 에러");
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
					throw new Exception("id 에러");
				
				
				System.out.print("PW:");
				pw = sc.next();
				if(!pw.equals("1234"))
					throw new Exception("pw 에러");
				
				
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		

		System.out.println(id+","+pw);
	}

}
