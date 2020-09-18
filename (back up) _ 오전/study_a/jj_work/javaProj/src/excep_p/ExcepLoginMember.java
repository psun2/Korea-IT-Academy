package excep_p;

import java.util.Scanner;

class ExcepMember{
	String id, pw, name;

	public ExcepMember(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}	
}

class ExcepLogin extends Exception{
	String [] arr = {"id에러", "pw에러"};
	int i;
	public ExcepLogin(int i) {
		this.i = i;
	}
	
	void ppp() {
		System.out.println(arr[i]);
	}
}
public class ExcepLoginMember {
	
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		ExcepMember login = null;
		
		ExcepMember [] mem = {
			new ExcepMember("aa", "1111", "이효리"),
			new ExcepMember("bb", "2222", "삼효리"),
			new ExcepMember("cc", "3333", "사효리"),
			new ExcepMember("dd", "4444", "오효리"),
			new ExcepMember("ee", "5555", "육효리")
		};

		while(true) {
			try {
				System.out.print("ID:");
				String id = sc.next();
				
				for (ExcepMember mm : mem) {
					if(mm.id.equals(id)) {
						login = mm;
						break;
					}
				}
				if(login==null) 
					//throw new Exception("id 에러");
					throw new ExcepLogin(0);
				
				System.out.print("PW:");
				String pw = sc.next();
				if(!pw.equals(login.pw))
					//throw new Exception("pw 에러");
					throw new ExcepLogin(1);
				
				break;
			} catch (ExcepLogin e) {
				//System.out.println(e.getMessage());
				e.ppp();
			}		
		}

		System.out.println(login.name+" 로그인 성공");
	}

}
