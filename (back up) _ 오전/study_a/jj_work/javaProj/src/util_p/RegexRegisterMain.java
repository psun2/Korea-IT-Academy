package util_p;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
////È¸¿ø °¡ÀÔ À¯È¿¼º °Ë»ç¸¦ ½Ç½ÃÇÏ¼¼¿ä
1. ¾ÆÀÌµğ : ¿µ¹® ¼ıÀÚ Á¶ÇÕ
2. ºñ¹ø , ºñ¹øÈ®ÀÎ 
3. ÀÌ¸ŞÀÏ  -  ¾ÆÀÌµğ:¿µ¹®,¼ıÀÚ   @  µµ¸ŞÀÎ : ¿µ¹® Á¡
4. ÀüÈ­¹øÈ£ - ¼ıÀÚ :  ###-####-####,   ##(#)-###-####
5. ÀÌ¸§ (ÇÑ±Û¸¸ °¡´É)
6. ÁÖ¹Î¹øÈ£ 
7. »çÁø Ã·ºÎ-->¿µ¹®,¼ıÀÚ.ÀÌ¹ÌÁö È®ÀåÀÚ
ÀÌ¹ÌÁö(jpg, jpeg, bmp, png, gif)  --  ´ë¼Ò¹®ÀÚ ±¸ºĞ¾øÀ½
8. ¿ìÆí¹øÈ£ °Ë»ö - ±¸´ÜÀ§ (ÃÊ¼º°Ë»ö)
¿¹¿ÜÃ³¸®·Î Ã³¸®ÇÒ °Í
*/


class RegexData{
	String [] index ="id,pw,email,tel,pname,jumin,img,zipcode".split(",");
	String [] data = new String [index.length];

	void ppp() {
		String res = "°¡ÀÔÁ¤º¸ \n";
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
				throw new Exception(qq+" ¿¡·¯");
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
				throw new Exception(qq+" ¿¡·¯");
		
		
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
						new RegexQQ(data, "pname",  "[°¡-ÆR]{2,6}") ,
						new RegexQQ(data, "jumin",  "\\d{6}-\\d{7}"),
						new RegexQQ(data, "img",  "[a-zA-Z0-9]{1,}\\.(jpg|jpeg|bmp|png|gif)"),
						new RegexQQ(data, "zipcode",  "[°¡-ÆR¤¡-¤¾0-9]{1,}")
				};
				
				for (int i = 0; i < qqArr.length; i++) {
					if(i!=6)
						qqArr[i].go();
					else
						qqArr[i].go(true);
					
					
					if(i==1) {
						new RegexPw(data, "pwÈ®ÀÎ").go();
					}
				}
				
				String zipSch=".*";
				String [] index = {
						"¤¡¤¤¤§¤©¤±¤²¤µ¤·¤¸¤º¤»¤¼¤½¤¾¤³¤¹¤¨¤¢¤¶",
						"°¡³ª´Ù¶ó¸¶¹Ù»ç¾ÆÀÚÂ÷Ä«Å¸ÆÄÇÏºüÂ¥µû±î½Î",
						"ƒ‰ˆ¢‹L¡“J•½šïŸç£ ¯†µi»MÀ˜ÆR˜ªÂöê…ùÏ"
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
					"°­³²±¸","°­µ¿±¸","¼­ÃÊ±¸","µ¿ÃÊ±¸","ÇÏ³²½Ã",
					"Á¾·Î1°¡","°­¼­±¸","Á¾·Î2°¡","»ïÀ°±¸",
					"±×·¯Áö¸»±¸","Á¹¸³±¸","¹è°íÇÁ±¸","½É½ÉÇÏ±¸"	
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
