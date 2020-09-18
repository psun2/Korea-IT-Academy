package util_p;

import java.util.Scanner;
import java.util.regex.Pattern;



class RegexMo{
	
	String [] pp;
	String qq, an;
	RegexMem mem;
	
	int error;
	public RegexMo(RegexMem mem, String qq, int error, String ...pp) {
		super();
		this.mem = mem;
		this.qq = qq;
		this.pp = pp;
		this.error = error;
	}
	
	void inputData() throws MyExcep {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(qq+":");
		
		an = sc.nextLine();
		
		for (String ss : pp) {
			if(!Pattern.matches(ss, an.toLowerCase()))
				throw new MyExcep(qq, error);
		}
		
		
		mem.input(qq, an);
	}
	
	
}

class MyExcep extends Exception{
	
	int i;
	String str;
	
	String [] arr = {"Çü½Ä ºÒÀÏÄ¡","³»¿ë ºÒÀÏÄ¡"};
	
	public MyExcep(String str, int i) {
		super();
		this.str = str;
		this.i = i;
	}
	
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		//return super.getMessage();
		return str+" "+arr[i];
	}
	
	
	
}

class RegexMem{
	
	String [] title = {"id","pw","email","tel","name","jumin","img","zipcode"};
	
	String [] data = new String[title.length];
	
	void input(String name, String data) {
		for (int i = 0; i < this.title.length; i++) {
			if(title[i].equals(name)) {
				this.data[i] = data;
			}
		}
	}
	void zipSch() {
		String [] seoul = {"°­³²±¸","°­µ¿±¸","°­ºÏ±¸","°­¼­±¸","°ü¾Ç±¸","±¤Áø±¸","±¸·Î±¸",
				"±ÝÃµ±¸","³ë¿ø±¸","µµºÀ±¸","µ¿´ë¹®±¸","µ¿ÀÛ±¸","¸¶Æ÷±¸","¼­´ë¹®±¸",
				"¼­ÃÊ±¸","¼ºµ¿±¸","¼ººÏ±¸","¼ÛÆÄ±¸","¾çÃµ±¸","¿µµîÆ÷±¸","¿ë»ê±¸",
				"ÀºÆò±¸","Á¾·Î±¸","Áß±¸","Áß¶û±¸"}; 
		String [] jaeum = {"[°¡-ƒ‰]","[³ª-ˆ¢]","[´Ù-‹L]","[¶ó-¡]","[¸¶-“J]","[¹Ù-•½]",
				"[»ç-šï]","[¾Æ-Ÿç]","[ÀÚ-£ ]","[Â÷-¯†]","[Ä«-µi]","[Å¸-»M]",
				"[ÆÄ-À˜]","[ÇÏ-ÆR]","[ºü-˜ª]","[Â¥-Âö]","[µû-ê]","[±î-…ù]","[½Î-Ï]"};
		
		String index = "¤¡¤¤¤§¤©¤±¤²¤µ¤·¤¸¤º¤»¤¼¤½¤¾¤³¤¹¤¨¤¢¤¶";
		
		String pp = ".*";
		for (char ch : data[7].toCharArray()) {
			
			int pos = index.indexOf(ch);
			if(pos>=0)
			{
				pp += jaeum[pos];
			}else {
				pp += ch; 
			}
		}
		pp += ".*";
		
		String res = "";
		
		for (String str : seoul) {
			if(Pattern.matches(pp, str)) {
				res+=str+",";
			}
		}
		
		data[7]+=":"+res;
	}
	void ppp() {
		zipSch();
		
		System.out.println("È¸¿ø°¡ÀÔ Á¤º¸ >>>>>>>>>>>>");
		for (int i = 0; i < this.title.length; i++) {
			System.out.println(title[i]+":"+data[i]);
		}
	}
}


public class RegexJoinMain {

	public static void main(String[] args) {
		
		RegexMem mem;
		
		/*
		 //// È¸¿ø °¡ÀÔ À¯È¿¼º °Ë»ç¸¦ ½Ç½ÃÇÏ¼¼¿ä
1. ¾ÆÀÌµð : ¿µ¹® ¼ýÀÚ Á¶ÇÕ
2. ºñ¹ø , ºñ¹øÈ®ÀÎ 
3. ÀÌ¸ÞÀÏ  -  ¾ÆÀÌµð:¿µ¹®,¼ýÀÚ   @  µµ¸ÞÀÎ : ¿µ¹® Á¡
4. ÀüÈ­¹øÈ£ - ¼ýÀÚ :  ###-####-####,   ##(#)-###-####
5. ÀÌ¸§ (ÇÑ±Û¸¸ °¡´É)
6. ÁÖ¹Î¹øÈ£ 
7. »çÁø Ã·ºÎ-->¿µ¹®,¼ýÀÚ.ÀÌ¹ÌÁö È®ÀåÀÚ
ÀÌ¹ÌÁö(jpg, jpeg, bmp, png, gif)  --  ´ë¼Ò¹®ÀÚ ±¸ºÐ¾øÀ½
8. ¿ìÆí¹øÈ£ °Ë»ö - ±¸´ÜÀ§ (ÃÊ¼º°Ë»ö)
¿¹¿ÜÃ³¸®·Î Ã³¸®ÇÒ °Í 
		 */
		
		
		
		while(true) {
			mem = new RegexMem();
			RegexMo [] arr = {
				new RegexMo(mem, "id", 0, "[0-9a-zA-Z]{2,}",".*[0-9].*",".*[a-zA-Z].*"),
				new RegexMo(mem, "pw", 0, ".{2,}"),
				new RegexMo(mem, "pwÈ®ÀÎ", 1, ".{2,}"),
				new RegexMo(mem, "email", 0, 
						"[0-9a-zA-Z]{2,}@[a-zA-Z]{2,}.(([a-zA-Z]{2,})|([a-zA-Z]{2,}.[a-zA-Z]{2,}))"),
				new RegexMo(mem, "tel", 0, "((\\d{3}-\\d{4})|(\\d{2,3}-\\d{3}))-\\d{4}"),
				new RegexMo(mem, "name", 0, "[°¡-ÆR]{2,}"),
				new RegexMo(mem, "jumin", 0, "\\d{6}-\\d{7}") ,
				new RegexMo(mem, "img", 0, "[0-9a-zA-Z]{1,}.(jpg|jpeg|bmp|png|gif)"),
				new RegexMo(mem, "zipcode", 0, "[°¡-ÆR¤¡-¤¾]{1,}")
			};
			
			try {
				for (RegexMo regexMo : arr) {
					regexMo.inputData();
					
					if(regexMo.qq.equals("pwÈ®ÀÎ") && !mem.data[1].equals(regexMo.an)) {
						throw new MyExcep(regexMo.qq, 1);
					}
				}
				
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		mem.ppp();

	}

}
