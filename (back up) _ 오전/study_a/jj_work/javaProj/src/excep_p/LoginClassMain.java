package excep_p;

import java.util.Scanner;

//회원가입 프로그램을 작성하세요
//입력사항 - id, pw, pw확인, 성명, 이메일, 취미, 특기, 전화번호, 핸드폰, 성별
//필수 입력사항 - id, pw, pw확인, 성명, 전화번호, 성별 (값이 없으면 에러 발생)
//유효성 검사 - 생년 : 1980 이전 출생자만 가입 가능
//          비밀번호, 비밀번호 확인은 값이 같아야만 가능
//사용자 정의 예외 클래스를 활용하여 작업할 것

class LoginRes{
	
	int birth;
	
	String [] index = {"id","pw","성명","이메일", "취미", "특기", "전화번호", "핸드폰", "성별"};
	String [] strData = new String[index.length];
	
	void strInput(String inputData,String qq) {
		for (int i = 0; i < index.length; i++) {
			if(index[i].equals(qq))
				strData[i] = inputData;
		}
	}
	
	String strFind(String title) {
		
		for (int i = 0; i < index.length; i++) {
			if(index[i].equals(title))
				return strData[i];
		}
		
		return null;
	}
	
	@Override
	public String toString() {
		String res = "\n\n<<<<회원가입완료>>>>\n\n";
		
		for (int i = 0; i < 3; i++) {
			res += index[i]+":"+strData[i]+"\n";
		}
		res += "생년월일:"+birth+"\n";
		for (int i = 3; i < index.length; i++) {
			res += index[i]+":"+strData[i]+"\n";
		}
		
		return res;
	}
}

class LoginQQ{
	
	LoginRes  res;
	Scanner sc = new Scanner(System.in);
	
	boolean notNull = false, isNum = false, isEqual=false;
	int isNumCut, inputNum;
	String equalTitle, qq, inputData;
	
	
	//필수 입력사항 파악
	public LoginQQ(LoginRes  res,String qq, boolean notNull) {
		super();
		this.res = res;
		this.qq = qq;
		this.notNull = notNull;
	}

	public LoginQQ(LoginRes  res,String qq, int isNumCut) {
		super();
		this.res = res;
		this.qq = qq;
		this.isNumCut = isNumCut;
		isNum = true;
	}

	public LoginQQ(LoginRes  res,String qq, String equalTitle) {
		super();
		this.res = res;
		this.qq = qq;
		this.equalTitle = equalTitle;
		isEqual=true;
	}
	
	
	void input() throws LoginUserExcep {
		
		if(!isNum)
			strInput();
		else
			numInput();
	}
	
	void strInput() throws LoginUserExcep {
		System.out.print(qq+":");
		inputData = sc.nextLine();
		if(notNull && inputData.equals("")) {
			throw new LoginUserExcep(qq,0);
		}
		if(isEqual && !res.strFind(equalTitle).equals(inputData)) {
			throw new LoginUserExcep(qq,1);
		}
		res.strInput(inputData,qq);
	}
	void numInput() throws LoginUserExcep {
		System.out.print(qq+":");
		inputNum = sc.nextInt();
		sc.nextLine();
		if(inputNum>19800000) {
			throw new LoginUserExcep(qq,2,1980);
		}
		res.birth = inputNum;
	}
	
	
}

class  LoginUserExcep extends Exception{

	int i, cut;
	
	String [] title = {
			" 필수입니다.",
			" 일치하지 않습니다.",
			" 이전 데이터만 입력가능합니다."
	};
	
	public LoginUserExcep(String message, int i) {
		super(message);
		this.i = i;
	}
	
	
	public LoginUserExcep(String message,int i, int cut) {
		super(message);
		this.i = i;
		this.cut = cut;
	}


	void ppp() {
		String ttt = getMessage();
		
		if(i==2)
			ttt+= " "+cut;
		ttt+= title[i];
		System.out.println(ttt);
	}
}



public class LoginClassMain {

	public static void main(String[] args) {
		LoginRes res = null;
		//입력사항 - id, pw, pw확인, 성명, 이메일, 취미, 특기, 전화번호, 핸드폰, 성별
		//필수 입력사항 - id, pw, pw확인, 성명, 전화번호, 성별 
		
		
		while(true) {
			try {
				res = new LoginRes();
				
				LoginQQ [] loginQQs = {
						new LoginQQ(res,"id", true),
						new LoginQQ(res,"pw", true),
						new LoginQQ(res,"pw확인", "pw"),
						new LoginQQ(res,"성명", true),
						new LoginQQ(res,"생년월일", 1980),
						new LoginQQ(res,"이메일", false),
						new LoginQQ(res,"취미", false),
						new LoginQQ(res,"특기", false),
						new LoginQQ(res,"전화번호", true),
						new LoginQQ(res,"핸드폰", false),
						new LoginQQ(res,"성별", true)
				};
				
				for (LoginQQ lqq : loginQQs) {
					lqq.input();
				}
				
				break;
			}catch (LoginUserExcep e) {
				e.ppp();
			}
		}
		
		System.out.println(res);

	}

}
