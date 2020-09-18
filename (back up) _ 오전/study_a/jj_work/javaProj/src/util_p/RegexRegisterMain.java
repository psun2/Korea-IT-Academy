package util_p;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
////회원 가입 유효성 검사를 실시하세요
1. 아이디 : 영문 숫자 조합
2. 비번 , 비번확인 
3. 이메일  -  아이디:영문,숫자   @  도메인 : 영문 점
4. 전화번호 - 숫자 :  ###-####-####,   ##(#)-###-####
5. 이름 (한글만 가능)
6. 주민번호 
7. 사진 첨부-->영문,숫자.이미지 확장자
이미지(jpg, jpeg, bmp, png, gif)  --  대소문자 구분없음
8. 우편번호 검색 - 구단위 (초성검색)
예외처리로 처리할 것
*/


class RegexData{
	String [] index ="id,pw,email,tel,pname,jumin,img,zipcode".split(",");
	String [] data = new String [index.length];

	void ppp() {
		String res = "가입정보 \n";
		for (int i = 0; i < data.length; i++) {
			res += index[i]+" : "+data[i]+"\n";
		}
				
		
		System.out.println(res);
	}
	
	void input(String qq, String answer) {
		for (int i = 0; i < index.length; i++) {
			if(qq.equals(index[i])) {
				data[i] = answer;
				break;
			}
		}
	}
	
}

class RegexQQ{
	Scanner sc = new Scanner(System.in);
	
	String qq, answer;
	String [] pp;
	RegexData data;
	boolean chk=false;

	public RegexQQ(RegexData data, String qq,  String... pp) {
		super();
		this.qq = qq;
		
		this.pp = pp;
		this.data = data;
	}
	
	void go()throws Exception {
		System.out.print(qq+":");
		answer = sc.nextLine();
		String ansOri = answer;
		if(chk)
			ansOri = answer.toLowerCase();
		for (String p : pp) {
			if(!Pattern.matches(p, ansOri)) 
				throw new Exception(qq+" 에러");
		}
		data.input(qq, answer);	
	}
	
	void go(boolean bb)throws Exception {
		chk = bb;
		go();
	}
	
}

class RegexPw extends RegexQQ{

	public RegexPw(RegexData data, String qq) {
		super(data, qq);
	}
	
	void go()throws Exception {
		System.out.print(qq+":");
		answer = sc.nextLine();
		
		if(!data.data[1].equals(answer)) 
				throw new Exception(qq+" 에러");
		
		
	}
}

public class RegexRegisterMain {

	public static void main(String[] args) {
		RegexData data;
		
		while(true) {
			try {
				data = new RegexData();
				RegexQQ [] qqArr = {
						new RegexQQ(data, "id",  "[a-zA-Z0-9]{5,}",".*[a-zA-Z].*",  ".*[0-9].*"), 
						new RegexQQ(data, "pw",  ".{5,}"),
						new RegexQQ(data, "email",  
					"[a-zA-Z0-9]{5,}@(([a-zA-Z]{2,}.[a-zA-Z]{2}.[a-zA-Z]{2})|([a-zA-Z]{2,}.[a-zA-Z]{3}))"),
						new RegexQQ(data, "tel",  
					"(\\d{3}-\\d{4}-\\d{4})|(\\d{2,3}-\\d{3}-\\d{4})"), 
						new RegexQQ(data, "pname",  "[가-힣]{2,6}") ,
						new RegexQQ(data, "jumin",  "\\d{6}-\\d{7}"),
						new RegexQQ(data, "img",  "[a-zA-Z0-9]{1,}\\.(jpg|jpeg|bmp|png|gif)"),
						new RegexQQ(data, "zipcode",  "[가-힣ㄱ-ㅎ0-9]{1,}")
				};
				
				for (int i = 0; i < qqArr.length; i++) {
					if(i!=6)
						qqArr[i].go();
					else
						qqArr[i].go(true);
					
					
					if(i==1) {
						new RegexPw(data, "pw확인").go();
					}
				}
				
				String zipSch=".*";
				String [] index = {
						"ㄱㄴㄷㄹㅁㅂㅅㅇㅈㅊㅋㅌㅍㅎㅃㅉㄸㄲㅆ",
						"가나다라마바사아자차카타파하빠짜따까싸",
						"깋닣딯맇밓빟싷잏짛칳킿팋핗힣삫찧띻낗앃"
				};
				for (char ch : data.data[7].toCharArray() ) {
					int pos = index[0].indexOf(ch);
					if(pos>=0) {
						zipSch+="["+index[1].charAt(pos)+"-"+index[2].charAt(pos)+"]";
					}else {
						zipSch+=ch;
					}
				}
				zipSch+=".*";
				//System.out.println(zipSch);
				
				String [] gu = {
					"강남구","강동구","서초구","동초구","하남시",
					"종로1가","강서구","종로2가","삼육구",
					"그러지말구","졸립구","배고프구","심심하구"	
				};
				
				for (String gg : gu) {
					if(Pattern.matches(zipSch, gg))
						data.data[7]+=","+gg;
				}
				
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		data.ppp();
		

	}

}
