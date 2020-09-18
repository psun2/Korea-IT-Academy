package excep_p;

import java.util.Scanner;

public class UserExcepLoginMain {

	public static void main(String[] args) {
		String uid = "aaa", upw="1234";
		
		Scanner sc = new Scanner(System.in);
		
		String id, pw;
		while(true) {
			try {
				
				System.out.print("id:");
				id = sc.nextLine();
				
				if(!id.equals(uid))
					throw new Exception("id 에러" );
				
				System.out.print("pw:");
				pw = sc.nextLine();
				
				if(!pw.equals(upw))
					throw new Exception("pw 에러" );
				
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("id:"+id+",pw:"+pw);
		

	}

}
