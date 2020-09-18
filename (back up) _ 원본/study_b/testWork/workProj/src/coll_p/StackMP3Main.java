package coll_p;

import java.util.Stack;
import java.util.regex.Pattern;

class StMusic{
	int no;
	String title, singer;
	String [] arr;
	public StMusic(int no, String title, String singer) {
		super();
		this.no = no;
		this.title = title;
		this.singer = singer;
		arr = new String[] {title, singer};
	}
	@Override
	public String toString() {
		return "[" + no + ", " + title + ", " + singer + "]";
	}
	
	boolean search(int i, String pp) {
		return Pattern.matches(pp, arr[i]);
	}
	
}


class StMP3{
	
	
	Stack back = new Stack();
	Stack next = new Stack();
	StMusic now;
	int max =-1;
	
	void goNext() {
		System.out.println("goNext()------------------------");
		if(next.empty()) {
			System.out.println("´ÙÀ½°îÀÌ ¾ø½À´Ï´Ù.");
			return;
		}
		
		next_M();
		ppp();
	}
	
	void next_M() {
		if(now!=null)
			back.push(now);
		
		now = (StMusic)next.pop();
	}
	
	
	void goBack() {
		System.out.println("goBack()------------------------");
		if(back.empty()) {
			System.out.println("´ÙÀ½°îÀÌ ¾ø½À´Ï´Ù.");
			return;
		}
		
		back_M();
		ppp();
	}
	
	void back_M() {
		if(now!=null)
			next.push(now);
		
		now = (StMusic)back.pop();
	}
	
	
	void goNo(int no) {
		System.out.println("goNo("+no+")------------------------");
		
		if(no<1 || no>max) {
			System.out.println("¾ø´Â ¹øÈ£ ÀÔ´Ï´Ù.");
			return;
		}
		
		while(now.no<no) {
			next_M();
		}
		
		while(now.no>no) {
			back_M();
		}
		
		ppp();
	}
	
	void ppp() {
		
		System.out.println("ÇöÀç:"+now);
		System.out.println("ÀÌÀü°îµé:"+back);
		System.out.println("´ÙÀ½°îµé:"+next);
	}
	void add(int no, String title, String singer) {
		if(max<no)
			max=no;
		
		next.push(new StMusic(no, title, singer));
	}
	
	String ppStr(String str) {
		String pp = ".*";
		String [] hangul = {
				"¤¡¤¤¤§¤©¤±¤²¤µ¤·¤¸¤º¤»¤¼¤½¤¾¤³¤¹¤¨¤¢¤¶",
				"°¡³ª´Ù¶ó¸¶¹Ù»ç¾ÆÀÚÂ÷Ä«Å¸ÆÄÇÏºüÂ¥µû±î½Î",
				"ƒ‰ˆ¢‹L¡“J•½šïŸç£ ¯†µi»MÀ˜ÆR˜ªÂöê…ùÏ"
		};
		
		for (char ch : str.toCharArray()) {
			int p = hangul[0].indexOf(ch);
			if(p>=0) {
				pp+="["+hangul[1].charAt(p)+"-"+hangul[2].charAt(p)+"]";
			}else {
				pp+=ch;
			}
		}
		
		pp += ".*";
		return pp;
	}
	
	void search(int i, String str) {
		
		String [] title = {"Á¦¸ñ","°¡¼ö"};
		System.out.println("search("+title[i]+","+str+")------------------------");
		
		int nowNum = now.no;
		boolean chk = false;
		String pp = ppStr(str);
		
		
		while(!next.empty()) {
			next_M();
			if(chk = now.search(i, pp))
				break;
		}
		
		if(!chk) {
		
			while(!back.empty()) {
				back_M();
			}
			
			next_M();
			while(nowNum!=now.no) {
				
				if(chk = now.search(i, pp))
					break;
				
				next_M();
			}
		}
		
		if(!chk) {
			System.out.println("Ã£À¸½Ã´Â °îÀÌ ¾ø½À´Ï´Ù.");
		}else {
			ppp();
		}
		
	}
}


public class StackMP3Main {

	public static void main(String[] args) {
		StMP3 mp3 = new StMP3();

		mp3.add(8,"±×¶§ ±× ¾ÆÀÎ","±èÇÊ");
        mp3.add(7,"¸ðµç ³¯, ¸ðµç ¼ø°£","ÆúÅ´");
        mp3.add(6,"½Ãµç ²É¿¡ ¹°À» ÁÖµí","HYNN");
        mp3.add(5,"¸ÕÁö°¡ µÇ¾î","±è±¤¼®");
        mp3.add(4,"Attention","Charlie Puth");
        mp3.add(3,"Please Don't Touch","RAYE");
        mp3.add(2,"Faded","Alan Walker");
        mp3.add(1,"All of Me","John Legend");

        mp3.goNext();
        mp3.goNext();
        mp3.goNext();
        mp3.goNo(11);
        mp3.goNext();
        mp3.goNext();
        mp3.goNext();
        mp3.goNo(2);
        mp3.goBack();
        mp3.goBack();
        mp3.goNo(4);
        mp3.search(0, "¸ðµç");
        mp3.search(1, "Wal");
        mp3.search(0, "¤¢¿¡");
	}

}
