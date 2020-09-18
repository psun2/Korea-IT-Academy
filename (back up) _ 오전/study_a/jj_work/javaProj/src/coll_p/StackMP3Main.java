package coll_p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
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
		arr = new String [] {title, singer};
	}
	@Override
	public String toString() {
		return " [" + no + "," + title + ", " + singer + "] ";
	}	
}

class StMP3{
	Stack back = new Stack();
	Stack next;
	ArrayList list = new ArrayList();
	StMusic now;
	
	int cnt=0;
	
	void add(String title, String singer) {
		cnt++;
		list.add(new StMusic(cnt, title, singer));
		//init();
	}
	
	void init() {
		Collections.reverse(list);
		next = new Stack();
		next.addAll(list);
	}
	
	void goNext() {
		
		System.out.println("<<<´ÙÀ½>>>---------------------");
		if(next.empty()) {
			System.out.println("´ÙÀ½°îÀÌ ¾ø½À´Ï´Ù.");
			return;
		}
		
		nextModule();
		
		ppp();
	}
	
	void nextModule() {
		if(now!=null)
			back.push(now);
		
		now = (StMusic)next.pop();
	}
	
	void goBack() {
		System.out.println("<<<µÚ·Î>>>---------------------");
		if(back.empty()) {
			System.out.println("ÀÌÀü°îÀÌ ¾ø½À´Ï´Ù.");
			return;
		}
		
		backModule();
		
		ppp();
	}
	
	void backModule() {
		if(now!=null)
			next.push(now);
		
		now = (StMusic)back.pop();
	}
	
	void goTrackNo(int no) {
		System.out.println("<<< "+no+" >>>---------------------");

		trackNoModule(no);
			
		ppp();
	}
	
	void trackNoModule(int no) {
		while(true) {
			
			if(no>now.no)
				nextModule();
			else if(no<now.no)
				backModule();
			else
				break;
		}
	}
	
	
	void search(String mm, int i) {
		
		System.out.println(
				"<<< search ("+new String [] {"Á¦¸ñ","°¡¼ö"}[i]+
				") : "+mm+" >>>---------------------");

		int nowNo = now.no;
		
		boolean chk = false;
		
		while(true) {
			
			nextModule();
			
			if(chk = schModule(mm,i)) {
				break;
			}
			
			if(next.empty())
				break;
		}
		
		if(!chk) {
			back.clear();
			init();
			init();
			now=null;
			//ppp();
			while(true) {
				
				nextModule();
				if(chk = schModule(mm,i)) {
					break;
				}
				
				if(nowNo == now.no)
					break;
			}
		}
		if(!chk)
		System.out.println(mm+" °Ë»ö°á°ú°¡ ¾ø½À´Ï´Ù.");
		ppp();
	}
	
	
	void search2(String mm, int i) {
		
		System.out.println(
				"<<< search ("+new String [] {"Á¦¸ñ","°¡¼ö"}[i]+
				") : "+mm+" >>>---------------------");

		int nowNo = now.no;
		
		ArrayList res = new ArrayList();
		
		while(true) {
			
			nextModule();
			
			if(schModule(mm,i)) {
				res.add(now);
			}
			
			if(next.empty())
				break;
		}
		
		
		back.clear();
		init();
		init();
		now=null;
		//ppp();
		while(true) {
			
			nextModule();
			if(schModule(mm,i)) {
				res.add(now);
			}
			
			if(nowNo == now.no)
				break;
		}
		
		if(res.isEmpty())
			System.out.println(mm+" °Ë»ö°á°ú°¡ ¾ø½À´Ï´Ù.");
		else {
			System.out.println("°Ë»ö°á°ú:"+res);
			System.out.print("¹øÈ£ÀÔ·Â:");
			
			Scanner sc = new Scanner(System.in);
			int nn = sc.nextInt();
			
			trackNoModule(nn);
		}
		ppp();
	}
	
	boolean schModule(String data,  int i) {
		String zipSch=".*";
		String [] index = {
				"¤¡¤¤¤§¤©¤±¤²¤µ¤·¤¸¤º¤»¤¼¤½¤¾¤³¤¹¤¨¤¢¤¶",
				"°¡³ª´Ù¶ó¸¶¹Ù»ç¾ÆÀÚÂ÷Ä«Å¸ÆÄÇÏºüÂ¥µû±î½Î",
				"ƒ‰ˆ¢‹L¡“J•½šïŸç£ ¯†µi»MÀ˜ÆR˜ªÂöê…ùÏ"
		};
		for (char ch : data.toCharArray() ) {
			int pos = index[0].indexOf(ch);
			if(pos>=0) {
				zipSch+="["+index[1].charAt(pos)+"-"+index[2].charAt(pos)+"]";
			}else {
				zipSch+=ch;
			}
		}
		zipSch+=".*";
		
		//System.out.println(zipSch+":"+now.title);
		
		return Pattern.matches(zipSch, now.arr[i]);
	}
	
	void ppp() {
		System.out.println("ÇöÀç°î:"+ now);
		System.out.println("ÀÌÀü°î:"+back);
		System.out.println("´ÙÀ½°î:"+next);
//		if(!back.isEmpty())
//			System.out.println("ÀÌÀü°î:"+back.lastElement());
//		if(!next.isEmpty())
//			System.out.println("´ÙÀ½°î:"+next.lastElement());
	}
}

public class StackMP3Main {

	public static void main(String[] args) {
		StMP3 mp3 = new StMP3();

		
		mp3.add("»ç¶ûÇÏ°Ô µÉÁÙ ¸ô¶ú¾î", "Àü¹Ìµµ");
        mp3.add("¿¡ÀÕ ¾Æµð¾ß", "¾ÆÀÌÀ¯");
        mp3.add("¾Ë·ÎÇÏ", "Á¶Á¤¼®");
        mp3.add("°í¾çÀÌ°¡½Ñ³ªºñ", "º¼»¡°£»çÃá±â");
        mp3.add("¸¶À× ¼³¾ÆÂ¼", "¿À¸¶ÀÌ°É");
        mp3.add("ÀÚ´Ù±ú´Ù", "Crush");
        mp3.add("³» ¶ËÀ» ¸ð¾Æ", "ÈÖÀÎ");
        mp3.add("³ª»Û³²ÀÚ ÀÖÀ¸¸é ¼Ò°³½ÃÄÑÁà", "Á¶ÀÌ");
        mp3.add("Èçµé¸®´Â ²Éµé¼Ó¿¡¼­ ³× ¶Ë³¿»õ°¡ ´À²¸Áø°Å¾ß", "Àå¹üÁØ");
        mp3.add("¾Æ¹«¶Ë", "ÁöÄÚ");
        
        mp3.init();
        //System.out.println(mp3.next);
        mp3.goNext();
        
        
        mp3.goNext();
        mp3.goNext();
        mp3.goNext();
        mp3.goBack();
        mp3.goTrackNo(5);
        mp3.goNext();
        mp3.search("ÀÌ",1);
        mp3.search2("¤·",0);
        
	}

}
